public class Employee extends Person {

    // Now I don\'t have to worry about defining the name age or gender.
    // Since we inherited from Person Class.

    public Employee(){
        super("Bobby Smith");   // makes it possible to call any superclass constructor by using super
        System.out.println("In Employee default constructor");
    }

    private String employeeID;
    private String title;

    public String getEmployeeID() {return employeeID;}
    public void setEmployeeID(String employeeID) {this.employeeID = employeeID;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}



}
