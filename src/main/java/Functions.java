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


}
