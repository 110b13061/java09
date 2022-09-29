package java09;
class CRectangle{
	int width;
	int height;
	public CRectangle(int w,int h){
		width = w;
		height = h;
	}
	public CRectangle() {
		this(10,8);
	}
	public void show() {
		System.out.println(""+width);
		System.out.println(""+height);
	}
}
	public class Class01{
		public static void main(String[] args) {
			CRectangle rec1 = new CRectangle(5,2);
			rec1.show();
			CRectangle rec2 = new CRectangle();
			rec2.show();
			
		}
	}
