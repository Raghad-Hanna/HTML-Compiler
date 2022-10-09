# HTML-Compiler

## Core Idea
This project is a compiler for HTML code whose functionality is extended with the concept of derivatives from the AngularJS framework

HTML is extended by adding those derivatives as new vocabulary to the HTML language, so that developers can start writing code at a more abstract level and can stop repeating themselves, and that is one of the main goals of any framework.

## Used Technologies
*Java language
*ANTLR: a tool for language recognition

## Main Features
1. Syntax Analysis: it validates HTML code syntactically according to the specification

2. Semantic Analysis: it validates HTML code semantically according to the specification

3. Code Generation: it takes as input the HTML file which contains the Native HTML + the new directives supported and generates a new file which contains the original file native contents + the JS scripts that define the new vocabulary and replace it so that the new file is ready to be understood by the browsers

all the above features are supported with the help of 2 data structures:
*Abstract Syntax Tree (AST)
*Symbol Table (ST)

which are core concepts in any language compiler software

## Code Design
focused on:
*Correct OOP
*Clean Code
*Asbtraction
*Low-coupled System Components

## Notes To Run The Application
you need to have:
*ANTLR as a plugin to a java IDE
*Java 8 or higher