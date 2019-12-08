package mediator;
//Mediator 
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    public void addUser(User user);
}
