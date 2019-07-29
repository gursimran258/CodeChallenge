package ca.jrvs.challenge;

public class DuplicateRemovalArray {

    /**
     * remove duplicates in sorted array in place
     * @param numsList
     * @return the array after removal of duplicates
     */
    public int[] removeDuplicatesinArray(int[] numsList) {
        int i=0;
        for(int j=i; j<numsList.length;j++){
            if(numsList[j]!=numsList[i])  {
            i++;
            numsList[i] = numsList[j];
            }
    }
        System.out.println("numsLit"+numsList);
return numsList; }
}
