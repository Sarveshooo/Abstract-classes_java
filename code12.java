abstract class parent
{
    abstract void marry();


    void career()
    {
        System.out.println("ML ENGG");
    }

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
        parent obj=new parent();
        child obj2=new child();
    }
}