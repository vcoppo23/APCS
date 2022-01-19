public class Main{
	public static void main(String[] args) {
	int x = 197487;
	int total = 0;
	while (197487 <= x && x <= 673251){
	    String number = String.valueOf(x);
	    char[] d = number.toCharArray();
	    if (d[0] <= d[1] && d[1] <= d[2] && d[2] <= d[3] && d[3] <= d[4] && d[4] <= d[5]){
	        if (d[0] == d[1] || d[1] == d[2] || d[2] == d[3] || d[3] == d[4] || d[4] == d[5]){
	            total = total + 1;
	        }
	    }
	    x++;
	}
	System.out.println(total);
	}
}
