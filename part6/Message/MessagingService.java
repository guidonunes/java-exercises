package part6.Message;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            this.messages.add(message);
        } else {
            System.out.println("Too long. Not added.");
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }

}
