package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String read(String key,String path) throws FileNotFoundException {
        Properties properties=new Properties();
        try(FileInputStream fis=new FileInputStream(path)){
            properties.load(fis);
        }catch (IOException fe){
            fe.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static String read(String key) throws FileNotFoundException {
        return read(key,Constants.CONFIG_FILE_PATH);
    }
}
