public class SelectionSort {
    public int[] sort( int[] arr ){

        int N = arr.length;
        int i, j, pos, temp;
        for (i = 0; i < N; i++)
        {
            for (j = i+1; j < N; j++)
            {
            	pos = j;
                if (arr[i] > arr[pos])
                {
                    pos = i;
                }
                temp = arr[i];
                arr[i] = arr[pos];
                arr[pos]= temp;   
            }        
        }      
        return arr;
     }
}

