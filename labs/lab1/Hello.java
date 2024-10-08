// ******************************************** 
// Hello.java 
// 
// Print a Hello, World message. 
// ******************************************** 
public class Hello
{ 
 // ----------------------------------- 
 // main method -- prints the greeting 
 // ----------------------------------- 
 public static void main (String[] args) 
 { 
 System.out.println ("Hello, World!");
 } 
}

/* Errors:
1- Hello.java:6: error: class Helloo is public, should be declared in a file named Helloo.java
2- Print string changed. There's no reason for errors
3-Hello.java:13: error: unclosed string literal
4-Hello.java:13: error: ')' expected
System.out.println (Hello, World!")
5-Hello.java:13: error: ';' expected
*/