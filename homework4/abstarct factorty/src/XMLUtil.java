import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory dFactory =DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document;
            document =builder.parse(new File("config.xml"));

            NodeList nodeList=document.getElementsByTagName("className");
            Node classNode=nodeList.item(0).getFirstChild();
            String className=classNode.getNodeValue();

            Class clazz=Class.forName(className);
            Object obj =clazz.getDeclaredConstructor().newInstance();
            return obj;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
