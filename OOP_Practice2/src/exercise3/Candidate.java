package exercise3;

public class Candidate {
	protected String id;
	protected String name;
	protected String address;
	protected int priority;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Candidate() {
		super();
	}
	public Candidate(String id, String name, String address, int priority) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.priority = priority;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+this.id+"\nname: "+this.name+"\naddress: "+this.address+"\npriority: "+this.priority ;
	}
	

}
