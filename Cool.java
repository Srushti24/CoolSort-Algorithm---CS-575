


import java.util.Scanner;


public class Cool {

    
    public static void main(String[] args) {
    System.out.println("Enter the number of elements in the array");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    System.out.println("Enter the  elements of the array");
    /*filling elements inside the array*/
    for( int i=0;i<a;i++)
    {
        arr[i]=sc.nextInt();
    }
        System.out.println("Enter the number of steps ");
        int step_size=sc.nextInt();
        int step[]=new int[step_size];
        System.out.println("Enter the elements of the step array");
        /*Filling the number of steps inside the array*/
        for(int i=0;i<step_size;i++)
        {
            step[i]=sc.nextInt();
        }
            
        int sub_arr[]=new int[100];
        /*Initialzing a sub array*/
        int b=0;
           
         while(b<step_size)
         {
                 int c=0;
                 int d=0;
                 int use_step=step[b];
                 /*One by one putting the value of each step into the use_step variable so that it can be used to create sub array*/
                for(int i=0;i<step_size;i++)
                {
                    while(c<a)
                    {
                        sub_arr[d]=arr[c];
                        c=c+use_step;
                        /*Adding the value of the selected step with the value of the array, to get sub array*/
                        d++;
                        /*Updating the index of the sub array, so that next value can be added to it*/
                        
                    }
                }
                   
                
                CoolSort(sub_arr, d);
                /*Calling the coolsort method*/
              
                 d=0;
                 c=0;
         
                  for(int i=0;i<=step_size;i++)
                  {
                            while(c<a)
                            {
                                arr[c]=sub_arr[d];
                                /*substituting the value of the sub array in our original array*/
                                c=c+use_step;
                                /*Adding the value of the step , so that the value of the sub array will be placed properly*/
                                d++;
                                /*incrementing the index of sub array*/
                            }
                  }
                       
                b++;
                        
        }
         System.out.println("Array is :");
            for(int i=0;i<a;i++)
            {
                System.out.println(" " +arr[i]);
            }
            /*printing the sorted array*/
            
      
            
    }

  
       public static void CoolSort(int sub_arr[],int n)
       {
          
           int i,j,key;
           for(j=1;j<n;j++)
           {
                 key=sub_arr[j];
      /*one by one selecting each element of the sub array starting from index 1 and making them as key*/
              
                  i=j-1;
                  /*assigning the value which is  one index below 'key'*/
           while(i>=0 && sub_arr[i]>key) 
          {/*if the element one index below key turns out to be greater than key, swap them. One by one compare each element on the left hand side of the key with it, till this condition is satisfied*/
              
              sub_arr[i+1]=sub_arr[i];
              i=i-1;
          }
      sub_arr[i+1]=key;

     
      }
       
           
           
        
    }
}
   


