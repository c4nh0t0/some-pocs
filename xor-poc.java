public class SecureStorage
{
	public SecureStorage()
	{
	}
	public static void main (String[] args) {
		System.out.println(decrypt("XOR'ED 52 BYTE CHARACTER LONG", (byte)52));
	}
	public static String decrypt(String s, byte byte0)
	{
		byte sb[] = s.getBytes();
		byte abyte0[] = new byte[sb.length];
		for(int i = 0; i < sb.length; i++)
			abyte0[i] = (byte)(sb[i] ^ byte0);
		return new String(abyte0);
	}
}