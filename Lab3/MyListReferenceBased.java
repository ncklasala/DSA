
public class MyListReferenceBased implements ListInterface{

		  // reference to linked list of items
		  private Node head; 
		  //private int numItems; // removed

		  public MyListReferenceBased() //Changed
		  {
		    //numItems = 0;
		    head = null;
		  }  // end default constructor

		  public boolean isEmpty() //changed
		  {
			  
			  if(size() == 0){
				  return true;
			  }
			  else{
				  return false;
			  }
		    //return numItems == 0;
		  }  // end isEmpty

		  public int size() //Changed
		  {
			  int size = 0;
			  Node curr = head;
			  while(curr != null){
				  size ++;
				  curr = curr.getNext();
				  
			  }
			  return size;
		   //return numItems;
		  }  // end size

		  private Node find(int index) 
		  {
		  // --------------------------------------------------
		  // Locates a specified node in a linked list.
		  // Precondition: index is the number of the desired
		  // node. Assumes that 0 <= index <= numItems 
		  // Postcondition: Returns a reference to the desired 
		  // node.
		  // --------------------------------------------------
		    Node curr = head;
		    for (int skip = 0; skip < index; skip++) 
		    {
		      curr = curr.getNext();
		    } // end for
		    return curr;
		  } // end find

		  public Object get(int index) 
		                throws ListIndexOutOfBoundsException 
		  {
		    if (index >= 0 && index < size()) //Changed
		    {
		      // get reference to node, then data in node
		      Node curr = find(index);
		      Object dataItem = curr.getItem();
		      return dataItem;
		    } 
		    else 
		    {
		      throw new ListIndexOutOfBoundsException(
		                     "List index out of bounds exception on get");
		    } // end if
		  } // end get

		  public void add(int index, Object item)
		                  throws ListIndexOutOfBoundsException 
		  {
		    if (index >= 0 && index < size()+1) 
		    {
		      if (index == 0) 
		      {
		        // insert the new node containing item at
		        // beginning of list
		        Node newNode = new Node(item, head);
		        head = newNode;
		      } 
		      else 
		      {
		        Node prev = find(index-1);
		        // insert the new node containing item after 
		        // the node that prev references
		        Node newNode = new Node(item, prev.getNext());
		        prev.setNext(newNode);
		      } // end if
		      //numItems++;   Removed
		    } 
		    else 
		    {
		      throw new ListIndexOutOfBoundsException(
		                    "List index out of bounds exception on add");
		    } // end if
		  }  // end add

		  public void remove(int index) 
		                   throws ListIndexOutOfBoundsException 
		  {
		    if (index >= 0 && index < size()) 
		    {
		      if (index == 0) 
		      {
		        // delete the first node from the list
		        head = head.getNext();
		      } 
		      else 
		      {
		        Node prev = find(index-1);
		        // delete the node after the node that prev
		        // references, save reference to node
		        Node curr = prev.getNext(); 
		        prev.setNext(curr.getNext());
		      } // end if
		     // numItems--;  Removed
		    } // end if
		    else 
		    {
		      throw new ListIndexOutOfBoundsException(
		                   "List index out of bounds exception on remove");
		    } // end if
		  }   // end remove

		  public void removeAll() 
		  {
		    // setting head to null causes list to be
		    // unreachable and thus marked for garbage 
		    // collection
		    head = null;
		    //numItems = 0; removed
		  } // end removeAll

		  public String toString(){
			  String string = "";

			  Node curr = head;
			  for(int i = 0; i < size(); i++ ){
				  string += curr.getItem() + " ";
				  curr = curr.getNext();
			  }
			  return string;
		  }

		} // end ListReferenceBased