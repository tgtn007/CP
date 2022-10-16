// https://leetcode.com/problems/find-in-mountain-array
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class Solution {
    
    int peakIndex(MountainArray mountainArr){
     // finding peak index
        int l = 0, r = mountainArr.length()-1;
        while(l<r){
            int m = (l+r)/2;
            if(mountainArr.get(m)>mountainArr.get(m+1))
                r=m;
            else
                l=m+1;
        }
     return l;
 }
    
    int binarySearchAsc(int t, MountainArray mountainArr, int l, int h){
        while(l<=h){
            int m = (l+h)/2;
            int midElement = mountainArr.get(m);
            if(midElement==t)
                return m;
            else if(t<midElement)
                h = --m;
            else
                l = ++m;
        }
        return -1;
    }
    
    int binarySearchDsc(int t, MountainArray mountainArr, int l, int h){
        while(l<=h){
            int m = (l+h)/2;
            int midElement = mountainArr.get(m);
            if(midElement==t)
                return m;
            else if(t<midElement)
                l = ++m;
            else
                h = --m;
        }
        return -1;
    }
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = peakIndex(mountainArr);
        int left = binarySearchAsc(target, mountainArr, 0, peakIndex);
        int right = binarySearchDsc(target, mountainArr, peakIndex-1 ,mountainArr.length()-1);
        
        if(left>=0)
            return left;
        else if(right>0)
            return right;
        else
            return -1;
    }
}
