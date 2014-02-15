package interfaceTest;

import interfaceTest.impl.TestCommand;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Flimsy | Dark
 * @category content
 * */
public class CommandHandler {

	/**
	 * Contains all the commands.
	 */
	
	private static final Map<String, Command> commands= new HashMap<String, Command>();
	
	/**
	 * Adds all the commands into the HashMap {@link commands}
	 */
	
	public static final void init(){
		commands.put("TestCommand", new TestCommand());
	}
	
	/**
	 * The method used to execute a {@link Command}
	 * @param commandName - The name of the command. <br> Should be exactly the same as the one put into the init() method. 
	 */
	
	public void execute(String commandName){
		Command command = null;
		if(commands.containsKey(commandName)){
			command = commands.get(commandName);
		}
		if(command == null){
			System.out.println("There is no such command.");
			return;
		}
		if(command.canExecute()){
			command.execute();
		} else {
			System.out.println("You can't execute this command.");
			return;
		}
	}
}
