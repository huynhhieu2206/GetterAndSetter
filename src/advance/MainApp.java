package advance;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Person[] Person = new Person[10];

		// Nhập thông tin của 10 sinh viên
		input(Person, scanner);
		// Sắp xếp danh sách sinh viên theo điểm trung bình tăng dần
		sortStudentsByGpa(Person);

		// In ra thông tin của 10 sinh viên
		print(Person);
		scanner.close();
	}

	// Phương thức nhập thông tin của 10 sinh viên
	public static void input(Person[] person, Scanner scanner) {
//		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < person.length; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ dòng trống
			System.out.print("Địa chỉ: ");
			String DC = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phone = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			double DTB = scanner.nextDouble();
			scanner.nextLine(); // Đọc bỏ dòng trống

			person[i] = new Person(name, age, DC, phone, DTB);
		}
	}

	// Phương thức in ra thông tin của 10 sinh viên
	public static void print(Person[] person) {
		System.out.println("\nThông tin của danh sách 10 sinh viên:");
		for (int i = 0; i < person.length; i++) {
			System.out.println("Sinh viên thứ " + (i + 1) + ":");
			System.out.println("Tên: " + person[i].getName());
			System.out.println("Tuổi: " + person[i].getAge());
			System.out.println("Địa chỉ: " + person[i].getDC());
			System.out.println("Số điện thoại: " + person[i].getPhone());
			System.out.println("Điểm trung bình: " + person[i].getDTB());
			System.out.println();
		}
	}

	// Phương thức sắp xếp danh sách sinh viên theo điểm trung bình tăng dần
	public static void sortStudentsByGpa(Person[] persons) {
		for (int i = 0; i < persons.length - 1; i++) {
			for (int j = 0; j < persons.length - i - 1; j++) {
				if (persons[j].getDTB() > persons[j + 1].getDTB()) {
					// Swap
					Person temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;
				}
			}
		}
	}
}