class parent
{
    void career()
    {
        System.out.println("ML ENGG");
    }
    void marry()
    {
        System.out.println("shravani");
    }
         /////////////////code2.java:7: error: missing method body, or declare abstract
    
          
       

}
abstract class child extends parent
{
    abstract void marry();
    
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