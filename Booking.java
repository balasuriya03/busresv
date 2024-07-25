package Busresv;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

	public class Booking {
	    public String passengerName;
	    public int busNO;
	    public Date date;

	    public Booking(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter name of the passenger: ");
	        passengerName=sc.next();
	        System.out.println("Enter bus no: ");
	        busNO=sc.nextInt();
	        System.out.println("Enter date ");
	        String dateInput=sc.next();
	        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	  try{
	        date=dateFormat.parse(dateInput);
	  }catch (ParseException e){
	    e.printStackTrace();
	  }
	    }
	    public boolean isAvailable() throws SQLException{
	        
	    BusDAO busdao = new BusDAO();
	    BookingDAO bookingdao = new BookingDAO();
	    int capacity = busdao.getCapacity(busNO);
	    
	    int booked = bookingdao.getBookedCount(busNO,date);
     
	                return booked<capacity;
	    }
	}
	
	

