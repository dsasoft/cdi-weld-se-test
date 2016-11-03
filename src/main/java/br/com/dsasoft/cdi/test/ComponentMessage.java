package br.com.dsasoft.cdi.test;

import br.com.dsasoft.cdi.test.qualifier.Message;

@Message
public class ComponentMessage implements Component {

	public void executeComponent() {
		System.out.println(ComponentMessage.class.getName());
	}
}
