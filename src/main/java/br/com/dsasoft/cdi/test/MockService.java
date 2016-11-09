package br.com.dsasoft.cdi.test;

import javax.inject.Inject;

import br.com.dsasoft.cdi.test.qualifier.Message;

public class MockService {

	private final Component component;

	@Inject
	public MockService(@Message Component component) {
		this.component = component;
	}

	public void executeComponent() {
		component.executeComponent();
	}
}
