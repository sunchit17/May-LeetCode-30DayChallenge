/*

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
Check if these points make a straight line in the XY plane.

Example-1:
Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true

Example-2:
Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false

*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) throws ArithmeticException {
        
        if(coordinates.length==2)
            return true;
        
        int [] first_point = coordinates[0];
        int [] second_point = coordinates[1];
        double m = (double)(second_point[1]-first_point[1])/(double)(second_point[0]-first_point[0]);
        
        for(int i=2;i<coordinates.length-1;i++)
        {
            int[] point = coordinates[i];
            int[] s_point = coordinates[i+1];
            double slope = (double)(s_point[1]-point[1])/(double)(s_point[0]-point[0]);
            if(slope!=m)
                return false;
        }
        return true;        
    }
}
