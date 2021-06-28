/**
 * this class calculates the # of months needed to pay off a loan with a given amount of principal and
 * interest rate
 */
public class Interest {

    /**
     * initial amount borrowed
     */
    private double amount;
    /**
     * annual interest rate
     */
    private double rate;
    /**
     * payment for a day
     */
    private double payment;
    /**
     * the payment where it doesn't grow or shrink
     */
    private double nochange;

    /**
     * assume each month is 30 days
     */
    public Interest() {
        amount = 350000.00;
        rate = .0675;
        payment = 2500.00;
    }

    /**
     * Question 1 computes the number of months needed to pay off the loan
     */
    public int computeMonths() {
        int days = 0;                //# of days it takes to pay off
        int months = 0;                //# of months it takes to pay off
        double p = amount;            //the principal
        double r = (double) rate / 365.0;        //the daily rate
        double d = payment;            //assuming payments are made per month
        boolean paidoff = false;                //checks payment
        while (!paidoff) {
            p = p * (1 + r);
            days++;
            if (days % 30 == 0 || days == 1) {
                months++;
                p -= d;
            }
            if (p <= 0)
                paidoff = true;
        }
        return months;
    }

    /**
     * Question 2 computes the number of months needed to pay off the loan
     */
    public int computeMonths2() {
        int days = 0;                             //# of days it takes to pay off
        int months = 0;                           //# of months it takes to pay off
        double p = amount;                        //the principal
        double r = (double) rate / 365.0;           //the daily rate
        double d = 1250.0;                       //assuming payments are made per month
        boolean paidoff = false;                  //payment check
        while (!paidoff) {
            p = p * (1 + r);    //update amount of principal owed
            days++;        //incerement days

            /** if its the middle of the month then make a payment*/
            if (days % 15 == 0)
                p -= d;

            /** if it's the beginning of the month then make a payment*/
            if (days % 30 == 0 || days == 1) {
                months++;
                p -= d;
            }
            if (p <= 0)
                paidoff = true;
        }
        return months;
    }

    /**
     * Question 3 doesn't change when paying monthly
     */
    public double noChange() {
        int days = 0;                //# of days it takes to pay off
        int months = 0;                //# of months it takes to pay off
        double p = amount;            //the principal
        double r = (double) rate / 365.0;        //the daily rate
        double i = 0.0;
        for (i = 2500.0; p <= 0; i--) {
            p = p * (1 + r);
            days++;
            if (days % 30 == 0 || days == 1) {
                months++;
                p -= i;
                System.out.println((p * r));
            }

        }
        return i;
    }

    public static void main(String[] args) {
        Interest in = new Interest();
        System.out.println("The number of months to pay off when paying in the beginning of " +
                "month: " + in.computeMonths());
        System.out.println("The number of months to pay off when paying in the beginning of " +
                "month and middle of the month: " + in.computeMonths2());

        System.out.println("The number of months to pay off when paying in the beginning of " +
                "month and middle of the month: " + in.noChange());

    }

}
