public class test {

	public static void main(String[] args) {
		
		// Singleton
		
		singletonLazy lazy = singletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = singletonLazy.getInstancia();
		System.out.println(lazy);
		
		singletonEager eager = singletonEager.getInstancia();
		System.out.println(eager);
		eager = singletonEager.getInstancia();
		System.out.println(eager);
		
		singletonLazyHolder lazyHolder = singletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = singletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
	}
}