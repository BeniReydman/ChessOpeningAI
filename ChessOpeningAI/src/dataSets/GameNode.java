package dataSets;

public class GameNode {
	
	GameNode next;

	public GameNode(GameNode next)
	{
		this.next = next;
	}
	
	public void setNext(GameNode next)
	{
		this.next = next;
	}
	
	public GameNode getNext()
	{
		return next;
	}
}
