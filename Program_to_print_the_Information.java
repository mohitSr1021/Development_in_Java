// Employee class!!
class Employee {

    // Name, Address, Year, and Salary are data members of class Employee.
    private final String name;
    private final String address;
    private final int year;
    private final double Salary;

    // Create a Employee constructor for the Employee class.
    public Employee(String takingString, int takingInteger, int takingSalary, String takingAddress){
        name = takingString;
        year = takingInteger;
        Salary = takingSalary;
        address = takingAddress;
    }
    public String getName() {        // getName() method of Employee class...
        return name;
    }
    public int getYear(){           // getYear() method of Employee class...
        return year;
    }
    public double getSalary(){     // getSalary() method of Employee class...
        return Salary;
    }
    public String getAddress(){     // getAddress() method of Employee class...
        return address;
    }
}

public class Program_to_print_the_Information {
  public static void main(String[] args) {
      Employee e1 = new Employee("Peter",2000,50000,"abc-delhi");    // Create an e1 object of class Employee (This will call the constructor). and we pass a Actual parameter to the constructor.
      Employee e2 = new Employee("Alycan",2001,48649,"xyz-Mumbai");  // Create an e2 object of class Employee (This will call the constructor).and we pass a Actual parameter to the constructor.
      Employee e3 = new Employee("Alex",2002,98750,"pqr-Goa");      // Create an e3 object of class Employee (This will call the constructor).and we pass a Actual parameter to the constructor.
      System.out.println("\t\t\n*******//WELCOME TO JAVA PROGRAMMING//*******");
      System.out.println("Name"+"\t\tYear of joining" + "\t\t\tSalary"+ "\t\t\tAddress");
      System.out.println(e1.getName()+"\t\t\t"+e1.getYear()+"\t\t\t\t"+e1.getSalary()+"\t\t\t"+e1.getAddress());  // printing details of employee 1
      System.out.println(e2.getName()+"\t\t\t"+e2.getYear()+"\t\t\t\t"+e2.getSalary()+"\t\t\t"+e2.getAddress());  // printing details of employee 2
      System.out.println(e3.getName()+"\t\t\t"+e3.getYear()+"\t\t\t\t"+e3.getSalary()+"\t\t\t"+e3.getAddress());  // printing details of employee 3
  }
}
