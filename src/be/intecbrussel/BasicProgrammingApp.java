package be.intecbrussel;

import java.util.Scanner;

public class BasicProgrammingApp {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        System.out.println("Hey, can you please give me a number? ");
        int number1 = userinput.nextInt();
        System.out.println("Please, give me a second number: ");
        int number2 = userinput.nextInt();
        System.out.println("And a third number as well: ");
        int number3 = userinput.nextInt();
        System.out.println("Give me one last number: ");
        int number4 = userinput.nextInt();


        boolean mybiggestNumber = true;
        System.out.println("Biggest number is: ");

        if (mybiggestNumber = number1 >= number2 && number1 >= number3 && number1 >= number4) {
            System.out.println(number1);
        } else {
            if (mybiggestNumber = number2 >= number1 && number2 >= number3 && number2 >= number4) {
                System.out.println(number2);
            } else {
                if (mybiggestNumber = number3 >= number1 && number3 >= number2 && number3 >= number4) {
                    System.out.println(number3);
                } else System.out.println(number4);
            }
        }
        boolean mysmallestNumber = true;
        System.out.println("Smallest number is: ");

        if (mysmallestNumber = number1 <= number2 && number1 <= number3 && number1 <= number4) {
            System.out.println(number1);
        } else {
            if (mysmallestNumber = number2 <= number1 && number2 <= number3 && number2 <= number4) {
                System.out.println(number2);
            } else {
                if (mysmallestNumber = number3 <= number1 && number3 <= number2 && number3 <= number4) {
                    System.out.println(number3);
                } else System.out.println(number4);
            }

        }
        boolean smallAverage = true;
        int average = (number1 + number2 + number3 + number4) / 4;
        int smallestNumber = number1;
        if (number1 <= number2 && number1 <= number3 && number1 <= number4) {
        } else {
            smallestNumber = number2;
            if (number2 <= number1 && number2 <= number3 && number2 <= number4) {
            } else {
                smallestNumber = number3;
                if (number3 <= number1 && number3 <= number2 && number3 <= number4) {
                } else {
                    smallestNumber = number4;
                }


                System.out.println("These are the SMALLEST-TO-AVERAGE numbers: ");
                do {
                    System.out.println(smallestNumber + 1);
                } while (smallestNumber < average);


                userinput.close();
            }
        }
    }
}
