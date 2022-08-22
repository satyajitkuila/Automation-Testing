package pacakage003;

public class CreateBox {

	public static void main(String[] args) {
		Common cm = new Common();
//		int h =cm.height=10;
//		int l =cm.length=20;
//		int b =cm.width=30;
		int b = cm.setWidth(10);
		int l = cm.setLength(010);
		int h = cm.setHeight(15);
		cm.setBoxDimension(l, b, h);
		System.out.println(cm.getlength());
	}

}
