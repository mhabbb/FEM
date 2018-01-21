package files;

import fem.GlobalData;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlReader {

    protected final Logger log = Logger.getLogger(XmlReader.class);

    public GlobalData readDataConfiguration(){
        try {
            File file = new File(this.getClass().getClassLoader().getResource("data.xml").getFile());
            log.debug("Xml data successfully opened");
            JAXBContext jaxbContext = JAXBContext.newInstance(GlobalData.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (GlobalData) unmarshaller.unmarshal(file);
        }catch (JAXBException e){
            log.error("Could not read xml data!");
            e.printStackTrace();
        }
        return null;
    }
}
