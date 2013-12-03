
public class Student {

	private int uninumber;
	private String name;
	
	public Student(int uninumber){
		this.setUninumber(uninumber);
	}

	
	public int getUninumber() {
		return uninumber;
	}

	public void setUninumber(int uninumber) {
		this.uninumber = uninumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "Name: " + name + "\n" +"Uninumber: "+ uninumber +"\n";
	}
}
