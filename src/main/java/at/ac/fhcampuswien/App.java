package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scanner= new Scanner(System.in);
    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char charnum = 'Z';
        long longnum = 80L;
        float floatnum1 = 44e-1f;
        float floatnum2 = 5.5f;
        double dblnum1 = 8.88e1;
        double dblnum2 = 99.9;
        int zahl1 = (int)charnum;
        int zahl2 = 0xface;
        int zahl3 = 012;
        int zahl4 = (int)longnum;
        int zahl5 = (int)floatnum1;
        int zahl6 = (int)floatnum2;
        int zahl7 = (int)dblnum1;
        int zahl8 = (int)dblnum2;
        int sum = zahl1+zahl2+zahl3+zahl4+zahl5+zahl6+zahl7+zahl8;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int num1;
        int num2;
        int sum;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int num1;
        int num2;
        System.out.println("Before Swap:");
        System.out.print("x: ");
        num1 = scanner.nextInt();
        System.out.print("y: ");
        num2 = scanner.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap:");
        System.out.println("x: " + num1);
        System.out.println("y: " + num2);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int num1;
        int num2;
        System.out.print("n1: ");
        num1 = scanner.nextInt();
        System.out.print("n2: ");
        num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.println("n1 > n2");
        }
        else if(num1 < num2){
            System.out.println("n2 > n1");
        }
        else if(num1 == num2){
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int revenue;
        System.out.print("Enter annual Revenue: ");
        revenue = scanner.nextInt();
        if (revenue<0 || revenue>=100000) {
            System.out.println("Invalid Revenue");
        }
        else if (revenue>=0 && revenue<20000) {
            System.out.println("Poor Sales Revenue");
        }
        else if (revenue>=20000 && revenue<50000) {
            System.out.println("Average Sales Revenue");
        }
        else if (revenue>=50000 && revenue<80000) {
            System.out.println("Good Sales Revenue");
        }
        else if (revenue>=80000 && revenue<100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        int eingabe;
        System.out.print("Enter CommissionClass: ");
        eingabe = scanner.nextInt();
        switch(eingabe){
            case 1 :
            System.out.println("Your Commission Rate was set to 0.01");
            break;
            case 2 :
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3 :
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4 :
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;

        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        int year;
        boolean isleapyear = false;
        System.out.print("Year: ");
        year = scanner.nextInt();
        if(year % 4 == 0){
           isleapyear = true;

        }
        if (year % 100 ==0 && year % 400 != 0){
            isleapyear = false;
        }
        if(year % 400 == 0){
            isleapyear = true;
        }

        if (isleapyear == true){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        int number;
        int reversedNum = 0;
        int rest;
        System.out.print("Number: ");
        number =scanner.nextInt();
        while (number!=0){ //While as long as Number != 0
            rest = number%10; //Number divided by 10 and rest captured in variable
            reversedNum = reversedNum * 10;//reversed number multiplied by 10 for correct digit
            reversedNum= reversedNum + rest;//getting rest into reversedNum
            number = number / 10;
        }
        System.out.println(reversedNum);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}