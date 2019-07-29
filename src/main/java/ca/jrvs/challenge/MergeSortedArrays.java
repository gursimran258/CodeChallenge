package ca.jrvs.challenge;

public class MergeSortedArrays {

    public int[] mergeArrays(int[] firstArray, int[] secondArray) {

        int n1 = firstArray.length;
        int n2 = secondArray.length;
        int[] mergedArray = new int[n1+n2];
        int k=0;
        int i =0;
        int j=0;
        while (i<n1 && j<n2) {
            if(firstArray[i] < secondArray[j]) {
                mergedArray[k++]=firstArray[i];
                i++;}
            else {
                mergedArray[k++] = secondArray[j];
                j++;
            }

            while(i<n1)
                mergedArray[k++] = firstArray[i++];
            while(j<n2)
                mergedArray[k++] = secondArray[j++];
        }
        System.out.println("merged array" + mergedArray);
        return mergedArray;
    }
}
