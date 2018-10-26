public class SuperArray{
  // fields
	private String[] data;
	private int size;
  // constructor
	public SuperArray(){
		data = new String[10]; // couldn't clear replace this?
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
public boolean add(String str){
  if (this.size == data.length){
    resize();
  }
  else {
    data[size] = str;
    size = size + 1;
  }
  return true;
  /* Appends the specified element to the end of this list.
  Returns true. Should resize the list before adding if there is no more space. */
}
public String get(int index){
  if (index < 0 || index >= size){
    return null;} // combine commented out code into one line
  /*if (index < 0){
    return null; // error message
  }
  else if (index >= size){
    return null; // error message */
  }
  else{
    return data[index];
  }
  // Returns the element at the specified position in this list. Prints an error when index is out of range.
}
}
