## Folder 12  Inheritance
 Inheritance is the process of acquiring the features of an existing class into a new class,it's just like adding extra features to an already existing device and making a new one just adding updated features.
One can say Specialization is also Inheritance because Specialization is also building on existing features.
Inheritance is like a top-to-down event.
# Features- includes properties and methods
Example:
circle has a property of radius
cylinder is inheriting from circle,so the method of cylinder includes the radius of circle and its own height..therefore cylinder has method of radius and height.
  Circle is the superclass
  Cylinder is the subclass.
# Constructors in Inheritance
Constructors are a method of a class which are automatically called when an object is created.
N:B When object of a child class is created,the parent class constructor is executed first,then the child class afterward,because its inheriting from the parent class.
# Constructor Types:
1. Parameterised constructor
Parent ()
2. Non-parameterised constructor
Parent (int x);

# this vs super
this
To avoid name conflict,one can use this(between properties and constructors),when refering to the properties use this in reference to object.

# Method Overloading
It means redefining a method of a superclass in a subclass,it uses the annotation:@Override
N:B The method would be called depending on the object not the reference

# Dynamic Method Dispatch
When a superclass reference which is holding an object of subcclass and an override method is called then the method of object would be called.
 It is useful for acheiving run-time polymorphism using method overriding.
  Super s = new Sub() (allowed)
 Sub su = new Super()   (not allowed)
N:B  In conclusion
 A super class reference can hold an object of subclass but it can call only method which are defined in superclass.

# Dos and Donts of Overriding
1. The signature of the super and subclass must be the same
super - public void display()
subclass- @Override
public void diplay()

2. Also,parameters must be the same
3. Name must be the same,in the casing
4. We cannot override final and static method
5. Access modifiers can be different that is:
 private,protected and public.
N:B The strict one cannot be in the subclass(that is the subclass cannot be private)

## Polymorphism
One name,different actions
In java,polymorphism is achieved using method overriding and overloading.
    Method Overloading (complile runtime polymorphism)
1. Same name,different actions
2. Compilers makes the call to the one to be called,it is pre-deccided because the arguments are different
3. This can be achieved in the same class.
      Method Overloading (runtime polymorphism)
1. Redifining a method of superclass inside subclass
2. This ccn be achieved in different classes
3. This will be decided on runtime based on the object.

## Folder 13  Abstract Class
1. Abstract      abstract class Super
2. Concrete      class Sub extends Super
N:B  you cannot create an object of abstract class but can create for concrete class
       Abstract method and Abstract class
Abstract method is a method not having body(undefined method)
An Abstract class means an object cannot be created
* If a class is having at least one abstract method,then the class should be abstract
* If a class is inheriting from an abstract class,then that class automatically becomes an abstract.
N:B  Its either you override or use abstract for the subclass when the parent class is abstract.
    use of abstract class:
Astract class are useful for defining standards and imposing standards,they give standards for the subclasses.
-final cannot be used in abstract,cause it means it cant be extended or override
-you cannot make abstract as static

## Folder 14  Interfaces
Interface can be seen as an abstract class with all abstract method,to achieve polymorphism
-classes are extended
-interface are implemented 
- extends can only inherit from one class while implement multiple interfaces.
- interfaces are used for aachieving runtime polymorphism,they are meant for only overriding and for dynamic method dispatch.
- interfacs are used for call back methods
- only uppercase identifiers are allowed
  int X = 10;

## Folder 15  Inner class
Innerclass:This is like a class inside of another class.
-Nested innerclass:innerclass can access the member of outer class directly and outer class cannot access the member of innerclass directly until it has created an object.
-Local innerclass: If you want any class to inherit from an aleady existing class or implement an interface,then you can define a local inner class.
-Anonymous innerclass
-Static innerclass

## Folder 16   Static
-Static variable
-Static method
-Static nested class
-static blocks

 final keyword 
final is just like const in java
- final variable -final method -final class
1.final variable: are constants,values cannot be modified,the variables are in capital letter
2.final method: it cannot be overrided
3.final class: if a class is final,it cannot be extended,that is cannot be inherited.
