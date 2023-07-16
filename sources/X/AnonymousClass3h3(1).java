package X;

import com.facebook.endtoend.EndToEnd;
import com.instagram.debug.devoptions.sandboxselector.SandboxDataModelConverterKt;

/* renamed from: X.3h3  reason: invalid class name */
public final class AnonymousClass3h3 {
    public static Boolean A00;

    public static String A00() {
        boolean booleanValue;
        String property;
        String A002 = AnonymousClass000.A00(370);
        boolean z = false;
        if (EndToEnd.isRunningEndToEndTest() && (property = System.getProperty("fb.e2e.instagram_server_host")) != null && !property.trim().isEmpty()) {
            z = true;
        }
        if (z) {
            String property2 = System.getProperty("fb.e2e.instagram_server_host");
            if (property2 == null) {
                return "";
            }
            return A03(property2.trim());
        }
        synchronized (AnonymousClass3h3.class) {
            Boolean bool = A00;
            if (bool == null) {
                bool = Boolean.valueOf(C09120et.A02().A0X());
                A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            return C18200wM.A0j(C09120et.A02().A0d);
        }
        return A002;
    }

    public static String A01() {
        boolean A0Y;
        String A0j;
        Class<AnonymousClass3h3> cls = AnonymousClass3h3.class;
        synchronized (cls) {
            A0Y = C09120et.A02().A0Y();
        }
        if (!A0Y) {
            return "";
        }
        synchronized (cls) {
            A0j = C18200wM.A0j(C09120et.A02().A14);
        }
        return C18180wK.A0j("www.%s", new Object[]{A0j.replace("instagram", "facebook")});
    }

    public static String A03(String str) {
        StringBuilder A0s;
        String str2;
        if (str.contains(" ")) {
            str = str.replaceAll("\\s+", "");
        }
        if ("preprod".equals(str)) {
            return "preprod.instagram.com";
        }
        if (!str.contains(".")) {
            A0s = C18190wL.A0s("i.");
            A0s.append(str);
            str2 = ".sb.instagram.com:8040";
        } else if (!str.endsWith(SandboxDataModelConverterKt.SANDBOX_SUBDOMAIN_ON_DEMAND)) {
            return str;
        } else {
            A0s = C18200wM.A0r();
            A0s.append(str);
            str2 = ".instagram.com";
        }
        return C18180wK.A0i(str2, A0s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (com.facebook.endtoend.EndToEnd.A02() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.URI A04() {
        /*
            java.lang.Class<X.3h3> r2 = X.AnonymousClass3h3.class
            monitor-enter(r2)
            X.0et r0 = X.C09120et.A02()     // Catch:{ all -> 0x0054 }
            boolean r0 = r0.A0Y()     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)
            monitor-enter(r2)
            if (r0 == 0) goto L_0x001b
            X.0et r0 = X.C09120et.A02()     // Catch:{ all -> 0x0054 }
            X.0dK r0 = r0.A14     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = X.C18200wM.A0j(r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)
            goto L_0x0042
        L_0x001b:
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0028
            boolean r1 = com.facebook.endtoend.EndToEnd.A02()     // Catch:{ all -> 0x0054 }
            r0 = 0
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0051
            java.util.Map r1 = com.facebook.endtoend.EndToEnd.A01()
            java.lang.String r0 = "/settings/e2e_instagram_graphql_www_host"
            java.lang.Object r1 = r1.get(r0)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "value"
            java.lang.String r0 = r1.optString(r0)
            if (r0 == 0) goto L_0x0051
        L_0x0042:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "https://i.%s/graphql_www"
            java.lang.String r0 = X.C18180wK.A0j(r0, r1)
            java.net.URI r0 = java.net.URI.create(r0)
            return r0
        L_0x0051:
            java.lang.String r0 = "instagram.com"
            goto L_0x0042
        L_0x0054:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3h3.A04():java.net.URI");
    }

    public static String A02(String str) {
        return C18180wK.A0j("https://%s%s", new Object[]{A00(), str});
    }
}
