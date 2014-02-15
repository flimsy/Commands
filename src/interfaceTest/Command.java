package interfaceTest;

/**
 * @author Flimsy | Dark
 * @category content
 * */
public interface Command {

	/**
	 * Executes the command
	 * {@link Command}
	 * */
	public void execute();
	
	/**
	 * Does the person meet the requirements to execute the command? <br>
	 * All restrictions can be added here.
	 * @return Returning false will prevent the command from executing.
	 * */
	
	public boolean canExecute();
	
	
}
