
public class HTree {
	private static final double INITIAL_X = 0.5;
	private static final double INITIAL_Y = 0.5;
	private static final double INITIAL_L = 0.25;
	
	public static void main(String[] args){
		int depth = Integer.valueOf(args[0]);
		
		draw(depth,INITIAL_X, INITIAL_Y, INITIAL_L);
		
	}
	
	private static void drawH(double x, double y, double l){
		StdDraw.line(x-l, y, x+l, y);
		StdDraw.line(x-l, y-l, x-l, y+l);
		StdDraw.line(x+l, y-l, x+l, y+l);
	}
	
	private static void draw(int n,double x, double y, double l){
		if (n>0){
			drawH(x,y,l);
			
			draw(n-1,x-l,y-l,l/2);
			draw(n-1,x-l,y+l,l/2);
			draw(n-1,x+l,y-l,l/2);
			draw(n-1,x+l,y+l,l/2);
		}
	}
}
