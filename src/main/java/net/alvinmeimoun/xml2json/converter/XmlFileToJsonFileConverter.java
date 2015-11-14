package net.alvinmeimoun.xml2json.converter;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class XmlFileToJsonFileConverter {

    public void doConvert(String sourceFile, String destinationFile) throws IOException {
        String xmlString = FileUtils.readFileToString(new File(sourceFile));

        XmlToJsonConverter baseConverter = new XmlToJsonConverter();
        String jsonString = baseConverter.doConvert(xmlString);

        File destFile = new File(destinationFile);
        FileUtils.write(destFile, jsonString, StandardCharsets.UTF_8);
    }

}
