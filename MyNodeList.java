package p1;

public class MyNodeList implements MyList {
	//Instance Variables
	public Node head = null; 
	 MyNodeList(){
	}
	/* default constructor that creates an empty list of Node objects that has a header node only; 
	*/
	public boolean add(Object o){
		Node swagger = head;
		if(!swagger.hasNext()){
			swagger.setData(o);
			return true;
		}
		else{
		if (o == null)
			return false;
		else{
			//Node swagger = head;
			while(swagger.hasNext()){
			swagger = swagger.getNext();
			}
			
			swagger.setData(o);
			return true;
		}
		}
	}
	public boolean insert(int index, Object o){
		return true;
	}
	public void clear(){
		
	}
	//returns true if the list contains the given object, should return false if null is inputted
	public boolean contains(Object o){
		Node contain = head;
		if (contain.getData() == null)
			return false;
		else{
			while(contain.hasNext()){
				if(contain.getData().equals(o)){
					return true;
				}
			}
			return false;
		}
	}
	//returns the object at the given index, return null if the given index is out of bounds.
	
	public Object get(int index){
		if (index > this.size()){
			return null;
		}
		else{
			Node finds = head;
			int i = 0;
			while(finds.hasNext() && i < index){
				
				finds = finds.getNext();
				i ++;
			}
			return finds;
		}
	}
	//returns the index of the given object, return -1 if the Object doesn't exist or is null

	public int indexOf(Object o){
		if (o == null){
			return -1;
		}
		else{
			int i = 0;
			Node yolo = head;
			boolean found = false;
			while(yolo.hasNext() || !found){
				if(yolo.getData().equals(o)){
					found = true;
				}
				i++;
				yolo = yolo.getNext();
			}
			if(found = true)
				return i;
			else{
				return -1;
			}
		}
	}
	//returns true if the list is empty, false if otherwise

		public boolean isEmpty(){
			Node current = head;
			if(current != null)
				return false;
			else{
				return true;
			}
		}
		//removes and returns the object at the given index

		public Object remove(int index){
			Node current = head;
			int count = 0;
			if (head == null)
				return null;
			else{
				while(current.hasNext()){
					current = current.getNext();
					if(count == index){
						Object swagg = current.getData();
						current = current.getNext();
					}
					count++;
				}
				return null;
			}
	}
		//removes the first instance of the object in the list.

		//returns true if an object is successfully removed, false if otherwise

		public boolean remove(Object o){
			return true;
		}

		    

		//replaces the object at the given index with the given object, if the index is out of bounds or the object passed in is null, do not do anything.

		public void set(int index, Object o){
		
		}

			
	public int size(){
		int flame = 0;
		Node yolo = head;
		while(yolo.hasNext()){
			flame ++;
		}
		return flame;
	}
	public static void main(String args[]){
		MyNodeList list = new MyNodeList();
		list.add("String1");

		list.add("String2");

		//list.insert(2, "String3");

		list.add("String4");

		//ArrayList: [String1, String2, String3, String4]

		System.out.println(list.indexOf("String2")); // Prints 1

		System.out.println(list.isEmpty()); //Prints false

		System.out.println(list.get(3)); // Prints String4
		
		list.size();
	}
}
