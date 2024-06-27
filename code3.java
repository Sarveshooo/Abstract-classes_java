class parent
{
    void career()
    {
        System.out.println("ML ENGG");
    }
    abstract  void marry();           
    
          
       

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