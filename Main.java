package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void getMedian(int arr1[],int arr2[])
    {
        int m=arr1.length;
        int n=arr2.length;
        int res=(m+n)/2;
        res=res+1;
        double result=0.0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0;
        int j=0;
        if(m==0 || n==0)
        {
            if(m==0)
            {
               for (i=0;i<n;i++)
               {
                   list.add(arr2[i]);
               }
            }
            else if(n==0)
            {
                for (i=0;i<m;i++)
                {
                    list.add(arr1[i]);
                }
            }
        }
        else
        {
            for(int k=0;k<res;k++)
            {
                if(i!=m && j!=n  )
                {
                    if(arr1[i]<arr2[j] )
                    {
                        try
                        {
                            list.add(arr1[i]);
                            System.out.println(arr1[i]);
                            i++;
                        }
                        catch (Exception e)
                        {
                            System.out.println(e);
                        }

                    }
                    else if(arr1[i]>arr2[j] )
                    {
                        try
                        {
                            list.add(arr2[j]);
                            System.out.println(arr2[j]);
                            j++;
                        }
                        catch (Exception e)
                        {
                            System.out.println(e);
                        }
                    }
                }
                else
                {
                    if(i!=n &j==m)
                    {
                        try
                        {
                            list.add(arr1[i]);
                            i++;
                        }
                        catch (Exception e)
                        {
                            System.out.println(e);
                        }

                    }
                    else if(i==n &j!=m)
                    {
                        try
                        {
                            list.add(arr2[j]);
                            j++;
                        }
                        catch (Exception e)
                        {
                            System.out.println(e);
                        }

                    }
                }

            }
        }

        if((m+n)%2==0)
        {
             result=list.get(res-1)+list.get(res-2);
             result=result/2;
        }
        else
        {
             result=list.get(res-1);
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array 1");
        int m=sc.nextInt();
        System.out.println("Enter the elements");
        int ar1[]=new int[m];
        for(int i=0;i<m;i++)
        {
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter Size of array 2");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int ar2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar2[i]=sc.nextInt();
        }
        getMedian(ar1,ar2);
    }
}

