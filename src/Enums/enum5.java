package Enums;

public class enum5 {
    public enum WebSites{GOOGLE ("www.google.com"),FACEBOOK("www.facebook.com"),YAHOO("www.yahoo.com");

    private String site;
    WebSites(String site) {
        this.site=site;
        }
        public String getSite(){
        return this.site;
        }

    }

    public static void main(String[] args) {
        for (WebSites web:WebSites.values()){
            System.out.println(web+"  =  "+web.getSite());

        }

    }
    }
