# JOM. Classes. Encapsulation. Exceptions
## Task 5

Create a class **Plant**, which includes **private** fields **String name**, **Color color** and T**ype type**, and **constructor** with three **String** parameters **(String type, String color, String name)** where these fields are initialized. Create **getters** for all fields.

**Color** and **Type** are **Enum**. 

**Color** contains **White**, **Red**, **Blue** entries.

**Type** contains **Rare** and **Ordinary** entries.

Override the method **toString( )** for **Plant** class which returns result formatted like following: ***{type: Rare, color: Red, name: MyPlant}***

Create classes **ColorException** and **TypeException** as derived from **Exception**. Both classes should have a constructor with one **String** parameter and pass this parameter to the base class.

The constructor of **Plant** should throw a corresponding exception whenever an inappropriate parameter is passed.

