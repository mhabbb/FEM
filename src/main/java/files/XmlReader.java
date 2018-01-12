package files;

import fem.GlobalData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class XmlReader {

    public GlobalData readDataConfiguration(){
        try {
            File file = new File(this.getClass().getClassLoader().getResource("data.xml").getFile());
            JAXBContext jaxbContext = JAXBContext.newInstance(GlobalData.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (GlobalData) unmarshaller.unmarshal(file);
        }catch (JAXBException e){
            e.printStackTrace();
        }
        return null;
    }
}
