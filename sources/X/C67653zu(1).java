package X;

import java.io.File;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3zu  reason: invalid class name and case insensitive filesystem */
public final class C67653zu implements AnonymousClass0TK {
    public static final C67653zu A09 = new C67653zu();
    public static volatile boolean A0A;
    public File A00 = null;
    public final C001600s A01 = new C001600s();
    public final C001600s A02 = new C001600s();
    public final C001600s A03 = new C001600s();
    public final C001600s A04 = new C001600s();
    public final Map A05 = AnonymousClass0wJ.A0y();
    public final Map A06 = AnonymousClass0wJ.A0y();
    public final Set A07 = C18200wM.A0u();
    public volatile boolean A08 = false;

    public static long A00(long j) {
        return (((long) ((int) ((j >>> 54) & 63))) << 54) | (0 << 62) | (0 << 61) | 0 | (((long) ((int) ((j >>> 48) & 63))) << 48) | ((((long) 0) & 4294967295L) << 16) | ((long) ((int) (j & 65535)));
    }

    private void A01(long j) {
        this.A06.get(Integer.valueOf((int) ((j >>> 54) & 63)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02f5, code lost:
        if (r9.A08 != false) goto L_0x0318;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x0320 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0321 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02(java.io.File r26) {
        /*
            r25 = this;
            r9 = r25
            monitor-enter(r9)
            r0 = r26
            r9.A00 = r0     // Catch:{ all -> 0x0336 }
            X.00s r0 = r9.A01     // Catch:{ all -> 0x0336 }
            r24 = r0
            r24.A05()     // Catch:{ all -> 0x0336 }
            X.00s r0 = r9.A02     // Catch:{ all -> 0x0336 }
            r23 = r0
            r23.A05()     // Catch:{ all -> 0x0336 }
            X.00s r0 = r9.A03     // Catch:{ all -> 0x0336 }
            r22 = r0
            r22.A05()     // Catch:{ all -> 0x0336 }
            X.00s r0 = r9.A04     // Catch:{ all -> 0x0336 }
            r21 = r0
            r21.A05()     // Catch:{ all -> 0x0336 }
            java.util.Set r0 = r9.A07     // Catch:{ all -> 0x0336 }
            r20 = r0
            r20.clear()     // Catch:{ all -> 0x0336 }
            java.io.File r0 = r9.A00     // Catch:{ all -> 0x0336 }
            if (r0 == 0) goto L_0x0331
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0336 }
            if (r0 == 0) goto L_0x0331
            java.io.File r0 = r9.A00     // Catch:{ IOException -> 0x0321 }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0321 }
            java.lang.StringBuilder r4 = X.C18200wM.A0r()     // Catch:{ IOException -> 0x0321 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0321 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0321 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0321 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x0321 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0321 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0321 }
            r0 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r0]     // Catch:{ all -> 0x031c }
        L_0x004f:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x031c }
            r0 = -1
            if (r1 == r0) goto L_0x005b
            r0 = 0
            r4.append(r2, r0, r1)     // Catch:{ all -> 0x031c }
            goto L_0x004f
        L_0x005b:
            r3.close()     // Catch:{ IOException -> 0x0321 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x0321 }
            r8 = 1
            r7 = 0
            org.json.JSONObject r13 = X.C18250wR.A0j(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            org.json.JSONArray r6 = r13.names()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r6.getClass()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r0 = r6.length()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x02c7
            int r0 = r6.length()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 != r8) goto L_0x0089
            java.lang.String r1 = "_qe_overrides_"
            java.lang.String r0 = r6.getString(r7)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            boolean r0 = r1.equals(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x0089
            goto L_0x02c7
        L_0x0089:
            java.util.Map r1 = r9.A05     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            boolean r0 = r1.isEmpty()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 != 0) goto L_0x02c7
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Iterator r16 = X.AnonymousClass0wJ.A0z(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x00a1:
            boolean r0 = r16.hasNext()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x010f
            java.util.Map$Entry r15 = X.C18180wK.A0o(r16)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r0 = r15.getValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r15.getValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            X.0Oe r0 = (X.C04560Oe) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r3 = r0.get()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            X.3IC r3 = (X.AnonymousClass3IC) r3     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r0 = r15.getKey()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r5.put(r0, r3)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r4 = r15.getKey()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Map r0 = r3.A01     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 != 0) goto L_0x00fe
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r3.A01 = r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.List r0 = r3.A03     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x00da:
            boolean r0 = r14.hasNext()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r12 = r14.next()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            X.3GH r12 = (X.AnonymousClass3GH) r12     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r1 = r12.A03     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r1 <= 0) goto L_0x00da
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 >= r0) goto L_0x00da
            java.util.Map r2 = r3.A01     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r0 = r12.A02     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r2.put(r1, r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            goto L_0x00da
        L_0x00fe:
            java.util.Map r0 = r3.A01     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r11.put(r4, r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r1 = r15.getKey()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Map r0 = r3.A02()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r10.put(r1, r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            goto L_0x00a1
        L_0x010f:
            r4 = 0
        L_0x0110:
            int r0 = r6.length()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r4 >= r0) goto L_0x02c7
            java.lang.String r2 = r6.getString(r4)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r1 = ":"
            r0 = -1
            java.lang.String[] r1 = r2.split(r1, r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r0 = r1.length     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 <= r8) goto L_0x0149
            r0 = r1[r7]     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r0 = r0.trim()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            boolean r0 = r0.isEmpty()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x0132
            r12 = 0
            goto L_0x013c
        L_0x0132:
            r0 = r1[r7]     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r0 = r0.trim()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r12 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x013c:
            r0 = r1[r8]     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r1 = r0.trim()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r12 <= 0) goto L_0x014f
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r12 >= r0) goto L_0x014f
            goto L_0x01a7
        L_0x0149:
            r0 = r1[r7]     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r1 = r0.trim()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x014f:
            boolean r0 = X.AnonymousClass0Td.A00(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x01a2
            java.util.Iterator r3 = X.C18190wL.A0u(r10)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x0159:
            boolean r0 = r3.hasNext()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x01a2
            java.util.Map$Entry r2 = X.C18180wK.A0o(r3)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r0 = r2.getValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            boolean r0 = r0.containsKey(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x0159
            java.lang.Object r2 = r2.getKey()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r0 = r2.intValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r5.containsKey(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r0 = r10.get(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r0.getClass()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r0.getClass()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r1 = r0.intValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            X.3IC r0 = (X.AnonymousClass3IC) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.List r19 = r0.A01(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            goto L_0x01f7
        L_0x01a2:
            java.util.List r19 = java.util.Collections.emptyList()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            goto L_0x01f7
        L_0x01a7:
            java.util.Iterator r14 = X.C18190wL.A0u(r11)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x01ab:
            boolean r0 = r14.hasNext()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x014f
            java.util.Map$Entry r2 = X.C18180wK.A0o(r14)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r0 = r2.getValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            boolean r0 = r0.containsKey(r3)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r2 = r2.getKey()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r0 = r2.intValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x014f
            boolean r0 = r5.containsKey(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x014f
            java.lang.Object r0 = r11.get(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r0.getClass()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r0.getClass()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r1 = r0.intValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            X.3IC r0 = (X.AnonymousClass3IC) r0     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.List r19 = r0.A01(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x01f7:
            boolean r0 = r19.isEmpty()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 != 0) goto L_0x02c3
            java.lang.String r0 = r6.getString(r4)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            org.json.JSONArray r12 = r13.getJSONArray(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r3 = 0
        L_0x0206:
            int r0 = r12.length()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r3 >= r0) goto L_0x02c3
            java.lang.String r1 = r12.getString(r3)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r0 = ": "
            r15 = 3
            java.lang.String[] r18 = r1.split(r0, r15)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r0 = r18[r7]     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r1 = r18[r8]     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.util.Iterator r16 = r19.iterator()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x0227:
            boolean r0 = r16.hasNext()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r14 = r16.next()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            X.3GH r14 = (X.AnonymousClass3GH) r14     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            int r2 = r17.intValue()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r0 = -1
            if (r2 == r0) goto L_0x0242
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r2 >= r0) goto L_0x0242
            int r0 = r14.A04     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == r2) goto L_0x0250
        L_0x0242:
            boolean r0 = X.AnonymousClass0Td.A01(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x0227
            java.lang.String r0 = r14.A01     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            boolean r0 = r0.equals(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r0 == 0) goto L_0x0227
        L_0x0250:
            r0 = 2
            r2 = r18[r0]     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r1 = "__NULL_VALUE__"
            boolean r1 = r2.equals(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r1 == 0) goto L_0x026d
            long r0 = r14.A00()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            long r0 = A00(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r0 = r20
            r0.add(r1)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            goto L_0x02bf
        L_0x026d:
            int r1 = r14.A06     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            if (r1 == r8) goto L_0x0299
            if (r1 == r0) goto L_0x02ae
            if (r1 == r15) goto L_0x028b
            r0 = 4
            if (r1 != r0) goto L_0x02bf
            long r0 = r14.A00()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            long r0 = A00(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            double r14 = java.lang.Double.parseDouble(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Double r14 = java.lang.Double.valueOf(r14)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r2 = r23
            goto L_0x02bc
        L_0x028b:
            long r0 = r14.A00()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            long r0 = A00(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r14 = r21
            r14.A07(r0, r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            goto L_0x02bf
        L_0x0299:
            long r0 = r14.A00()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            long r0 = A00(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.String r14 = "true"
            boolean r2 = r2.equals(r14)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r2 = r24
            goto L_0x02bc
        L_0x02ae:
            long r0 = r14.A00()     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            long r0 = A00(r0)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            java.lang.Long r14 = X.AnonymousClass0wJ.A0d(r2)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
            r2 = r22
        L_0x02bc:
            r2.A07(r0, r14)     // Catch:{ NullPointerException | NumberFormatException | JSONException -> 0x02f3, all -> 0x02cc }
        L_0x02bf:
            int r3 = r3 + 1
            goto L_0x0206
        L_0x02c3:
            int r4 = r4 + 1
            goto L_0x0110
        L_0x02c7:
            boolean r0 = r9.A08     // Catch:{ IOException -> 0x0321 }
            if (r0 != 0) goto L_0x0318
            goto L_0x02f7
        L_0x02cc:
            r1 = move-exception
            boolean r0 = r9.A08     // Catch:{ IOException -> 0x0321 }
            if (r0 != 0) goto L_0x02f2
            int r0 = r24.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x02f0
            int r0 = r22.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x02f0
            int r0 = r23.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x02f0
            int r0 = r21.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x02f0
            boolean r0 = r20.isEmpty()     // Catch:{ IOException -> 0x0321 }
            if (r0 == 0) goto L_0x02f0
            r8 = 0
        L_0x02f0:
            r9.A08 = r8     // Catch:{ IOException -> 0x0321 }
        L_0x02f2:
            throw r1     // Catch:{ IOException -> 0x0321 }
        L_0x02f3:
            boolean r0 = r9.A08     // Catch:{ IOException -> 0x0321 }
            if (r0 != 0) goto L_0x0318
        L_0x02f7:
            int r0 = r24.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x0316
            int r0 = r22.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x0316
            int r0 = r23.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x0316
            int r0 = r21.A01()     // Catch:{ IOException -> 0x0321 }
            if (r0 > 0) goto L_0x0316
            boolean r0 = r20.isEmpty()     // Catch:{ IOException -> 0x0321 }
            if (r0 == 0) goto L_0x0316
            r8 = 0
        L_0x0316:
            r9.A08 = r8     // Catch:{ IOException -> 0x0321 }
        L_0x0318:
            r0 = 1
            A0A = r0     // Catch:{ IOException -> 0x0321 }
            goto L_0x0334
        L_0x031c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0320 }
        L_0x0320:
            throw r0     // Catch:{ IOException -> 0x0321 }
        L_0x0321:
            r24.A05()     // Catch:{ all -> 0x0336 }
            r23.A05()     // Catch:{ all -> 0x0336 }
            r22.A05()     // Catch:{ all -> 0x0336 }
            r21.A05()     // Catch:{ all -> 0x0336 }
            r20.clear()     // Catch:{ all -> 0x0336 }
            goto L_0x0334
        L_0x0331:
            r0 = 0
            A0A = r0     // Catch:{ all -> 0x0336 }
        L_0x0334:
            monitor-exit(r9)
            return
        L_0x0336:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67653zu.A02(java.io.File):void");
    }

    public final boolean boolOverrideForParam(long j, boolean z) {
        if (!this.A08) {
            return z;
        }
        synchronized (this) {
            A01(j);
            Boolean bool = (Boolean) this.A01.A04(A00(j));
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public final double doubleOverrideForParam(long j, double d) {
        if (!this.A08) {
            return d;
        }
        synchronized (this) {
            A01(j);
            Double d2 = (Double) this.A02.A04(A00(j));
            if (d2 != null) {
                d = d2.doubleValue();
            }
        }
        return d;
    }

    public final boolean hasBoolOverrideForParam(long j) {
        boolean z = false;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A01(j);
            long A002 = A00(j);
            if (this.A01.A04(A002) != null || this.A07.contains(Long.valueOf(A002))) {
                z = true;
            }
        }
        return z;
    }

    public final boolean hasDoubleOverrideForParam(long j) {
        boolean z = false;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A01(j);
            long A002 = A00(j);
            if (this.A02.A04(A002) != null || this.A07.contains(Long.valueOf(A002))) {
                z = true;
            }
        }
        return z;
    }

    public final boolean hasIntOverrideForParam(long j) {
        boolean z = false;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A01(j);
            long A002 = A00(j);
            if (this.A03.A04(A002) != null || this.A07.contains(Long.valueOf(A002))) {
                z = true;
            }
        }
        return z;
    }

    public final boolean hasStringOverrideForParam(long j) {
        boolean z = false;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A01(j);
            long A002 = A00(j);
            if (this.A04.A04(A002) != null || this.A07.contains(Long.valueOf(A002))) {
                z = true;
            }
        }
        return z;
    }

    public final long intOverrideForParam(long j, long j2) {
        if (!this.A08) {
            return j2;
        }
        synchronized (this) {
            A01(j);
            Long l = (Long) this.A03.A04(A00(j));
            if (l != null) {
                j2 = l.longValue();
            }
        }
        return j2;
    }

    public final String stringOverrideForParam(long j, String str) {
        if (!this.A08) {
            return str;
        }
        synchronized (this) {
            A01(j);
            String str2 = (String) this.A04.A04(A00(j));
            if (str2 != null) {
                str = str2;
            }
        }
        return str;
    }

    public final void removeAllOverrides() {
        throw C18240wQ.A0j();
    }

    public final void removeOverrideForParam(long j) {
        throw C18240wQ.A0j();
    }

    public final void updateOverrideForParam(long j, double d) {
        throw C18240wQ.A0j();
    }

    public final void updateOverrideForParam(long j, long j2) {
        throw C18240wQ.A0j();
    }

    public final void updateOverrideForParam(long j, String str) {
        throw C18240wQ.A0j();
    }

    public final void updateOverrideForParam(long j, boolean z) {
        throw C18240wQ.A0j();
    }
}
