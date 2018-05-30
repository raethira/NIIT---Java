class ConcreteCommand extends Command
{
	public ConcreteCommand( Receiver receiver ) {
		super ( receiver );
	}
	public void Execute()
	{
		receiver.Action();
	}
}