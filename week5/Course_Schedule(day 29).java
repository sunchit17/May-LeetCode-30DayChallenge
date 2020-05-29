/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1,
which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs,
is it possible for you to finish all courses?

Example 1:
Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0. So it is possible.

Example 2:
Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0, and to take course 0 you should
             also have finished course 1. So it is impossible.
             
*/

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        ArrayList<Integer> [] list = new ArrayList[numCourses];
        for(int i=0;i<numCourses;++i)
            list[i] =  new ArrayList();
        
        for(int [] node: prerequisites)
            list[node[0]].add(node[1]);
        
        int[] visited = new int[numCourses];
        for(int i = 0; i<numCourses ; ++i)
            if(visited[i] == 0 && !dfs(list,visited,i)) return false;
        return true;
    }
    
    public static boolean dfs(ArrayList<Integer>[] adj, int[] visited, int i)
    {
        if(visited[i] == 1) return false;
        visited[i]=1;
        for(int d: adj[i])
            if(!dfs(adj,visited,d)) return false;
        visited[i]=2;
        return true;
    }
}
