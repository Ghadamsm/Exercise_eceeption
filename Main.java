import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//  1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input .


//        try {
//
//            System.out.println("please enter a 1st number :");
//            int first = s.nextInt();
//
//            System.out.println("please enter a 2nd number :");
//            int second = s.nextInt();
//
//
//            int sum = first + second;
//            int mul = first - second;
//            int sub = first * second;
//            int div = first / second;
//            int rem = first % second;
//
//
//            System.out.println(first + " + " + second + " = " + sum);
//            System.out.println(first + " - " + second + " = " + mul);
//            System.out.println(first + " * " + second + " = " + sub);
//            System.out.println(first + " / " + second + " = " + div);
//            System.out.println(first + " % " + second + " mod " + rem);
//        } catch (InputMismatchException e ){
//            System.out.println(e.getMessage());
//        }





//        2.Write a Java program that takes a number as input and prints its multiplication table up to 10.


//        try {
//
//
//            System.out.println("Enter a number :");
//            int num = s.nextInt();
//
//            for (int i = 1; i <= 10; i++) {
//
//                int sub = num * i;
//                System.out.println(num + " * " + i + " = " + sub);
//
//            }
//
//        } catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }





        //  3. Write a Java program to print the area and perimeter of a circle.



//        try {
//
//
//            System.out.println(" please enter a Radius : ");
//            double radius = s.nextDouble();
//
//
//            double area = Math.PI * radius * radius;
//            double perimeter = 2 * Math.PI * radius;
//
//            System.out.println("Perimeter is = " + perimeter);
//            System.out.println("Area is = " + area);
//
//
//        } catch (InputMismatchException e ){
//            System.out.println(e.getMessage());
//        }






        //  4.Java program to find out the average of a set of integers.



//
//        try {
//            System.out.println("Enter the count of numbers : ");
//            int number;
//            number = s.nextInt();
//            double num1 = 0;
//            double av = 0;
//            int i;
//
//            while (number != -1) {
//
//                for (i = 0; i <= number; i++) {
//
//                    num1 = number + number;
//
//                    System.out.println("Enter a integer : ");
//                    number = s.nextInt();
//                }
//
//                av = num1 / i;
//            }
//
//
//            System.out.println("The average is : " + av);
//
//
//        }catch (InputMismatchException e ) {
//            System.out.println(e.getMessage());
//        }









        //  5.Write a Java program that accepts three integers as input, adds the first two integers
//together, and then determines whether the sum is equal to the third integer.


//        try {
//
//
//            System.out.println("Input the first number : ");
//            int first = s.nextInt();
//
//
//            System.out.println("Input the second number : ");
//            int second = s.nextInt();
//
//
//            System.out.println("Input the third number : ");
//            int third = s.nextInt();
//
//            int sum = first + second;
//
//            thir(first, second, third, sum);
//        } catch (InputMismatchException e ) {
//            System.out.println(e.getMessage());
//        } catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }






        //  6.Java program to check whether the given number is even or odd.



//try {
//
//
//    System.out.println("Enter a number : ");
//    int number = s.nextInt();
//
//    numb(number);
//
//}   catch (InputMismatchException e ) {
//            System.out.println(e.getMessage());
//        } catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }




//  7.Java program to convert the temperature in Centigrade to Fahrenheit.


//        try {
//
//
//            System.out.println("Enter temperature in Centigrade : ");
//            double centigrade = s.nextDouble();
//
//            double fahrenheit = (centigrade * 1.8) + 32;
//
//            System.out.println("Temperature in Fahrenheit is : " + fahrenheit);
//
//        }   catch (InputMismatchException e ) {
//            System.out.println(e.getMessage());
//        }



        //  8.Write a Java program that takes a string and a number from the user,then prints the
//character in the given index.



//
//        System.out.println("Input a string : ");
//        String string = s.nextLine();
//
//try {
//
//
//    System.out.println("Input a number : ");
//    int number = s.nextInt();
//
//
//    System.out.println("Expected Output : " + string.charAt(number));
//} catch (InputMismatchException e){
//    System.out.println(e.getMessage());
//}






//  9.Write a Java program to print the area and perimeter of a rectangle.

//
//try{
//        System.out.println("Width = ");
//        double width = s.nextDouble();
//
//
//        System.out.println("Height = ");
//        double height = s.nextDouble();
//
//
//
//        double area = width * height ;
//        double perimeter = 2 * (width + height) ;
//
//
//        System.out.println("Area is " + width + " * " + height + " = " + area);
//        System.out.println("Perimeter is 2* ( " + width + " + " + height + " ) = " + perimeter);
//} catch (InputMismatchException e){
//    System.out.println(e.getMessage());
//}





        //  10.Write a Java program to compare two numbers.



