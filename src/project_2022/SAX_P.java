/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2022;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.List;


public class SAX_P extends DefaultHandler {

    boolean bFirstName = false;
    boolean bLastName = false;
    boolean bNickName = false;
    boolean bMarks = false;
    boolean bWinner = false;
    boolean bRunnerup = false;
    boolean bWinningscore = false;
    boolean bReferee = false;
    boolean btopScorer = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        if (qName.equalsIgnoreCase("final")) {
            String venue = attributes.getValue("venue");
            System.out.println("Venue : " + venue);
            String year = attributes.getValue("year");
            System.out.println("Year : " + year);
            String replay = attributes.getValue("replay");
            System.out.println("Replay : " + replay);
        } else if (qName.equalsIgnoreCase("winner")) {
            bWinner = true;
        } else if (qName.equalsIgnoreCase("runnerUp")) {
            bRunnerup = true;
        } else if (qName.equalsIgnoreCase("winningScore")) {
            bWinningscore = true;
        } else if (qName.equalsIgnoreCase("referee")) {
            bReferee = true;
        }
        else if (qName.equalsIgnoreCase("topScorer")) {
            btopScorer = true;
        }
        else if (qName.equalsIgnoreCase("topScorer")) {
            btopScorer = true;
        }

    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("final")) {
            System.out.println("End Element :" + qName);
        }
    }

    @Override
    public void characters(char ch[],
                           int start, int length) throws SAXException {
        if (bWinner) {
            System.out.println("Winner: "
                    + new String(ch, start, length));
            bWinner = false;
        } else if (bRunnerup) {
            System.out.println("Runner Up: "
                    + new String(ch, start, length));
            bRunnerup = false;
        } else if (bWinningscore) {
            System.out.println("Winning Score: "
                    + new String(ch, start, length));
            bWinningscore = false;
        } else if (bReferee) {
            System.out.println("Referee: "
                    + new String(ch, start, length));
            bReferee = false;
            System.out.println("");
        }
    }


    public static void main(String[] args) {

        try {
            File inputFile = new File("GAAFinal.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            SAX_P myFirstSaxParser = new SAX_P();
            //System.out.println("SAX_P.MyFirstSaxParser.main()");
            saxParser.parse(inputFile, myFirstSaxParser);
        } catch (Exception e) {
            e.printStackTrace();

        }//end of main

    }

    public List getFinalList() {
        return null;
    }

    public String run(String fileName) {
        SAX_P saxRun = new SAX_P();
        return saxRun.run("GAAFinal.xml");
    }
}//end of public class SAX_P

