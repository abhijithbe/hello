public class bubblesort {
    void bubble(int arr[]){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if (arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("hello");
    }
    public static void main(String args[]){
        int arr[]={5,4,3,5,6,1};
        bubblesort b=new bubblesort();
        b.bubble(arr);
    }
}
