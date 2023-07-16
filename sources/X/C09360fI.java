package X;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Collections;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: X.0fI  reason: invalid class name and case insensitive filesystem */
public final class C09360fI {
    public static C09360fI A04;
    public Class A00;
    public Method A01;
    public Method A02;
    public boolean A03;

    public final void A00(String str, Socket socket) {
        if (socket == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.getClass();
            sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(str)));
            sSLSocket.setSSLParameters(sSLParameters);
        } else if (this.A03) {
            Class cls = this.A00;
            cls.getClass();
            if (cls.isInstance(socket)) {
                try {
                    Method method = this.A02;
                    method.getClass();
                    method.invoke(socket, new Object[]{true});
                    Method method2 = this.A01;
                    method2.getClass();
                    method2.invoke(socket, new Object[]{str});
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:5:0x000e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C09360fI() {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000c }
            r4.A00 = r2     // Catch:{ ClassNotFoundException -> 0x000c }
            goto L_0x0014
        L_0x000c:
            java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            r4.A00 = r2     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
        L_0x0014:
            java.lang.String r1 = "setUseSessionTickets"
            r3 = 1
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            r4.A02 = r0     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            java.lang.Class r2 = r4.A00     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            java.lang.String r1 = "setHostname"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            r4.A01 = r0     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
            r4.A03 = r3     // Catch:{ NoSuchMethodException -> 0x0035, NoSuchMethodException -> 0x0035 }
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09360fI.<init>():void");
    }
}
