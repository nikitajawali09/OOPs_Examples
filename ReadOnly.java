package encapsulation;

public class ReadOnly {
	
	private static String classTeacher="Anupama Rai";
	private static int classTeacherId=1332;
	
	public static void show() {
		System.out.println("Class teacher :"+getClassTeacher());
		System.out.println("Class Teacher Id :"+getClassTeacherId());
	}

	
	public static void main(String[] args) {
		ReadOnly.show();
	}


	public static String getClassTeacher() {
		return classTeacher;
	}


	public static void setClassTeacher(String classTeacher) {
		ReadOnly.classTeacher = classTeacher;
	}


	public static int getClassTeacherId() {
		return classTeacherId;
	}


	public static void setClassTeacherId(int classTeacherId) {
		ReadOnly.classTeacherId = classTeacherId;
	}


	
	
}
