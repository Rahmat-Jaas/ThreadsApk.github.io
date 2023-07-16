package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.net.Socket;
import java.security.cert.Certificate;
import java.util.Locale;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.0sY  reason: invalid class name and case insensitive filesystem */
public final class C16140sY implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C12990mp A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Socket A03;

    public C16140sY(C12990mp r1, String str, Socket socket, int i) {
        this.A01 = r1;
        this.A03 = socket;
        this.A02 = str;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        int length;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Socket socket = this.A03;
        AnonymousClass0g1.A00(socket.isConnected());
        C12990mp r3 = this.A01;
        SSLSocketFactory sSLSocketFactory = r3.A03;
        String str7 = this.A02;
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str7, this.A00, true);
        C16730te r4 = r3.A01;
        sSLSocket.getInputStream();
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            throw new SSLException("SSL Session is null");
        } else if ("SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
            if (sSLSocket.isClosed()) {
                str2 = "closed";
            } else {
                str2 = "open";
            }
            if (sSLSocket.isConnected()) {
                str3 = RealtimeConstants.MQTT_CONNECTED;
            } else {
                str3 = RealtimeConstants.MQTT_DISCONNECTED;
            }
            if (sSLSocket.isBound()) {
                str4 = "bound";
            } else {
                str4 = "unbound";
            }
            if (sSLSocket.isInputShutdown()) {
                str5 = "input_shutdown";
            } else {
                str5 = "input_open";
            }
            if (sSLSocket.isOutputShutdown()) {
                str6 = "output_shutdown";
            } else {
                str6 = "output_open";
            }
            throw new SSLException(String.format((Locale) null, "SSL handshake returned an invalid session. Socket state (%s, %s, %s, %s, %s, %s, %s)", new Object[]{str2, str3, str4, str5, str6, str7, String.valueOf(sSLSocket.getInetAddress())}));
        } else if (r4.A00.verify(str7, session)) {
            return sSLSocket;
        } else {
            String obj = sSLSocket.getInetAddress().toString();
            try {
                Certificate[] peerCertificates = session.getPeerCertificates();
                if (peerCertificates == null || (length = peerCertificates.length) <= 0) {
                    str = "No certificates";
                } else {
                    str = String.format((Locale) null, "num: %d, %s", new Object[]{Integer.valueOf(length), peerCertificates[0].toString()});
                }
            } catch (SSLException e) {
                str = AnonymousClass00U.A0L("Exception getting certificates ", e.toString());
            }
            throw new SSLException(String.format((Locale) null, "could not verify hostname for (%s, %s). (%s)", new Object[]{str7, obj, str}));
        }
    }
}
