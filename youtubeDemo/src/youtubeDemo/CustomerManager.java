package youtubeDemo;

public class CustomerManager {
	private Customer customer;
	private ICreditManager _creditManager;
	private ICustomerDal customerDal;
	

	public CustomerManager(Customer customer,ICreditManager _creditManager,ICustomerDal customerDal) {
		super();
		this.customer = customer;
		this._creditManager=_creditManager;
		this.customerDal = customerDal;
		
	}

	public void save() {
		System.out.println("Müşteri kaydedildi");
	}

	public void delete() {
		System.out.println("Müşteri silindi");
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Müşteriye kredi verildi.");
	}
	public void add() {
		customerDal.add();
	}
}
