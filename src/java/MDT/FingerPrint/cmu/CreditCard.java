package MDT.FingerPrint.cmu;



import java.util.ArrayList;

public class CreditCard {
	private String creditCardNumber;
	private String expiry;
	private String cardHolderName;
	private String cvv;
        private String isPrimary;
	private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
        
        public String getIsPrimary(){
            return this.isPrimary;
        }
        public void setIsPrimary(String isPrim){
            this.isPrimary= isPrim;
        }
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public void addTransaction(Transaction t){
		transactionList.add(t);
	}
	public ArrayList<Transaction> getTransactionList(){
		return transactionList;
		
	}
	
	
}
