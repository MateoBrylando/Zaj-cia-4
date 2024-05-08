/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);
      Service s = new Service();
      System.out.print("Podaj Imie Studenta: ");
      String name = input.nextLine();
      System.out.print("Podaj Wiek Studenta: ");
      int age = input.nextInt();
      s.addStudent(new Student(name, age));
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {
    }
  }
}