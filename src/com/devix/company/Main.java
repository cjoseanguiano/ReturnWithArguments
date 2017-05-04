package com.devix.company;

public class Main {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.add(5, 2);
    }
}

class Sample {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }
}
