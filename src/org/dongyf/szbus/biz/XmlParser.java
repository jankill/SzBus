package org.dongyf.szbus.biz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.dongyf.szbus.entity.ResultCodes;
import org.dongyf.szbus.entity.Station;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class XmlParser {

	public ResultCodes<Station> parserStationXml() {
		ResultCodes<Station> resultCodes = null;
		XmlPullParserFactory xmlPullParserFactory = null;
		XmlPullParser xmlPullParser = null;
		FileInputStream fis = null;
		List<Station> stations = new ArrayList<Station>();
		
		System.out.println(this.getClass().getResource("/").getPath());
		File file = new File(this.getClass().getResource("/").getPath(),"station.xml");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			xmlPullParserFactory = XmlPullParserFactory.newInstance();
			xmlPullParserFactory.setNamespaceAware(true);
			xmlPullParser = xmlPullParserFactory.newPullParser();
			xmlPullParser.setInput(fis, "utf-8");
			int type = xmlPullParser.getEventType();
			while (type != XmlPullParser.END_DOCUMENT) {
				String nodeName = xmlPullParser.getName();
				resultCodes = new ResultCodes<Station>();
				Station station = new Station();
				if (type == XmlPullParser.START_TAG) {
					if (nodeName.equals("resultcode")) {
						resultCodes.setResultCode(Integer
								.parseInt(xmlPullParser.nextText()));
					} else if (nodeName.equals("reason")) {
						resultCodes.setReason(xmlPullParser.nextText());
					} else if (nodeName.equals("station")) {
						station.setStation(xmlPullParser.nextText());
					} else if (nodeName.equals("stationCode")) {
						station.setStationCode(xmlPullParser.nextText());
					} else if (nodeName.equals("local")) {
						station.setLocal(xmlPullParser.nextText());
					} else if (nodeName.equals("street")) {
						station.setStreet(xmlPullParser.nextText());
					} else if (nodeName.equals("Sections")) {
						station.setSections(xmlPullParser.nextText());
					} else if (nodeName.equals("point")) {
						station.setPoint(xmlPullParser.nextText());
					} else if (nodeName.equals("error_code")) {
						resultCodes.setErrorCode(Integer.parseInt(xmlPullParser
								.nextText()));
					}
				} else if (type == XmlPullParser.END_TAG) {
					if (nodeName.equals("item")) {
						stations.add(station);
						resultCodes.setBusInfo(stations);
					} else if (nodeName.equals("root")) {
						return resultCodes;
					}

				}

				type = xmlPullParser.next();
				System.out.println("while"+resultCodes);
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return resultCodes;
	}

}
