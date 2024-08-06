import java.util.Scanner;
public class Donation {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        System.out.println("enter amount from the first donator");
        Double don1 = collect.nextDouble();
         System.out.println("enter amount from the second donator");
        Double don2 = collect.nextDouble();
         System.out.println("enter amount from the third donator");
        Double don3 = collect.nextDouble();
         System.out.println("enter amount from the fourth donator");
        Double don4 = collect.nextDouble();
         System.out.println("enter amount from the fifth donator");
        Double don5 = collect.nextDouble();
        
        double vatdon1 = (don1 * 5)/(100);
        double vatdon2 = (don2 * 5)/(100);
        double vatdon3 = (don3 * 5)/(100);
        double vatdon4 = (don4 * 5)/(100);
        double vatdon5 = (don5 * 5)/(100);


        double total = (don1 + don2 + don3 + don4 + don5);
        System.out.println("the total donation is : " + total);

         double vattotal = (vatdon1 + vatdon2 + vatdon3 + vatdon4 + vatdon5);
         System.out.println("the total 5% vat deducted is : " + vattotal);

        double VAT = (total * 5)/(100);
        System.out.println("the 5% VAT deducted is " + VAT );
         

        
    }
}
