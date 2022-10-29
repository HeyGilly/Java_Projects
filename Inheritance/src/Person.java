import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;
    private String gender;

    // First Constructor
    public Person() {
        System.out.println("In Person default constructor");
    }

    // Second Constructor - will be using Super()
    public Person(String name){
        System.out.println("2nd Person Constructor  Name is set");
    }

    // Getter and Setter
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
}
