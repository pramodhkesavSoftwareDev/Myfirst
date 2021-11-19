class ZohoQ{
public static void main(String[] args){
int[] ar={1,-4,6,3,2,5};
int max=0;
int max2=0;
for(int i=0;i<ar.length;i++){
if(ar[i]>max){
max=ar[i];
}
if(ar[i]>max2&&ar[i]<max){
max2=ar[i];
}
}
for(int i=0;i<ar.length;i++){
if(ar[i]<max2){
System.out.println(ar[i]);
}
}
}
}
