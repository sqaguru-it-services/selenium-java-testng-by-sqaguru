package synchronizationinjava;

public class MyThread extends Thread{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int countStackFrames() {
		// TODO Auto-generated method stub
		return super.countStackFrames();
	}

	@Override
	public ClassLoader getContextClassLoader() {
		// TODO Auto-generated method stub
		return super.getContextClassLoader();
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return super.getState();
	}

	@Override
	public UncaughtExceptionHandler getUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return super.getUncaughtExceptionHandler();
	}

	@Override
	public void interrupt() {
		// TODO Auto-generated method stub
		super.interrupt();
	}

	@Override
	public boolean isInterrupted() {
		// TODO Auto-generated method stub
		return super.isInterrupted();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

	@Override
	public void setContextClassLoader(ClassLoader cl) {
		// TODO Auto-generated method stub
		super.setContextClassLoader(cl);
	}

	@Override
	public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
		// TODO Auto-generated method stub
		super.setUncaughtExceptionHandler(eh);
	}

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("thread started");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
