import java.sql.SQLOutput;

public class Methode1 {
    public static void main(String[] args) {


        int result = add(6, 12);


        System.out.println("Das Ergebnis der Addition lautet " + result);

        String numberToString = toString(10);

        System.out.println("Die übergebene Zahl lautet : " + numberToString);

        System.out.println(checkIfGreaterThan100(110, 99));

    }

    public static int add(int var1, int var2){
        return var1 + var2;
    }

    public static String toString(int number){
        return "" + number;
    }

    public static String checkIfGreaterThan100(int value1, int value2){
        boolean isGreaterThan100 = value1 < 100 || value2 < 100;
        return "At least one number is greater than 100 " + isGreaterThan100;
    }
}