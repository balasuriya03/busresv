package Busresv;

public class Bus{
  public int busNO;
  public boolean ac;
  public  int capacity;
 

 public Bus(int no,boolean ac,int cap){
   this.busNO=no;
   this.ac=ac;
   this.capacity=cap;

 }
 public int getBusNO(){
   return busNO;
 }
 public int getcapacity(){
   return capacity;
 }
 public boolean isAc(){
   return ac;
 }
 public void setcapacity(int cap){
   capacity=cap;
 }
 public void setAc(boolean val){
   ac=val;
 }

public void displaybusInfo(){
   System.out.println("Bus No: "+ busNO + " Ac: " + ac + " Total capacity: " +capacity) ;
}
 
   
}
