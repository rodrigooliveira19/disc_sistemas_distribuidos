package threads;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ads
 */
public class Consumer extends Thread {

	Programa a;

	public Consumer(Programa x) {

		a = x;
	}

	public void run() {

		try {
			while (true) {
				while (a.itemCount == 0)
					sleep(100);
				int item;
				//item = (Integer) a.buffer.get(0);
				if (a.itemCount <= 0) {
					a.semaphore.down();
				}
			
				item = (Integer) a.getBuffer().get(0);
				//a.buffer.remove(0);
				a.getBuffer().remove(0); 
				a.itemCount--;
				System.out.println("consumer: consuming item "+item);
				for (int i =0;i<10000;i++);
				a.semaphore.down();
				
			}
 
		}

		catch(InterruptedException e) {

			e.printStackTrace(); 

		}

	}


}
