package kodlamaioWebsite.entities;

public class Instuctor {

	private int InstuctorId;
	private String InstuctorFirstName;
	private String InstuctorLastName;

	public Instuctor(int instuctorId, String instuctorFirstName, String instuctorLastName) {
		super();
		InstuctorId = instuctorId;
		InstuctorFirstName = instuctorFirstName;
		InstuctorLastName = instuctorLastName;
	}
	public Instuctor() {
	
	}

	public int getInstuctorId() {
		return InstuctorId;
	}

	public void setInstuctorId(int instuctorId) {
		InstuctorId = instuctorId;
	}

	public String getInstuctorFirstName() {
		return InstuctorFirstName;
	}

	public void setInstuctorFirstName(String instuctorFirstName) {
		InstuctorFirstName = instuctorFirstName;
	}

	public String getInstuctorLastName() {
		return InstuctorLastName;
	}

	public void setInstuctorLastName(String instuctorLastName) {
		InstuctorLastName = instuctorLastName;
	}

}
