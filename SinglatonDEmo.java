class SinglatonDemo
{
    //Eagger Initialization Singlaton
   private static final  SinglatonDemo s1= new SinglatonDemo();
    private SinglatonDemo()
    {
    }
    public  static  SinglatonDemo getSinglatonDemo()
    {
    return s1;
    }
    //Lazy Initialization Singlaton

    }
    



