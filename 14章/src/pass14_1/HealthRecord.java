package pass14_1;

public class HealthRecord {
	private String name;
	private double height;
	public double stdWeight() {
		return Math.pow(height,2)*22;
	}
	public String toString() {
		return name+"/"+height+"m";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public HealthRecord(String name,double height) {
		this.name=name;
		this.height=height;
	}
	public HealthRecord(double height) {
		this("",height);
	}

}
