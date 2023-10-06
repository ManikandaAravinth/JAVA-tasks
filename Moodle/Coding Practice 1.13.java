class kgm
{
    public static void main(String args[]){  


    int counter=0, i=1, j=1;  
    while(i<=100)  
    {  
        j=1;  
       counter=0;  
        while(j<=i)  
        {  
            if(i%j==0)  
            counter++;  
            j++;   
        }  
        if(counter==2)  
        {  
            System.out.print(i+" ");  
           
        }  
        i++;  
    }    
    }  
}