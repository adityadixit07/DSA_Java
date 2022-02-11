public class insertionsort1 {
    public static void main(String[] args) {
        int a[]={23,34,12,233,546,67};
        int sa[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && sa[j]>key){
                sa[j+1]=sa[j];
                j=j-1;
            }
            sa[j+1]=key;
        }
        System.out.println("sortded array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }
    }
    
}
