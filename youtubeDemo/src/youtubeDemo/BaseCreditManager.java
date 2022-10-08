package youtubeDemo;

public abstract class BaseCreditManager implements ICreditManager {

	//DRY
	
	public abstract void  calculate();
	
	public  void save() {
		System.out.println("Kaydedildi.");
	}
}
