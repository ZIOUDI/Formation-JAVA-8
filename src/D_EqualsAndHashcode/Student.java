package D_EqualsAndHashcode;


public class Student {
    private String id;
    private String name;
    private String email;
    private int age;
    
    public Student( ) {
     }
    
    public Student(String id) {
        this.id = id;
    }
 
    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
 
    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;
 
        return studentInfo;
    }

    /*  compare 2 Students object
	@Override
	public boolean equals(Object obj) {

	    if (obj instanceof Student) {
	        Student another = (Student) obj;
	        if (this.id.equals(another.id) &&
	            this.name.equals(another.name) &&
	            this.email.equals(another.email) &&
	            this.age == another.age) {
	                return true;
	        }
	    }
	 
	    return false;
	} */
	
	

		//  compare  Students just with ID
		@Override
		public boolean equals(Object obj) {

		    if (obj instanceof Student) {
		        Student another = (Student) obj;
		        if (this.id.equals(another.id) ) {
		                return true;
		        }
		    }
		 
		    return false;
		}
		
		public int hashCode() {
		    return 31 + id.hashCode();
		}
		
		
		 public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}
}

