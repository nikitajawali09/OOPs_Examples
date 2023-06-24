package encapsulation;

public class Employee {

	private int id;
	private String name;
	private String designation;

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void displayEmp(int id,String name,String designation) {
		System.out.println("Employee details :"+id+"|"+name+"|"+designation);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setDesignation("BA");
		e.setId(1333);
		e.setName("Archit Singht");
		e.displayEmp(e.getId(), e.getName(), e.getDesignation());
	}

}
