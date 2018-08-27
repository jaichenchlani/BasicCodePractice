public class App {

    public static void main( String[] args )
    {
        int intInput;
        String strInput;


//        System.out.println("Hello World!");

//        System.out.println(Functions.addNumbers(1,2));

//        System.out.println("Factorial 5 = " + Functions.getFactorial(5));


        strInput = "one two three four";

//        System.out.println(strInput.substring(0,1));
//        System.out.println(strInput.substring(1,strInput.length()));

        System.out.println("Reverse of " + strInput + " is: " + Functions.getReverseString(strInput) + "\n");

        System.out.println("Converted First Letter to Uppercase for " + strInput + " : " + Functions.capitalizeFirstLetter(strInput) + "\n");

        intInput = 1421;

        System.out.println("Is " + intInput + " Prime? " + Functions.isPrime(intInput) + "\n");

        System.out.println("Original Sentence: " + strInput + "\n");

        System.out.println("Reversed Sentence: " + Functions.getReverseSentence(strInput) + "\n");


    }

}
