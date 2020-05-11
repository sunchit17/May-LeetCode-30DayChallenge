/*
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

Given n = 5, and version = 4 is the first bad version.

call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true

Then 4 is the first bad version. 
*/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return search_version(1,n);
    }
    public int search_version(int start,int end)
    {
        if(start>end){
            return start;
        }
        else{
            int mid = (end-start)/2+start;
            if(isBadVersion(mid)==false)
                return search_version(mid+1,end);
            else
                return search_version(start,mid-1);
        }
    }
}
