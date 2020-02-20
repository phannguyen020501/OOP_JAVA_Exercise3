package exercise3;

public class CandidateB extends Candidate {
	public static final String Math="Math";
	public static final String Chemistry="Chemistry";
	public static final String Biology="Biology";
	public CandidateB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateB(String id, String name, String address, int priority) {
		super(id, name, address, priority);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSubject: "+Math+"-"+Chemistry+"-"+Biology;
	}

}
