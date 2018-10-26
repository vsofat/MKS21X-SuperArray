public class SuperArray{
  // fields
	private String[] data;
	private int size;
  // constructor
	public SuperArray(){
		data = new String[10];
	}
  // accessors
 public void clear(){
   size = 0; // using this.size would be the same thing here
   data = new String[10];
   // Removes all of the elements from this list. You can just set size to 0 for this!
 }
 public int size(){
   return size; // this.size is the same as size
   // Returns the number of elements in this list.
 }
}
public boolean isEmpty(){
  if (size) == 0){ // this.size is the same as size
    return true;
  }
  else{
    return false;
  }
  // Returns true if this list contains no elements.
}
