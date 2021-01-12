public class DebitCard extends Card implements IScan{
    private int sortCode;
    private int accountNumber;

//    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
        super(securityNumber, expiryDate, cardNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public String scan() {
        return "Payment Complete";
    }
}
