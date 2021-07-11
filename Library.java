import java.util.*;
class Project
{
	public static void main(String shama[])
	{
		char r;
		do{
			System.out.println("\n**********IEM LIBRARY MANAGEMENT SYSTEM************");
			System.out.println("\nEnter 1. to add Book");
			System.out.println("\nEnter 2. to issue Book");
			System.out.println("\nEnter 3. to return Book");
			System.out.println("\nEnter 4. to print issue details");
			System.out.println("\nEnter 5. to exit");
			Scanner sc=new Scanner(System.in);
		    System.out.println("\nEnter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				  Library aa=new Library();
				  aa.add();
				   break;
				case 2:
                  Library bb=new Library();
				  bb.issue();
                   break;
                case 3:
                  Library cc=new Library();
				  cc.return_book();
				   break;
				 case 4:
				  Library dd=new Library();
				  dd.details();
				   break;
				 case 5:
                  Library pp=new Library();
				  pp.exit();
                   break;
                 default:
                   System.out.println("\nWrong choice");
			}
            System.out.println("\nEnter Y/N to select the next option");
			r=sc.next().charAt(0);
		}   while(r=='Y'||r=='y');
			 if(r=='N'||r=='n')
			    {
				 Library z=new Library();
				 z.exit();
		        }
		    } 

    }
	
class Library
{
	static String str,c,b,date;
	static int a;
	void add()
	{
		System.out.println("\nEnter Book name:\nEnter Author name:\nEnter Book number:");
		Scanner obj1=new Scanner(System.in);
		str=obj1.nextLine();
		String author=obj1.nextLine();
		int no=obj1.nextInt();
	    System.out.println("\nYout details are: "+str+"-" +author+"-" +no+"-");
	}
    void issue()
	{
		Scanner obj2=new Scanner(System.in);
		System.out.println("\nBook name:");
		str=obj2.nextLine();
		System.out.println("\nBook_ID:");
		a=obj2.nextInt();
		obj2.nextLine();
		System.out.println("\nIssue date:");
		b=obj2.nextLine();
		System.out.println("\nTotal no of books issued:");
		c=obj2.nextLine();
		System.out.println("\nReturn books date:");
		date=obj2.nextLine();
	}
	int getid()
	{
		return a;
	}
	void return_book()
	{
		System.out.println("\nEnter Student nam:\nEnter Book_ID:");
		Scanner obj3=new Scanner(System.in);
		String name=obj3.nextLine();
		int bookid=obj3.nextInt();
		if(a==bookid)
		{
			System.out.println("\nTotal Details");
			System.out.println("\nBook name::"+Library.str);
			System.out.println("\nBook ID::"+Library.a);
			System.out.println("\nBook Issue date::"+Library.b);
			System.out.println("\nTotal no of books issued::"+Library.c);
			System.out.println("\nBook Return date::"+Library.date);
		}
		else
		{
			System.out.println("\nWrong ID,Please enter the correct ID");
		}
	}
	void details()
	{
		    System.out.println("\nBook name::"+Library.str);
			System.out.println("\nBook ID::"+Library.a);
			System.out.println("\nBook Issue date::"+Library.b);
			System.out.println("\nTotal no of books issued::"+Library.c);
			System.out.println("\nBook Return date::"+Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
}

			
		