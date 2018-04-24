package dnhthanh.hueic.edu.vn;

public class DaoTu {
	public static String thuchien(String s) {
		String ns = new String();
		// Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo từ.
		char[] a = s.toCharArray();
		int t = a.length - 1;
		for (int i = a.length-1; i >= 0 ; i--) {
			if (a[i] == ' ' || i == 0) {
				ns += new String(getChar(a, i, t));
				t = i;
			}
		}
		return ns;
	}
	public static char[] getChar(char[] s, int from, int to) {
		char[] temp = new char[to-from+1];
		for(int i = from; i <= to; i++) {
			temp[i-from]=s[i];
		}
		return temp;
	}
}
