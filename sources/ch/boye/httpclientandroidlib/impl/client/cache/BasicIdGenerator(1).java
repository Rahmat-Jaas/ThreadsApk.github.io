package ch.boye.httpclientandroidlib.impl.client.cache;

import X.C18200wM;
import X.C18210wN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Formatter;
import java.util.Locale;

public class BasicIdGenerator {
    public long count;
    public final String hostname;
    public final SecureRandom rnd;

    public synchronized void generate(StringBuilder sb) {
        this.count++;
        int nextInt = this.rnd.nextInt();
        sb.append(System.currentTimeMillis());
        sb.append('.');
        new Formatter(sb, Locale.US).format("%1$016x-%2$08x", C18210wN.A1Y(Long.valueOf(this.count), nextInt));
        sb.append('.');
        sb.append(this.hostname);
    }

    public BasicIdGenerator() {
        String str;
        try {
            str = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException unused) {
            str = "localhost";
        }
        this.hostname = str;
        try {
            SecureRandom instance = SecureRandom.getInstance("SHA1PRNG");
            this.rnd = instance;
            instance.setSeed(System.currentTimeMillis());
        } catch (NoSuchAlgorithmException e) {
            throw new Error(e);
        }
    }

    public String generate() {
        StringBuilder A0r = C18200wM.A0r();
        generate(A0r);
        return A0r.toString();
    }
}
