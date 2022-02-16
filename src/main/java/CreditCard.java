public class CreditCard extends Card implements IScan{
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

}
