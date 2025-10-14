package parsers.dom;

import model.Author;
import model.Sonnet;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainDom {
    public static Sonnet parse () throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = factory.newDocumentBuilder().parse(new File("file.xml"));

        doc.getDocumentElement().normalize();

        Sonnet sonnet = new Sonnet();
        List<String> lines = new ArrayList<>();

        Author author = new Author();
        author.setFirst_name(doc.getElementsByTagName("firstName").item(0).getTextContent());
        author.setLast_name(doc.getElementsByTagName("lastName").item(0).getTextContent());
        sonnet.setAuthor(author);


        NodeList linesNodes = doc.getElementsByTagName("line");
        for (int i = 0; i < linesNodes.getLength(); i++) {
            lines.add(linesNodes.item(i).getTextContent());
        }
        sonnet.setLines(lines);

        return sonnet;
    }
}
