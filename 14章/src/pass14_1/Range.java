package pass14_1;

public class Range {
	private double min;
	private double max;
	public boolean isOk(double a) {
		return min<=a && a<max ? true:false ;
	}
	public String toString() {
		return min+"-"+max;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min=min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max=max;
	}
	public Range(double min,double max) {
		this.max=max;
		this.min=min;
	}


}
