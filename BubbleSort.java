class BubbleSort{
    public static void main(String[] args) {
        int a[]={2,45,12,34,21};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted Array:");
        for(int i=0;i<a.length;i++){
            System.out.println(+a[i]+" ");
        }
    }
}