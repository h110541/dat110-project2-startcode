package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {

	// message sent from client to create topic on the broker

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
    // as described in the project text

	private String topic;

	public CreateTopicMsg(String user, String topic) {
		super(MessageType.CREATETOPIC, user);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	@Override
	public String toString() {
		String s = super.toString();
		return s.replaceFirst("]$", ", topic=" + topic + "]");
	}

}
