package j11_상속.factory;

public class FactoryCastMain {

	public static void main(String[] args) {
		//업캐스팅: 부모 개체(상위 객체)로 업캐스팅함 자료형 변환
		Factory f1 = new SamsungFactory(1); // 상속을 받았기 때문에 자료형이 Factory가 가능
		Factory f2 = new LGFactory(1);
		
		Factory[] factories = new Factory[10];
		
		for(int i = 0; i < factories.length; i++) {
			if(i % 2 == 0) {
				factories[i] = new LGFactory(i + 1);
			}else {
				factories[i] = new SamsungFactory(i + 1);
			}
		}
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
		System.out.println();
		for(int i = 0; i < factories.length; i++) {
			factories[i].stop();
		}
		
		//다운캐스팅
		
//		LGFactory lgFactory = (LGFactory) factories[0];
//		lgFactory.produceSmartTV();
//		
//		SamsungFactory samsungFactory = (SamsungFactory) factories[1];
//		samsungFactory.produceAirConditioner();
//		
		for(int i = 0; i < factories.length; i++) {
			if(factories[i] instanceof LGFactory) {
				LGFactory lgFactory = (LGFactory) factories[i];
				lgFactory.produceSmartTV();
				
			}else if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory) factories[i];
				samsungFactory.produceAirConditioner();
				
			}else {
				System.out.println("다운캐스팅 불가능");
			}
		}
		
	}

}
