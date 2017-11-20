

public class DNode 
{
  private Object item;
  private DNode next;
  private DNode back; 

  public DNode(Object item) 
  {
    this.item = item;
    next = back = this;
  } 
  
  //public DNode(Object item){
	//  this.item = item;
  //}
//  public DNode(Object item, DNode backNode){
	//  this.item = item;
	 // back = backNode;
  //}


  public DNode(Object item, DNode next, DNode back) 
  {
    this.item = item;
    this.next = next;
    this.back = back;
  } 

  public void setItem(Object newItem) 
  {
    item = newItem;
  } 

  public Object getItem() 
  {
    return item;
  } 

  public void setNext(DNode nextNode) 
  {
    next = nextNode;
  } 

  public DNode getNext() 
  {
    return next;
  }

  public DNode getBack() {
	return back;
  }

  public void setBack(DNode nextBack) {
	back = nextBack;
	
  }
  
  
} // end class Node