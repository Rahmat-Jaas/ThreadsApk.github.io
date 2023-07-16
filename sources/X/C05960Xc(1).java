package X;

import android.app.Application;

/* renamed from: X.0Xc  reason: invalid class name and case insensitive filesystem */
public final class C05960Xc implements C04050Mb {
    public static final String[] A01 = {"android.permission.READ_CALENDAR", "android.permission.CAMERA", "android.permission.READ_CONTACTS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.BODY_SENSORS", "android.permission.SEND_SMS", "android.permission.READ_EXTERNAL_STORAGE"};
    public final Application A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r7.A00.checkCallingOrSelfPermission(r5) != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        X.C04790Pd.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r5.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        r6 = "android.permission-group.CONTACTS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        if (r5.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        r6 = "android.permission-group.STORAGE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b0, code lost:
        if (r5.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b2, code lost:
        r6 = "android.permission-group.LOCATION";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bc, code lost:
        if (r5.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00be, code lost:
        r6 = "android.permission-group.PHONE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c8, code lost:
        if (r5.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ca, code lost:
        r6 = "android.permission-group.CALENDAR";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d4, code lost:
        if (r5.equals(r0) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d6, code lost:
        r6 = "android.permission-group.SMS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = r6.lastIndexOf(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0 < 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r6 = r6.substring(r0 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r5 = r1[r2];
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r8, X.AnonymousClass0ND r9) {
        /*
            r7 = this;
            X.0ON r3 = X.AnonymousClass0MU.A8N
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r2 = 0
        L_0x0008:
            java.lang.String[] r1 = A01
            int r0 = r1.length
            if (r2 >= r0) goto L_0x00da
            r5 = r1[r2]
            int r0 = r5.hashCode()
            switch(r0) {
                case -2062386608: goto L_0x00ce;
                case -1928411001: goto L_0x00c2;
                case -1921431796: goto L_0x00b6;
                case -1888586689: goto L_0x00aa;
                case -1479758289: goto L_0x00a7;
                case -1238066820: goto L_0x009b;
                case -895673731: goto L_0x0098;
                case -406040016: goto L_0x008d;
                case -63024214: goto L_0x008a;
                case -5573545: goto L_0x0087;
                case 52602690: goto L_0x0084;
                case 112197485: goto L_0x0081;
                case 214526995: goto L_0x0076;
                case 463403621: goto L_0x006b;
                case 603653886: goto L_0x0068;
                case 610633091: goto L_0x0065;
                case 784519842: goto L_0x0062;
                case 952819282: goto L_0x005f;
                case 1271781903: goto L_0x005c;
                case 1365911975: goto L_0x0059;
                case 1831139720: goto L_0x004e;
                case 1977429404: goto L_0x004b;
                case 2133799037: goto L_0x0048;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.String r6 = ""
        L_0x0018:
            r0 = 46
            int r0 = r6.lastIndexOf(r0)
            if (r0 < 0) goto L_0x0026
            int r0 = r0 + 1
            java.lang.String r6 = r6.substring(r0)
        L_0x0026:
            r5 = r1[r2]
            r1 = 0
            android.app.Application r0 = r7.A00     // Catch:{ RuntimeException -> 0x0033 }
            int r0 = r0.checkCallingOrSelfPermission(r5)     // Catch:{ RuntimeException -> 0x0033 }
            if (r0 != 0) goto L_0x0036
            r1 = 1
            goto L_0x0036
        L_0x0033:
            X.C04790Pd.A00()
        L_0x0036:
            r4.put(r6, r1)     // Catch:{ JSONException -> 0x003a }
            goto L_0x0045
        L_0x003a:
            r5 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Caught JSONException"
            X.AnonymousClass0LU.A0F(r1, r0, r5)
            X.C04790Pd.A00()
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0048:
            java.lang.String r0 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            goto L_0x00b8
        L_0x004b:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            goto L_0x0078
        L_0x004e:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.MICROPHONE"
            goto L_0x0018
        L_0x0059:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            goto L_0x008f
        L_0x005c:
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            goto L_0x0078
        L_0x005f:
            java.lang.String r0 = "android.permission.PROCESS_OUTGOING_CALLS"
            goto L_0x00b8
        L_0x0062:
            java.lang.String r0 = "android.permission.USE_SIP"
            goto L_0x00b8
        L_0x0065:
            java.lang.String r0 = "android.permission.WRITE_CALL_LOG"
            goto L_0x00b8
        L_0x0068:
            java.lang.String r0 = "android.permission.WRITE_CALENDAR"
            goto L_0x00c4
        L_0x006b:
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.CAMERA"
            goto L_0x0018
        L_0x0076:
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
        L_0x0078:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.CONTACTS"
            goto L_0x0018
        L_0x0081:
            java.lang.String r0 = "android.permission.CALL_PHONE"
            goto L_0x00b8
        L_0x0084:
            java.lang.String r0 = "android.permission.SEND_SMS"
            goto L_0x00d0
        L_0x0087:
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            goto L_0x00b8
        L_0x008a:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            goto L_0x00ac
        L_0x008d:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
        L_0x008f:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.STORAGE"
            goto L_0x0018
        L_0x0098:
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            goto L_0x00d0
        L_0x009b:
            java.lang.String r0 = "android.permission.BODY_SENSORS"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.SENSORS"
            goto L_0x0018
        L_0x00a7:
            java.lang.String r0 = "android.permission.RECEIVE_WAP_PUSH"
            goto L_0x00d0
        L_0x00aa:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
        L_0x00ac:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.LOCATION"
            goto L_0x0018
        L_0x00b6:
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
        L_0x00b8:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.PHONE"
            goto L_0x0018
        L_0x00c2:
            java.lang.String r0 = "android.permission.READ_CALENDAR"
        L_0x00c4:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.CALENDAR"
            goto L_0x0018
        L_0x00ce:
            java.lang.String r0 = "android.permission.READ_SMS"
        L_0x00d0:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = "android.permission-group.SMS"
            goto L_0x0018
        L_0x00da:
            java.lang.String r0 = r4.toString()
            r8.A03(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05960Xc.CWp(X.0Mn, X.0ND):void");
    }

    public C05960Xc(Application application) {
        this.A00 = application;
    }

    public final Integer Awy() {
        return AnonymousClass006.A0U;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
