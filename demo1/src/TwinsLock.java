import java.util.ArrayList;

/**
 * @author yuanqiao
 */
public class TwinsLock {

    static class OOMObject {

    }

    public static void main(String[] args) {
        ArrayList<OOMObject> oomObjects = new ArrayList<>();
        String s = "abc";
        String s1 = s + "cde";
        oomObjects.add(new OOMObject());
        while (true) {

        }
    }
}
