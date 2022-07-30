package j11_상속.factory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory[] samsungfactories = new SamsungFactory[4];
		samsungfactories[0] = new SamsungFactory(1);
		samsungfactories[1] = new SamsungFactory(2);
		samsungfactories[2] = new SamsungFactory(3);
		samsungfactories[3] = new SamsungFactory(4);
		
		LGFactory[] lgFactories = new LGFactory[4];
		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);
		lgFactories[3] = new LGFactory(4);
		
		for(int i = 0; i < samsungfactories.length; i++) {
			samsungfactories[i].start();
		}
		
		for(int i = 0; i < lgFactories.length; i++) {
			lgFactories[i].start();
		}
		
		
	}

}
