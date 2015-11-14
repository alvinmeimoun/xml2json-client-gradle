package net.alvinmeimoun.xml2json.converter;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonConverter {

    private static final int JSON_INDENTATION = 4;

    public String doConvert(String sourceXmlString){
        JSONObject xmlJSONObj = XML.toJSONObject(sourceXmlString);
        return xmlJSONObj.toString(JSON_INDENTATION);
    }

}
