public class Main {
    public static void main(String[] args) {

        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAccountNo("122300891564");
        accountDetails.setSurname("Sharma");
        accountDetails.setPin(4971);

        System.out.println(accountDetails.getAccountNo());
        System.out.println(accountDetails.getSurname());
    }
}

class AccountDetails{
    private String accountNo;
    private String surname;
    private int pin;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}