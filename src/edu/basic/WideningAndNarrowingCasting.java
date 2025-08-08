package edu.basic;

public class WideningAndNarrowingCasting {

	public static void main(String[] args) {
        int myInt = 50;
        double myDouble = myInt;  // Automatic casting: int to double - WideningCasting

        System.out.println("Int value: " + myInt);
        System.out.println("Double value (widened): " + myDouble);
        
        
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2;  // Manual casting: double to int - NarrowingCasting

        System.out.println("Double value: " + myDouble2);
        System.out.println("Int value (narrowed): " + myInt2);
    }
}
