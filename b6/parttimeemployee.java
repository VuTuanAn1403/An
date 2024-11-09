package b6;

public class parttimeemployee extends emplayee {
	private int hoursPerweek;

	public parttimeemployee() {
		// TODO Auto-generated constructor stub
	}

	public parttimeemployee(int hoursPerweek, String employername, String datehired, String name, int age,
			char gender) {
		super(employername, datehired, name, age, gender);
		this.hoursPerweek = hoursPerweek;
	}

	public int getHoursPerweek() {
		return hoursPerweek;
	}

	public void setHoursPerweek(int hoursPerweek) {
		this.hoursPerweek = hoursPerweek;
	}

	@Override
	public String toString() {
		return "parttimeemployee [hoursPerweek=" + hoursPerweek + ", toString()=" + super.toString() + "]";
	}

}
