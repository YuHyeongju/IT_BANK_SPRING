package obj;

public class Toy {
	private Battery bat;
	
	
	
	public void run() {
		if(bat == null) {
			System.out.println("배터리가 없습니다.");
			return;
		}
		
		
		
		System.out.println("장난감이 동작 합니다.");
		
	}
	public void setBat(Battery bat) { //private 속성이기때문에 간접접근을 해줘야함
		this.bat = bat; 
	}
}
