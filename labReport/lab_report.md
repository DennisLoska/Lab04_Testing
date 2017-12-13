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
This is because the conditional in `Absolute.absoluteValueOf(int x)` is not correct. We compare with `<` instead we should compare with `<=`. Also the value to be compared to during the condition should be 0 rather than -1. This way this test would be succesful. For that reason, the return value of -1 should be 1 and not -1 as well. 


### 2. Black-box-test:
In order to test `GradingScale.class` we need to cd into the directory this file is saved to and run the application by typing `java GradingScale` into the Terminal.

euivalence classes:
For each grade 2 values are tested, the minimum to receive the grade, 
the maximum to receive the grade. The avg of the received grades also needs to be tested.

To test the return value for grades:

edge cases:
- maxPercentageof()
- minPercentageof()

normal cases
- avgPercentageof()

illegal cases
-overHundred()

The ouput is off: 
50: F (instead of E)
over 100: B (instead of error message)
-1: AVG is calculated based on number of inputs overall instead of number of inputs related to grades.

### 3. White-box-test:

In general, we can speak of up to 7 independent paths - as due to various contraints introducing new nodes.
For clarification, please take a look at the code graph. 

	Overview of conditions
(1)	if (income < 0)
(2)	if (nFamilyMembers <= 0)
(3)	 if (income < 10000)
	else if (income < 50000)
	else
(4)	if (taxTotal < 0)

Test cases are actually a combination of the follow:

- incomeLessThanZero()
- incomeGreaterThanZero()
- FamilyMembersGreaterThanZero()
- FamilyMembersLessThanZero()
- incomeGreater10000()
- incomeLess10000()
- incomeGreater50000()
- incomeLess50000()
- taxTotalLessZero()


### 4. Reflection:
Due to its progressive nature, one can hardly test inputs and outputs effectively. To test more effectively, the code would need to be refactored in a way, that each phase is represented by at least one method. This way, each phase could be tested independently.

## Part 2: Test Driven Development


