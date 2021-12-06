package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] {2,7,8,3,9,1,5,4,6,0};

        int intermediate;

        for (int i = 1; i <= 1000000; i++){
            if(arr[9] > arr[8]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
            } else if (arr[8] > arr[7]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
            } else if (arr[7] > arr[6]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
                intermediate = arr[7];
                arr[7] = arr[6];
                arr[6] = intermediate;
            } else if (arr[6] > arr[5]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
                intermediate = arr[7];
                arr[7] = arr[6];
                arr[6] = intermediate;
                intermediate = arr[6];
                arr[6] = arr[5];
                arr[5] = intermediate;
            } else if(arr[5] > arr[4]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
                intermediate = arr[7];
                arr[7] = arr[6];
                arr[6] = intermediate;
                intermediate = arr[6];
                arr[6] = arr[5];
                arr[5] = intermediate;
                intermediate = arr[5];
                arr[5] = arr[4];
                arr[4] = intermediate;
            } else if (arr[4] > arr[3]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
                intermediate = arr[7];
                arr[7] = arr[6];
                arr[6] = intermediate;
                intermediate = arr[6];
                arr[6] = arr[5];
                arr[5] = intermediate;
                intermediate = arr[5];
                arr[5] = arr[4];
                arr[4] = intermediate;
                intermediate = arr[4];
                arr[4] = arr[3];
                arr[3] = intermediate;
            } else if (arr[3] > arr[2]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
                intermediate = arr[7];
                arr[7] = arr[6];
                arr[6] = intermediate;
                intermediate = arr[6];
                arr[6] = arr[5];
                arr[5] = intermediate;
                intermediate = arr[5];
                arr[5] = arr[4];
                arr[4] = intermediate;
                intermediate = arr[4];
                arr[4] = arr[3];
                arr[3] = intermediate;
                intermediate = arr[3];
                arr[3] = arr[2];
                arr[2] = intermediate;
            } else if (arr [2] > arr[1]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
                intermediate = arr[7];
                arr[7] = arr[6];
                arr[6] = intermediate;
                intermediate = arr[6];
                arr[6] = arr[5];
                arr[5] = intermediate;
                intermediate = arr[5];
                arr[5] = arr[4];
                arr[4] = intermediate;
                intermediate = arr[4];
                arr[4] = arr[3];
                arr[3] = intermediate;
                intermediate = arr[3];
                arr[3] = arr[2];
                arr[2] = intermediate;
                intermediate = arr[2];
                arr[2] = arr[1];
                arr[1] = intermediate;
            } else if (arr [1] > arr[0]){
                intermediate = arr[9];
                arr[9] = arr[8];
                arr[8] = intermediate;
                intermediate = arr[8];
                arr[8] = arr[7];
                arr[7] = intermediate;
                intermediate = arr[7];
                arr[7] = arr[6];
                arr[6] = intermediate;
                intermediate = arr[6];
                arr[6] = arr[5];
                arr[5] = intermediate;
                intermediate = arr[5];
                arr[5] = arr[4];
                arr[4] = intermediate;
                intermediate = arr[4];
                arr[4] = arr[3];
                arr[3] = intermediate;
                intermediate = arr[3];
                arr[3] = arr[2];
                arr[2] = intermediate;
                intermediate = arr[2];
                arr[2] = arr[1];
                arr[1] = intermediate;
                intermediate = arr[1];
                arr [1] = arr[0];
                arr[0] = intermediate;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.print(arr[i]);
        }

    }
}
