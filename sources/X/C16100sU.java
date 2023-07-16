package X;

import android.content.Context;
import android.os.StrictMode;

/* renamed from: X.0sU  reason: invalid class name and case insensitive filesystem */
public final class C16100sU {
    public static C16080sS A00;
    public static final AnonymousClass0L7 A01;
    public static final C16080sS A02;
    public static final C16080sS A03 = new AnonymousClass0B6();

    static {
        C02980Dq r1 = new C02980Dq();
        A02 = r1;
        A01 = new AnonymousClass0L7(r1);
    }

    public static synchronized AnonymousClass0L7 A00() {
        AnonymousClass0L7 r0;
        synchronized (C16100sU.class) {
            r0 = A01;
        }
        return r0;
    }

    public static synchronized C16080sS A01() {
        C16080sS r0;
        synchronized (C16100sU.class) {
            r0 = A00;
            if (r0 == null) {
                throw new IllegalStateException();
            }
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079 A[Catch:{ IOException | IllegalArgumentException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b A[Catch:{ IOException | IllegalArgumentException -> 0x00b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r15) {
        /*
            java.lang.String r3 = ""
            java.lang.String r0 = "com.facebook.secure.switchoff"
            r5 = 0
            android.content.SharedPreferences r2 = r15.getSharedPreferences(r0, r5)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "last_criteria"
            java.lang.String r1 = r2.getString(r0, r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "last_custom_config"
            java.lang.String r14 = r2.getString(r0, r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "last_deeplink_config"
            java.lang.String r13 = r2.getString(r0, r3)     // Catch:{ all -> 0x00ce }
            android.content.ContentResolver r11 = r15.getContentResolver()     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            r10 = 0
            if (r0 == 0) goto L_0x002a
            X.0sT[] r8 = new X.C16090sT[r5]     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            goto L_0x00be
        L_0x002a:
            java.lang.String r0 = "\\^\\^\\^"
            java.lang.String[] r9 = r1.split(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            int r7 = r9.length     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            X.0sT[] r8 = new X.C16090sT[r7]     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
        L_0x0033:
            if (r10 >= r7) goto L_0x00be
            r3 = r9[r10]     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            if (r0 == 0) goto L_0x0045
            X.0sT r0 = new X.0sT     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            r0.<init>()     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
        L_0x0042:
            r8[r10] = r0     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            goto L_0x009c
        L_0x0045:
            r6 = 0
            int r12 = r3.codePointAt(r5)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            java.lang.String r4 = "Criteria specification is not valid"
            r2 = 33
            r1 = 1
            if (r12 == r2) goto L_0x005a
            r0 = 42
            if (r12 == r0) goto L_0x006e
            r0 = 58
            if (r12 == r0) goto L_0x005a
            goto L_0x00ae
        L_0x005a:
            int r0 = r3.indexOf(r12, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            if (r0 < 0) goto L_0x00a8
            java.lang.String r4 = r3.substring(r1, r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            if (r12 != r2) goto L_0x0073
            r6 = 1
            goto L_0x0073
        L_0x006e:
            r4 = 0
            java.lang.String r3 = r3.substring(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
        L_0x0073:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            if (r0 == 0) goto L_0x007b
            r2 = 0
            goto L_0x0096
        L_0x007b:
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            r2.<init>()     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ XmlPullParserException -> 0x009f, IOException | IllegalArgumentException -> 0x00b4 }
            r0.setNamespaceAware(r1)     // Catch:{ XmlPullParserException -> 0x009f, IOException | IllegalArgumentException -> 0x00b4 }
            org.xmlpull.v1.XmlPullParser r1 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x009f, IOException | IllegalArgumentException -> 0x00b4 }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ XmlPullParserException -> 0x009f, IOException | IllegalArgumentException -> 0x00b4 }
            r0.<init>(r3)     // Catch:{ XmlPullParserException -> 0x009f, IOException | IllegalArgumentException -> 0x00b4 }
            r1.setInput(r0)     // Catch:{ XmlPullParserException -> 0x009f, IOException | IllegalArgumentException -> 0x00b4 }
            r2.readFromXml(r1)     // Catch:{ XmlPullParserException -> 0x009f, IOException | IllegalArgumentException -> 0x00b4 }
        L_0x0096:
            X.0sT r0 = new X.0sT     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            r0.<init>(r11, r2, r4, r6)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            goto L_0x0042
        L_0x009c:
            int r10 = r10 + 1
            goto L_0x0033
        L_0x009f:
            r1 = move-exception
            java.lang.String r0 = "Something went wrong with the parser"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            r2.<init>(r0, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            goto L_0x00b3
        L_0x00a8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            r2.<init>(r4)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            goto L_0x00b3
        L_0x00ae:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
            r2.<init>(r4)     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
        L_0x00b3:
            throw r2     // Catch:{ IOException | IllegalArgumentException -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            java.lang.String r1 = "IntentCriteria"
            java.lang.String r0 = "Error parsing switch-off criteria."
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x00ce }
            X.0sT[] r8 = new X.C16090sT[r5]     // Catch:{ all -> 0x00ce }
        L_0x00be:
            X.3YE[] r2 = X.AnonymousClass3YE.A01(r14)     // Catch:{ all -> 0x00ce }
            java.util.Map r1 = X.C61003Rl.A00(r13)     // Catch:{ all -> 0x00ce }
            X.0IZ r0 = new X.0IZ     // Catch:{ all -> 0x00ce }
            r0.<init>(r1, r8, r2)     // Catch:{ all -> 0x00ce }
            A00 = r0     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r2 = move-exception
            java.lang.String r1 = "DefaultSwitchOffs"
            java.lang.String r0 = "Error loading last config"
            android.util.Log.w(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16100sU.A02(android.content.Context):void");
    }

    /* JADX INFO: finally extract failed */
    public static synchronized void A03(Context context) {
        synchronized (C16100sU.class) {
            if (A00 == null) {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    A02(context);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    if (A00 == null) {
                        A00 = A03;
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            }
        }
    }
}
