package br.com.dsasoft.cdi.test;

import br.com.dsasoft.cdi.test.qualifier.Command;

@Command
public class ComponentCommand implements Component {

	public void executeComponent() {
		System.out.println(ComponentCommand.class.getName());
	}

}
