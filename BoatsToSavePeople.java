class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boat_required=0;
        while(i<=j){
             boat_required++;
             if(people[i]+people[j]<=limit){
                            i+=1;
             }
        j-=1;
        }
    return boat_required;
    }
public static void main(String[] args){
int arr = {3,2,2,1};
int limit = 3;
int ans = numRescueBoats(arr,target);
}
