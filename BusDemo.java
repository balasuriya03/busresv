package Busresv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BusDemo{
    public static void main(String[] args) throws SQLException {


    	BusDAO busdao = new BusDAO();
       
         busdao.displayBusInfo();
        
         
    int userOpt = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 to book and 2 to cancel");
    userOpt = sc.nextInt();
    
    
       while(userOpt==1){
         System.out.println("Enter 1 to book and 3 to exit");
         userOpt = sc.nextInt();
 
         if(userOpt==1){
            Booking booking =new Booking();
         if(booking.isAvailable()){
            BookingDAO bookingdao = new BookingDAO();
            bookingdao.addBooking(booking);
         
            System.out.println("Your booking is confirmed");
      }
         else
            System.out.println("Sorry. bus is full. Try another date");
       }
        }
       
       
     while(userOpt==2) {
    	 System.out.println("Enter 2 to Cancel and 3 to exit");
    	 userOpt = sc.nextInt();
    	 
    	 if(userOpt==2) {
    	 System.out.println("Enter the name: ");
    	String n=sc.next();
		   String query = "delete from booking where passenger_namae = ?";
		   Connection con = DBconnection.getConnection();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,n);
			pst.executeUpdate();
		   System.out.println("Your ticket is cancelled");
		   
    	 }
     }
    
       
    }
}