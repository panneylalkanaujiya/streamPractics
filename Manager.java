public class Manager
{
        static
        {
        System.out.println("SIB");
    }
        {
            System.out.println("IIB");
        }
    public Manager()
    {
        System.out.println("Manager");
    }
        public static void main(String[] args) {
        System.out.println("Main started");
        Manager m1 = new Manager();
        System.out.println("Main ended");
    }

}


