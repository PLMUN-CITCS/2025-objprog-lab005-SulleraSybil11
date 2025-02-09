public class MathLibraryDemo {
    public static void main(String[] args) {  //Defining main method


double base = 2;  //Declaring a double 
int exponent = 3;  //Declaring an int
double powerResult = Math.pow(base, exponent);  //Declaring a double
double numberForSqrt = 16;  //Declaring a double
double sqrtResult = Math.sqrt(numberForSqrt);  //Declaring a double
double decimalNumber = 5.67;  //Declaring a double
long roundedNumber = Math.round(decimalNumber);  
double randomNumber = Math.random();  //Declaring a double

System.out.println("Power: " + powerResult);  //Printing all out the declared variables
System.out.println("Square Root: " + sqrtResult);
System.out.println("Rounded Number: " + roundedNumber);
System.out.println("Random Number: " + randomNumber);

    }
}