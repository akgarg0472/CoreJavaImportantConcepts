package com.akgarg.comparatorVsComparable;

public class ComparableImpl {

    public static void main(String[] args) {
        var userOne = new User("John Doe", 21, 25000);
        var userTwo = new User("John the Don", 18, 0);

        var compareResult = compareUser(userOne, userTwo);
        System.out.println(compareResult);
    }


    private static String compareUser(User firstUser, User secondUser) {
        var compareResult = firstUser.compareTo(secondUser);

        if (compareResult > 0) {
            return "User one is greater than that of user two.";
        } else if (compareResult < 0) {
            return "User one is smaller than that of user two.";
        } else {
            return "Both user one and user two are equal to each other.";
        }
    }

}