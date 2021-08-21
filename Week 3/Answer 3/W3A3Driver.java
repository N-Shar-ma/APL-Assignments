public class W3A3Driver {
    public static void main(String[] args) {
        OnlineIDE repl = new OnlineIDE();
        repl.setUrl("replit.com");
        repl.setSSLCertificateIssuer("Cloudflare Inc");
        repl.supportLanguage("Java");
        repl.supportLanguage("C++");
        repl.supportLanguage("JavaScript");
        repl.supportLanguage("C");
        System.out.println("Details about this online IDE:");
        System.out.println("The url " + repl.getUrl() + " is part of world wide web?: " + Website.partOfWorldWideWeb);
        System.out.println("It is secure?: " + HTTPSWebsite.isSecure + ", and its SSL certificate is issued by " + repl.SSLCertificateissuer);
        System.out.println("It supports Java? " + repl.supportsLanguage("Java"));
    }
}

// Output

// Details about this online IDE:
// The url replit.com is part of world wide web?: true
// It is secure?: true, and its SSL certificate is issued by Cloudflare Inc
// It supports Java? true