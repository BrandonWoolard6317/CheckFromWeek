import java.util.Scanner;

public class CheckFromWeek {
    public static void main(String[] args) {
        String initialHours;
        int weekBonus;
        int unionFees;
        int Hours;
        double Cash;
        double Tax;
        double beforeTax;
        double afterTax;

        Scanner keyboard = new Scanner(System.in);

        weekBonus = 116;
        unionFees = 30;

        System.out.println("+-----------------------+");
        System.out.println("|    Check Calculator   |");
        System.out.println("+-----------------------+");
        System.out.println("| Name: Brandon Woolard |");
        System.out.println("| Job: UPS              |");
        System.out.println("| Hours Worked:         |");
        System.out.println("| Before Tax:           |");
        System.out.println("| Tax:                  |");
        System.out.println("| Union Fees:           |");
        System.out.println("| After Taxes:          |");
        System.out.println("+-----------------------+");

        System.out.println("Hours worked this week?");
        initialHours = keyboard.nextLine();
        Hours = Integer.parseInt(initialHours);

        Cash = (Hours * 10.35);
        Tax = (Cash * 0.0575);
        beforeTax = Cash + weekBonus;
        afterTax = (beforeTax - Tax) - unionFees;

        double roundOffBT = Math.round(beforeTax * 100) /100;
        double roundOffTax = Math.round(Tax * 100) / 100;
        double roundOffAT = Math.round(afterTax*100)/100;

        System.out.println("+-----------------------+");
        System.out.println("|    Check Calculator   |");
        System.out.println("+-----------------------+");
        System.out.println("| Name: Brandon Woolard |");
        System.out.println("| Job: UPS              |");
        System.out.println("| Hours Worked: " + Hours + " hours|");
                System.out.println("| Before Tax: $" + roundOffBT + "    |");
        System.out.println("| Tax: -$" + roundOffTax + "           |");
        System.out.println("| Union Fees: -$" + unionFees + "      |");
        System.out.println("| After Taxes: $" + roundOffAT + "   |");
        System.out.println("+-----------------------+");

    }
}