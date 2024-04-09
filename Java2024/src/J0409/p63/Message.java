package J0409.p63;

public class Message {
	private String skill;
	private String name;

	public Message(String skill, String name) {
		this.skill = skill;
		this.name = name;
	}

	public String to() {
		return name;
	}

	public String command() {
		return skill;
	}
}
