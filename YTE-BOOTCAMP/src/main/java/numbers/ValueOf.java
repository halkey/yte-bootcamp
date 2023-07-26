package numbers;

public class ValueOf {

    public static void main(String args[]) {
        Integer x =Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("444",16);

        System.out.println(x); //9
        System.out.println(c); //5.0
        System.out.println(a); //80.0
        System.out.println(b); //1092
    }

}