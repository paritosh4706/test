import java.text.DecimalFormat;
import java.util.Scanner;

class SalaryApp
{
    static private double hra,da,gross,pf,netSal,AnnualPkg;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static double salaryCalc(double Basic)
    {
        hra=0.1*Basic;
        System.out.println("House Rent Allowance \t"+df.format(hra));
        da=0.1*Basic;
        System.out.println("Dearness Allowance \t"+df.format(da));
        gross=Math.round(hra+da+Basic);
        System.out.println("Gross Salary \t"+df.format(gross));
        pf=0.1*Basic;
        System.out.println("PF \t"+df.format(pf));
        netSal=Math.round(gross-pf);
        System.out.println("NetSalary \t"+df.format(netSal));
        AnnualPkg=gross*12;

        return AnnualPkg;



    }

}
public class SalaryApplication {

    public static void main(String[] args) {
        System.out.println("Enter your basic Salary");
        Scanner sc=new Scanner(System.in);
        double basic=sc.nextDouble();
       double annual= SalaryApp.salaryCalc(basic);
        System.out.println("Annual Salary \t"+annual);
    }
}
