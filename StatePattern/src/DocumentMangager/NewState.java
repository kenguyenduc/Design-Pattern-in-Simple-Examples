package DocumentMangager;

public class NewState implements State{
    @Override
    public void HandleRequest(){
        System.out.println("Create a new document");
    }
}
