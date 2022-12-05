package robotack;

public class Department {

	private Long id;

	private String name;


	public Department() {
		super();
	}

	public Department(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name  + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
