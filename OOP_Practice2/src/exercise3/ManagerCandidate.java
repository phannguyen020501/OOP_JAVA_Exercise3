package exercise3;

import java.util.ArrayList;
import java.util.List;

public class ManagerCandidate {
	List<Candidate> listcan=new  ArrayList<Candidate>();

	public ManagerCandidate(List<Candidate> listcan) {
		super();
		this.listcan = listcan;
	}

	public ManagerCandidate() {
		super();
	}
	public  void addCan(Candidate can) {
		listcan.add(can);
	}
	public void showInforCandidate() {
		listcan.stream().forEach(o->System.out.println(o.toString()));
	}
	public Candidate searchById(String id) {
		return listcan.stream().filter(o->o.getId().equals(id)).findFirst().orElse(null);
	}

}
