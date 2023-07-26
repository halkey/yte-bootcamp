package practice_4;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();

        if (number > 100)
            throw new MyException(number);
    }
}
