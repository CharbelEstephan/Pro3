package p1;
public class MyArrayList implements MyList {
	//Fields
	private Object[] Stuff;
	private int addIterator=-1;
	private int ptr = -1;
	private int cool;
	//Constructors
	//Methods
	
	
	public boolean add(Object o){
		if (addIterator < Stuff.length-1){
			this.ptr++;
			this.addIterator++;
			
			
			Stuff[this.addIterator] = o;
			cool ++;
			return true;
		}
		else
			return false;
	}

    

	//inserts the given object at the given index in the list, for a list of size n you should be able to insert an object from indices 0-n. i.e. before, in, and immediately after the list. the list will grow if needed. If the index is negative or n+1 or greater, the method should return false. if the object inputted into the method is null, it should also return false.

	public boolean insert(int index, Object o){
		
	}

	    

	//clears all data from the list. in the case of the node list, set the head.next to null. in the array list, set the underlying array to a new array of size 2.

	public void clear(){
		for(int i = 0; i < Stuff.length-1; i++){
			if (Stuff[i] != null)
				Stuff[i] = null;
		}
		Object[] Stuff = new  Object[2]; 
		cool = 0;
	}

	    

	//returns true if the list contains the given object, should return false if null is inputted.

	public boolean contains(Object o){
			int check = 0;
			while (check <+ Stuff.length-1){
				if (Stuff[check] == o){
					return true;
				}
				else{
					check ++;
				}
			}
			return false;
	}

	    

	//returns the object at the given index, return null if the given index is out of bounds.

	public Object get(int index){
		if ( index > Stuff.length){
			return null;
		}
		else{
			return Stuff[index];
		}
	}

	    

	//returns the index of the given object, return -1 if the Object doesn't exist or is null

	public int indexOf(Object o){
		int check = 0;
		while (check <+ Stuff.length-1){
			if (Stuff[check] == o){
				return check;
			}
			else{
				check ++;
			}
		}
		return -1;
	}

	   

	//returns true if the list is empty, false if otherwise

	public boolean isEmpty(){
		int check = 0;
		while (check <+ Stuff.length-1){
			if (Stuff[check] != null){
				return false;
			}
			else{
				check ++;
			}
		}
		return true;
	}

	    

	//removes and returns the object at the given index

	public Object remove(int index){
		

	    

	//removes the first instance of the object in the list.

	//returns true if an object is successfully removed, false if otherwise

	public boolean remove(Object o){
		
	}

	    

	//replaces the object at the given index with the given object, if the index is out of bounds or the object passed in is null, do not do anything.

	public void set(int index, Object o){
		if (index > Stuff.length || Stuff[index] == null){
			System.out.println("Can't be done");
		}
		else{
			Stuff[index] = o;
			
		}
	}

	    

	//returns the number of elements in the list

	public int size(){
		return cool;
	}

}
