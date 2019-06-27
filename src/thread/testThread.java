package thread;


public class testThread implements Runnable{
	
	SynchronizationObject synchronizationObject;
	Thread thread;
	int type;
	
	public testThread(SynchronizationObject synchronizationObject,int type){
		this.synchronizationObject = synchronizationObject;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		if(type == 1)
			synchronizationObject.runSynchronizationMethod1();
		else
			synchronizationObject.runSynchronizationMethod0();
		
	}
	
	public static void main(String[] args) {
		
		SynchronizationObject synchronizationObject = new SynchronizationObject();
		new testThread(synchronizationObject, 1);
		new testThread(synchronizationObject, 0);
		
	}
	
}
