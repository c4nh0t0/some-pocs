public class decrypt
{
    public static void main(String[] args){
    	System.out.println(a("VERIFIED STRINGS", "KEY")); 	
    }
    public static String a(String s, String s1)
    {
        byte[] sb = s.getBytes();
        byte abyte0[] = s1.getBytes();
        byte[] sb1 = new byte[sb.length];
        for(int i = 0; i < sb.length; i++)
            sb1[i] = (byte)(sb[i] ^ abyte0[i % abyte0.length]);

        return new String(sb1);
    }
}