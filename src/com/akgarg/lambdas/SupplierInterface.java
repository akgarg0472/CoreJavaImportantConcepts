package com.akgarg.lambdas;

import com.akgarg.comparatorVsComparable.User;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {
        Supplier<User> getUser = User::new;
        System.out.println(getUser.get());

        IntSupplier generateRandomInteger = () -> Double.valueOf(Math.random() * 100).intValue();
        System.out.println(generateRandomInteger.getAsInt());
    }

}
