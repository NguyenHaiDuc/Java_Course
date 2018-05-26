package fantasy11230.gmail.com;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		int luachon;
		ArrayList<Student> listSt = new ArrayList<>();
		Students students = new Students();
		listSt.add(new Student("01", "Trần Bảo", 1999, false));
		listSt.add(new Student("02", "Trần Viết Bảo", 1989, true));
		listSt.add(new Student("03", "Hồ Quang Cường Đạt", 1998, false));
		listSt.add(new Student("04", "Mai Văn Đạt", 1988, true));
		listSt.add(new Student("05", "Nguyễn Hải Đức", 1997, false));
		students.setSt(listSt);

		ArrayList<Employer> listEm = new ArrayList<>();
		Employers employers = new Employers();
		listEm.add(new Employer("01", "Phạm Trọng Hòa", 1987, true, 2));
		listEm.add(new Employer("02", "Nguyễn Thanh Lai", 1996, true, 8));
		listEm.add(new Employer("03", "Cao Hữu Lâm", 1986, true, 4));
		listEm.add(new Employer("04", "Nguyễn Thế Lân", 1995, true, 6));
		listEm.add(new Employer("05", "Nguyễn Văn Thành Lộc", 1985, true, 10));
		employers.setEm(listEm);
		;

		do {
			System.out.println("1. Tìm theo tên Học Sinh");
			System.out.println("2. Tìm theo tuổi Học Sinh");
			System.out.println("3. Tìm theo giới tính Học Sinh Nam");
			System.out.println("4. Tìm theo giới tính Học Sinh nữ");
			System.out.println("5. Tìm nhân viên theo lương");
			System.out.println("6. Thoát chương trình");
			System.out.println("Nhập lựa chọn");
			luachon = new Scanner(System.in).nextInt();

			switch (luachon) {
			case 1:
				System.out.println("Nhập vào tên cần tìm kiếm");
				String ten = new Scanner(System.in).nextLine();
				System.out.println(students.TimKiem(ten));
				break;

			case 2:
				System.out.println("Nhập số đầu");
				int from = new Scanner(System.in).nextInt();
				System.out.println("Nhập số cuối");
				int to = new Scanner(System.in).nextInt();
				System.out.println(students.TimKiem(from, to));
				break;
			case 3:
				System.out.println("Các học sinh có giới tính nam là: \n");
				System.out.println(students.TimKiem(true));

				break;
			case 4:
				System.out.println("Các học sinh có giới tính nữ là: \n");
				System.out.println(students.TimKiem(false));
				break;
			case 5: {
				System.out.println("Nhập số đầu");
				int from1 = new Scanner(System.in).nextInt();
				System.out.println("Nhập số cuối");
				int to1 = new Scanner(System.in).nextInt();
				System.out.println(employers.TimKiem(from1, to1));
				break;
			}
			}
			if (luachon == 6)
				break;
		} while (true);
	}

}
