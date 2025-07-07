package practice_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DogumGunuTebrikProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Doğum Günü Tebrik Programı ---");
        System.out.print("Doğum gününüzü ve saatinizi girin (örn. 2000-09-15): ");
        String dogumGunuInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dogumGunu = LocalDate.parse(dogumGunuInput, formatter);
        LocalDate bugun = LocalDate.now();

        if (dogumGunu.getMonthValue() == bugun.getMonthValue() && dogumGunu.getDayOfMonth() == bugun.getDayOfMonth()) {
            System.out.println("Bugün doğum gününüz! İyi ki doğdunuz! 🎉🎂");
        } else {
            long kalanGun;
            boolean isDogumGunuGecmis = bugun.getDayOfYear() - dogumGunu.getDayOfYear() >= 1;
            if (isDogumGunuGecmis) {
                LocalDate dogumGunuBuYil = dogumGunu.plusYears(bugun.getYear() - dogumGunu.getYear());
                kalanGun = ((bugun.until(dogumGunuBuYil, ChronoUnit.DAYS) + 365));
            } else {
                kalanGun = dogumGunu.getDayOfYear() - bugun.getDayOfYear() - 1;
            }
            System.out.println("Doğum gününüze " + kalanGun + " gün " + "kaldı. 🎉🎂");
        }
        scanner.close();
    }
}
