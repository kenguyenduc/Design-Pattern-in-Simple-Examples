package DocumentMangager;

public class SubmittedState implements State{

    @Override
    public void HandleRequest() {
        System.out.println("Submitted");
    }
    
}
