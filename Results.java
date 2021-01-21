package operator;

public class Results {
	private int Physics;
	private int Chemistry;
	private int Biology;
	private int total;
	private double percentage;
	public Results(int Physics, int Chemistry, int Biology) {
		this.Physics = Physics;
		this.Chemistry = Chemistry;
		this.Biology = Biology;
		this.total = Physics + Biology + Chemistry;
		double total2 = total;
		this.percentage = (total2/450)*100;
	}
	public void displayResults() {
		System.out.println("Physics: "+this.Physics);
		System.out.println("Biology: "+this.Biology);
		System.out.println("Chemistry: "+this.Chemistry);
		System.out.println("Total: "+this.total);
	}
	public void displayPercentage() {
		System.out.printf("Percentage: %.2f %n",this.percentage);
	}
	public static void main(String[] args) {
		

	}

}
