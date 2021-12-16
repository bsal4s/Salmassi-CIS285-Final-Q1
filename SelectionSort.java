public class SelectionSort {
    public static void sort( int arr[] ){
        int N = arr.length;
        int i, j, pos, temp;
        for (i = 0; i < N; i++)
        {
            pos = j;
            for (j = i+1; j < N-1; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = i;
                }
            }
            temp = arr[I];
            arr[i] = arr[pos];
            arr[pos]= temp;           
        }
      }
}
