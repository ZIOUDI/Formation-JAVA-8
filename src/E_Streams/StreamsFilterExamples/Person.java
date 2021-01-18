package E_Streams.StreamsFilterExamples;
 
import java.math.BigDecimal;

public class Person {
 
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
//

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() ;
	}
	
	
	//...
}
