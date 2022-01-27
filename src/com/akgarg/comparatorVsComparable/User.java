package com.akgarg.comparatorVsComparable;

@SuppressWarnings("unused")
public class User implements Comparable<User> {

    private String name;
    private int age;
    private int salary;

    public User() {
    }

    public User(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(User otherUser) {
        // if current user is less than the otherUser then return -ve value
        // if current user is equal to otherUser then return 0
        // if current user is greater than otherUser then return +ve value
        return this.age - otherUser.getAge();
    }

}
