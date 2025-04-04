public class PolymorphismWithInterface {
    public static void main(String[] args) {
        NetBanking netBanking = new NetBanking();
        netBanking.pay();

        CashPayment cashPayment = new CashPayment();
        cashPayment.pay();

        CardPayment cardPayment = new CardPayment();
        cardPayment.pay();
    }
}

interface Payment{
    void pay();
}

class NetBanking implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment done via net banking");
    }
}

class CardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment done via card");
    }
}

class CashPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment done via cash");
    }
}
