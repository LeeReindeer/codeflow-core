<h1>CodeFlow<img alt="icon" src="art/codeflow.webp"/></h1>

[![](https://jitpack.io/v/LeeReindeer/codeflow-core.svg)](https://jitpack.io/#LeeReindeer/codeflow-core)

Let's convert Java code to flowchart graph!

## Features

Java code to flowchart graph:

`*`: reconsider or will not be supported.

- [x] Control flow in Java: sequence, loop(`for`, `while`, `do while`) and condition(`if`)
- [x] Support `switch` statement
- [x] Support `break`, `contuine`
- [ ] *Support labels and `goto`
- [x] Top-level function and statement
- [x] Multi-function supported, which represented in subgraphs
- [x] Function overload(different arguments size only)
- [x] Semantic check and warning
- [ ] *Support Class method

## Quick start

```java
CodeFlow codeFlow = CodeFlow.builder()
              .outDir("tests")
              .format(Format.PNG)
              .build();
codeFlow.parse("if(ok){doSome();}else{doSomeElse();}").toFile("file.png");
```

## Usage

1. **Add dependency**

Maven:

```
<repositories>
    <repository>
        <id>jitpack.io</id>
		<url>https://jitpack.io</url>
    </repository>
</repositories>
```

```xml
<dependency>
    <groupId>com.github.LeeReindeer</groupId>
    <artifactId>codeflow-core</artifactId>
    <version>${latest-version}</version>
</dependency>
```

Gradle:

```
allprojects {
    repositories {
        ...
	    maven { url 'https://jitpack.io' }
	}
}
```

```
implementation 'com.github.LeeReindeer:codeflow-core:${latest-version}'
```

For snapshot, use `master-SNAPSHOT` as the version tag.

2. **Get a builder**

```java
CodeFlow codeFlow = CodeFlow.builder()
        .useNative(true)            // use native bind of graphviz, faster
        .supportClass(false)        // whether support class declare
        .failFast(true)		    // not recovery from syntax error
   			            // the graph will not created when syntax error occurred.
        .workDir("examples")        // input file dir
        .outDir("tests")            // output file dir
        .format(Format.PNG)         // output file format
        .build();
```

3.  **Configuration Flowchart style(optional)**

All flowchart configuration is in `FlowchartConfig` as static fields.

```java
  public static String functionColor = "lightblue"; //function call node color
  // You can set decision nodes' compass,
  // but the best you can do is not interfering the layout engine.
  // It will avoid most line intersections in graphviz.
  // Nevertheless, if you sill want to customize, the recommend preference is commented following.
  public static String decisionTrueCompass; // s
  public static String decisionFalseCompass; // w
  public static String doWhileDecisionTrueCompass; // e
  public static String doWhileDecisionFalseCompass; // s
```

4. **Do Convert**

-  `parse(String code)`

- `parse(Supplier<String> supplier)`

- `parse(File file)`

- `parseFile(String path)`

Examples:

```java
// convert code string to java.awt.image.BufferedImage
codeFlow.parse("if(ok){doSome();}else{doSomeElse();}").toImage();
// convert code in file simple.cf to simple.png
codeFlow.parseFile("simple.cf").toFile("simple.png");
```

## Examples

```java
int binarySearch(int[] a, int k) {
    int len = a.length;
    int l = 0, r = len - 1;
    while (l < r) {
      int mid = (l + r) / 2;
      if (a[mid] < k) {
        l = mid + 1;
      }
      else if (a[mid] > k) {
        r = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
}
```

Above code will generate a flowchart like:

![binarySearch](examples/binarySearch.png)

See more example at [examples folder](examples/).

## How it works

- It use [ANTLR4](https://www.antlr.org/) to generate parser to parse Java code. 

- And then, visit the AST to build flowchart fragment:
    - The single flowchart fragment is built directly
    - The complex flowchart fragment(like nested conditions and loops) is built recursively

- Use [graphviz-java](https://github.com/nidi3/graphviz-java) library convert node data structure to [dot](https://en.wikipedia.org/wiki/DOT_\(graph_description_language\)) file.

- Finally, use [Graphviz](https://www.graphviz.org/) to convert dot file to graph image.
