package Controller;

public class CincothreadsController extends Thread {
	private int n;

	public void CincoThreadsController() {
		this.n = (int) this.getId();
	}

	@Override
	public void run() {
		Mostrar();
	}

	public void Mostrar() {
		System.out.println("Thread nº " + n + " rodando");
	}
}