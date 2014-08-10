import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.Threads.ThreadB;
import com.Threads.BlockingQueue.BlockingQueue;


public class BlockingQueueTest {

	BlockingQueue<Integer> queue;
	
	@Before
	public void setUp() throws Exception {
		queue = new BlockingQueue<Integer>();
	}

	@Test
	public void test() {
		Thread t = new Thread(new ThreadB(queue));
		t.start();
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		assertTrue(queue.add(5));
		
	}

}
