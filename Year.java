import java.util.Scanner;
public class Year {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year to check");
        int year = sc.nextInt();
            if(year<1 || year>9999){
                System.out.println("Invalid");
            }
            else if(year%4==0 && year%100!=0){
                System.out.println("The  year is a leap year");
            }
            else if((year%4==0 && year%100==0&&year%400==0)){
                System.out.println("The  year is a leap year");
            }
            
            else{
                System.out.println("Invalid year");
            }
        }
        
    }
    
