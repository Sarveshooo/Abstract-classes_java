 class parent
{
    void career()
    {
        System.out.println("ML ENGG");
    }
     void marry();           /////////////////code2.java:7: error: missing method body, or declare abstract
    
          
       

}
class child extends parent
{
    void marry()
    {
        System.out.println("shravani");

    }
    void career()
    {
        System.out.println("YOUTUBER");

    }
}
class client
{
    public static void main(String[] args) {
        parent obj=new child();
        obj.marry();
        obj.career();
    }
}