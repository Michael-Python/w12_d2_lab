public class Card {
    int securityNumber;
    String expiryDate;
    String cardNumber;

    public int getSecurityNumber() {
        return securityNumber;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public Card(int securityNumber, String expiryDate, String cardNumber) {
        this.securityNumber = securityNumber;
        this.expiryDate = expiryDate;
        this.cardNumber = cardNumber;
    }
}
