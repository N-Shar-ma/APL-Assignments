import java.util.ArrayList;

public class OnlineIDE implements HTTPSWebsite, IDE { // multiple inheritance by implementing 2 interfaces
    String url, SSLCertificateissuer;
    ArrayList<String> languagesSupported = new ArrayList<String>();

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setSSLCertificateIssuer(String issuer) {
        SSLCertificateissuer = issuer;
    }

    public String getSSLCertificateIssuer() {
        return SSLCertificateissuer;
    }

    public void supportLanguage(String lang) {
        languagesSupported.add(lang);
    }

    public boolean supportsLanguage(String lang) {
        return languagesSupported.contains(lang);
    }
}
