package exercise3;

public class CandidateA extends Candidate {
	public static final String Math="Math";
	public static final String Physics="Physics";
	public static final String Chemistry="Chemistry";
	public CandidateA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateA(String id, String name, String address, int priority) {
		super(id, name, address, priority);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSubject: "+Math+"-"+Physics+"-"+Chemistry;
	}

}
