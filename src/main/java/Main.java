import java.util.*;
public class Main {
    public static void main(String[] args) {
        Circle cir=new Circle();
        System.out.println("The area of the circle is "+ cir.areaofthecircle(10) );

        Armstrong armstrong=new Armstrong();
        armstrong.isarmstrong(153);

        Biggestnumber max=new Biggestnumber();
        System.out.println("The biggest number is "+max.biggestelement());

        BMIcalculator bmi=new BMIcalculator();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please tell us your height in inches: ");
        double height=scanner.nextDouble();
        System.out.println("Please tell us your weight in pounds: ");
        double weight=scanner.nextDouble();
        System.out.println("The bmi for your given height and weight is: "+bmi.calculatebmi(weight,height));
        System.out.println(bmi.message(bmi.calculatebmi(weight,height)));


    }





}
