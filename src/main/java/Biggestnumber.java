public class Biggestnumber {
    public static int biggestelement(){
        int []arr={30,12,45,23,99,958};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
