
public class Shape implements Agreeable {
	
	private int width;
	private int height;
	
	Shape(){
		
	}
	
	Shape(int width, int height){
		this.width = width;
		this.height = height;
	}

	@Override
	public void isSmallerThan() {
		// TODO Auto-generated method stub
		
	}
	
	public int calcArea(int width, int height){
		return this.width*this.height;
	}
	
	
	
	

}
