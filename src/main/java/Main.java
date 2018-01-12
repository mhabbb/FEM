import fem.GlobalData;
import files.XmlReader;

public class Main {
    public static void main(String[] args) {
        //xx
        XmlReader xmlReader = new XmlReader();
        GlobalData globalData = xmlReader.readDataConfiguration();
        System.out.println(globalData.getB());
    }
}
