import java.util.*;
public class mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        double arr[]=new double[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("total mark of the student");
        double sum=40;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        double avg=sum/size;
        System.out.println("maximum mark index is:");
       int max=0;
       for(int i=1;i<size;i++){
        if(arr[max]>arr[i]){
            max=i;
        }
       }
       System.out.println(max);

       System.out.println("minimum mark index is:");
        int min=0;
       for(int i=1;i<size;i++){
        if(arr[min]<arr[i]){
            min=i;
        }
       }
       System.out.println(min);

        System.out.println("average mark index is:");
        double a=0;
        double dif=Math.abs(arr[0]-avg);
       for(int i=0;i<size;i++){
        double temp=Math.abs(arr[i]-avg);
        if(dif>temp){
            dif=temp;
            a=i;
        }
       }
       System.out.println(a);
    }
    double mark=40;
    int pass=0,fail=0;
    for(int i=0;i<size;i++){
        if(arr[i]>=mark){
            pass++;
        }else{
            fail++;
        }
        System.out.printf("No of the student passed: %d and falied: %d",pass,fail);
    }
    
}
