import java.util.*;

public class Main {
    static class Node implements Comparable {
        int data;
        boolean marked;
        LinkedList<Node> adjacent;

        Node(int data) {
            this.data = data;
            this.marked = false;
            this.adjacent = new LinkedList<>();
        }

        @Override
        public int compareTo(Object o) {
            Node n = (Node) o;
            return this.data - ((Node) o).data;
        }
    }
    static class Graph {

        ArrayList<Node> nodes;

        Graph(int size) {
            this.nodes = new ArrayList();
            for (int i=0; i<size; i++) {
                nodes.add(new Node(i));
            }
        }

        void addEdge(int i1, int i2) {
           Node n1 = nodes.get(i1);
           Node n2 = nodes.get(i2);
           if (!n1.adjacent.contains(n2)) {
               n1.adjacent.add(n2);
           }
           if (!n2.adjacent.contains(n1)) {
               n2.adjacent.add(n1);
           }
        }
        
        // DFS
        void dfs(Node r) {
            if (r == null) return;
            r.marked = true;
            visit(r);

            Collections.sort(r.adjacent);

            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    dfs(n);
                }
            }
        }
        
        void dfs(int index) {
            Node r = nodes.get(index);
            dfs(r);
        }

        // BFS
        void bfs(int index) {
            Node root = nodes.get(index);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            root.marked = true;
            while(!queue.isEmpty()) {
                Node r = queue.remove();

                Collections.sort(r.adjacent);

                for (Node n : r.adjacent) {
                    if (n.marked == false) {
                        n.marked = true;
                        queue.add(n);
                    }
                }
                visit(r);
            }
        }

        void visit(Node n) {
            System.out.print(n.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int v = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int start = Integer.parseInt(input[2]);

        Graph g = new Graph(v + 1);
        for (int i=0; i<n;i++) {
            String[] edges = sc.nextLine().split(" ");
            int x = Integer.parseInt(edges[0]);
            int y = Integer.parseInt(edges[1]);
            g.addEdge(x, y);
        }


        g.dfs(start);
        System.out.println();

        for (int i=0; i < g.nodes.size(); i++ ){
            g.nodes.get(i).marked = false;
        }

        g.bfs(start);
    }
}