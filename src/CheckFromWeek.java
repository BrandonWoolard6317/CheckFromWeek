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

        int weekBonus;
        int unionFees;
        int Hours;
        int amountSaving;
        int yesOrNoStatement;
        int yesOrNoStatementTwo;

        double Cash;
        double Tax1;
        double Tax2;
        double Tax3;
        double Tax4;
        double Tax5;
        double beforeTax;
        double afterTax;
        double timeOfSaving;
        double dueAtSigning;

        Scanner keyboard = new Scanner(System.in);

        weekBonus = 200;
        unionFees = 30;

        System.out.println("+-----------------------------+");
        System.out.println("|       Check Calculator      |");
        System.out.println("+-----------------------------+");
        System.out.println("| Name: Brandon Woolard       |");
        System.out.println("| Job: UPS                    |");
        System.out.println("| Hours Worked:               |");
        System.out.println("| Before Tax:                 |");
        System.out.println("| Tax:                        |");
        System.out.println("| Union Fees:                 |");
        System.out.println("| After Taxes:                |");
        System.out.println("+-----------------------------+");

        System.out.println("Hours worked this week?");
        initialHours = keyboard.nextLine();
        Hours = Integer.parseInt(initialHours);

        Cash = (Hours * 10.35);
        Tax1 = (Cash * 0.061998092366389);
        Tax2 = (Cash * 0.014522630072921);
        Tax3 = (Cash * 0.121042429463709);
        Tax4 = (Cash * 0.017722531614412);
        Tax5 = (Cash * 0.025014614934925);
        totalTax = (Tax1+Tax2+Tax3+Tax4+Tax5);
        beforeTax = Cash + weekBonus;
        afterTax = (beforeTax - totalTax) - unionFees;

        double roundOffBT = Math.round(beforeTax * 100) /100;
        double roundOffTax = Math.round(totalTax * 100) / 100;
        double roundOffAT = Math.round(afterTax*100)/100;

        System.out.println("+-----------------------------+");
        System.out.println("|       Check Calculator      |");
        System.out.println("+-----------------------------+");
        System.out.println("| Name: Brandon Woolard       |");
        System.out.println("| Job: UPS                    |");
        System.out.println("| Hours Worked: " + Hours + " hours      |");
        System.out.println("| Before Tax: $" + roundOffBT + "          |");
        System.out.println("| Tax: -$" + roundOffTax + "                 |");
        System.out.println("| Union Fees: -$" + unionFees + "            |");
        System.out.println("| After Taxes: $" + roundOffAT + "         |");
        System.out.println("+-----------------------------+");

        System.out.println("Press 1 to open the Time of Saving Calculator\nPress 0 to open the Car Payment Options Calculator");
        yesOrNo = keyboard.nextLine();
        yesOrNoStatement = Integer.parseInt(yesOrNo);
        if(yesOrNoStatement == 1){
            System.out.println("+-------------------------+");
            System.out.println("|     Time of Saving      |");
            System.out.println("+-------------------------+");
            System.out.println("| Wanted Amount:          |");
            System.out.println("| Weekly Amount: $" + roundOffAT + "   |");
            System.out.println("| Weeks:                  |");
            System.out.println("+-------------------------+");
            System.out.println("Enter a price to see how long it will take to reach it.");
            amountWanted = keyboard.nextLine();
            amountSaving = Integer.parseInt(amountWanted);
            timeOfSaving = amountSaving / roundOffAT;
            double roundOffTOF = Math.round(timeOfSaving * 100) / 100;

            System.out.println("+-------------------------+");
            System.out.println("|     Time of Saving      |");
            System.out.println("+-------------------------+");
            System.out.println("| Wanted Amount: $" + amountWanted + "    |");
            System.out.println("| Weekly Amount: $" + roundOffAT + "   |");
            System.out.println("| Weeks: " + roundOffTOF + "              |");
            System.out.println("+-------------------------+");
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
            System.out.println("| Term of Payment:          |");
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
            System.out.println("How long's the term of the payment?");
            termOfLease = keyboard.nextLine();
            System.out.println("How much would you pay per month?");
            payPerMonth = keyboard.nextLine();
            System.out.println("Down Payment amount?");
            downPayment = keyboard.nextLine();
            System.out.println("What's the value of the trade in if any?");
            tradeInValue = keyboard.nextLine();

            int payPerMonthCompare;
            payPerMonthCompare = Integer.parseInt(payPerMonth);

            int payPerMonthAddition;
            int downPaymentAddition;
            int tradeInValueAddition;
            payPerMonthAddition = Integer.parseInt(payPerMonth);
            downPaymentAddition = Integer.parseInt(downPayment);
            tradeInValueAddition = Integer.parseInt(tradeInValue);
            dueAtSigning = payPerMonthAddition + downPaymentAddition + tradeInValueAddition;

            System.out.println("+---------------------------+");
            System.out.println("|        Car Payment        |");
            System.out.println("+---------------------------+");
            System.out.println("| Weekly Income: $" + roundOffAT + "     |");
            System.out.println("| Monthly Income: $" + roundOffAT*4 + "   |");
            System.out.println("| Car Company: " + carCompany + "        |");
            System.out.println("| Car Model: " + carModel + "          |");
            System.out.println("| Car Make: " + carMake + "              |");
            System.out.println("| Car Year: " + carYear + "            |");
            System.out.println("| Term of Payment: " + termOfLease + " months|");
            System.out.println("| Pay Per Month: $" + payPerMonth + "/month |");
            System.out.println("| Down Payment: $" + downPayment + "        |");
            System.out.println("| Trade-in Value: $" + tradeInValue + "        |");
            System.out.println("| Due at Signing: $" + dueAtSigning + "   |");
            if(payPerMonthCompare > roundOffAT*2) {
                System.out.println("| Worth It?: No             |");
            } else if(payPerMonthCompare < roundOffAT*2) {
                System.out.println("| Worth It?: Yes            |");
            }
            System.out.println("+---------------------------+");
        }
    }
}
