package ch.boye.httpclientandroidlib.impl.auth;

public interface SpnegoTokenGenerator {
    byte[] generateSpnegoDERObject(byte[] bArr);
}
