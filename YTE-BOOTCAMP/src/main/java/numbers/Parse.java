package numbers;

public class Parse {

    public static void main(String args[]) {
        int x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("111", 10);

        System.out.println(x); //9
        System.out.println(c); //5.0
        System.out.println(b); //111
    }

}