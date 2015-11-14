package net.alvinmeimoun.xml2json;

import net.alvinmeimoun.xml2json.converter.XmlFileToJsonFileConverter;

import java.io.IOException;

public class Xml2JsonMain {

    public static void main(String[] args){
        System.out.println(args.length);

        if(args == null || args.length < 2){
            System.out.println("Paramètres incorrect : entreé un chemin d'accès source (xml) et un chemin d'accès de destination (json)");
            return;
        }

        XmlFileToJsonFileConverter fileConverter = new XmlFileToJsonFileConverter();
        try {
            fileConverter.doConvert(args[0], args[1]);
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de la lecture/ecriture des fichiers : ");
            e.printStackTrace();
        }
    }

}
