abstract class  parent
{
    abstract void career();
  
    
    abstract void marry();
    
    }
 class child extends parent
{
    void marry()
    {
        System.out.println("LOVE MARRIAGE ");
    }
    
    void career()
    {
        System.out.println("YOUTUBER");

    }
}
class client
{
    public static void main(String[] args) {
       
        //child obj=new child();
        parent obj2=new parent();
        //parent obj3=new child();
            
        obj2.marry();
        obj2.career();
    }
}