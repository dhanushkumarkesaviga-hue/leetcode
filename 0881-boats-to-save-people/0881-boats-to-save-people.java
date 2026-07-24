class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int r = people.length-1;
        int count = 0;
        Arrays.sort(people);
        while(l<r) {
             if(people[r]+people[l]>limit){
            count++;
            r--;
        }
          else  if (people[l] +people[r]<=limit) {
            count++;
             l++;
             r--;
            }
            if(l==r){
     count++;
            }
        }
        
    return count;}
}