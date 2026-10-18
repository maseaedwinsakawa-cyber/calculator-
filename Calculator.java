//Importing the Scanner class to allow the user input the values from the keyboard 

import java.util.Scanner;
// Creating the class calculator using object oriented programming 

class Calculator {

    private double result;
    private double number1;
    private double number2;

    //Our No argument constructor
    public Calculator() {

    }

    //Our parameterized constructor
    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;

    }

    // Our getter and setter methods to get and set the values of number1 and number2 since they are private variables as declared 
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;

    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    // Our methods to perform the basic arithmetic operations of addition, subtraction, multiplication and division
    public double add() {
        result = number1 + number2;
        System.out.println("The result of addition is: " + result);
        return result;
    }

    public double subtract() {
        result = number1 - number2;
        System.out.println("The result of subtraction is: " + result);
        return result;
    }

    public double multiply() {
        result = number1 * number2;
        System.out.println("The result of multiplication is: " + result);
        return result;

    }

    public double divide() {
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        } else {
            result = number1 / number2;
            System.out.println("The result of division is: " + result);
            return result;
        }
    }

    public double getResult() {
        return result;
    }

    public double bodmas() {
        result = (number1 / number2) + (number1 * number2) - (number1 + number2);
        System.out.println("The result of BODMAS operation is: " + result);
        return result;
    }

    public double modulus() {
        result = number1 % number2;
        System.out.println("The result of modulus operation is: " + result);
        return result;
    }

    //Our main method to run the calculator program and take input from the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        // introducing the calculator object and calling the methods to perform the arithmetic operations
        Calculator calculator = new Calculator(a, b);
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
        calculator.bodmas();
        calculator.modulus();
    }
}
