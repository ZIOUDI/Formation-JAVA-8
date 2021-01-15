package StreamMapMethodsExample;
 
import java.math.BigDecimal;

public class Staff {

    public Staff(String string, int i, BigDecimal bigDecimal) {
		// TODO Auto-generated constructor stub
	}
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
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	private String name;
    private int age;
    private BigDecimal salary;
	//...
}
