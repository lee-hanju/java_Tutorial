public class Point {
	private int x,y;
	public Point(int x,int y) {this.x =x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {this.x=x; this.y=y;}
}



public class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y) {
		super(x, y);
		color = "BLACK";
		// TODO Auto-generated constructor stub
	}
	public ColorPoint() {
		super(0,0);
		color = "BLACK";
		// TODO Auto-generated constructor stub
	}
	public void setXY(int x,int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String n = color+"���� "+"("+getX()+","+getY()+")�� ��";
		return n;
	}
}


public class Main {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"�Դϴ�.");
	}
}