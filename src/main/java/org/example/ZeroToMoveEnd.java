package org.example;

public class ZeroToMoveEnd {
    public static void main(String[] args) {
        int arr[] = {100,0,300,40,0,5,6,77,};
        int i =0 ,z= 1;
        int size = arr.length;
        while(z<size)
        {
            if(arr[i]==0)
            {
                if(arr[z]!=0)
                {
                    int temp = arr[z];
                    arr[z] = arr[i];
                    arr[i] = temp;
                    i++;
                    z++;
                }
                else {
                    z++;
                }
            }
            else {
                i++;
            }
        }

        for(int num : arr)
        {
            System.out.print(num + " ");
        }

    }
}
