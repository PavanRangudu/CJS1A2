
public class CJS1A2_print_val {
	public static void main (String s[]) {
		int a = 20, b = 10;
		int b1 = a-- - --a; // 20 - 18 = 2
		int c = a--;        // 18
		int d = a>>2;       // a = 17 here same as 5'b10001 right shift by 2 = 3'b100 which is 4
		int e = a&b;        // a = 17 & b = 10 i.e a = 5'b10001 & b = 4'b1010 equals 0
		System.out.println(b1+"\n"+c+"\n"+d+"\n"+e);
	}
}
