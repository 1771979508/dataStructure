package graph;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 		visited:用来记录已经被访问的顶点，用来避免顶点被重复访问。如果顶点q被访问，那相应的visited[q]会被设置为 true
 * 
 * 		queue:用来存储已经被访问、但相连的顶点黑没有被访问的顶点。因为广度优先搜索是逐层访问的，也就是说，我们只有把第k层的顶点都访问完之后，才能访问第k+1层的顶点
 * 					当我们访问到第k层的顶点的时候，我们需要把第k层的顶点记录下来，稍后才能通过第k层的顶点来找第k+1层的顶点。所以，我们用这个队列来实现记录的功能
 * 	
 * 		prev：用来记录搜索路径。当我们从顶点s开始，广度优先搜索到顶点t后，prev数组中存储的就是搜索的路径。不过，我们的这个路径是反向储存的
 * 				prev[w]存储的是，顶点w是从哪个前驱顶点遍历过来的。比如，我们通过顶点2的邻接表访问到顶点3，【那prev[s]等于2】。为了正向打印出路径，我们需要递归地来打印即print()函数
 * 
 * */

public class graphDefine { // 定义无向图
	
	private int v; // 顶点的个数
	private LinkedList<Integer> adj[]; // 邻接表
	
	public graphDefine(int v){
		this.v = v;
		adj = new LinkedList[v];  // 邻接表里面存放图顶点的个数
		for(int i=0;i<v;i++){  // 遍历顶点的总数
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int s,int t){  // 无向图一条边存两次 -- s:start  t:terminal
		adj[s].add(t);  // 存着首尾两条
		adj[t].add(s);
	}
	
	// 图的广度优先搜索
	public void bfs(int s,int t){
		if(s==t){
			return;
		}
		// 定义顶点是否已经被访问过了
		boolean[] visited = new boolean[v];
		visited[s] = true;
		// 定义一个队列，用来盛放后面即将遍历的节点 - 广度优先遍历：【出去一个顶点(如当前节点)则进来与当前节点相邻近的顶点到队列中】
		Queue<Integer> queue = new LinkedList<>();
		// 添加起始的顶点
		queue.add(s);
		// 定义一个数组，用来存放当前节点到上一个节点的路径权重
		int[] prev = new int[v];
		// 遍历所有的顶点，将路径权重初始化为最大(-1)
		for(int i=0;i<v;i++){
			prev[i] = -1;
		}
		// 然后开始队列的操作：即开始广度搜索
		while(!queue.isEmpty()){  // queue.size()　！＝　0
			int w = queue.poll();  // 出队列的顶点
			for(int i=0;i<adj[w].size();i++){  // 遍历出队列的整条链表，看有多少跟它相连
				int q = adj[w].get(i);  // 第几条数据
				if(!visited[q]){ // 如果该节点(q)没有被访问过
					
					prev[q] = w;  // 这个代码不是很明白为啥么这么写 --> 目测是记录当前节点，存放到路径中去？方便后面寻找节点的路径
					
					if(q == t){
						print(prev,s,t);  // 该函数用来打印该顶点走过前面的路径
						return;
					}
					// 递归直到找到该顶点，然后设置成为访问过
					visited[q] = true;
					queue.add(q);
				}
			}
		}
	}
	
	private void print(int[] prev,int s,int t){  // 递归打印 s->t 的路径
		if(prev[t] != -1 && t != s){
			print(prev, s, prev[t]);
		}
		System.out.println(t + " ");
	}
	
	
	
	// 图的深度优先搜索(Depth-First-Search) DFS   - 回溯思想 - 走迷宫
		// 先定义未查询得到
	boolean found = false;
	
	public void dfs(int s,int t){
		found = false;
		boolean[] visited = new boolean[v];
		int[] prev = new int[v];  // 用来记录搜索的路径
		for(int i=0;i<v;i++){
			prev[i] = -1;
		}
		// 进行深度优先搜索的递归 - 即如果顶点(节点)存在下一个节点(顶点)的话，进行递归
		recurDfs(s,t,visited,prev);
		// 递归打印开始节点到结束节点的路径
		print(prev, s, t);
	}
	
	// 节点递归的函数
	public void recurDfs(int w,int t,boolean[] visited,int[] prev){
		if(found == true){
			return;
		}
		visited[w] = true;
		// 如果w节点等于最后一个节点则返回true
		if(w==t){
			found = true;
			return;
		}
		for(int i=0;i<adj[w].size();i++){
			int q = adj[w].get(i);
			// 如果该节点为被记录走过则一直往下进行递归
			if(!visited[q]){
				//将走过的节点存入prev数组中
				prev[q] = w;
				// 继续递归直到访问过该节点
				recurDfs(q, t, visited, prev);
			}
		}
	}
	
	 
	@Override
	public String toString() {
		return "graphDefine [v=" + v + ", adj=" + Arrays.toString(adj) + ", found=" + found + "]";
	}

	public static void main(String[] args) {
		
//		String string = "abcdefg";
//		string.indexOf("a");
		
		graphDefine graphDefine = new graphDefine(10);
		System.out.println(graphDefine);
		
	}
	
	
	
}
