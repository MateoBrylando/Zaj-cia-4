public class Student {

  private String Name;
  private int Age;
  private String Nazwisko;
  private String Urodziny;
  public Student(String name, String nazwisko, int age, String urodziny) {
    Name = name;
    Age = age;
    Nazwisko = nazwisko;
    Urodziny = urodziny;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}  
  public String GetNazwisko() {return Nazwisko;}
  public String GetUrodziny() {return Urodziny;}
  public String ToString() {
    return Name + " " + Nazwisko + " "+Integer.toString(Age)+" "+Urodziny;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error" ,"Parse Error", -1,"Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]),data[3]);
  }
}