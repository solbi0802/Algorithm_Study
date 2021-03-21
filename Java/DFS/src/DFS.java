
public class DFS {
	static int maps [ ] [ ] = { {0, 1, 1, 1, 0}, {1, 0, 0, 0, 0},
			{1,0,0,1,1}, {1,0,1,0,0}, {0,0,1,0,0}};
	// 방문여부
	static int[] isVisit = new int[5];
	
	public static void dfs(int v) {
		isVisit[v] = 1;
		System.out.print(v);		//방문노드 출력
		for (int i = 0; i < 5; i++)
			if (maps[v][i] == 1 && isVisit[i] == 0)
				dfs(i);
	}
	public static void main(String[] args) {
		dfs(0);
	}
}
