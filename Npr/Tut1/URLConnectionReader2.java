package Npr.Tut1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader2 {
    public static void main(String[] args) throws IOException {
        URL url = null;
        BufferedReader in = null;
        try {
            url = new URL("http://lms.fit.hanu.vn");
        } catch (MalformedURLException e) {
            System.out.println("Cannot find webpage" + url);
            System.exit(-1);
        }
        try {
            URLConnection aConnection = url.openConnection();
            in = new BufferedReader(new InputStreamReader(aConnection.getInputStream()));
        } catch (IOException e) {
            System.out.println("Cannot connect to webpage " + url);
            System.exit(-1);
        }
        try {
            String lineOfWebPage;
            while ((lineOfWebPage = in.readLine()) != null) {
                System.out.println(lineOfWebPage);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Cannot read from webpage " + url);
        }
    }
}
