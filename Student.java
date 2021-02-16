
public class Student {
    private String surname;
    private int ID;
    static int z = 0;
    Student()
    {
        this.surname = "";
        this.ID = 0;
        z++;
    }
    Student(String surname, int ID)
    {
        this.surname = surname;
        this.ID = ID;
        z++;
    }

    Student(String surname)
    {
        this.surname = surname;
        this.ID = 0;
        z++;
    }

    Student (int ID)
    {
        this.surname ="";
        this.ID = ID;
        z++;
    }

    void Print()
    {
        System.out.println("Name = " + surname);
        System.out.println("ID = " + ID);
        System.out.println();

    }

    public static void main(String[] args)
    {
        Student test1 = new Student( );
        System.out.println(z);
        Student test2 = new Student("Dziuba" );
        System.out.println(z);
        Student test3 = new Student( 1234);
        System.out.println(z);
        Student test4 = new Student( "Mazur", 4321);
        System.out.println(z);

        test1.Print();

        test2.Print();
        test3.Print();
        test4.Print();
    }
    }







