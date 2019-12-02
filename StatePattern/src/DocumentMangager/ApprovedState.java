package DocumentMangager;

public class ApprovedState implements State{

    @Override
    public void HandleRequest() {
        System.out.println("Approved");
    }
    
}
