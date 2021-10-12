package ex43;

import java.io.*;

public class WebsiteMaker {

    String directorypath;

    public String createWebsite(String webname) {
        //create a file with the directory as its name
        String directory = directorypath + webname;
        File fp = new File(directory);
        //put the file in the directory
        fp.mkdirs();

        return directory;
    }

    public String html(String webname, String author) {
        String html = directorypath + webname + "/index.html";
        //create skeleton
        String skeleton = "<title>" + webname + "</title>\n<meta>" + author + "</meta>";

        File fp = new File(html);

        try {
            FileWriter ofp = new FileWriter(fp);
            ofp.write(skeleton);
            ofp.close();
        }
        catch(Exception e) {
            //nothing
        }

        return html;
    }

    public String javascriptWebsite(String webname) {
        String jssdir = directorypath + webname + "/js/";
        File fp = new File(jssdir);
        fp.mkdirs();

        return jssdir;
    }

    public String cssWebsite(String webname) {
        String cssdir = directorypath + webname + "/css/";
        File fp = new File(cssdir);
        fp.mkdirs();

        return cssdir;
    }
}
