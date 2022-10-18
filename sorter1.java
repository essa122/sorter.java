package swe;

public class sorter1 {
    public static void sel_sort(int numArray[]) 
    { 
        int n = numArray.length; 
   
        // traverse unsorted array 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (numArray[j] < numArray[min_idx]) 
                    min_idx = j; 
   
            // swap minimum element with compared element  
            int temp = numArray[min_idx]; 
            numArray[min_idx] = numArray[i]; 
            numArray[i] = temp; 
        } 
    }
    public static void main(String[] args) {
        System.out.println("Hi Java");
        // System.out.println("hiiiiiiii");
        for (int i=0 ; i<=3 ; i++){
            int z = 0+ i;
            System.out.println(z);
        }
        int x = 1;
        System.out.println(x);

        int numArray[] = {7,5,2,20,42,15,23,34,10};
        System.out.println("Original Array:" + Arrays.toString(numArray)); 
        //call selection sort routine
        sel_sort(numArray); 
        //print the sorted array
        System.out.println("Sorted Array:" + Arrays.toString(numArray));
    }
}

