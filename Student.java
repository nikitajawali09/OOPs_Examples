package encapsulation;

public class Student {

	private String stdName;
	private int rollNo;
	private int stdId;
	private int physicsMarks;
	private int mathsMarks;
	private int chemistryMarks;
	private double percentage;
	private int totalMarks;
	

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public Student(String stdName, int rollNo, int stdId) {
		super();
		this.stdName = stdName;
		this.rollNo = rollNo;
		this.stdId = stdId;
	}

	public Student() {
		super();
	}
	
	public int totalMarks(int physicsMarks,int mathsMarks,int chemistryMarks) {
		
		return physicsMarks+mathsMarks+chemistryMarks;
	}
	
	public double percentage(int physicsMarks,int mathsMarks,int chemistryMarks) {
		double total = physicsMarks+mathsMarks+chemistryMarks;
		return total/300*100;	
	}
	
	public void displayDetails(int rollNo,int stdId,String stdName) {
		System.out.println("Details :"+rollNo+"|"+stdId+"|"+stdName);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setRollNo(47646);
		s.setStdId(12);
		s.setStdName("Century High School");
		s.setChemistryMarks(78);
		s.setMathsMarks(89);
		s.setPhysicsMarks(88);
		System.out.println("Total Marks :"+s.totalMarks(s.getChemistryMarks(),s.getMathsMarks(),s.getChemistryMarks())+ " out of 300");
		System.out.println("Percentage :"+s.percentage(s.getPhysicsMarks(), s.getMathsMarks(), s.getChemistryMarks()));
		s.displayDetails(s.getRollNo(), s.getStdId(), s.getStdName());
	}

}
