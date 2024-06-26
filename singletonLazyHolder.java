public class singletonLazyHolder {

	private static class InstanceHolder {
		public static singletonLazyHolder instancia = new singletonLazyHolder();
	}
	
	private singletonLazyHolder() {
		super();
	}
	
	public static singletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}