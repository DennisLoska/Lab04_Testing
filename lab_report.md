# Lab Report 04
## Assignment 04 - Testing
_Authors: Dennis Loska, Tony Dorfmeister, Ai Dong 05.12.2017_

## Part 1: Black and White Box Tests

### 1. Getting started:
In this exercise we have tested edge cases and normal cases for the class `Absolute.java`.
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

### 3. White-box-test:

### 4. Reflection:

## Part 2: Test Driven Development


