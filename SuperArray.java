public class SuperArray{
  // fields
	private String[] data;
	private int size;
  // constructor
	public SuperArray(){
		this.data = new String[10]; // couldn't clear replace this?
	}
  // accessors
 public void clear(){
   size = 0; // using this.size would be the same thing here
   this.data = new String[10];
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
    this.data[size] = str;
    size = size + 1;
  }
  return true;
  /* Appends the specified element to the end of this list.
  Returns true. Should resize the list before adding if there is no more space. */
}
public String toString(){
String result = "["
for (int i = 0; i < this.data.length - 1; i++){
  result += data[x] + ", ";
}
if (size() > 0){
  result += data[(size())-1];}
  result += "]";
  return result;
}
  // Returns the data in the format: "[A, B, FISH, cat, Dog]" Without double quotes around the data elements.
}
public String toStringDebug() {
    String result = "[";
    for(int i = 0; i < data.length; i++) {
      ans += this.data[i];
      if (i != data.length - 1)) {
        result += ", ";
      }
    }
    result += "]";
    return result;
    // toString + null values for Debugging purposes
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
// PHASE 2
private void resize() {
    String[] Ary = new String[this.size];
    for(int i = 0; i < this.size; i++) {
      Ary[i] = this.data[i];
    }
    this.data = new String[(this.size * 2)];
    for(int i = 0; i < this.size; i++) {
      this.data[i] = Ary[i];
    }
    /* This is a private method that you call when you need more space.
       It will increase the capacity by making a new Array of Strings and copying the old one over. */
  }
// PHASE 3
public boolean contains(String target){
  for (int i = 0; i < this.size; i++){
    if (data[i].equals(target){
      return true;
    }
    else{
      return false;
    }
    // Returns true if this list contains the specified element.
  }}
  public int indexOf(String target) {
    for (int ind = 0; ind < size(); ind ++) {
      if (data[x].equals(target)){
      return ind; // first occurence from front
    }
    }
    return -1; // if there is no occurence
  }
  public int lastIndexOf(String target) {
    for (int ind = size() - 1; ind >= 0; ind --) {
      if (data[x].equals(target)){
        return x; // first occurence from back 
    }
    return -1; // if there is no occurence
  }
  public void	add(int index, String element){

    /* All elements at the index or to the right, are shifted to the right to make space,
       then insert the specified element at the specified position in this list. Prints an error when index is out of range. */
  }

  }
