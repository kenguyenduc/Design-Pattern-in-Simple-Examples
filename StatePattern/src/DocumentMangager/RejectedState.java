
package DocumentMangager;

public class RejectedState implements State {
    @Override
    public void HandleRequest() {
        System.out.println("Rejected");
    }
}
