import java.util.Scanner;

public class CheckFromWeek {
    public static void main(String[] args) {
        String initialHours;
        String amountWanted;
        String yesOrNo;
        String yesOrNoTwo;
        String carCompany;
        String carModel;
        String carMake;
        String carYear;
        String termOfLease;
        String payPerMonth;
        String downPayment;
        String tradeInValue;
        String dueAtSigning;
        int weekBonus;
        int unionFees;
        int Hours;
        int amountSaving;
        int yesOrNoStatement;
        int yesOrNoStatementTwo;
        double Cash;
        double Tax;
        double beforeTax;
        double afterTax;
        double timeOfSaving;

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

        System.out.println("Press 1 to open the Time of Saving Calculator\nPress 0 to open the Car Payment Options Calculator");
        yesOrNo = keyboard.nextLine();
        yesOrNoStatement = Integer.parseInt(yesOrNo);
        if(yesOrNoStatement == 1){
            System.out.println("Enter a price to see how long it will take to reach it.");
            amountWanted = keyboard.nextLine();
            amountSaving = Integer.parseInt(amountWanted);
            timeOfSaving = amountSaving / roundOffAT;
            double roundOffTOF = Math.round(timeOfSaving * 100) / 100;

            System.out.println("+-----------------------+");
            System.out.println("|    Time of Saving     |");
            System.out.println("+-----------------------+");
            System.out.println("| Wanted Amount: $" + amountWanted + "  |");
            System.out.println("| Weekly Amount: $" + roundOffAT + " |");
            System.out.println("| Weeks: " + roundOffTOF + "            |");
            System.out.println("+-----------------------+");
            System.out.println(" ");
            System.out.println("Press 1 to open the Car Payment Options Calculator\nPress 0 to close the program");
        }
        if(yesOrNoStatement == 0){
            System.out.println("Are you sure want to use the Car Payments Calculator?\n1 for Yes     0 for No");
        }

        yesOrNoTwo = keyboard.nextLine();
        yesOrNoStatementTwo = Integer.parseInt(yesOrNoTwo);

        if(yesOrNoStatementTwo == 1){
            System.out.println("+---------------------------+");
            System.out.println("|        Car Payment        |");
            System.out.println("+---------------------------+");
            System.out.println("| Weekly Income:            |");
            System.out.println("| Monthly Income:           |");
            System.out.println("| Car Company:              |");
            System.out.println("| Car Model:                |");
            System.out.println("| Car Make:                 |");
            System.out.println("| Car Year:                 |");
            System.out.println("| Term of Lease:            |");
            System.out.println("| Pay Per Month:            |");
            System.out.println("| Down Payment:             |");
            System.out.println("| Trade-in Value:           |");
            System.out.println("| Due at Signing:           |");
            System.out.println("| Worth It?:                |");
            System.out.println("+---------------------------+");

            System.out.println("Car Company?");
            carCompany = keyboard.nextLine();
            System.out.println("Car Model?");
            carModel = keyboard.nextLine();
            System.out.println("Car Make?");
            carMake = keyboard.nextLine();
            System.out.println("Car Year?");
            carYear = keyboard.nextLine();
            System.out.println("How long's the term of lease?");
            termOfLease = keyboard.nextLine();
            System.out.println("How much would you pay per month?");
            payPerMonth = keyboard.nextLine();
            System.out.println("Down Payment amount?");
            downPayment = keyboard.nextLine();
            System.out.println("What's the value of the trade in if any?");
            tradeInValue = keyboard.nextLine();
            System.out.println("How much is due at signing?");
            dueAtSigning = keyboard.nextLine();

            String worthIt;

            int payPerMonthCompare;
            payPerMonthCompare = Integer.parseInt(payPerMonth);

            System.out.println("+---------------------------+");
            System.out.println("|        Car Payment        |");
            System.out.println("+---------------------------+");
            System.out.println("| Weekly Income: $" + roundOffAT + "     |");
            System.out.println("| Monthly Income: $" + roundOffAT*4 + "   |");
            System.out.println("| Car Company: " + carCompany + "        |");
            System.out.println("| Car Model: " + carModel + "          |");
            System.out.println("| Car Make: " + carMake + "           |");
            System.out.println("| Car Year: " + carYear + "            |");
            System.out.println("| Term of Lease: " + termOfLease + " months  |");
            System.out.println("| Pay Per Month: $" + payPerMonth + "/month |");
            System.out.println("| Down Payment: $" + downPayment + "          |");
            System.out.println("| Trade-in Value: $" + tradeInValue + "        |");
            System.out.println("| Due at Signing: $" + dueAtSigning + "      |");
            if(payPerMonthCompare > roundOffAT*4) {
                System.out.println("| Worth It?: No         |");
            } else if(payPerMonthCompare < roundOffAT*4) {
                System.out.println("| Worth It?: Yes            |");
            }
            System.out.println("+---------------------------+");
        }
    }
}