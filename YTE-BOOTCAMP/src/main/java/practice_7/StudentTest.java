package practice_7;

import java.util.*;
import java.util.stream.Collectors;

/*
    Practice

    Student class
    String name, int age, String department, double gpa (hepsi private)
    Tüm fieldların setlendiği bir constructor
    Public getter metotları

    Öğrencilerin yaşları 20'den küçük ve GPA'leri 3.0 ve 3.0'dan büyük olanlara ait toplam GPA değerini bulun

    Map<String, List<Student>> studentsByDepartment -> şeklinde bölüm bazında öğrenci listesi oluşturun (hint: groupingBy())

    Map<String, Double> averageGpaByDepartment şeklinde bölümlerin ortalama GPA'sını hesaplayın. (hint: entrySet())

    String departmentWithHighestAverageGpa şeklinde en yüksek ortalama GPA'e sahip bölümü bulun (hint: Map.Entry.comparingByValue())

    Kullanılacak öğrenci listesi aşağıdaki gibidir

    Name    |  Age  |       Department           |  GPA  |
    ------------------------------------------------------
    Ali     |   18  |   Computer Science         |  3.5  |
    Ayşe    |   20  |   Biology                  |  3.2  |
    Mehmet  |   17  |   Electrical Engineering   |  3.0  |
    Zeynep  |   19  |   Mathematics              |  3.8  |
    Ahmet   |   21  |   Physics                  |  3.1  |
    Hayriye |   21  |   Physics                  |  3.5  |
    Veli    |   49  |   Computer Science         |  3.0  |

*/

class Student {
    private String name;
    private int age;
    private String department;
    private double gpa;

    public Student(String name, int age, String department, double gpa) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //Bunu kaldırıp kodu tekrar çalıştırdığınızda studentsByDepartment'ın farklı şekilde konsola basıldığını göreceksiniz.
    //Ne olup bittiğini öğrenmek için aşağıdaki linki inceleyebilirsiniz.
    //https://stackoverflow.com/questions/29318996/the-connection-between-system-out-println-and-tostring-in-java
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Department: " + department + ", GPA: " + gpa;
    }
}

public class StudentTest {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 18, "Computer Science", 3.5));
        students.add(new Student("Ayşe", 20, "Biology", 3.2));
        students.add(new Student("Mehmet", 17, "Electrical Engineering", 3.0));
        students.add(new Student("Zeynep", 19, "Mathematics", 3.8));
        students.add(new Student("Ahmet", 21, "Physics", 3.1));
        students.add(new Student("Hayriye", 21, "Physics", 3.5));
        students.add(new Student("Veli", 49, "Computer Science", 3.0));

        // Soru: Öğrencilerin yaşları 20'den küçük ve GPA'ları 3.0 ve 3'den büyük olanlarına ait toplam GPA değerini bulun.

        var result = students.stream()
                .filter(student -> student.getAge() < 20 && student.getGpa() >= 3.0)
                .map(Student::getGpa)
                .reduce(0d, Double::sum);

        System.out.println("Toplam GPA:" + result);
        System.out.println("-----------------------");

        // Bölüm bazında öğrenci listeleri oluşturun

        Map<String, List<Student>> studentsByDepartment = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        System.out.println("studentsByDepartment: " + studentsByDepartment);
        System.out.println("-----------------------");

        // Bölümlerin ortalama GPA'sını hesaplayın

        Map<String, Double> averageGpaByDepartment = studentsByDepartment.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .mapToDouble(Student::getGpa)
                                .average()
                                .orElse(0)
                ));

        System.out.println("averageGpaByDepartment: " + averageGpaByDepartment);
        System.out.println("-----------------------");

        // En yüksek ortalama GPA'ya sahip bölümü bulun

        String departmentWithHighestAverageGpa = averageGpaByDepartment.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("N/A");

        System.out.println("departmentWithHighestAverageGpa: " + departmentWithHighestAverageGpa);
    }

    List<String> sada = new ArrayList<>();
    Set<String> eqewq = new HashSet<>();
}