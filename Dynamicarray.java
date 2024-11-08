public class DynamicArrayExample1  
{   
private int array[];   
private int count;   
private int sizeofarray;    
public DynamicArrayExample1()   
{   
array = new int[1];   
count = 0;   
sizeofarray = 1;   
}   
public void addElement(int a)   
{   t  
if (count == sizeofarray)   
{        
growSize();   
}   
array[count] = a;   
count++;   
}   
public void growSize()   
{       
int temp[] = null;   
if (count == sizeofarray)   
{    
temp = new int[sizeofarray * 2];   
{   
for (int i = 0; i < sizeofarray; i++)   
{    
temp[i] = array[i];   
}   
}   
}   
array = temp;   
sizeofarray= sizeofarray * 2;   
}    
public void addElementAt(int index, int a)   
{     
if (count == sizeofarray)   
{   
growSize();   
}   
for (int i = count - 1; i >= index; i--)   
{    
array[i + 1] = array[i];   
}    
array[index] = a;   
count++;   
}   
public static void main(String[] args)   
{   
DynamicArrayExample1 da = new DynamicArrayExample1();   
da.addElement(12);   
da.addElement(22);   
da.addElement(35);   
da.addElement(47);   
da.addElement(85);   
da.addElement(26);   
da.addElement(70);   
da.addElement(81);   
da.addElement(96);   
da.addElement(54);  
System.out.println("Elements of the array:");    
for (int i = 0; i < da.sizeofarray; i++)   
{   
System.out.print(da.array[i] + " ");   
}   
System.out.println();   
System.out.println("Size of the array: " + da.sizeofarray);   
System.out.println("No. of elements in the array: " + da.count);    
da.addElementAt(5, 99);
System.out.println("\nElements of the array after adding an element at index 5:");     
for (int i = 0; i < da.sizeofarray; i++)   
{   
System.out.print(da.array[i] + " ");   
}   
System.out.println();    
System.out.println("Size of the array: " + da.sizeofarray);   
System.out.println("No. of elements in the array: " + da.count);   
}  
} 