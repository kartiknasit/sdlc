package test.com.sdlc.project.jms.jmslistener;

import static org.junit.Assert.*;

import javax.jms.TextMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sdlc.project.jms.adapter.ConsumerAdapter;
import com.sdlc.project.jms.jmslistener.ConsumerListener;

public class ConsumerListenerTest {

	private TextMessage message;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOnMessage() {
		ConsumerListener listener = new ConsumerListener();
		listener.onMessage(message);
		assertNull(message);
	}
}
