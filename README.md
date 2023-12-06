# JOM. Classes. Encapsulation. Exceptions
## Task 4

Create a method for calculating an area of a rectangle

**int squareRectangle(int a, int b)**, which should throw an **IllegalArgumentException** with message ***"both arguments should be more than zero"*** if at least one of its arguments is non positive. 

Create **trySquareRectangle** method which takes two parameters and calls **squareRectangle** to evaluate an area of a rectangle. Catch exceptions that can be generated.

**trySquareRectangle** method shouldn't generate any exceptions. In case when one or two parameters are non positive the method should return **-1**.
