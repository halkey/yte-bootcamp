package exceptions;

public class Unchecked {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        System.out.println(num[5]); //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    }
}