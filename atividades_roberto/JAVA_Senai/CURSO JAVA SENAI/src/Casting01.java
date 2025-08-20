public class Casting01 {
    public static void main(String[] args) {
        byte myByte = 127;

        short myShort = 128;
        System.out.println((byte)myShort);

        byte myByte2 = 127;
        myByte2++;
        System.out.println(myByte2);
        myByte2++;
        System.out.println(myByte2);
        
    }    
}
