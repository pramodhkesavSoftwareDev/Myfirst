class BubbleSort{
public static void main(String[] args){
BubbleSort bsort=new BubbleSort();
int a[] ={56,91,35,72,45,68};
bubble(a);
	for(int i=0;i<a.length-1;i++){
	System.out.println("Sorted values");	
		System.out.println(a[i]);
	}
}
static void bubble(int a[])
{
int n=a.length-1;
int i,j,temp;
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
}
