public class OptimizeSubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int i,j,k=0;

        for(i=0;i<4;i++){
            for(j=k;j<=i;j++){
                System.out.print(arr[j]+" ");   
            }
              if(i==3 && k<4){
                i=k;
                k++;               
            }
            System.out.println();
            
        }
    }
}
