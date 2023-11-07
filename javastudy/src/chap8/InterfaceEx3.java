package chap8;
/*
 * 인터페이스형을 리턴타입으로 사용.
 */
class Lazerzet implements Printerable{
	@Override
	public void print() {
		System.out.println("레이저프린트로 프린트함.");
	}	
}
class Inkzet implements Printerable{
	@Override
	public void print() {
		System.out.println("잉크젯프린터로 프린트함.");
	}
}
class PrintManager{
	public static Printerable getPrint(String type) {
		if(type.equals("INK")) {
			return new Inkzet();
		}else {
			return new Lazerzet();
		}
	}
}
public class InterfaceEx3 {
	public static void main(String[] args) {
		Printerable p = PrintManager.getPrint("INK");
		p.print();
		p = PrintManager.getPrint("LAZER");
		p.print();
	}
}
