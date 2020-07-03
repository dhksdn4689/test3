package ch22;

public class Member1 {
public String id;

public Member1(String id){
	this.id=id;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return id.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Member1) {
		Member1 m= (Member1)obj;
		if(this.id==m.id) {
			return true;
		}
		else {
			return false;
		}
		
	}
	return false;
}
	public String toString(){
		return id;
		
	}









}