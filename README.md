# OOP_JAVA

### Class : 
* named grp of objects that have common properties (or functions).
* start with capital letter.
* used to create your own datatype.
* template of an object.
* Logical construct.
* Syntax to create a class :

  class Student {
  
      -------

      -------
  
  }

### Object :
* an instance of a class (physical stuff of that class -> like a newborn baby of human class).
* physical reality (sth that actually occupies space in memory).
* characterised by :
  * State : represented by attributes of an object. reflect properties of an object. value from its datatype.
  * Identity : gives unique name to an object & hence helps to distinguish between 2 objects of the same class. enables 1 object to interact with other.
  * Behaviour : represented by the methods of the object.

> Variables inside the object are called instance variables. Example : student_1 is an object of class Student. Then, roll_no, name, & marks are the instance variables.

> (.) Dot Operator : In Java, its categorised as separator.

* declaration  :

  Student student_1;  //only declaring the reference to the object  //no object is really created yet  //only reference is set up  //no initialisation is done  //only the reference variable get stored in stack and by default in Java it is pointing to null.

* Creation :

  //LHS will execute at compile time and RHS will get executed at runtime.
  
  Student student_1 = new Student() ;  //new keyword dynamically allocates the memory at runtime and returns a reference to it that will get stored in student_1.  //all class objects in Java must be allocated dynamically.

> In Java, we can't access/manipulate memory address due to safety reasons.
* When you create an object of a class, then it means that it is being instantiated.

> Java is static type language.

### Constructor
* A CONSTRUCTOR basically defines what will happen when an object is created. It is a special function that runs when you create an object and it allocates some variables. In nutshell, a constructor in Java is a special method that is used to initialize objects.
* There is a default type constructor which don't take any arguments(not created by us, its default)
