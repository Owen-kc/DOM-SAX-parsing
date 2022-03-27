
package project_2022;


import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DOM_P {


    ArrayList<Final> GAA = new ArrayList<Final>();
    Document dom;

    public static void main(String[] args) {
        try {
            File inputFile = new File("GAAFinal.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("final");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Winner : " + eElement.getAttribute("winner"));
                    System.out.println("Runner Up : " + eElement.getElementsByTagName("runnerUp").item(0).getTextContent());
                    System.out.println("Winning Score : " + eElement.getElementsByTagName("winningScore").item(0).getTextContent());
                    System.out.println("Referee : " + eElement.getElementsByTagName("referee").item(0).getTextContent());
                    System.out.println("Top Scorer : " + eElement.getElementsByTagName("topScorer").item(0).getTextContent());
                    System.out.println("Top Scorer : " + eElement.getElementsByTagName("topScorer").item(0).getTextContent());
                    System.out.println("Attendance : " + eElement.getElementsByTagName("attendance").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();


        }//end of main

    }

    public List getFinalList(Element finalAL) {

        String winner =  getFinalList(finalAL, "winner");
        String runnerUp =  getFinalList(finalAL, "runnerUp");
        String winningScore =  getFinalList(finalAL, "winningScore");
        String referee =  getFinalList(finalAL, "referee");
        String topScorer =  getFinalList(finalAL, "topScorer");
        String topScorer2 =  getFinalList(finalAL, "topScorer2");
        String attendance =  getFinalList(finalAL, "attendance");
        String venue = finalAL.getAttribute("venue");
        String year = finalAL.getAttribute("year");
        String replay = finalAL.getAttribute("replay");

        //Create a new Final with the value read from the xml nodes
        Final e = new Final(venue,year, replay, winner, runnerUp, winningScore, referee,topScorer,topScorer2,attendance);

        return (List) e;

    }


    public String run(String fileName) {
        DOM_P d = new DOM_P();
        return null;
    }
}//end of public class DOM_P

