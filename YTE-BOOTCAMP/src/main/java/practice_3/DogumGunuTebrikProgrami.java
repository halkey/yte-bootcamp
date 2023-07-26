package practice_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunuTebrikProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Doğum Günü Tebrik Programı ---");
        System.out.print("Doğum gününüzü ve saatinizi girin (örn. 2000-09-15 13:30): ");
        String dogumGunuInput = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dogumGunu = LocalDateTime.parse(dogumGunuInput, formatter);

        LocalDateTime bugun = LocalDateTime.now();

        if (dogumGunu.getMonthValue() == bugun.getMonthValue() && dogumGunu.getDayOfMonth() == bugun.getDayOfMonth()) {
            System.out.println("Bugün doğum gününüz! İyi ki doğdunuz! 🎉🎂");
        } else {
            long gunKaldi = bugun.until(dogumGunu, ChronoUnit.DAYS);
            long saatkaldi = bugun.until(dogumGunu, ChronoUnit.HOURS);
            System.out.println("Doğum gününüze " + gunKaldi + " gün, veya " + saatkaldi + " saat " + "kaldı. 🎉🎂");
        }
        scanner.close();
    }
}
