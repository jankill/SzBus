package org.dongyf.szbus.test;

import org.dongyf.szbus.biz.XmlParser;
import org.dongyf.szbus.entity.ResultCodes;
import org.dongyf.szbus.entity.Station;

import android.test.AndroidTestCase;

public class XmlParserTest extends AndroidTestCase {

	public void  testOne() {
		XmlParser xmlParser = new XmlParser();
		ResultCodes<Station> resultCodes = xmlParser.parserStationXml();
		System.out.println(resultCodes);
		System.out.println("sasadasdasdas");
	
	}
}
