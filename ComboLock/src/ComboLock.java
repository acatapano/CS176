
public class ComboLock 
{

	private int[] code = new int[3];
	private int[] inputs = new int[] {0, 0, 0};
	private int position = 0;
	
	public ComboLock(int secret1, int secret2, int secret3)
	{
		
		code[0] = secret1;
		code[1] = secret2;
		code[2] = secret3;
		
	}
	
	public void reset()
	{
		
		position = 0;
		inputs = new int[] {0, 0, 0};
		
	}

	public void turnRight(int ticks)
	{
		
		position = position + ticks;
		
		if(inputs[0] == 0)
		{
			
			inputs[0] = position;
			
		}
		
		else if(inputs[0] != 0 && inputs[2] == 0)
		{
			
			inputs[2] = position % 40;
			
		}

	}
	
	public void turnLeft(int ticks)
	{
		
		position = Math.abs(position - ticks);
		inputs[1] = position;
		
	}
	
	public boolean open()
	{
		
		boolean open = false;
		
		if(inputs[0] == code[0] && inputs[1] == code[1] && inputs[2] == code[2])
		{
			
			open = true;
			return open;
			
		}
		
		return open;
		
	}
	
}
