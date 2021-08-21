public interface HTTPSWebsite extends Website { // interface extending another interface
    boolean isSecure = true;
    void setSSLCertificateIssuer(String issuer);
    String getSSLCertificateIssuer();
}
