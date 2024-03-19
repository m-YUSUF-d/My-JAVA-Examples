public class Students_Class {
    
    private static String name;
    private static int age;

    public static int count;

    public Students_Class()
    {
        count++;
    }
    public Students_Class(String name , int age)
    {
        setName(name);
        setAge(age);
        count++;
    }


    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    public static void getValues()
    {
        System.out.println("Name : " + name + ", Age : " + age);
        System.out.println(count);

    }
}
