package numbers;

public class Equals {

    public static void main(String args[]) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a = 5;

        System.out.println(x.equals(y)); //false
        System.out.println(x.equals(z)); //true
        System.out.println(x.equals(a)); //false
    }

}