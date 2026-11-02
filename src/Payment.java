class Payment1 {
    double calculateAmount(double amount) {
        return amount;
    }

    // Overloaded method
    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

class CardPayment extends Payment1 {
    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 2 / 100);
    }
}

class UPIPayment extends Payment1 {
    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 1 / 100);
    }
}

public class Payment {
    public static void main(String[] args) {
        Payment1 p;

        p = new CardPayment();
        System.out.println("Card Payment: " + p.calculateAmount(1000));

        p = new UPIPayment();
        System.out.println("UPI Payment: " + p.calculateAmount(1000));

        Payment1 obj = new Payment1();
        System.out.println("After Discount: " +
                obj.calculateAmount(1000, 10));
    }
}