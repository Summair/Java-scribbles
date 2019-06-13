import java.util.*;




public class ArraySort {

protected final static int MAX = 4000;
protected final static int NEEDLE = 1999;

int haystack[];

Random r;

	public static void main(String[] args) {
		
		ArraySort h = new ArraySort();
		
		if(args.length == 0)
			h.play();
		else {
			int won = 0;
			 
			int games = Integer.parseInt(args[0]);
			for(int i=0; i< games; i ++)
				if (h.play())
					++won;
			System.out.println("Computer won" + won + " out of " + games + ".");
		}

	}
	
	
	public ArraySort() {
		
		haystack = new int[MAX];
		r = new Random();
		
	}

	
	public boolean play() {
		int i;
		
		for(i=0; i<MAX; i++) {
			haystack[i] = (int)(r.nextFloat() * MAX);
		}
		
		Arrays.sort(haystack);
		
		i = Arrays.binarySearch(haystack, NEEDLE);
	
		if (i >=0) {
			
			System.out.println("Value " + NEEDLE + "occurs at haystack [" + i + "]" );
			return true;
			
	} else { 
		System.out.println("Value " + NEEDLE + "does not occur in haystack" + haystack[-(i+2)] + " (found at" + -(i+2) + ")");
		return false;
	}
		
 }
}

