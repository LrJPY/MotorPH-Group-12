
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMD PC
 */
public class Payslip {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String Empno;
        double hourlyrate;
        double dailyrate;
        double weeklyrate;
        int wdays;
        double basicsal; 
        int overtime;
        int positionlevel;    
        double actualpag = 0;
        double actualphil;
        double totalded;
        double totalgross;
        double netpay;
        double totalallow;
        int level;
        
       
        
      
         
        
        System.out.println("Employee No.:");
        Empno = input.next();
       
        System.out.println("Hourly rate:");
        hourlyrate = input.nextDouble();
        System.out.println("No. of Worked Days:");
        wdays = input.nextInt();
        
        //Salary computation
        dailyrate = hourlyrate * 8;
        weeklyrate = dailyrate * 5;
        basicsal = dailyrate * wdays;
        System.out.println("Daily Rate:"+dailyrate);
        System.out.println("Weekly Rate:"+weeklyrate);
        System.out.println("Basic Salary:"+basicsal);
        
       //Overtime 
        
       //Total Allowances
       level = input.nextInt();
       
       switch(level){
           case 1:
               System.out.println(2500);
           case 2: 
               System.out.println(3100);
           case 3:
               System.out.println(3500);
           case 4:
               System.out.println(4500);
           case 5:
               System.out.println(4500);
        
    }
       System.out.println("Position Level:");
       positionlevel = input.nextInt();
       
      
       
       //PAGIBIG
       if (basicsal >= 5000)
       {
           System.out.println("EE PAGIBIG Contribution:100");
       } else{
           actualpag = basicsal *0.02;
           System.out.println("EE PAGIBIG Contribution:"+actualpag);
       
       }
       
       //Philhealth
       actualphil = basicsal *0.025;
       System.out.println("EE Philhealth Contribution:"+actualphil);
       
      //Tax
      
      
      //Gross Pay
      totalgross = basicsal;
      System.out.println("Gross Pay:"+totalgross);
      
      //Total Deductions
      totalded = actualpag + actualphil;
      System.out.println("Total Deductions:"+totalded);
      
      //Net Pay
      netpay = totalgross - totalded;
      System.out.println("Net Pay:"+netpay);
      
      
       
       
       
       
       
       
       
              
    }
       
                
        
        
    }

