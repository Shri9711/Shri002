package lambdaExpression;

public class Student {
	
	
	
	 int rollNo;
	 String name;
	 int marks;

	
	public  Student(int rollNo, String name, int marks ) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo =" + rollNo + ", name =" + name + ", marks=" + marks + "]\n";
	}

}
