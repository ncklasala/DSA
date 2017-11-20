import java.util.ArrayList;

public class ListArrayListBasedPlus extends ListArrayListBased{

	public ListArrayListBasedPlus(){
		super();
	}
  	public void reverse(){
  		ArrayList<Object> revItems = new ArrayList<>();
  		int index = super.items.size() - 1;
  		for(int j = 0; j < super.items.size();j++){
  			Object revItem = super.items.get(index - j);
  			revItems.add(revItem);
  		}
  		super.items = revItems;
  	}
  	//public void printList(){
	  //System.out.println("The List has a size of" + super.items.size() + "and has the items" + super.items.toString());
  	//}
	@Override
	public String toString() {
		return items.toString() ;
	}
  	
  	
}
