package com.akgarg.oops.polymorphism;

@SuppressWarnings("CommentedOutCode")
public class PolymorphismOverridingExample {

    public static void main(String[] args) {
        Parent parentOne = new Child();    // downcasting
        parentOne.print();  // hiding the implementation of parent class's print() method
        // parentOne.printClassName(); // can't access child class method from parent class reference

        // Child child = new Parent(); // error, we can't upcast a reference
        Parent parentTwo = new Parent();
        parentTwo.print();

        Child child = new Child();
        child.print();
        child.printClassName();
    }

    private static class Parent {
        public void print() {
            System.out.println("Parent class print() method");
        }
    }

    private static class Child extends Parent {
        @Override
        public void print() {
            System.out.println("Child class print() method");
        }

        public void printClassName() {
            System.out.println(this.getClass().getCanonicalName());
        }
    }

}
