package carrace.car;
import java.util.Random;



public class carImpl implements car{
	
	private Random random = new Random();
	private int num=0;
	
	
	public String name;
	
	public carImpl(String name) {
		this.name=name;
	}
	
	
	@Override
	public int randomNum() {
		random.setSeed(System.currentTimeMillis());
		int n=random.nextInt(10);
		return n;
	}


	@Override
	public int count(int i) {
		if(i>=4) {
			num++;
		}
		return num;
	}
}
