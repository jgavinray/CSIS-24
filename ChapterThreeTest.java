public class ChapterThreeTest
{

    public static void main(String[] args)
    {
        double width;
        double height;
        double length;
        double total;
        
        total = calcRoomVolume(3,4,5);
        System.out.println("Total volume equals: " + total);
    }
    
    

    public static double calcRoomVolume(double length, double width, double height)
    {
        return (length * width * height);
    }
    
    
    
}