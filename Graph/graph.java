import java.util.ArrayList;
import java.util.Scanner;

public class graph {
    static class Edge {
        int s;
        int d;
        int w;

        Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int nodes = Integer.parseInt(sc.nextLine());
        int edges = Integer.parseInt(sc.nextLine());

        ArrayList<Edge>[] graph = new ArrayList[nodes];
        for (int i = 0; i < nodes; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges; i++) {
            String[] parts = sc.nextLine().split(" ");
            int source = Integer.parseInt(parts[0]);
            int destination = Integer.parseInt(parts[1]);
            int weight = Integer.parseInt(parts[2]);

            // Add edges to the graph
            graph[source].add(new Edge(source, destination, weight));
            graph[destination].add(new Edge(destination, source, weight)); // Assuming it's an undirected graph
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        boolean[] visited = new boolean[nodes];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> smallList = new ArrayList<>();
        ArrayList<ArrayList> ans = findpath(graph, source, destination, smallList, list, visited);
        System.out.println(ans);
    }

    public static ArrayList findpath(ArrayList<Edge>[] graph, int source, int destination, ArrayList<Integer> smallList,
            ArrayList<ArrayList<Integer>> list, boolean[] visited) {
        smallList.add(source);
        if (source == destination) {
            list.add(smallList);
            return list;
        }
        visited[source] = true;
        for (int i = 0; i < graph[source].size(); i++) {
            if (visited[graph[source].get(i).d] != true) {
                ArrayList<Integer> ans = findpath(graph, graph[source].get(i).d, destination, smallList, list, visited);
                if (!ans.isEmpty()) {
                    return list;
                }
            }
        }
        return list;
    }
}
