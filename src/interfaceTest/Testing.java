package interfaceTest;

public class Testing {

	public static void main(String[] args) {
		CommandHandler.init();
		CommandHandler ch = new CommandHandler();
		ch.execute("help");
	}
}
