package turvo;

public class Person {
	 String name;
	 int timeUnit;
	 
	Person(String name, int timeunit){
		this.name = name;
		this.timeUnit = timeunit;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(int timeUnit) {
		this.timeUnit = timeUnit;
	}
	
	

}
