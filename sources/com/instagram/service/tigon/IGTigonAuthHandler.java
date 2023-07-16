package com.instagram.service.tigon;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C49032qj;
import X.C83444rO;
import com.facebook.tigon.iface.TigonAuthHandler;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class IGTigonAuthHandler implements TigonAuthHandler {
    public static final C49032qj Companion = new C49032qj();
    public static final String TAG = "IGTigonAuthHandler";
    public final C83444rO igAuthHandler;
    public final TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f A[LOOP:0: B:9:0x0029->B:11:0x002f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map getAllHeaders(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r3 = "IGTigonAuthHandler"
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            X.4rO r1 = r4.igAuthHandler     // Catch:{ URISyntaxException -> 0x0015, IOException -> 0x001a }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0015, IOException -> 0x001a }
            r0.<init>(r5)     // Catch:{ URISyntaxException -> 0x0015, IOException -> 0x001a }
            r1.A9t(r0, r2)     // Catch:{ URISyntaxException -> 0x0015, IOException -> 0x001a }
            goto L_0x0021
        L_0x0015:
            com.instagram.service.tigon.TigonUnexpectedErrorReporter r1 = r4.tigonUnexpectedErrorReporter
            java.lang.String r0 = "Failed to convert url string to URI"
            goto L_0x001e
        L_0x001a:
            com.instagram.service.tigon.TigonUnexpectedErrorReporter r1 = r4.tigonUnexpectedErrorReporter
            java.lang.String r0 = "Error attaching auth request headers"
        L_0x001e:
            r1.report(r3, r0)
        L_0x0021:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r2.next()
            X.3Ud r0 = (X.AnonymousClass3Ud) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            r3.add(r0)
            goto L_0x0029
        L_0x0041:
            java.util.Map r0 = X.AnonymousClass4WJ.A0B(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.tigon.IGTigonAuthHandler.getAllHeaders(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[LOOP:0: B:11:0x0031->B:13:0x0037, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map getRoutingHeaders(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r3 = "IGTigonAuthHandler"
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            X.4rO r1 = r4.igAuthHandler     // Catch:{ URISyntaxException -> 0x001d, IOException -> 0x0022 }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x001d, IOException -> 0x0022 }
            r0.<init>(r5)     // Catch:{ URISyntaxException -> 0x001d, IOException -> 0x0022 }
            X.44h r1 = (X.C685644h) r1     // Catch:{ URISyntaxException -> 0x001d, IOException -> 0x0022 }
            boolean r0 = X.C48982qe.A00(r0)     // Catch:{ URISyntaxException -> 0x001d, IOException -> 0x0022 }
            if (r0 == 0) goto L_0x0029
            X.C685644h.A00(r1, r2)     // Catch:{ URISyntaxException -> 0x001d, IOException -> 0x0022 }
            goto L_0x0029
        L_0x001d:
            com.instagram.service.tigon.TigonUnexpectedErrorReporter r1 = r4.tigonUnexpectedErrorReporter
            java.lang.String r0 = "Failed to convert url string to URI"
            goto L_0x0026
        L_0x0022:
            com.instagram.service.tigon.TigonUnexpectedErrorReporter r1 = r4.tigonUnexpectedErrorReporter
            java.lang.String r0 = "Error attaching routing headers"
        L_0x0026:
            r1.report(r3, r0)
        L_0x0029:
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0031:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r2.next()
            X.3Ud r0 = (X.AnonymousClass3Ud) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            r3.add(r0)
            goto L_0x0031
        L_0x0049:
            java.util.Map r0 = X.AnonymousClass4WJ.A0B(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.tigon.IGTigonAuthHandler.getRoutingHeaders(java.lang.String):java.util.Map");
    }

    public void update(String str, Map map) {
        TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter2;
        String str2;
        AnonymousClass0wJ.A1N(str, map);
        try {
            URI uri = new URI(str);
            LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                C18240wQ.A1I(value);
                A0v.put(key, C18180wK.A0n(value));
            }
            this.igAuthHandler.D8b(uri, A0v);
        } catch (URISyntaxException unused) {
            tigonUnexpectedErrorReporter2 = this.tigonUnexpectedErrorReporter;
            str2 = "Failed to convert url string to URI";
            tigonUnexpectedErrorReporter2.report(TAG, str2);
        } catch (IOException unused2) {
            tigonUnexpectedErrorReporter2 = this.tigonUnexpectedErrorReporter;
            str2 = "Error updating response headers";
            tigonUnexpectedErrorReporter2.report(TAG, str2);
        }
    }

    public IGTigonAuthHandler(C83444rO r1, TigonUnexpectedErrorReporter tigonUnexpectedErrorReporter2) {
        AnonymousClass0wJ.A1O(r1, tigonUnexpectedErrorReporter2);
        this.igAuthHandler = r1;
        this.tigonUnexpectedErrorReporter = tigonUnexpectedErrorReporter2;
    }
}
