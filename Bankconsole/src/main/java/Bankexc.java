import java.lang.*;
import java.sql.*;
import java.util.*;
public class Bankexc 
{	  
	public static void main(String[] args) 
	{
        Connection con = ConnectionUtils.getConnection();
        Scanner sc = new Scanner(System.in);
        String name,password,namecheck;
        float balance;
        int choice, id,idcheck;

        String insertCmd, readCmd, updateCmd, deleteCmd;
        System.out.println("welcome to the bank");
        System.out.println("MENU");
       while(true)
       {
    	   System.out.println("Select from the Given Options: ");
       
        System.out.println("1: Createnewuser  2:getuser by id 3: delete users 4:deposit 5:check balance 6: with draw");
        System.out.println("Enter your choice");
        choice = sc.nextInt();

        try {
            switch (choice) 
            {
            case 1:
                System.out.println("Enter  name: ");
                name = sc.next();
                System.out.println("create password ");
                password = sc.next();
                System.out.println("minumum balance should be 1000: ");
                balance = sc.nextFloat();
                System.out.println("Enter  id as u wishes: ");
                id = sc.nextInt();
                insertCmd = "insert into namepass(name1,password1,balance,id) values(?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(insertCmd);
                	if(balance>1000)
                	{
               
                        stmt.setString(1, name);
                        stmt.setString(2, password);
                        stmt.setDouble(3, balance);
                        stmt.setInt(4, id);
                	}
                	else {
                		System.out.println("balance should be above 1000");
                	}
                if (stmt.execute()) {
                    System.out.println("Error!");
                } else {
                    System.out.println("Executed");
                }
                stmt.close();
                break;
            case 2:
            	System.out.println("enter the id");
            	id=sc.nextInt();
                readCmd = "select * from namepass where id=?";
                stmt = con.prepareStatement(readCmd);
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + " "
                            + rs.getInt(4));
                }
                stmt.close();
                break;
           case 3:
                System.out.println("Enter the id number: ");
                id = sc.nextInt();
                deleteCmd = "delete from namepass where id =?";
                stmt = con.prepareStatement(deleteCmd);
                stmt.setInt(1, id);
                if (stmt.execute()) {
                    System.out.println("Error!");
                } else {
                    System.out.println("Executed");
                }
                stmt.close();
                break;
                
            case 4:
            	float deposit,upb;
            	int af=0;
                System.out.println("Enter  id: ");
                id = sc.nextInt();
                System.out.println("enter ammount to deposit");
                deposit=sc.nextFloat();
                readCmd = "select balance from namepass where id=?";
                stmt = con.prepareStatement(readCmd);
                stmt.setInt(1, id);
                ResultSet rs1 = stmt.executeQuery();
                rs1.next();
                System.out.println ("current balance of ur account is:"+(rs1.getFloat("balance")+deposit) );
                upb=rs1.getFloat("balance");
                stmt.close();
                System.out.println(upb);
                	updateCmd = "update namepass set balance = ? where id =?";
                    PreparedStatement psstmt = con.prepareStatement(updateCmd);
                    psstmt.setFloat(1,(upb+deposit));
                    psstmt.setInt(2, id);
                    af=psstmt.executeUpdate();
                    System.out.println( af);
                    if (psstmt.execute()) {
                        System.out.println("Error!");
                    } else {
                        System.out.println("Executed");
                    }
                      psstmt.close();
                
            		   
                stmt.close();
                break;
            case 5:
            	System.out.println("Enter  id: ");
                id = sc.nextInt();
                readCmd = "select balance from namepass where id=?";
                stmt = con.prepareStatement(readCmd);
                stmt.setInt(1, id);
                ResultSet rs2 = stmt.executeQuery();
                  while(rs2.next()) {
                 System.out.println ("current balance of ur account is:"+rs2.getFloat("balance"));
                  }
                  stmt.close();
                  break;
            case 6:
            	float withd,dnb;
            	int awi=0;
                System.out.println("Enter  id: ");
                id = sc.nextInt();
                System.out.println("enter ammount to withdraw");
                withd=sc.nextFloat();
                readCmd = "select balance from namepass where id=?";
                stmt = con.prepareStatement(readCmd);
                stmt.setInt(1, id);
                ResultSet rs3 = stmt.executeQuery();
                rs3.next();
                System.out.println ("current balance of ur account is:"+(rs3.getFloat("balance")-withd) );
                dnb=rs3.getFloat("balance");
                stmt.close();
                System.out.println(dnb);
                	updateCmd = "update namepass set balance = ? where id =?";
                    PreparedStatement psstmt1 = con.prepareStatement(updateCmd);
                    psstmt1.setFloat(1,(dnb-withd));
                    psstmt1.setInt(2, id);
                    awi=psstmt1.executeUpdate();
                    System.out.println( awi);
                    if (psstmt1.execute()) {
                        System.out.println("Error!");
                    } else {
                        System.out.println("Executed");
                    }
                      psstmt1.close();
                
            		   
                stmt.close();
                break;
            default:
                System.out.println("Wrong Choice");
            break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       }
	}	
}
