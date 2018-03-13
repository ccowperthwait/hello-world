public class Sample {
	public static void main(String[] args) {
		if (args == null) {
			System.out.println("args==null");
		} else if (args.length == 0) {
			System.out.println("args.length==0");
		} else {
			for (int i = 0; i < args.length; i++) 
				System.out.println("args[" + i + "]=[" + args[i] + "]");
		}
	}
}
