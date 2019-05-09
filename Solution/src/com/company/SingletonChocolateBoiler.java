package com.company;

public class SingletonChocolateBoiler {
    private static SingletonChocolateBoiler instance;
    // other useful instance variables here

    private boolean empty;
    private boolean boiled;

    private SingletonChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static SingletonChocolateBoiler getInstance() {
        if (instance == null){
            instance = new SingletonChocolateBoiler();
        }
        return instance;
    }
    // other useful methods here
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}