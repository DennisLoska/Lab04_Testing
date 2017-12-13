# Lab Report 04
## Assignment 04 - Testing
_Authors: Dennis Loska, Tony Dorfmeister, Ai Dong 05.12.2017_

## Part 1: Black and White Box Tests

### 1. Getting started:
In this exercise we have tested edge cases and normal cases for the class `Absolute.java`. <br>
The edge cases are:
- `testZero()`
- `testMaxValue()`
- `testMinValue()`

The normal cases are:
- `testSignedValueOf1()`
- `testSignedValueOf2()`
- `testUnSignedValueOf1()`
- `testUnSignedValueOf2()`

From these test cases we can see that only 1 test is failing which is `testSignedValueOf1()`.
This is because the conditional in `Absolute.absoluteValueOf(int x)` is not correct. We compare with `<` instead we should compare with `<=`. This way this test would be succesful.


### 2. Black-box-test:
In order to test `GradingScale.class` we need to cd into the directory this file is saved to and run the application by typing `java GradingScale` into the Terminal.
Then the application allows us to insert numerical values into the terminal line by line.
This should print the corresponding Grades to the terminal as long as values between 0 and 100 are entered. At last the program should return the average when the value -1 is entered.
So the equivalence classes for this application would be:
- input values in range(100)
- input value -1 prints average
- input values <-1 and >100
- program runs till -1 is entered

Since the application is able to get multiple inputs at a time, we went ahead and populated generic textfiles with sample data that we can then feed into the GradingScale by using the pipe command `|` in bash.

Here are the results for the different tests: <br>
**test 01: input values in range 100**

![inputValuesInRange100](/Users/tweak/CloudStation/IMI/03_Semester/Informatik-03/labs/Lab04_Testing/labReport/images/inputValuesInRange100.png)

This is only some of the output because the whole output (101 lines) would be too much for this report.

By comparing the output to the GradinScale provided with the assignment we can say that the program works for all input value inside the range of 100.

The value -1 also prints the average.



**test 02: input values in range 100 without average**

![inputValuesInRange100_withoutAverage](/Users/tweak/CloudStation/IMI/03_Semester/Informatik-03/labs/Lab04_Testing/labReport/images/inputValuesInRange100_withoutAverage.png)

This is the same output as test01 but now the loss of the value -1 at the end of file causes the program to return a NullPointerException



**test 03: normal input values with -1 in the middle**

![average in middle](/Users/tweak/CloudStation/IMI/03_Semester/Informatik-03/labs/Lab04_Testing/labReport/images/average in middle.png)

Here we can see that the program only runs 

### 3. White-box-test:

### 4. Reflection:

## Part 2: Test Driven Development


