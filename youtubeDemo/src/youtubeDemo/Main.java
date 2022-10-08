package youtubeDemo;

public class Main {

	public static void main(String[] args) {

//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.calculate();
//		creditManager.save();

//		Person person = new Person();
//		person.setId(1);
//		person.setFirstName("Enes");
//		person.setLastName("Aksüt");
//		person.setNationalIdentity("123456");
//		person.setCity("Eskişehir");
//
//		CustomerManager customerManager = new CustomerManager(person);
//		customerManager.save();
//		customerManager.delete();
//		customerManager.save(1,"Enes","Aksüt","123456");
		
//		Company company = new Company();
//		company.setId(2);
//		company.setTaxNumber("984653");
//		company.setCity("Ankara");
//		company.setCompanyName("İnşaat A.Ş.");
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//		Customer c1 = new Customer();
//		Customer c2 = new Person();
//		Customer c3 = new Company();

		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager(),new MySqlCustomerDal());
		customerManager.giveCredit();
		customerManager.add();
		//IoC Container
		
	}

}
