package advance;

public class Person {
	private String name;
	private int age;
	private String DC;
	private String phone;
	private double DTB;

	public Person(String name, int age, String DC, String phone, double DTB) {
		this.name = name;
		this.age = age;
		this.DC = DC;
		this.phone = phone;
		this.DTB = DTB;

	}

	// Getter và setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi phải là số nguyên lớn hơn 0.");
        }
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String address) {
        this.DC = DC;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        if (DTB >= 0) {
            this.DTB = DTB;
        } else {
            System.out.println("Điểm trung bình phải là số thực lớn hơn hoặc bằng 0.");
        }
    }
}