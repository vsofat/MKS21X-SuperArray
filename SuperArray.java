public class SuperArray {
  // fields
  private String[] data;
  private int size;
  // constructor
  public SuperArray() {
    clear(); // couldn't clear replace this?
  }
  public SuperArray(int size) {
    if (size < 0) {
      throw new IllegalArgumentException("ERROR: given value of size is negative");
    }
    this.data = new String[size]; // couldn't clear replace this?
  }
  // accessors
  public void clear() {
    size = 0; // using this.size would be the same thing here
    this.data = new String[10];
    // Removes all of the elements from this list. You can just set size to 0 for this!
  }
  public int size() {
    return size; // this.size is the same as size
    // Returns the number of elements in this list.
  }
  public boolean isEmpty() {
    return size == 0;
    // Returns true if this list contains no elements.
  }
  public boolean add(String str) {
    if (this.size < data.length) {
      data[size] = str;
      size++;
    } else {
      resize();
      data[size] = str;
      size++;
    }
    return true;
    /* Appends the specified element to the end of this list.
     Returns true. Should resize the list before adding if there is no more space. */
  }
  public String toString() {
    if (this.size == 0) {
      return  "[]";
    } else {
      String result = "[";
      for (int x = 0; x < this.size - 1; x ++) {
        result += data[x] + ", ";
      }
      if (size() > 0) {
        result += data[size() - 1];
        result += "]";
      }
      return result;
      // Returns the data in the format: "[A, B, FISH, cat, Dog]" Without double quotes around the data elements.
    }
  }
  public String toStringDebug() {
    if (this.size == 0) {
      return "[]";
    } else {
      String result = "[";
      for (int i = 0; i < data.length; i++) {
        result += this.data[i];
        if (i != data.length - 1) {
          result += ", ";
        }
      }
      result += "]";
      return result;
      // toString + null values for Debugging purposes
    }
  }

  public String get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("ERROR: index out of bounds");
    }
    // combine commented out code into one line
    /*if (index < 0){
     return null; // error message
     }
     else if (index >= size){
     return null; // error message */
    else {
      return data[index];
    }
    // Returns the element at the specified position in this list. Prints an error when index is out of range.
  }
  // mutators
  public String  set(int index, String value) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("ERROR: index out of bounds");
    } else {
      String str = data[index];
      data[index] = value;
      return str;
    }
    /* Replaces the element at the specified position in this list with the specified element, returns the old element.
     Prints an error when index is out of range. */
  }
  // PHASE 2
  private void resize() {
    String arr[] = new String[2*data.length+1];
    for (int x = 0; x < size(); x++) {
      arr[x] = data[x];
    }
    data = arr;
    /* This is a private method that you call when you need more space.
     It will increase the capacity by making a new Array of Strings and copying the old one over. */
  }
  // PHASE 3
  // Alex helped me with Phase 3 and error handling
  public boolean contains(String target) {
    for (int i = 0; i < this.size; i++) {
      if (data[i].equals(target)) {
        return true;
      }
    }
    return false;
    // Returns true if this list contains the specified element.
  }
  public int indexOf(String target) {
    for (int ind = 0; ind < size(); ind ++) {
      if (data[ind].equals(target)) {
        return ind; // first occurence from front
      }
    }
    return -1; // if there is no occurence
  }
  public int lastIndexOf(String target) {
    for (int ind = size() - 1; ind >= 0; ind --) {
      if (data[ind].equals(target)) {
        return ind; // first occurence from back
      }
    }
    return -1; // if there is no occurence
  }
  public void add(int index, String input) {
    if (index < 0 || index > size()) throw new IndexOutOfBoundsException("ERROR: index out of bounds");
    if (size == data.length - 1) resize();
    String output[] = new String[data.length];
    for (int x = 0; x < index; x ++) {
      output[x] = data[x];
    }
    output[index] = input;
    for (int x = index; x < size + 1; x ++) {
      output[x + 1] = data[x];
    }
    size ++;
    data = output;
    /* All elements at the index or to the right, are shifted to the right to make space,
     then insert the specified element at the specified position in this list. Prints an error when index is out of range. */
  }
  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("ERROR: index out of bounds");
    }
    String s = this.data[index];
    String[] result = new String[this.data.length];
    for (int i = 0; i < this.size; i++) {
      if (i < index) {
        result[i] = this.data[i];
      }
      if (i >= index) {
        result[i] = this.data[i + 1];
      }
    }
    size--;
    data = result;
    return s;
    /* Removes the element at the specified position in this list and shifts all subsequent elements to the left.
     Return the element removed.
     Prints an error when index is out of range.
     */
  }
  public boolean remove(String target) {
    boolean exists = false;
    for (int i = 0; i < this.size; i++) {
      if (this.contains(target)) {
        this.remove(this.indexOf(target));
        exists = true;
      }
    }
    return exists;
    /* Removes the first occurrence of the specified element from this list and return true if it is present.
     Return false if it is nt in the list.
     Upon removal, shift all the subsequent elements to the left. */
  }
}
