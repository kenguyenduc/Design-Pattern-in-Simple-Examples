package DocumentMangager;

public class Client {
    public static void main(String[] args) {
        DocumentContext context=new DocumentContext();
        
        context.setState(new NewState());
        context.applyState();
        
        context.setState(new SubmittedState());
        context.applyState();
 
        context.setState(new ApprovedState());
        context.applyState();
    }
}
