package exercise3;

public class CandidateC extends Candidate {
	public static final String Literature="Literature";
	public static final String Geography="Geography";
	public static final String History="History";
	public CandidateC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateC(String id, String name, String address, int priority) {
		super(id, name, address, priority);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nSubject: "+Literature+"-"+Geography+"-"+History;
	}

}
