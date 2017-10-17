/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fcfs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int process[] = new int[50];
		int burstTime[] = new int[50];
		int arrivalTime[] = new int[50];
		int n,i=0,j=0,temp;
		float awt=0,atat=0;
		int cum[] = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter the no of processes:");
		n=sc.nextInt();
		System.out.println("Enter the processes: ");
		for(i=0;i<n;i++){
			process[i] = sc.nextInt();
			burstTime[i] = sc.nextInt();
			arrivalTime[i] = sc.nextInt();
		}
			for(i=0;i<n;i++)
		{
			System.out.print("p"+process[i]+" "+arrivalTime[i]+" "+burstTime[i]);
		}
		for(i=0;i<n;i++)
		{
		for(j=0;j<n-1;j++)
			{
				if(arrivalTime[j]>arrivalTime[j+1])
			{
				temp = arrivalTime[j];
				arrivalTime[j] = arrivalTime[j+1];
				arrivalTime[j+1] = temp;
				
				temp = burstTime[j];
				burstTime[j] = burstTime[j+1];
				burstTime[j+1] = temp;
				
				temp = process[j];
				process[j] = process[j+1];
				process[j+1] = temp;
				
				
			}	
			
			}
		}
		System.out.println("......");
		for(i=0;i<n;i++)
		{
			System.out.print("p"+process[i]+" "+arrivalTime[i]+" "+burstTime[i]);
		}
		for(i=0;i<n;i++)
		{
			cum[i]=0;
		}
		
		for(i=0;i<n-1;i++)
		{
			cum[i+1]+= cum[i] +burstTime[i];
			awt+= ( cum[i+1]-arrivalTime[i+1]);
				System.out.println(awt);
		}
		awt=awt/3;
			System.out.println(awt);
		
		
		
		
	}
}