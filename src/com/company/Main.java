package com.company;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {


        GregorianCalendar time = new GregorianCalendar();
        // Get user input
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = reader.nextLine();

       int hour = time.get(Calendar.HOUR_OF_DAY);
       if (hour < 12){
           System.out.println("Good morning  " + name);

       }
       else  if (hour < 18){
           System.out.println("Good afternoon  " + name);

       }
       else{
           System.out.println("Good evening  " + name);
       }
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.nextLine());


     Random rand = new Random();
     int value = rand.nextInt(90 - 18) + 18;
     int minus;

     System.out.print("I am " + age);
     System.out.print(" which is ");
     if(value > age){
         minus = value - age;
         System.out.println(minus + " years older ");
     }
     else {
         minus = age- value;
         System.out.println(minus + "years younger");
     }
        System.out.println("Twice my age would be " + age * 2);
     if(value % 2==0)
     {
         System.out.println("My age is an even number ");
     }
     else {
         System.out.println("My age is an odd number");
     }






        //System.out.println("Good Afternoon " + input);


    }
}
