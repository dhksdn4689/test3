
public class HashMapNation {
	public String nation;
	public int pop;
	
	public HashMapNation(String nation, int pop) {
		this.pop=pop;
		this.nation=nation;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
		
	}

	@Override
	public boolean equals(Object obj) {
		//부모객체와 자식객체가 형성되어서 형변환이 가능한지 판단
		if(obj instanceof HashMapNation) {
			HashMapNation hash= (HashMapNation)obj;
			if(this.nation==hash.nation) {
				return true;
			}
			else {
			return false;}
		}
		return false;
	}
	
	public String toString()
	{
		return super.toString();
	}
}
