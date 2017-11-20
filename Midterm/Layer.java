
public class Layer {
	private int numItems;
	private double weight;
	public Layer(int numItems, double weight) {
		this.numItems = numItems;
		this.weight = weight;
	}
	public int getNumItems() {
		return numItems;
	}
	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double layerWeight(){
		return numItems * weight;
	}
	
}
