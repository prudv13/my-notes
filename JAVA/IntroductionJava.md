# JAVA
- developed at Sun Microsystems
- purchased by Oracle in 2010
- General purpose programming language
- used for developing software that run on mobile, desktop, servers
- machine independent

## API
- Application programming interfcae
- contains predefined java code that we can use to develop java programs.
- no need to write everything from scratch

## Java Editions
- Java Standard Edition(JSE): develop desktop applications
- Java Enterprise Edition(JEE): develop web server-side applications
- Java Micro Edition(JME): develop mobile applications

## JDK
- Java Development Kit
- contains JRE(Java Runtime Environment) that is used to run our programs.
- JRE & JDK contain JVM(Java Virtual Machine)
- JVM executes our java programs on different machines

## IDE
- Integrated Development Environment
- Program that allows us to write our source code, compile to machine code
- tools to debug the code
- build tools to execute files by JVM
---

## ANATOMY OF JAVA PROGRAM

```
CLASS: blueprint to create Objects
OBJECT: instance of a class
```
---
### Class Structure
```java
class ClassName {
    //code block
}
```
- 'class' is keyword
- --

### Method Structure
- group of instructions to do a specific task
- every method is written inside a class
```java
returnType methodName(parameters){
    //code block
}
```
### Calling a method
- using the method
- calling a method is a statemnt in java
- code block of the method gets executed
- main() method is automatically called when we run our java program. It is the starting point of execution of out program.

```java
methodName(parameters);
```
---

### Access Modifiers
- specify how to access Classes & Methods discussed later in OOP

```
public
private
protected
default
```
---

### JAVA Program structure
```java
public class Main {
    public static void main(String[] args) {
        // code block
    }
}
```
---
### Strings
- group of characters / text
```
"hello"
"this is a string"
"1"
"125"
"!@#128&**"
""
```
### println( ) -> displays its paramater on the console window
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
```
### print( ) -> displays its paramater on the console window, doesn't get to new line
```java
public class Main {
    public static void main(String[] args) {
        System.out.print("hello");
    }
}
```

## SYSTEM.OUT.
- out is an object of the 'PrintStream' Class
- out has the print() and println() methods
- out refers to the standard output device / screen
- System is a class
- out is inside System

```java
System.out.println();
System.out.print();
```

## Printing some values

```java
System.out.println(4); // 4
System.out.println(5+2); // 7
System.out.println(3-5); // -2
System.out.println(6*3); // 18
System.out.println(4/2); // 2
```

# Comments
- Text ignored by the compiler
```java
// single line comment

/*
this is a
multi-line comment
*/
```