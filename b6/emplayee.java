package b6;

public class emplayee extends person {
	private String employername, datehired;

	public emplayee() {
		// TODO Auto-generated constructor stub
	}

	public emplayee(String employername, String datehired, String name, int age, char gender) {
		super(name, age, gender);

		this.employername = employername;
		this.datehired = datehired;
	}

	public String getEmployername() {
		return employername;
	}

	public void setEmployername(String employername) {
		this.employername = employername;
	}

	public String getDatehired() {
		return datehired;
	}

	public void setDatehired(String datehired) {
		this.datehired = datehired;
	}

	@Override
	public String toString() {
		return "emplayee [employername=" + employername + ", datehired=" + datehired + ", toString()="
				+ super.toString() + "]";
	}

}
