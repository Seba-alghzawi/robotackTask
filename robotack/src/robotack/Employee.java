package robotack;

public class Employee {

	private Long id;

	private String name;

	private String msisdn;

	private Integer salary;

	private Department departmentId;

	private String birtDate;

	public Employee() {
		super();
	}

	
	public Employee(Long id, String name, String msisdn, Integer salary, Department departmentId, String birtDate) {
		super();
		this.id = id;
		this.name = name;
		this.msisdn = msisdn;
		this.salary = salary;
		this.departmentId = departmentId;
		this.birtDate = birtDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Department getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Department departmentId) {
		this.departmentId = departmentId;
	}

	
	public String getBirtDate() {
		return birtDate;
	}

	public void setBirtDate(String birtDate) {
		this.birtDate = birtDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", msisdn=" + msisdn + ", salary=" + salary + ", departmentId="
				+ departmentId + ", birtDate=" + birtDate + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
