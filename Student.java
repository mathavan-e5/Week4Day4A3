package Week4Day2;

public class Student {
	public void getStudentinfo(int id) {
		System.out.println("id" +id);
		
	}
	public void getStudentinfo1(int id,String name) {
		System.out.println("Id"+id+ "Name"+name);
		
	}
	public void getStudentinfo1(String email,long phonenumber) {
		System.out.println("Email"+email+ "Phonenumber is"+phonenumber);
		
	}
	public static void main(String[] args) {
		Student sum=new Student();
		sum.getStudentinfo(555);
		sum.getStudentinfo1(555, "mathavan");
		sum.getStudentinfo1("123@",834083023);
	
		
	}

}
