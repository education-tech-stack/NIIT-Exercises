
package alchem;
import java.util.Scanner;

public class EmployeeDetails {
    
    public static int option;
    String id, name, dept, dsg, doj, dob, mstats, dom;
    EmployeeDetails()
    {
        id=name=dept=dsg=doj=dob=mstats=dom="N.A";
    }
    Scanner scan = new Scanner(System.in);
    private void showMenu()
    {
        System.out.println("----Menu----\n1. Enter data \n2. Update Data \n3. Display Data \n4. EXIT \n\nChoose the option :");
        
        try{
            option = scan.nextInt();
            if(option>3 || option<1)
                throw new RuntimeException();
        }
        catch(RuntimeException e){
            System.err.print("INCORRECT OPTION CHOOSE BETWEEN 1 TO 3 \nChoose the option :");
            option = scan.nextInt();
        }
        switch(option)
        {
            case 1: enterData();
                break;
            case 2: updateData();
                break;
            case 3: display();
                break;
            case 4: 
                break;
            /*default:{
                System.out.println("INCORRECT OPTION CHOOSE BETWEEN 1 TO 3");     //shortest approach without exceptions handling
                showMenu();
            }*/
            
        }
        
    }
    private void enterData()
    {        
        System.out.println("Enter the following details \nEmployee ID :");  //id = evaluation();
        try{
            id=scan.next().toLowerCase();
            if(id.charAt(0)=='e')
                throw new RuntimeException();
            
        }
        catch(RuntimeException e){
            System.err.println("Employee ID can't start with e or E.\nRe-Enter the id : ");
            id=scan.next().toLowerCase();
        }
        
        System.out.println("Name                 : ");  name=scan.nextLine();
        System.out.println("Departament          : ");  dept=scan.nextLine();
        System.out.println("Designation          : ");  dsg=scan.nextLine();
        System.out.println("Date of Joining      : ");  doj=scan.nextLine();
        System.out.println("Date of Birth        : ");  dob=scan.nextLine();
        System.out.println("Maritial Status(M/NM): ");  mstats=scan.nextLine();
        if(mstats.compareTo("M")==0 || mstats.compareTo("m")==0)
        {System.out.println("Date of Marriage     : ");  dom=scan.nextLine();  }
    }
    private void updateData()
    {}
    private void display()
    {
        System.out.println("Enter the Employee ID : "); id=scan.nextLine();
        
    }
    /*String evaluation(){     //!working
        String eid="N.A";
        try{
            eid=scan.next().toLowerCase();
            if(eid.charAt(0)=='e')
                throw new RuntimeException();
            else
                return eid;
        }
        catch(RuntimeException e){
            System.err.println("Employee ID can't start with e or E.\nRe-Enter the id : ");
            evaluation();
        }
    }*/
    public static void main(String[] args)
    {
        EmployeeDetails emp = new EmployeeDetails();
        while(option!=4)
        emp.showMenu();
    }
}
