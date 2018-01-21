import fem.GlobalData;
import files.XmlReader;
import integral.Integral;
import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        XmlReader xmlReader = new XmlReader();
        GlobalData globalData = xmlReader.readDataConfiguration();

        Integral integral = new Integral();
        System.out.println(integral.doublePointIntegral());
        System.out.println(integral.triplePointIntegral());
    }
}
