package ch22;

public class Key {
	public int number;

	Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Key) {
		Key k = (Key)obj;
		if(number==k.number) {
			return true;
		}
		else {
			return false;
		}
		
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
