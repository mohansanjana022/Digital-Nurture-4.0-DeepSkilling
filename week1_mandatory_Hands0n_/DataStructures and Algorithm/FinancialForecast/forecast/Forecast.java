
package forecast;
import java.util.Scanner;


public class Forecast {
    public static double FutureValue(double principal,double rate,double years){
        if(years==0)
            return principal;
        else
            return FutureValue(principal,rate,years-1)*(1+rate);
    }

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double ratePercent = sc.nextDouble();
        double rate = ratePercent / 100.0;  // Convert % to decimal

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
     double result=FutureValue(principal,rate,years);
     System.out.printf("Future Value after %d years = ₹%.2f\n", years, result);
    }   
}
