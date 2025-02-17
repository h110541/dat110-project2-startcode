package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

	private String topic;

	public SubscribeMsg(String user, String topic) {
		super(MessageType.SUBSCRIBE, user);
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
