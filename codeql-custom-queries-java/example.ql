/**
 * This is an automatically generated file
 * @name Hello world
 * @kind problem
 * @problem.severity warning
 * @id java/example/hello-world
 */

 import semmle.code.java.dataflow.FlowSinks
 import semmle.code.java.dataflow.FlowSources


 from FlowSources source,FlowSinks Sink
 where 
 select t




 /*
 from Parameter p
 where not exists(p.getAnAccess())
 select p , "haha$&"
 */