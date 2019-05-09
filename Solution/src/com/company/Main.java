package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Non Singleton

        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        ChocolateBoiler chocolateBoiler1 = new ChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler1.drain();
        System.out.println(chocolateBoiler.isEmpty());
        System.out.println(chocolateBoiler1.isEmpty());


        //Singleton

        SingletonChocolateBoiler singletonChocolateBoiler = SingletonChocolateBoiler.getInstance();
        SingletonChocolateBoiler singletonChocolateBoiler1 = SingletonChocolateBoiler.getInstance();

        singletonChocolateBoiler.fill();
        singletonChocolateBoiler1.drain();
        System.out.println(singletonChocolateBoiler.isEmpty());
        System.out.println(singletonChocolateBoiler1.isEmpty());
    }
}
