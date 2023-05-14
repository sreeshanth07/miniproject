import java.util.Scanner;

public class MiniProject {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char display= 'y';
		
		while(display == 'y' || display=='Y') {
			System.out.println("1.addition ");
			System.out.println("2.subtraction");
			System.out.println("3.even or odd ");
			System.out.println("4.Prime number or non Prime number ");
			System.out.println("5.reversing of number");
			System.out.println("6.armstorng number ");
			System.out.println("7.palindrome number");
			System.out.println("8.swaping of numbers ");
			System.out.println("9.Enter a number and then find a number ");
			System.out.println("10.Number in words.");
			System.out.println("11.tables ");
			System.out.println("12.check which value is greater ");
			System.out.println("13.check whcih value is lesser");
			System.out.println("14.Entered aplphabet is vowel or consonant");
			System.out.println("15.Leap year or Non Leap year");
			System.out.println("16.vote eligibility");
			System.out.println("17.know which number give which day of a week");
			System.out.println("18.know which number give which day of a month");
			System.out.println("19.know how many dots are requried to be connected for a diagram");
			System.out.println("20.marriage elgibility");
			System.out.println("21.check whether entered number is positive or negative or nuteral");
			System.out.println("22.give the temperature value and check the condition outside ");
			System.out.println("23.choose the operator for your number ");
			System.out.println("24.know how many times does the number is repeated");
			System.out.println("25.searching of number in the entered list ");
			System.out.println(" ");
			System.out.println("---> **please enter your choice of program.**<--");
			
			int choice =sc.nextInt();
			
			switch (choice) {
			case 1: addition();break;
			case 2: subtraction();break;
			case 3: evenOrOdd();break;
			case 4: primeOrNonPrime();break;
			case 5: reverse();break;
			case 6: armstrong();break;
			case 7: palindrome();break;
			case 8: swap();break;
			case 9: NumberAndDigit();break;
			case 10: NumInWords();break;
			case 11: table();break;
			case 12: greater();break;
			case 13: lessThan();break;
			case 14: vowelOrConsonent();break;
			case 15: leapOrNonLeap();break;
			case 16: vote();break;
			case 17: week();break;
			case 18: month();break;
			case 19: connect();break;
			case 20: elgibility();break;
			case 21: positiveOrNegative();break;
			case 22: temperature();break;
			case 23: operator();break;
			case 24: repitition();break;
			case 25: search();break;
			default : System.out.println("entered wrong choice ");
			}
			
			System.out.println("do you watn to continue Y/N");
			display=sc.next().charAt(0);
		}
		System.out.println("thanks for tryting my project and testing me ....");	
	}
		public static void addition() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter two numbers for addition :");
			int a =sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			System.out.println(c);
		}
		public static void subtraction() {
			System.out.println("please enter two number for subtraction :");
			Scanner sc=new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a-b ;
		    System.out.println(c);
		}
		public static void evenOrOdd() {
			System.out.println("please enter a number to check even or odd ");
			Scanner sc=new Scanner(System.in);
			int a = sc.nextInt();
			if(a%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		public static void primeOrNonPrime(){
			System.out.println("please enter a number to check it is prime or not ");
			Scanner sc= new Scanner(System.in);
			int a =sc.nextInt();
			
			boolean flag=true;
			
			for(int i=2; i<a; i++) {
    			if (a%i==0) flag = false;
		}
			if (flag) {
				System.out.println(a + "=" + "yes it is a prime number");
			}
			else {
				System.out.println(a + "=" + "no it is not a prime number ");
			}
   }
		public static void reverse() {
			System.out.println("Please enter a number to reverse : ");
			Scanner sc= new Scanner(System.in);
			
			int a = sc.nextInt();
			int dulblicate=a;
			int reverse = 0;
			
			while(a!=0) {
				int temp=a%10;
			        reverse=reverse*10+temp;
			        a=a/10;
			        System.out.println(reverse);
			}
		}
		
		public static void armstrong() {
		    System.out.println("waht is a armstrong ?.");
			System.out.println("A) the Armstrong number is the number in any given number base, which "
					+ "forms the total of the same number, when each of its digits is raised to "
					+ "the power of the number of digits in the number.");
			System.out.println("   ");
			System.out.println("please enter a number to check whether it is armstorng ot not ");
			Scanner sc=new Scanner (System.in);
			
			int a =sc.nextInt();
			int dublicate=a;
			int armstrong =0;
			
			while(a!=0) {
				int temp =a%10;
			   armstrong =armstrong+(temp*temp*temp);
			            a=a/10;
			}
			if(dublicate==armstrong) {
				System.out.println("entered number is armstrong number ");
			}
			else {
				System.out.println("enterd number is not a armstrong number");
			}			
		}
		public static void palindrome() {
			System.out.println("what is a palindrome ? .");
			System.out.println( "A) A number that remains same even if its digits are reversed,"
					                    + " is called a palindromic number.");
			System.out.println("please enter a number to check whether it is a palindrome or not ");
			Scanner sc=new Scanner(System.in);
			
			int a=sc.nextInt();
			int dublicate=a;
			int reverse=0;
			
			while (a!=0) {
			int	temp=a%10;
			    reverse=reverse*10+temp;
				a=a/10;
			}
			if(dublicate==reverse) {
				System.out.println("entered number is a palindrome number :"
						           + a + "=" + reverse);
			}
			else {
				System.out.println("entered number is not a plaindrome number ");
			}
		}
		public static void swap() {
			System.out.println("please enter any two numbers to swap :");
			Scanner sc=new Scanner(System.in);
			
			int a =sc.nextInt();
			int b =sc.nextInt();
			
			int temp=a;
			    a=b;
			    b=temp;
			    System.out.println(a);
			    System.out.println(b);
		}
		public static void NumberAndDigit() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter a number : ");
			int a =sc.nextInt();
			System.out.println("please enter a digit from 0-9 : ");
			int b =sc.nextInt();
			
			int dublicate =a;
			int reverse = 0;
			
			while(a!=0) {
				int temp=a%10;
			     reverse= reverse*10+temp;
				       a=a/10;
				       
				       for(;reverse!=0;) {
				    	   int number=reverse%10;
				    	       reverse=reverse/10;
				    	       
				   if(number == b)	{
					   switch (number) {
					   case 0 : System.out.println("entered number is found");break;
					   case 1 : System.out.println("entered number is found");break;
					   case 2 : System.out.println("entered number is found");break;
					   case 3 : System.out.println("entered number is found");break;
					   case 4 : System.out.println("entered number is found");break;
					   case 5 : System.out.println("entered number is found");break;
					   case 6 : System.out.println("entered number is found");break;
					   case 7 : System.out.println("entered number is found");break;
					   case 8 : System.out.println("entered number is found");break;
					   case 9 : System.out.println("entered number is found");break;
					  default : System.out.println("ayoo not getting sir ");
					   }
				   }
		        }
			}
		}
		public static void NumInWords() {
			System.out.println("please enter any number from 0-9");
			Scanner sc=new Scanner (System.in);
			
			int a = sc.nextInt();
			int dublicate=a;
			int reverse =0;
			
			while(a!=0) {
				int temp=a%10;
				    reverse=reverse*10+temp;
				    a=a/10;
			}
			
			for (;reverse!=0;reverse=reverse/10) {
				    int  number=reverse%10;
			
			switch(number) {
			case 0 : System.out.println("zero");break;
			case 1 : System.out.println("one");break;
			case 2 : System.out.println("two");break;
			case 3 : System.out.println("three");break;
			case 4: System.out.println("four");break;
			case 5 : System.out.println("five");break;
			case 6 : System.out.println("six");break;
			case 7 : System.out.println("seven");break;
			case 8 : System.out.println("eight");break;
			case 9 : System.out.println("nine");break;
			default : System.out.println("entered number out of range...");			
			}
			}
		}
		public static void table() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter a number between 0-9 to print their table : ");
			System.out.println(" ");
			System.out.println("***please note if you give a two digit number or more,"
					+ " it considers each number as a individual***. ");
			int a =sc.nextInt();
			int dublicate=a;
			int reverse=0;
			
			while(a!=0) {
				int temp=a%10;
				   reverse=reverse*10+temp;
				   a=a/10;
			}
			
			for(;reverse!=0;reverse=reverse/10) {
				int number=reverse%10;
				
				for(int i=1;i<11;i++) {
				System.out.println(number + "*" + i + "=" + (number*i));
				}
			}
		}
		public static void greater() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter your values to know which is greater : ");
			
			int A =sc.nextInt();
			int B =sc.nextInt();
			
			if(A>B) {
				System.out.println(A + ">" + B + " A is greater than B");
			}
			else {
				System.out.println(B + ">" + A + " B is greater than A");
			}		
		}
		public static void lessThan() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter your values to know which is lesser : ");
			
			int A =sc.nextInt();
			int B =sc.nextInt();
			
			if(A<B) {
				System.out.println(A + "<" + B + " B is lesser than A");
			}
			else {
				System.out.println(B + "<" + A + " A is lesser than B");
			}		
		}
		public static void vowelOrConsonent() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter any alphabet in English from A-Z"
					+ " to know it is vowel or consonent");
			
			char A =sc.next().charAt(0);
			if( A=='a'|| A=='e'|| A=='i'|| A=='o'|| A=='u'|| A=='A'|| A=='E'|| A=='I'|| A=='O'|| A=='U') {
				System.out.println("Entered alphabet is vowel");	
			}
			else {
				System.out.println("Entered alphabet is a consonent ");
			}
		}
		public static void leapOrNonLeap() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter a year to check leap year or not :");
			
			int a =sc.nextInt();
			if(a%4==0) {
				System.out.println("entered year is a leap year");
			}
			else {
				System.out.println("entered year is a non leap year.");
			}
		}
		public static void vote() {
			Scanner sc= new Scanner (System.in);
			System.out.println("please entere your age"
					+ " to know whether you are elegible for vote or not : ");
			
			int a =sc.nextInt();
			if(a>=18) {
				System.out.println("your elegible for vote");
			}
			else {
				System.out.println("your are not elegible for vote");
			}
		}
		public static void week() {
			Scanner sc=new Scanner (System.in);
			System.out.println("please enter a number to know whcih day it is :");
			
			int a =sc.nextInt();
				switch(a) {
				case 1: System.out.println("monday");break;
				case 2: System.out.println("tuesday");break;
				case 3: System.out.println("wednesday");break;
				case 4: System.out.println("thrusday");break;
				case 5: System.out.println("friday");break;
				case 6: System.out.println("saturday");break;
				case 7: System.out.println("sunday");break;
				default : System.out.println("entered a wrong choice..");
				}
			}
		public static void month() {
			Scanner sc=new Scanner(System.in);
         System.out.println("please enter a number to know whcih month it is :");
			
			int a =sc.nextInt();
				switch(a) {
				case 1: System.out.println("january");break;
				case 2: System.out.println("february");break;
				case 3: System.out.println("march");break;
				case 4: System.out.println("april");break;
				case 5: System.out.println("may");break;
				case 6: System.out.println("june");break;
				case 7: System.out.println("july");break;
				case 8: System.out.println("auguest");break;
				case 9: System.out.println("sepetmeber");break;
				case 10: System.out.println("october");break;
				case 11: System.out.println("november");break;
				case 12: System.out.println("december");break;
				default : System.out.println("entered a wrong choice..");
				}
		}
		public static void connect() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number from range 1 to 4 to know what diagram an");
			
			int a=sc.nextInt();
			
			if (a==1) {
				System.out.println("i am a dot");
			}
			else if (a==2) {
				System.out.println("i am a line");
			}
			else if (a==3) {
				System.out.println("i am a triangel");
			}
			else if (a==4) {
				System.out.println("i am a square");
			}
			else {
				System.out.println("I Know Only 4.");
			}
		  }
		public static void elgibility() {
			  Scanner sc= new Scanner(System.in);
			      System.out.println("please enter your ages");
			     
			      System.out.println("male:");
			      int male=sc.nextInt();
			      System.out.println("female:");
			      int female=sc.nextInt();
			      
			      if(male>=24 && female>=21) {
			    	  System.out.println("You are elgible for marriage");
			      }
			      else {
			    	  System.out.println("Sorry It is Not Allowed In INDIA ....");
			      }
			   }
		public static void positiveOrNegative() {
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter a number to know it is positive(+ve)"
					+ " or negative(-ve)");
			
			int a =sc.nextInt();
			if(a>0) {
				System.out.println(a+ "=" + "positive (+ve) number");
			}
			else if(a==0) {
				System.out.println(a+ "=" + "nutural number");
			}
			else {
				System.out.println(a+ "=" + "negative(-ve) number ");
			}
		}
		 public static void temperature() {
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Please Enter the Temperature Type (c/f) : ");
				char tt=sc.next().charAt(0);
				
				System.out.println("Now enter Temparature Value : ");
				int tv = sc.nextInt();
				
				if(tt=='c') {
					if(tv<=18) {
						System.out.println("temperature is freezing...");
					}
					else if(tv>=19&& tv<=35) {
						System.out.println("temperature is hot out side");				
					}
					else if(tv>=36&& tv<=60) {
						System.out.println("Amma babooiiiii....***");				
					}
			    } else if(tt=='f')	{
					if(tv<=65) {
						System.out.println("temperature is freezing...");
					}
					else if(tv>=66&& tv<=80) {
						System.out.println("temperature is hot out side");				
					}
					else if(tv>=81&& tv<=100) {
						System.out.println("Amma babooiiiii....***");		
					}	
			        } 
			    else {
					System.out.println("You have entered wrong temperature.");
			}	
		  }
		 public static void operator() {
				System.out.println("please enter any two numbers :");
				Scanner sc=new Scanner(System.in);
				
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("now select which operator to be used '+' or '-' or '*' or '/' ");
				char op=sc.next().charAt(0);
				
				if (op=='+') {
					System.out.println(a+b);
				}
				else if(op=='-') {
					System.out.println(a-b);
					
				}
				else if(op=='*') {
					System.out.println(a*b);
				}
				else if(op=='/') {
					System.out.println(a/b);
				}
				else {
					System.out.println("Entered number is not any operation...");
				}
		 }
				public static void repitition() {

					System.out.println("please enter any 10 values :");
					Scanner sc=new Scanner(System.in);
					int a[]=new int[10];
					
					for(int i=0;i<a.length;i++) {
						a[i]=sc.nextInt();
					}
					
					System.out.println("Enter search key : ");
					int key=sc.nextInt();
					int count = 0;
					
					for(int val : a) {
						if(val == key) {
							count ++;
						}
					}
					System.out.println(key + " is repeated " + count + " times ....");	
				}
				public static void search() {
					Scanner sc=new Scanner(System.in);
					int a[]= new int[5];
					System.out.println("please enter the array list...");
					for(int i=0;i<a.length;i++) {
						a[i]=sc.nextInt();
					}
					System.out.println("please enter a number to find in array list...");
					int b=sc.nextInt();
					boolean flag=false;
					for(int i=0;i<a.length;i++) {
						    if( a[i]==b)   flag=true;
					}
					if(flag) {
						System.out.println("number is found");
					}
					else {
						System.out.println("number is not found");
					}	
			    }
	}
		

