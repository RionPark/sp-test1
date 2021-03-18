package test;

public class StringBuilderTest {

	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		StringBuilder str = new StringBuilder();
		for(int i=1;i<=100000;i++) {
			str.append(i);
			if(i%100==0) {
				str.append("\r\n");
			}
		}
		System.out.println(str.toString());
		long eTime = System.currentTimeMillis();
		System.out.println("execute time : " + (eTime-sTime) + "ms");
	}
}
