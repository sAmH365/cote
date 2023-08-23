import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack st = new Stack();
		int num = 0;
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			String str = bf.readLine();
			StringTokenizer sto = new StringTokenizer(str);
			String a = sto.nextToken();
			if (a.equals("push")) {
				num = Integer.parseInt(sto.nextToken());
				st.push(num);
			} else {
				switch (a) {
				case "top":
					st.top();
					break;
				case "size":
					st.size();
					break;
				case "empty":
					st.empty();
					break;
				case "pop":
					st.pop();
					break;
				}
				
			}
		}

	}
}

class Stack {
	List<Integer> list = new ArrayList<>();
	int pointer = -1;

	public void push(int n) {
		pointer++;
		list.add(n);
	}

	public void pop() {
		if (pointer == -1) {
			System.out.println(-1);
		} else {
			System.out.println(list.get(pointer));
			list.remove(pointer);
			pointer--;
		}
	}

	public void size() {
		System.out.println(list.size());
	}

	public void empty() {
		if (pointer == -1)
			System.out.println(1);
		else
			System.out.println(0);
	}

	public void top() {
		if(pointer==-1)
			System.out.println(-1);
		else
			System.out.println(list.get(pointer));
	}
}
