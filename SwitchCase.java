import javax.swing.JOptionPane;
public class SwitchCase{
public static void main(String[] args){
	String userrole=JOptionPane.showInputDialog("Enter role");
	switch(userrole){
	case "Administrator":
	System.out.print("Welcome "+userrole+ "!");
	break;
	case "Faculty":
	System.out.print("Welcome " +userrole+"!");
	break;
	case "Staff":
	System.out.print("Welcome "+userrole+"!");
	break;
	case "Student":
	System.out.print("Welcome "+userrole+ "!");
	break;
	case "Guest":
	System.out.print("Welcome " +userrole+"!");
}
}
}
