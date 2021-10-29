package Session;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student19 {

		int stid;
		String stname, email, mobile;

		public Student19(int stid, String stname, String email, String mobile) {
			this.stid = stid;
			this.stname = stname;
			this.email = email;
			this.mobile = mobile;
		}

		public void show() {
			System.out.println("id :" + stid + ", name : " + stname + ", Email :" + email + ", Mob :" + mobile);
		}

		public void show1() {
			System.out.println("id :" + stid + ", name : " + stname + ", Email :" + email + ", Mob :" + mobile);
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String emailpat = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			Student19[] St = new Student19[5];
			System.out.println("enter 5 student details : id, name, Email, Mob");

			for (int i = 0; i < 5; i++) {
				int sid = sc.nextInt();
				String na = sc.next();
				String em = sc.next();
				String mob = sc.next();
				if (em.matches(emailpat) && mob.matches("\\+?\\d{10}"))
					St[i] = new Student19(sid, na, em, mob);
				else {
					System.out.println("please check mobileNo or email");
					break;
				}
			}
			sc.close();

			try {

				System.out.println("\nStudents details whose MobNo starts with 98 ");
				for (Student19 std : St) {

					if (std.mobile.startsWith("98")) {

						std.show();

					}

				}
				int count = 0;
				System.out.println("\n Students  email id from mail");
				for (Student19 std : St) {
					Pattern p = Pattern.compile("@g(oogle)?mail\\.com$");
					Matcher m = p.matcher(std.email);
					if (m.find())

						std.show();
					else {

						count++;

					}
				}
				System.out.println("");
				System.out.println(" \nNumber of students whose email id is not from gmail is : " + count);

			} catch (Exception e) {
				System.out.println(" make sure u had enter right mobNo and email");
			}

		

	}

}
