package br.com.dsasoft.cdi.test;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Hello world!
 *
 */
public class App {
	private MockService service;

	public App() {
		Weld weld = new Weld();
		WeldContainer weldContainer = weld.initialize();
		service = weldContainer.instance().select(MockService.class).get();
		
		
		service.executeComponent();
	}

	public static void main(String[] args) {
		new App();
	}
}
