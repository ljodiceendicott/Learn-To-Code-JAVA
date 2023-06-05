# Branching 

## Naming Convention

For when naming the branch, use a name that makes it easy to understand what it is that the branch holds.

Naming Convention for the items that are apart of the proof-of-concept(POC) branch:

>POC-*USER_STORY_CODE*_*SHORT_DESC*

For branching that will contain files that will be in the final product:

>DEV-*USER_STORY_CODE*_*SHORT_DESC*


## Branching System

The branching system that we are using is git-flow


## Adding Features

When it comes to adding features make sure that if you are implementing a feature make sure that it works with the entire project

## Once finished With Branch

Once you are done using a branch we keep the branches within the reposityory

# Fixing Bugs

Bugs should be reduced when first writing the code that you are writing.

If the bug has shown up as a result of someone editing part of the code, It should be their responsibility to try and fix that Bug because they were the last ones to be using a working version of the code.

This is unless it is found that the bug is a result of something located in the code base that was done by someone else then it is the person who had written the buggy codes responsibility to fix it

# Code Reviews

The last person to modify a file before you work on the file will review it

# Style Guidelines

## Identifier Naming 

For Identifier Naming conventions, Google's Rules for Identifier type are what is used
Link to Full info:[https://google.github.io/styleguide/javaguide.html#s5.2-specific-identifier-names](Google's Identifier Naming Convention)

**A quick lookup guide below** 

## Class Naming

Class names are written in UpperCamelCase

Class names are nouns

Test Class's are the class name followed by the term 'Test'

## Method Naming

Method names are written in lowerCamelCase

Method names are verbs or a verb phrase

## Constant Naming 

Constant names use all uppercase letters with each word seperated by a single underscore

# Formatting

## Whitespace

For whitespace conventions Google's Rules for whitespace for both Vertical and Horizontal whitespace are what is used
link to Full Descriptions:[https://google.github.io/styleguide/javaguide.html#s4.6-whitespace](Google Whitespace Guidelines)

## Brackets

For any time you need to put a opening curly brace '{' it is put on the same line as the line that needs it

For the ending curly brace '}', it goes on its own line

EX.
```java

if(x < 4){
   System.out.println("yep");
}
```

## File Headers

File Headers should contain:

*FileName
*Date-Created
*Description of what this file is made to accomplish
*Name of the last person to work on the file
*the date that the last person worked on file
*Description that explains if there are any known bugs or issues

Date-Created and the description of the file should not change

The name and date of when and who the last person that worked on file should change when the person begins editing the file. Once finished with working on the file put the end date of when it was worked on

For issues and bugs, if there are specific line numbers, put them. If there is a general issue state the general issue. For filling this out it is possible that multiple lines are used. Make sure that it is contained using comments

An example of how this should look:

```Java
// Name: Level.java			   //
// Date Created: 10/31/21		   //
// Description:This is the Class for level //

// Known issues/bugs:Assignment not working(23), Loop seems to not be doing the right thing(40-50) 

// Last Edited: Luke Jodice (11/14/21)
```

# Comments/Javadocs

For method definitions, all non get/set methods should have javadocs

## Javadoc Formatting for classes

```Java
/**
 * A model for a book (title, author, etc.).
 * 
 * @author hfeild
 */
public class Book {

}
```

For complex or confusing code, inline comments are recommended

creations of variables and most uses of methods will not need a comment unless it is as stated above