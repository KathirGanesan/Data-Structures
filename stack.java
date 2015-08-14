/**
 * Created by Kathir G on 8/13/2015.
 */
import java.util.*;
public class stack {
    int a[],n,top;
    Scanner sc = new Scanner(System.in);
    stack()
    {
        top=-1;
        System.out.println("Enter N:");
        n=sc.nextInt();
        a = new int[n];

    }
    public int size()
    {
        return top;
    }
    public boolean isempty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isfull()
    {
        if(top==n-1)
            return true;
        else
            return false;
    }
    public void resize(int x[],int n)
    {
        int[] temp = new int[n*2];
        for(int i=0;i<n;i++)
        {
            temp[i]=x[i];
        }
        a=temp; n= n*2;
    }
    public void push(int x)
    {
        if(size() == n-1)
        {
        resize(a,n);
            a[++top]=x;
        }
        else
            a[++top]=x;
    }
    public void pop()
    {
        if(isempty())
            System.out.println("Stack underflow!");
        else
        {
            int t = a[top--];
            System.out.println(t + " is popped!");
        }
    }
    public  void display()
    {
        System.out.println("The Stack elements are ...");
        for(int i=0;i<=top;i++)
            System.out.println(a[i]);
    }
    public void operate()
    {
        int c,x;
                do {

            System.out.println("1.Push 2.Pop 3.IsFull 4.IsEmpty 5.Display 6.Exit \n Your choice:");
            c=sc.nextInt();
            switch(c)
            {
                case 1: System.out.println("Enter number:"); x=sc.nextInt();push(x); break;
                case 2: pop(); break;
                case 3: if(isfull()) System.out.println("Yes, the Stack is full!"); else System.out.println("Nope!");break;
                case 4: if(isempty()) System.out.println("Yes, the Stack is empty!"); else System.out.println("Nope!");break;
                case 5: display();break;
                case 6: System.exit(0);
                    default: System.out.println("Invalid option!");

            }
        }while(true);
    }
    public  static  void  main(String arg[])
    {
        stack s = new stack();
        s.operate();
    }
}
