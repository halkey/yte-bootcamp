package practice_4;

public class MyException extends Exception {
    public MyException(int number) {
        super(number + " sayısı 100'den büyük");
    }
}
