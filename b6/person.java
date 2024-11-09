package b6;

public class person {
	private String name;
	private int age;
	private char gender;

	public person() {
		// TODO Auto-generated constructor stub
	}

	public person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
