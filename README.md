# JOM. Classes. Encapsulation. Exceptions
## Task 2

Create the **Point** class that correspond next class diagram:

![image](https://user-images.githubusercontent.com/61456363/168443472-b2507d4a-73da-470c-ba21-f25e18fdcaf9.png)

A **Point** class, which models a 2D point with x and y coordinates should contains:

1. Two **private** instance variables **x** and **y**  of **int** type.
2. A constructor that constructs a point with the given **x** and **y** coordinates.
3. A method **getXYPair()** which returns the **x** and **y** in a 2-element **int** array.
4. A method called **distance(int x, int y)** that returns the distance from this point to another point at the given **(x, y)** coordinates.
5. An overloaded **distance(Point point)** method that returns the distance from this point to the given **Point** instance.
6. Another overloaded **distance()** method that returns the distance from **this** point to the origin **(0, 0)**

> For correct passing of all tests don't use print and println methods in your code.
