package br.com.dsasoft.cdi.test;

import javax.inject.Inject;

import br.com.dsasoft.cdi.test.qualifier.Message;

public class MockService {

	@Inject @Message
	private Component component;

	public void executeComponent() {
		component.executeComponent();
	}
}
