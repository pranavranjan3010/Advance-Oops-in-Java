package kim1;
import javax.swing.*;
import java.util.Scanner;
public class harry {
    public static void main(String[] args) {
    }
    }
        /*
        //Data Hiding concept in Abstraction......................
        employee e=new employee();
        e.age=23;
        e.name_details();
        System.out.println("Age of emp1 is:"+e.age);
        e.salary=4000000;
        System.out.println("Salary of the emp1 is:"+e.salary);
        System.out.println("--New Salary--");
        System.out.println(e.salary_details());

    }

    }
    class employee
    {
        int id;
        float salary;
        int age;
        void name_details()
        {
            System.out.println("Name-Rahul");

        }
        float salary_details()
        {
           return 2*salary;
        }
    }
    //Prime number using oops concept.............
        /*
        prime p=new prime();
        p.enter();
        p.check();
    }
    }
    class prime {
    int n,i,count=0;
        Scanner Scan = new Scanner(System.in);
        void enter()
        {
            System.out.println("Enter the nuumber\n");
             n=Scan.nextInt();

        }
        void check()
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("Prime number");
            }
            else
            {
                System.out.println("Not a prime number");
            }

        }
    }
    //Factorial of the number using recursion..............
        /*
        factorial f=new factorial();
        System.out.println("Factorial of the number is:"+f.fact(4));
    }
    }
    class factorial
    {
        int fact=1;
        int fact(int n)
        {
            if(n==0) {
                return 1;
            }
                else
                {


                    return n * fact(n - 1);
                }
        }
    }
  //Mutliple inheritance using the concept of the Interface...............
         */
        /*
        cat c = new cat();
        c.eat();
        c.run();
        c.rest();

    }
}
    class Animal
    {
        Animal()
        {
            System.out.println("--------------------Animal Functions---------------");
        }
        void run()
        {
            System.out.println("Animal is running!!");
        }

    }
    class dog
    {
        dog()
        {
            System.out.println("--------------------Animal Functions---------------");
        }

    }


        class cat extends Animal implements functions
        {
            void rest()
            {
                System.out.println("Animal is taking rest!!");
            }
            public void eat()
            {
                System.out.println("Animal is eating");
            }

        }
        interface functions
        {
            void eat();

        }
        //Basic Interface Example....................

        /*
        tv t =new tv();
        t.start();
        t.stop();
    }
    }
    class tv implements remote
    {
        tv()
        {
            System.out.println("--------------------Remote functions--------------------");
        }
        public void start()
        {
            System.out.println("used to start the tv");
        }
      public  void stop()
        {
            System.out.println("used to stop the tv");
        }

    }
    interface remote
    {
         void start();
         void stop();
    }

        /*
        A a1=new A();
        a1.data(45);
        //a1.a();
        a1.a=56;
        System.out.println(a1.a);
    }
}
class A
{
     int a;
    void data(int a)
    {
        System.out.println("value of the a is:"+a);
    }
}
//Use of the Static Keyword...............
        /*
        
      //  book b=new book();
       // b.details();
       // book.details();
        book.details();
    }
    }
        class book
        {
      private  static  int id=3010;
      private  static  String name="Java Programming";
       private static int price=4000;
        static void details()
        {
            System.out.println("Name-"+name);
            System.out.println("Price-"+price);
            System.out.println("Id-"+id);
        }
        }
        //Setter and Getter Functions......................

        /*
        Circle c=new Circle();
        c.set_radius(7);
        System.out.println("Area of the circle is:"+c.get_area());

    }
    }
    class Circle
    {
        float r1;

        void set_radius(float r)
        {
            this.r1=r;
        }
        double  get_area()
        {
            return   3.14*r1*r1;

        }
    }
    //Abstract class in java....................
        /*
       // java_course j=new java_course();
        child j=new child();
        j.details();
    }
    }
    abstract class java_course
    {
        int days=42;
        float price=999;
        String name="Core Java";
        void details()
        {
           System.out.println("Name-"+name);
            System.out.println("Price-"+price);
            System.out.println("Days-"+days) ;
        }
    }

    class child extends java_course
    {
        child()
        {
            System.out.println("-------------------------Course Details------------------------");
        }


    }
        /*
          //Method Overriding(Run time Polymorphism)
        //A a=new A();
        //a.data();
        B b=new B();
        b.data();
    }
    }
     //Method Overriding(Run time Polymorphism)
    class A
    {
        void data()
        {
            System.out.println("hello world");
        }
    }
class B extends A
{
    void data()
    {
        super.data();
        System.out.println("hello welcome");
    }
}
        /*
        //Method Overloading(Compile time Polymorphism)
        sum s=new sum();
        System.out.println(s.add(15,5));
        System.out.println(s.add(3.4,5.67));
        System.out.println(s.add("Hello","World"));
    }
    }
    class sum
    {
        int add(int a,int b)
        {
            return a-b;
        }
        String add(String a,String b)
        {
            return a+b;
        }
        double add(double a,double b)
        {
            return a*b;
        }
    }

        /*
        //Sum of the numbers..................using functions
        add s=new add();
        s.sum(3,4);
        System.out.println(s.sum());
    }
    }
    class add
    {
        int a,b;
        void sum(int a1,int b1)
        {
           this.a=a1;
           this.b=b1;
        }
        int sum()
        {
            return a+b;
        }

    }
    //Parameterized constructor...............
        /*
        A a1=new A(5);
        System.out.println(a1.a);
    }
    }
 class A
{
    int a;
    A(int a2 )
    {
        this.a=a2;

    }
}
//Construtors..................
        /*
        B a=new B();
    }

    }

    class A
    {
        A()
        {
            System.out.println("Constructor of the class A");
        }
    }
class B extends A
{
    B()
    {
        System.out.println("Constructor of the class B");
    }
}
//Classes and Objects....................
        /*
        
car c=new car();
c.data();

    }
    }
    class car
    {
        private int no=3010;
        private String name="Ferrari";
       private  float price=7000000;
        void data()
        {
            System.out.println("Name-"+name);
            System.out.println("Number-"+no);
            System.out.println("Cost-"+price);
        }


    }
