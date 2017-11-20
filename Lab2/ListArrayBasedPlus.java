
public class ListArrayBasedPlus extends ListArrayBased{
	

	public ListArrayBasedPlus(){
		super();
        
	}
	

	@Override
	public void add(int index, Object item) throws IndexOutOfBoundsException{
		if(super.numItems == super.items.length){
			resize();
			
		}
		try{
		super.add(index, item);
		System.out.println("Items "+ item.toString()+ " added to postion "+ index);
		}catch(IndexOutOfBoundsException ex){
			System.out.println("Postion is out of range");
		}
	}

	public void resize(){
		int newLength = 0;
		if(super.numItems % 2 == 0){
			newLength = (int) ((int)(super.numItems + 1)*1.5);
		}
		else{
			newLength = (int) ((int)(super.numItems + 1.5)*1.5);
		}
		Object[] newArray = new Object[newLength];
		for(int k = 0; k < super.numItems;k++){
			newArray[k] = super.items[k];
		}
		super.items = newArray;
	}
	public void reverse(){
		int size = super.numItems;
		int index = size -1;
		Object[] revArray = new Object[size];
		for(int r = 0; r < super.numItems;r++){
			revArray[r] = super.items[index - r];
		}
		super.items = revArray;
	}

	@Override
	public String toString() {
		String string ="";
		for(int s = 0; s < numItems; s++){
			string = string + items[s] + " ";
		}
		return string;
	}
	

}
