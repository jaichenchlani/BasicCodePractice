public class App {

    public static void main( String[] args )
    {
        int intInput;
        String strInput;


//        System.out.println("Hello World!");

//        System.out.println(Functions.addNumbers(1,2));

//        System.out.println("Factorial 5 = " + Functions.getFactorial(5));


        strInput = "abcd";

//        System.out.println(strInput.substring(0,1));
//        System.out.println(strInput.substring(1,strInput.length()));

        System.out.println("Reverse of " + strInput + " is: " + Functions.getReverseString(strInput));

        System.out.println("Converted First Letter to Uppercase for " + strInput + " : " + Functions.capitalizeFirstLetter(strInput));


    }

}
