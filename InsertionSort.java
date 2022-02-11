public class InsertionSort {
    public static void main(String[] args) {
        int a[]={12,1,23,11,78,452,32};
        int sortedarray[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0&& sortedarray[j]>key){
                sortedarray[j+1]=sortedarray[j];
                j=j-1;
            }
            sortedarray[j+1]=key;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<a.length;i++){
            System.out.println(sortedarray[i]+" ");
        }
    }
    
}
