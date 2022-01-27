package com.akgarg.lambdas;

@SuppressWarnings({"CommentedOutCode", "TrivialFunctionalExpressionUsage", "RedundantSuppression", "Convert2Lambda"})
public class LambdasExample {

    public static void main(String[] args) {
        // Implementing by creating an implementation class
        IPrint print = new PrintImpl();
        print.print("Joh Doe");

        // implementing by creating anonymous inner class
        new IPrint() {
            @Override
            public void print(String name) {
                System.out.println("Name from inner class is: " + name);
            }
        }.print("John Doe");

        print(name -> System.out.println("Name entered is: " + name));
    }


    private static void print(IPrint print) {
        print.print("John Doe");
    }

}
