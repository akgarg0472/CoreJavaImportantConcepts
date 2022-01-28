→ OOPS is programming style to write code.
→ Classes and objects are the heart of OOPS.
→ Object is defined as independent instance of a class. It represents a real-world entity.
→ Class is defined as the template of object. It defines the properties(variables) and behaviour(methods) of an object.
→ There are four principles in Object-Oriented programming:
    - Encapsulation
    - Abstraction
    - Inheritance
    - Polymorphism

→ Class:
    - 'class' keyword is used to create a new class.
    - Syntax to define a class:
        accessModifier class ClassName {
            // class body
        }
    - 'this' keyword in class represents the current instance(object).

→ Object:
    - 'new' operator is used to create an instance of class.
    - Syntax to create an object:
       ┌--------------------------------┐      ┌-----------------------┐
       | ReferenceType    referenceName |   =  |  new     ClassName(); |
       |      ↑                 ↑       |      |   ↑          ↑        |
       |     (1)               (2)      |      |  (3)        (4)       |
       └--------------------------------┘      └-----------------------┘
           (Reference holding object)               (Actual Object)

        (1) specifies the type of the reference
        (2) name of the reference holding actual object's reference
        (3) new keyword used to instantiate object
        (4) class name whose object is to be instantiated

    - All references are stored in Stack memory area and all objects are stored in the Heap memory area.
           ┌-------------------------------------------------------------------┐
           |                            MEMORY SPACE                           |
           |     ┌-----------------┐                  ┌-----------------┐      |
           |     |                 |                  |                 |      |
           |     |                 |                  |                 |      |
           |     |                 |                  |-----------------|      |
           |     |                 |                  |                 |      |
           |     |                 | ┌---------------→|    new User()   |      |
           |     |                 | |                |                 |      |
           |     |-----------------| |                |-----------------|      |
           |     | otherReference  |—┘                |                 |      |
           |     |-----------------|                  | new ClassName() |      |
           |     |  referenceName  |----------------→ |                 |      |
           |     └-----------------┘                  └-----------------┘      |
           |        (Stack Memory)                       (Heap Memory)         |
           └-------------------------------------------------------------------┘

    - All properties are initialized to their default value.
        - for reference type: null
        - for primitive type: their respective default value
    - We can instantiate any number of objects from a class (provided class is not a Singleton class).

→ Encapsulation:
    - Encapsulation is the bundling or grouping of related properties(variables) and behavior(methods) in a single unit (class).

→ Abstraction:
    - Abstraction is defined as the hiding the implementation details of class and only providing the necessary information (methods) to reduce the complexity of code.

→ Inheritance:
    - Inheritance is a mechanism which allows the re-usability of code by making it child of another class to inherited its (super class) properties & behaviors.
    - 'extends' keyword is used to make a class child of another class.
      Syntax:
        class ChildClass extends ParentClass {
        }
    - We can inherit at most one class in Java.
    - super keyword is used to call the constructor or method of parent class.
    - this keyword is used to refer to current class fields & methods.
    - Private class members are not inherited.
    - Inheritance is use when we have to establish 'is-A' relationship b/w objects. For example: 'Dog' is an 'Animal'.
    - Inheritance allows to use one of the important concept 'method overriding' (polymorphism).
    - Every class is by default a child of 'Object' class in Java.
    - Parent class reference can hold the object of child class (Downcasting) but child class reference can't hold the object of parent class (Upcasting).
    - We can declare class 'final' to prevent it from being inherited.
    
→ Polymorphism:
    - Polymorphism means 'Multiple forms'. Polymorphism is the mechanism which allows an object to take different forms and behave differently in different environments.
    - Polymorphism is of two types: Compile time polymorphism & Runtime polymorphism
    - Compile time polymorphism is method overloading and run time polymorphism is Method overriding.
    - We can make our super class method 'final' to disable the overriding of method.