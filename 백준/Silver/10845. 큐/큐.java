import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue q = new Queue();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1;
		String st;
		String to1;
		int to2;
		int n = Integer.parseInt(bf.readLine());
				
		for(int i=0;i<n;i++) {
			st = bf.readLine();
			st1 = new StringTokenizer(st);
			to1 = st1.nextToken();
						
			switch(to1) {
			case "push" :
				to2 = Integer.parseInt(st1.nextToken());
				q.push(to2);
				break;
			case "pop" :
				System.out.println(q.pop());
				break;
			case "size" :
				System.out.println(q.size());
				break;
			case "empty" :
				if(q.empty()) {
					System.out.println(1);
				}else{
					System.out.println(0);
				}
				break;
			case "front" :
				System.out.println(q.front());
				break;
			case "back" :
				System.out.println(q.back());
				break;
			}
			
		}
			
			
	}
	
}
class Queue{
	ArrayList ar = new ArrayList();
	
	int p = -1;
	
	public void push(int a){
		ar.add(a);
		p++;
	}
	public int pop() {
		if(ar.size()==0) {
			return -1;
		}else {
			int temp = (int) ar.get(0);
			p--;
			ar.remove(0);
			return temp;
		}
		
	}
	public int size() {
		return ar.size();
		}
	public boolean empty() {
		return ar.isEmpty();
	}
	public int front() {
		if(ar.size()==0) {
			return -1;
		}
		return (int)ar.get(0);
	}
	public int back() {
		if(ar.size()==0) {
			return -1;
		}
		return (int)ar.get(p);
	}
}

