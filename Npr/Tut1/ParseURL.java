package Npr.Tut1;

public class ParseURL {
    public static void main(String... args) {
        String url = "http://java.sun.com:80/docs/books/tutorial/intro.html#DOWNLOADING";
        String protocol = url.substring(0, url.indexOf(":"));
        String host = url.substring(url.indexOf("//") + 2, url.indexOf("/", url.indexOf("//") + 2));
        String port = url.substring(url.indexOf(":", url.indexOf("//") + 2) + 1, url.indexOf("/", url.indexOf(":", url.indexOf("//") + 2) + 1));
        String path = url.substring(url.indexOf("/", url.indexOf(":", url.indexOf("//") + 2) + 1), url.indexOf("#"));
        String file = url.substring(url.indexOf("/", url.indexOf(":", url.indexOf("//") + 2) + 1));
        String ref = url.substring(url.indexOf("#") + 1);
        System.out.println("Protocol = " + protocol);
        System.out.println("Host = " + host);
        System.out.println("Port = " + port);
        System.out.println("Path = " + path);
        System.out.println("FileName = " + file);
        System.out.println("Ref = " + ref);
    }
}
