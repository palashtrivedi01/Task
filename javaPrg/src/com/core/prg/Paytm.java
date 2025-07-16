package com.core.prg;
import  java.util.Scanner;
//we use implements when we use interface
interface PaymentMethod {

    void authorizePayment(double amount);

    void processPayment();
}
class CreditCard implements PaymentMethod {

    double balance =1000000000000.0;
    @Override
    public void authorizePayment(double amount) {
        if (balance>amount){
            processPayment();

        }
    }
    @Override
    public  void processPayment() {
        System.out.println("Payment SucessFull");

    }
}
class DebitCard implements PaymentMethod{

    double balance=10000000.0;

    @Override
    public void authorizePayment(double amount) {
        if (balance>amount){
            processPayment();

        }

    }

    @Override
    public void processPayment() {
        System.out.println("Payment SucessFull");

    }
}
class PayPal implements   PaymentMethod{

    double amount =100000000.0;

    @Override
    public void authorizePayment(double amount) {

    }

    @Override
    public void processPayment() {

    }
}
public class Paytm {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("which payment method will you refer CreditCard/DebitCard/Paypal??");
        String paymentMethod = a.nextLine().toLowerCase();

        switch (paymentMethod) {
            case "creditcard":
                System.out.println("Enter your Bill Amount");
                double creditBill=a.nextDouble();
                CreditCard c = new CreditCard();
                c.authorizePayment(creditBill);

            case "debitcard":
                System.out.println("Enter your Bill Amount");
                double debitBill=a.nextDouble();
                DebitCard d=new DebitCard();
                d.authorizePayment(debitBill);

            case "paypal":
                System.out.println("Enter your Bill Amount");
                double paypalBill=a.nextDouble();
                PayPal p=new PayPal();
                p.authorizePayment(paypalBill);
        }

    }
}