//        try {
//            System.out.println("Input first integer : ");
//            int first = s.nextInt();
//
//
//            System.out.println("Input second integer : ");
//            int second = s.nextInt();
//
//
//            if (first > second) {
//                if (first >= second) {
//
//                    System.out.println(first + " != " + second);
//                    System.out.println(first + " >= " + second);
//
//                }
//                System.out.println(first + " > " + second);
//
//            } else if (first < second) {
//                if (first <= second) {
//
//                    System.out.println(first + " != " + second);
//                    System.out.println(first + " <= " + second);
//
//                }
//                System.out.println(first + " < " + second);
//
//            } else if (first == second) {
//                System.out.println(first + " == " + second);
//            }
//
//        } catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }






        //  11.Write a Java program to convert seconds to hours, minutes and seconds.



//        System.out.println("Input seconds : ");



//        try {
//
//
//            int second = s.nextInt();
//
//
//            int hour = second / 3600;
//            int min = (second % 3600) / 60;
//            int sec = (second % 3600) % 60;
//
//            System.out.println(hour + " : " + min + " : " + sec);
//
//
//        } catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }







        //  12.Write a Java program that accepts four integers from the user and prints equal if all
//four are equal, and not equal otherwise.



//        try {
//
//            System.out.println("Input first number : ");
//            int first = s.nextInt();
//
//
//            System.out.println("Input second number : ");
//            int second = s.nextInt();
//
//
//            System.out.println("Input third number : ");
//            int third = s.nextInt();
//
//
//            System.out.println("Input fourth number : ");
//            int fourth = s.nextInt();
//
//            inte(first , second , third , fourth);
//
//
//        } catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        } catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }





        //  13.Write a Java program that reads an integer and check whether it is negative, zero, or positive.



//
//try {
//    System.out.println("input a number : ");
//    int number = s.nextInt();
//
//    check(number);
//
//}catch (InputMismatchException e){
//    System.out.println(e.getMessage());
//} catch (Exception e1){
//    System.out.println(e1.getMessage());
//}
//





        //  14.Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered

//
//
//try {
//
//    System.out.println("enter a number or -1 to quit");
//    int num = s.nextInt();
//
//    int positive = 0, negative = 0, zero = 0;
//
//    while (num != -1) {
//        System.out.println("enter a number");
//        num = s.nextInt();
//
//        if (num > 0) {
//            positive++;
//        } else if (num < 0) {
//            negative++;
//        } else {
//            zero++;
//        }
//
//    }
//
//    System.out.println(positive + " positives ");
//    System.out.println(negative + " negatives ");
//    System.out.println(zero + " Zero ");
//
//} catch (InputMismatchException e){
//    System.out.println(e.getMessage());
//}







//  15.Write a program to enter the numbers till the user wants and at the end the program
//should display the largest and smallest numbers entered.


//
//try {
//    System.out.println("enter the number or 0 to quit : ");
//    int num = s.nextInt();
//
//    int large = Integer.MIN_VALUE;
//    int small = Integer.MAX_VALUE;
//
//    while (num != 0) {
//
//        System.out.println("enter the number : ");
//        num = s.nextInt();
//
//        if (num > large) {
//            large = num;
//
//        }
//        if (num < small) {
//            small = num;
//        }
//
//
//    }
//    System.out.println("the large number : " + large);
//    System.out.println("the small number : " + small);
//
//} catch (InputMismatchException e){
//    System.out.println(e.getMessage());
//}













    }




//    Q5

//    public static void thir (int first , int second , int third , int sum ) throws Exception {
//
//
//        if (sum == third){
//
//            System.out.println("The result is : true");
//
//        } else {
//           throw new Exception("false");
//        }
//
//    }





//    Q6

//    public static void numb(int number) throws Exception{
//
//        if (number%2 == 0){
//            System.out.println("The number is Even");
//
//        } else {
//            throw new Exception("The number is Odd");
//        }
//
//
//    }




//    Q12


//    public static void inte (int first , int second , int third , int fourth) throws Exception{
//
//
//
//        if ((first == second) && (third == fourth)) {
//
//            System.out.println("Numbers are equal ");
//        }else {
//          throw new Exception("Numbers are not equal !");
//        }
//
//    }





//    Q13

//    public static void check(int number) throws Exception{
//
//
//        if (number >= 1){
//            System.out.println("Number is positive");
//
//        } else if (number == 0) {
//            System.out.println("Number is Zero");
//
//        }else {
//            throw new Exception("Number is negative");
//        }
//
//
//    }


}