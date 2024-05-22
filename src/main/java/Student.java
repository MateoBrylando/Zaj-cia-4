public class Student {
  private String Name;
  private int Age;
  private String Nazwisko;
  private int Dzien;
  private int Miesiac;
  private int Rok;
  

  public Student(String name, String nazwisko, int age, int dzien, int miesiac, int rok)  {
    Name = name;
    Age = age;
    Nazwisko = nazwisko;
    Dzien = dzien;
    Miesiac = miesiac;
    Rok = rok;
    
  }
  public String GetName() { return Name; }
  public int GetAge() { return Age; }  
  public String GetNazwisko() { return Nazwisko; }
  public int GetDzien() { return Dzien; }
  public int GetMiesiac() { return Miesiac; }
  public int GetRok() { return Rok; }
  public String ToString() {
    return Name + " " + Nazwisko + " " + Age + " " + Dzien + " " + Miesiac + " " + Rok;
  }
  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if (data.length != 6) {
      return new Student("Parse Error" ,"Parse Error", 1, 1, -1, -1);
    }
    return new Student(data[0], data[1],
                       Integer.parseInt(data[2]),
                       Integer.parseInt(data[3]),
                       Integer.parseInt(data[4]),
                       Integer.parseInt(data[5]));
  }
}