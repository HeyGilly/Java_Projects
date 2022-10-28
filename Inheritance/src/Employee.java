public class Employee extends Person {

    // Now I don\'t have to worry about defining the name age or gender.
    // Since we inherited from Person Class.

    private String employeeID;
    private String title;

    public String getEmployeeID() {return employeeID;}
    public void setEmployeeID(String employeeID) {this.employeeID = employeeID;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}



}
