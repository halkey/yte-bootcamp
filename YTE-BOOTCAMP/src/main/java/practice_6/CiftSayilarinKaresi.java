package practice_6;


import java.util.ArrayList;
import java.util.List;

public class CiftSayilarinKaresi {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int sumOfSquaredEvenNumbers = numbers.stream()
                .filter(n -> n > 0 && n % 2 == 0) // Sadece pozitif çift sayıları seç
                .map(n -> n * n) // Her sayının karesini al
                .reduce(0, Integer::sum); // Karesini alınan sayıların toplamını bul

        System.out.println("Listedeki pozitif çift sayıların karelerinin toplamı: " + sumOfSquaredEvenNumbers);

    }


}