# Stack
## Overview 
Stack is a very simple programming language with minimal features .\
As the name suggests, this language is totally based around a stack. \
It supports many of the widely used stack operations such as load,pop etc. \
You can also use instructions like add,sub etc. for performing mathematical opertions on the elements stored in the stack.\
It can also be very helpful when you are learning about stacks and need a hands-on experience as to how it works\
\
A very simple sample of the language can be found in the file sample.st where you will see :
```
load 48
load 96
add
print 
```
This code will **load** the integer 48 and 96 into the stack, then using the **add** instruction it will add the 2 items on the stack and
print the sum on the screen

## Requirements
The Stack source code is fully written in Java and it can be be run on all JVMs supporting **Java 8 and above**

## Building Stack
Stack can be built with the help of the Apache ant tool\
To build the program perform the following steps:
1. Clone this repository to a suitable directory
2. Install ant from its website 
3. Make sure that the ant executable is in your PATH environment variable
4. Run the following command at the root of the repository
```
ant
```
5. This will produce a jar file called Stack-(version-code).jar
6. To execute the jar file use the following command:
```
java -jar Stack-(version-code).jar [INPUT-FILE}
```
You may also use a script to automate the process of execution of the program
