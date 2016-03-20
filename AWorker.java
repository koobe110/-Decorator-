package imooc;

public class AWorker extends Worker {
	private Worker worker;
	public AWorker(Worker worker) {
		// TODO Auto-generated constructor stub
		this.worker = worker;
	}
	public void doSomeWork(){
		System.out.println("A¹«Ë¾");
		worker.doSomeWork();
	}
}
