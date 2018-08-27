public class Functions {

    public static int addNumbers(int a, int b) {
        return a+b;
    }

    public static long getFactorial(int a) {
        long answer = 1;
        for (int i = a; i > 1; i--) {
            answer = answer * i;
            System.out.println(answer);
        }
        return answer;
    }

    public static String getReverseString(String s) {
        String resultString = "";
        for (int i = s.length()-1; i >= 0; i--) {
            resultString = resultString + s.substring(i,i+1);
        }
        return resultString;
    }

    public  static String capitalizeFirstLetter(String s) {
        String resultString = "";
        String firstLetter = s.substring(0,1);
        String restOfString = s.substring(1,s.length());
        firstLetter = firstLetter.toUpperCase();
        resultString = firstLetter + restOfString;
        return  resultString;
    }

    public static boolean isPrime(int a) {

        if (a <= 1) {
            System.out.println("Decision A: Less than or equal to 1.\n");
            return false;
        }

        if (a == 2) {
            System.out.println("Decision B: 2 is a Prime Number.\n");
            return true;
        }

        if (isEven(a)) {
            System.out.println("Decision C: Even Number.\n");
            return false;
        }

        for (int i = 3; i <= a/2 ; i=i+2) {
            if (a % i == 0) {
                System.out.println("Decision D: Divisible by " + i);
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
