package numbers;

public class CompareTo {

    public static void main(String args[]) {
        Integer x = 5;

        //Integer value is greater than the argument (5>3) so, output is 1
        System.out.println(x.compareTo(3));

        //Integer value is equal to the argument so, output is 0
        System.out.println(x.compareTo(5));

        //Integer value is less than the argument (5<8) so, output is −1
        System.out.println(x.compareTo(8));
    }

}