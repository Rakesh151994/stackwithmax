
//package rakesh;
//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StackWithMax{

	Stack stack=new Stack();
	public static void main(String a[]) {
		/*long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long startTime = System.nanoTime();
		//.....your program....
*/		java.util.List<Integer> list=null;
		Scanner scanner=new Scanner(System.in);
		int totalQueries=scanner.nextInt();
		StackWithMax stackMax=new StackWithMax();
		String toPerform=null;
		int x=0;
		while(x<totalQueries) {
			toPerform=scanner.next();
			/*if(toPerform.equalsIgnoreCase("push")) {
				stackMax.stack.push(scanner.nextInt());
			}else if(toPerform.equalsIgnoreCase("max")) {
				//list=stackMax.stack.arrayList;
				Collections.sort(stackMax.stack.arrayList);
				System.out.println(stackMax.stack.arrayList.get(stackMax.stack.arrayList.size()-1));
				
			}else if(toPerform.equalsIgnoreCase("pop")) {
				stackMax.stack.pop();
			}*/
			
			switch(toPerform) {
			
			case "push" :
				stackMax.stack.push(scanner.nextInt());
				break;
			
			case "max" :
				Collections.sort(stackMax.stack.arrayList);
				System.out.println(stackMax.stack.arrayList.get(stackMax.stack.arrayList.size()-1));
				break;
			
			
			case "pop":
				stackMax.stack.pop();
			}
			x++;
		}

		scanner.close();
	/*	long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);*/
		
		//long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		//System.out.println(afterUsedMem-beforeUsedMem);
	} 
}


class Stack {

	LinkedList list=new LinkedList();
	ArrayList<Integer> arrayList=new ArrayList<>();
	public void push(int data) {
		list.insert(data);
		arrayList.add(data);
	}

	public void pop() {
		Node returnedValue=list.removeFirst();
		arrayList.remove(arrayList.lastIndexOf(returnedValue.data));
		//return returnedValue;
	}	

	/*public void printArrayList() {
		for(Integer number : arrayList)
			System.out.print(number+" ");
		Collections.sort(arrayList);
		System.out.println("After sorting");
		for(Integer number : arrayList)
			System.out.print(number+" ");
	}*/

	/*public void display() {
		list.display();
	}*/

	//26480144



}

class Node{
	Node node;
	int data;
	Node(int data){
		this.data=data;
	}
}

class LinkedList {
	Node head;
	int size=0;

	public void insert(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			size++;
			return;
		}
		Node temporary=head;
		head=node;
		head.node=temporary;
		size++;
	}

	public Node removeFirst() {
		Node toReturn=head;
		head=head.node;
		size--;
		return toReturn;
	}

	/*public void display() {
		if(head==null)
			throw new RuntimeException();
		Node current=head;

		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.node;
		}

	}*/


}



/*class Z{
	public static void main(String a[]) {
		try {
		int b=1;
		FileWriter writer=new FileWriter("C:\\Users\\rakesh.pothula\\Desktop\\test.txt");
		for(int v=1;v<=50000;v++) {
			writer.write("push "+b+" "+"max ");
			b++;
		}
		writer.close();
		}catch(Exception exception) {
			
		}
		
		}
}*/


