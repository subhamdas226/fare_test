import java.util.Scanner;

import java.util.Scanner.*;
class Fare {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
  Scanner sc= new Scanner(System.in);
  int n = sc.nextInt();
  
  int distance= sc.nextInt();
  findFare obj = new findFare();

  if(n==1){
    obj.Mini(distance);
  }
  if(n==2){
    obj.sedan(distance);
  }
  if(n==3){
    obj.suv(distance);
    }
  }
}
  class findFare{
  void Mini(int distance){
    if(distance<=75){
      int r_fare = distance -3;
      int t_fare = 50 +(r_fare * 10);
      System.out.println(t_fare);
    }
    else{
      int t_fare = distance*8;
      System.out.println(t_fare);
    }
  }
 void sedan(int distance){ 
   if(distance<=100){
      int r_fare = distance -5;
      int t_fare = 80 +(r_fare * 12);
      System.out.println(t_fare);
    }
    else{
      int t_fare = distance*10;
      System.out.println(t_fare);
    }
 }

 void suv(int distance){
   if(distance<=100){
      int r_fare = distance -5;
      int t_fare = 100 +(r_fare * 15);
      System.out.println(t_fare);
    }
 }
}