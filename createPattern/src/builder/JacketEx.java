package builder;
//Jacket을 직접 활용하여 인스턴스를 생성하지 않고, 내부 클래스인 Bulder를 통하여 인스턴스를 생성
public class JacketEx {
	public static void main(String[] args) {
		createJacket();
	}
	public static void createJacket(){		//상품 등록
		Jacket jacket = new Jacket.Builder().setNumber(1)
				.setName("NackTiePro").setSize(174.3).build();
		System.out.println("품번 : "+jacket.number+", 제품명 : "
				+jacket.name+", 사이즈 : "+jacket.size);
	}
	//빌더 패턴을 활용하여 인스턴스를 생성하게 되면, 결합력을 낮추고, 내부 클래스에서 생성자를 호출되므로
	//해당 생성자의 직접적인 의존도(Dependency)를 낮출 수 있다. 
}
