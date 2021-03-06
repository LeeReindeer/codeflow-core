/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.graphviz;

public class gv {
  public static SWIGTYPE_p_Agraph_t graph(String name) {
    long cPtr = gvJNI.graph__SWIG_0(name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t digraph(String name) {
    long cPtr = gvJNI.digraph(name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t strictgraph(String name) {
    long cPtr = gvJNI.strictgraph(name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t strictdigraph(String name) {
    long cPtr = gvJNI.strictdigraph(name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t readstring(String string) {
    long cPtr = gvJNI.readstring(string);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t read(String filename) {
    long cPtr = gvJNI.read__SWIG_0(filename);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t read(SWIGTYPE_p_FILE f) {
    long cPtr = gvJNI.read__SWIG_1(SWIGTYPE_p_FILE.getCPtr(f));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t graph(SWIGTYPE_p_Agraph_t g, String name) {
    long cPtr = gvJNI.graph__SWIG_1(SWIGTYPE_p_Agraph_t.getCPtr(g), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t node(SWIGTYPE_p_Agraph_t g, String name) {
    long cPtr = gvJNI.node(SWIGTYPE_p_Agraph_t.getCPtr(g), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t edge(SWIGTYPE_p_Agnode_t t, SWIGTYPE_p_Agnode_t h) {
    long cPtr = gvJNI.edge__SWIG_0(SWIGTYPE_p_Agnode_t.getCPtr(t), SWIGTYPE_p_Agnode_t.getCPtr(h));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t edge(SWIGTYPE_p_Agnode_t t, String hname) {
    long cPtr = gvJNI.edge__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(t), hname);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t edge(String tname, SWIGTYPE_p_Agnode_t h) {
    long cPtr = gvJNI.edge__SWIG_2(tname, SWIGTYPE_p_Agnode_t.getCPtr(h));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t edge(SWIGTYPE_p_Agraph_t g, String tname, String hname) {
    long cPtr = gvJNI.edge__SWIG_3(SWIGTYPE_p_Agraph_t.getCPtr(g), tname, hname);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static String setv(SWIGTYPE_p_Agraph_t g, String attr, String val) {
    return gvJNI.setv__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), attr, val);
  }

  public static String setv(SWIGTYPE_p_Agnode_t n, String attr, String val) {
    return gvJNI.setv__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n), attr, val);
  }

  public static String setv(SWIGTYPE_p_Agedge_t e, String attr, String val) {
    return gvJNI.setv__SWIG_2(SWIGTYPE_p_Agedge_t.getCPtr(e), attr, val);
  }

  public static String setv(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agsym_t a, String val) {
    return gvJNI.setv__SWIG_3(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agsym_t.getCPtr(a), val);
  }

  public static String setv(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agsym_t a, String val) {
    return gvJNI.setv__SWIG_4(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agsym_t.getCPtr(a), val);
  }

  public static String setv(SWIGTYPE_p_Agedge_t e, SWIGTYPE_p_Agsym_t a, String val) {
    return gvJNI.setv__SWIG_5(SWIGTYPE_p_Agedge_t.getCPtr(e), SWIGTYPE_p_Agsym_t.getCPtr(a), val);
  }

  public static String getv(SWIGTYPE_p_Agraph_t g, String attr) {
    return gvJNI.getv__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), attr);
  }

  public static String getv(SWIGTYPE_p_Agnode_t n, String attr) {
    return gvJNI.getv__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n), attr);
  }

  public static String getv(SWIGTYPE_p_Agedge_t e, String attr) {
    return gvJNI.getv__SWIG_2(SWIGTYPE_p_Agedge_t.getCPtr(e), attr);
  }

  public static String getv(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agsym_t a) {
    return gvJNI.getv__SWIG_3(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agsym_t.getCPtr(a));
  }

  public static String getv(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agsym_t a) {
    return gvJNI.getv__SWIG_4(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agsym_t.getCPtr(a));
  }

  public static String getv(SWIGTYPE_p_Agedge_t e, SWIGTYPE_p_Agsym_t a) {
    return gvJNI.getv__SWIG_5(SWIGTYPE_p_Agedge_t.getCPtr(e), SWIGTYPE_p_Agsym_t.getCPtr(a));
  }

  public static String nameof(SWIGTYPE_p_Agraph_t g) {
    return gvJNI.nameof__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
  }

  public static String nameof(SWIGTYPE_p_Agnode_t n) {
    return gvJNI.nameof__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n));
  }

  public static String nameof(SWIGTYPE_p_Agsym_t a) {
    return gvJNI.nameof__SWIG_2(SWIGTYPE_p_Agsym_t.getCPtr(a));
  }

  public static SWIGTYPE_p_Agraph_t findsubg(SWIGTYPE_p_Agraph_t g, String name) {
    long cPtr = gvJNI.findsubg(SWIGTYPE_p_Agraph_t.getCPtr(g), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t findnode(SWIGTYPE_p_Agraph_t g, String name) {
    long cPtr = gvJNI.findnode(SWIGTYPE_p_Agraph_t.getCPtr(g), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t findedge(SWIGTYPE_p_Agnode_t t, SWIGTYPE_p_Agnode_t h) {
    long cPtr = gvJNI.findedge(SWIGTYPE_p_Agnode_t.getCPtr(t), SWIGTYPE_p_Agnode_t.getCPtr(h));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t findattr(SWIGTYPE_p_Agraph_t g, String name) {
    long cPtr = gvJNI.findattr__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t findattr(SWIGTYPE_p_Agnode_t n, String name) {
    long cPtr = gvJNI.findattr__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t findattr(SWIGTYPE_p_Agedge_t e, String name) {
    long cPtr = gvJNI.findattr__SWIG_2(SWIGTYPE_p_Agedge_t.getCPtr(e), name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t headof(SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.headof(SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t tailof(SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.tailof(SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t graphof(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.graphof__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t graphof(SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.graphof__SWIG_1(SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t graphof(SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.graphof__SWIG_2(SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t rootof(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.rootof(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t protonode(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.protonode(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t protoedge(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.protoedge(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static boolean ok(SWIGTYPE_p_Agraph_t g) {
    return gvJNI.ok__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
  }

  public static boolean ok(SWIGTYPE_p_Agnode_t n) {
    return gvJNI.ok__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n));
  }

  public static boolean ok(SWIGTYPE_p_Agedge_t e) {
    return gvJNI.ok__SWIG_2(SWIGTYPE_p_Agedge_t.getCPtr(e));
  }

  public static boolean ok(SWIGTYPE_p_Agsym_t a) {
    return gvJNI.ok__SWIG_3(SWIGTYPE_p_Agsym_t.getCPtr(a));
  }

  public static SWIGTYPE_p_Agraph_t firstsubg(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.firstsubg(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t nextsubg(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agraph_t sg) {
    long cPtr = gvJNI.nextsubg(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agraph_t.getCPtr(sg));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t firstsupg(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.firstsupg(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agraph_t nextsupg(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agraph_t sg) {
    long cPtr = gvJNI.nextsupg(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agraph_t.getCPtr(sg));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agraph_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t firstedge(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.firstedge__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t nextedge(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.nextedge__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t firstout(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.firstout__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t nextout(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.nextout__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t firstedge(SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.firstedge__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t nextedge(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.nextedge__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t firstout(SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.firstout__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t nextout(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.nextout__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t firsthead(SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.firsthead(SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t nexthead(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agnode_t h) {
    long cPtr = gvJNI.nexthead(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agnode_t.getCPtr(h));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t firstin(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.firstin__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t nextin(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.nextin__SWIG_0(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t firstin(SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.firstin__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agedge_t nextin(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.nextin__SWIG_1(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agedge_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t firsttail(SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.firsttail(SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t nexttail(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agnode_t t) {
    long cPtr = gvJNI.nexttail(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agnode_t.getCPtr(t));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t firstnode(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.firstnode__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t nextnode(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.nextnode__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t firstnode(SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.firstnode__SWIG_1(SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agnode_t nextnode(SWIGTYPE_p_Agedge_t e, SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.nextnode__SWIG_1(SWIGTYPE_p_Agedge_t.getCPtr(e), SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agnode_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t firstattr(SWIGTYPE_p_Agraph_t g) {
    long cPtr = gvJNI.firstattr__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t nextattr(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_Agsym_t a) {
    long cPtr = gvJNI.nextattr__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_Agsym_t.getCPtr(a));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t firstattr(SWIGTYPE_p_Agedge_t e) {
    long cPtr = gvJNI.firstattr__SWIG_1(SWIGTYPE_p_Agedge_t.getCPtr(e));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t nextattr(SWIGTYPE_p_Agedge_t e, SWIGTYPE_p_Agsym_t a) {
    long cPtr = gvJNI.nextattr__SWIG_1(SWIGTYPE_p_Agedge_t.getCPtr(e), SWIGTYPE_p_Agsym_t.getCPtr(a));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t firstattr(SWIGTYPE_p_Agnode_t n) {
    long cPtr = gvJNI.firstattr__SWIG_2(SWIGTYPE_p_Agnode_t.getCPtr(n));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static SWIGTYPE_p_Agsym_t nextattr(SWIGTYPE_p_Agnode_t n, SWIGTYPE_p_Agsym_t a) {
    long cPtr = gvJNI.nextattr__SWIG_2(SWIGTYPE_p_Agnode_t.getCPtr(n), SWIGTYPE_p_Agsym_t.getCPtr(a));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Agsym_t(cPtr, false);
  }

  public static boolean rm(SWIGTYPE_p_Agraph_t g) {
    return gvJNI.rm__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
  }

  public static boolean rm(SWIGTYPE_p_Agnode_t n) {
    return gvJNI.rm__SWIG_1(SWIGTYPE_p_Agnode_t.getCPtr(n));
  }

  public static boolean rm(SWIGTYPE_p_Agedge_t e) {
    return gvJNI.rm__SWIG_2(SWIGTYPE_p_Agedge_t.getCPtr(e));
  }

  public static boolean layout(SWIGTYPE_p_Agraph_t g, String engine) {
    return gvJNI.layout(SWIGTYPE_p_Agraph_t.getCPtr(g), engine);
  }

  public static boolean render(SWIGTYPE_p_Agraph_t g) {
    return gvJNI.render__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g));
  }

  public static boolean render(SWIGTYPE_p_Agraph_t g, String format) {
    return gvJNI.render__SWIG_1(SWIGTYPE_p_Agraph_t.getCPtr(g), format);
  }

  public static boolean render(SWIGTYPE_p_Agraph_t g, String format, SWIGTYPE_p_FILE fout) {
    return gvJNI.render__SWIG_2(SWIGTYPE_p_Agraph_t.getCPtr(g), format, SWIGTYPE_p_FILE.getCPtr(fout));
  }

  public static boolean render(SWIGTYPE_p_Agraph_t g, String format, String filename) {
    return gvJNI.render__SWIG_3(SWIGTYPE_p_Agraph_t.getCPtr(g), format, filename);
  }

  public static byte[] renderresult(SWIGTYPE_p_Agraph_t ing, String format) {
    return gvJNI.renderresult(SWIGTYPE_p_Agraph_t.getCPtr(ing), format);
  }

  public static String renderdata(SWIGTYPE_p_Agraph_t g, String format) {
    return gvJNI.renderdata(SWIGTYPE_p_Agraph_t.getCPtr(g), format);
  }

  public static boolean write(SWIGTYPE_p_Agraph_t g, String filename) {
    return gvJNI.write__SWIG_0(SWIGTYPE_p_Agraph_t.getCPtr(g), filename);
  }

  public static boolean write(SWIGTYPE_p_Agraph_t g, SWIGTYPE_p_FILE f) {
    return gvJNI.write__SWIG_1(SWIGTYPE_p_Agraph_t.getCPtr(g), SWIGTYPE_p_FILE.getCPtr(f));
  }

  public static boolean tred(SWIGTYPE_p_Agraph_t g) {
    return gvJNI.tred(SWIGTYPE_p_Agraph_t.getCPtr(g));
  }

}
