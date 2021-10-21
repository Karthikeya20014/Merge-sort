import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
public class merge{
 static int size,a[];
 public static void main(String[] args){
 //TimeUnit.SECONDS.sleep(5);
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size of array");
 size=sc.nextInt();
 a=new int[size];
 System.out.println("enter the elements: ");
 for (int i=0;i<a.length;i++ ){
 a[i]=sc.nextInt();
 }
 long startTime = System.nanoTime();
 mergesort(a,size);
 for(int i=0;i<a.length;i++){
 System.out.print(a[i]+" ");
 }
 long endTime = System.nanoTime();
 long timeElapsed = endTime - startTime;
 System.out.println("Execution time in case1 in ms : " +
(float)timeElapsed/1000000 );

 }
 static void mergesort(int a[],int n){
 int mid;
 int L[],R[];
 if(n<2)
 ;
 else{
 mid=n/2;
 L=new int[mid];
 R=new int[n-mid];
 for(int i=0;i<mid;i++)
 L[i]=a[i];
 for(int i=mid;i<n;i++)
 R[i-mid]=a[i];
 mergesort(L,mid);
 mergesort(R,n-mid);
 merge(a,L,mid,R,n-mid);

 }
 }
 static void merge(int a[],int L[],int l,int R[],int r){
 int i,j,k;
 i=0;
 j=0;
 k=0;
 while(i<l&&j<r)
 {
 if(L[i]<R[j]){
 a[k]=L[i];
 i++;
 }
 else{
 a[k]=R[j];
 j++;
 }
 k++;
 }
 while(i<l)
 {
 a[k]=L[i];
 i++;k++;
 }
 while(j<r){
 a[k]=R[j];
 j++;k++;

 }
 }
}