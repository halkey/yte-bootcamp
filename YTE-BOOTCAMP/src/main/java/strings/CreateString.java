package strings;

public class CreateString {

    public static void main(String args[]) {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '!' };
        String helloString = new String(helloArray);
        System.out.println( helloString );
    }
}