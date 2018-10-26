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
public String toString(){
String result = "[]"
for (int i = 0; i < this.data.length - 1; i++){
  result += data[x] + ", ";
}
if (size() > 0){
  result += data[(size())-1];
  return result;
}
  // Returns the data in the format: "[A, B, FISH, cat, Dog]" Without double quotes around the data elements.
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
// mutator
public String	set(int index, String value){
  if (index < 0 || index >= size){
    return null;
  }
  else{
    String str = data[index];
    data[index] = value;
    return str;
  }
  /* Replaces the element at the specified position in this list with the specified element, returns the old element.
     Prints an error when index is out of range. */
}
//
}
