import java.util.ArrayList;
//import java.io.*;
public class ListArrayListBased implements ListInterface{
	protected ArrayList<Object> items = new ArrayList<>();
	private int numItems;
	public ListArrayListBased(){
	  
	  items = new ArrayList<Object>();
  	}
	
  	public void add(int index, Object item){
	  	items.add(index, item);
	  	numItems++;

  	}
	
  	public void remove(int index){
  		items.remove(index);
  		numItems--;
  	}
	
  	public void removeAll(){
  		for(int i = 0; i < items.size();i++){
  			items.remove(i);
  		}
  		numItems = 0;
  	}

  	
	public boolean isEmpty() {
		return (numItems ==0);
	}
	
	public int size() {
	
		return numItems;
	}
	
	public Object get(int index) throws ListIndexOutOfBoundsException {
		return items.get(index);
	}
  
  
}
