package interfaceTest.impl;

import interfaceTest.Command;

public class TestCommand implements Command{

	@Override
	public void execute() {
		System.out.println("Testcommand executed!");
	}

	@Override
	public boolean canExecute() {
		return true;
	}

}
