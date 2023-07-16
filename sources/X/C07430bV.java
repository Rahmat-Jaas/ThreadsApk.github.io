package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0bV  reason: invalid class name and case insensitive filesystem */
public final class C07430bV {
    public static final List A03 = Arrays.asList(new String[]{"log_type", "build_id", "app_id", "user_id", AnonymousClass00T.A00(0, 9, 90), AnonymousClass0MU.A08.A00});
    public final Uri A00;
    public final AnonymousClass09B A01;
    public final AnonymousClass0Q1 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:116:0x02a3, B:126:0x02b4] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x024b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x02b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x02b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0241 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0246 */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ae A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:116:0x02a3=Splitter:B:116:0x02a3, B:126:0x02b4=Splitter:B:126:0x02b4} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.AnonymousClass0O7 r14, java.util.Map r15, int r16) {
        /*
            r13 = this;
            X.0Q1 r4 = r13.A02
            if (r4 == 0) goto L_0x007d
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x007d
            X.0L3 r0 = new X.0L3
            r0.<init>(r14, r4)
            r14 = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r0 = r15.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x001b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.String r1 = r4.A00
            java.lang.Object r0 = r5.getKey()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = ""
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0073
        L_0x0045:
            java.lang.String r1 = ""
            java.lang.Object r0 = r5.getKey()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.Object r2 = r5.getValue()
            X.09E r2 = (X.AnonymousClass09E) r2
            java.lang.Object r1 = r5.getKey()
            java.io.InputStream r0 = r2.A01
            X.0Q0 r8 = new X.0Q0
            r8.<init>(r4, r0)
            boolean r11 = r2.A03
            boolean r12 = r2.A02
            long r9 = r2.A00
            X.09E r7 = new X.09E
            r7.<init>(r8, r9, r11, r12)
        L_0x006f:
            r3.put(r1, r7)
            goto L_0x001b
        L_0x0073:
            java.lang.Object r1 = r5.getKey()
            java.lang.Object r7 = r5.getValue()
            goto L_0x006f
        L_0x007c:
            r15 = r3
        L_0x007d:
            X.0L4 r9 = new X.0L4
            r9.<init>(r14, r13)
            android.net.Uri r7 = r13.A00
            java.lang.String r4 = "Android"
            X.09B r3 = r13.A01
            java.util.List r12 = A03
            java.lang.String[] r11 = r9.B4x(r12)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0 = 3
            r1 = r11[r0]
            java.lang.String r10 = "0"
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r1.equals(r10)
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = "c_user="
            java.lang.String r1 = X.AnonymousClass00U.A0L(r0, r1)
            java.lang.String r0 = "Cookie"
            r2.put(r0, r1)
        L_0x00b3:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5 = 0
            r8 = 0
        L_0x00ba:
            int r0 = r11.length
            if (r8 >= r0) goto L_0x00e0
            r0 = 5
            if (r8 != r0) goto L_0x00d6
            r1 = r11[r8]
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d3
            r1 = r10
        L_0x00cb:
            java.lang.String r0 = "consent_choice"
            r6.put(r0, r1)
        L_0x00d0:
            int r8 = r8 + 1
            goto L_0x00ba
        L_0x00d3:
            java.lang.String r1 = "1"
            goto L_0x00cb
        L_0x00d6:
            java.lang.Object r1 = r12.get(r8)
            r0 = r11[r8]
            r6.put(r1, r0)
            goto L_0x00d0
        L_0x00e0:
            java.util.Properties r10 = new java.util.Properties
            r10.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "attempt_count"
            r10.setProperty(r0, r1)
            X.0O6 r11 = new X.0O6
            r11.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
        L_0x00f8:
            boolean r0 = r9.AxZ(r11)
            if (r0 == 0) goto L_0x010a
            java.lang.String r1 = r11.A00
            if (r1 == 0) goto L_0x00f8
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x00f8
            r8.add(r1)
            goto L_0x00f8
        L_0x010a:
            r9.reset()
            int r0 = r8.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "property_count"
            r10.put(r0, r1)
            r9.A6C(r10)
            r8 = 1
            java.lang.String r1 = "1"
            java.lang.String r0 = "schema_version"
            r6.put(r0, r1)
            java.lang.String r1 = "schema_type"
            java.lang.String r0 = "LACRIMA"
            r6.put(r1, r0)
            java.lang.String r1 = r7.toString()
            java.net.URL r0 = new java.net.URL
            r0.<init>(r1)
            java.net.HttpURLConnection r3 = r3.AZ7(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "POST"
            r3.setRequestMethod(r0)
            java.lang.String r0 = "User-Agent"
            r3.setRequestProperty(r0, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "multipart/form-data;boundary=%s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "Content-Type"
            r3.setRequestProperty(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0188
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0168:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = r0.toString()
            r3.setRequestProperty(r1, r0)
            goto L_0x0168
        L_0x0188:
            r3.setDoOutput(r8)
            r3.setChunkedStreamingMode(r5)
            r0 = -852882599(0xffffffffcd2a0b59, float:-1.783044E8)
            java.io.OutputStream r4 = X.C13770oH.A01(r3, r0)     // Catch:{ all -> 0x02ba }
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x02b0 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x02b0 }
        L_0x019d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x02b0 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x02b0 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x02b0 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02b0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02b0 }
            X.C04940Py.A01(r4, r1, r0, r7)     // Catch:{ all -> 0x02b0 }
            goto L_0x019d
        L_0x01bb:
            java.lang.String r8 = "]"
            java.lang.String r6 = "data["
            X.0O6 r2 = new X.0O6     // Catch:{ all -> 0x02b0 }
            r2.<init>()     // Catch:{ all -> 0x02b0 }
        L_0x01c4:
            boolean r0 = r9.AxZ(r2)     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x01d8
            java.lang.String r1 = r2.A01     // Catch:{ all -> 0x02b0 }
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = X.AnonymousClass00U.A0V(r6, r0, r8)     // Catch:{ all -> 0x02b0 }
            X.C04940Py.A01(r4, r0, r1, r7)     // Catch:{ all -> 0x02b0 }
            goto L_0x01c4
        L_0x01d8:
            java.util.Set r0 = r15.entrySet()     // Catch:{ all -> 0x02b0 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x02b0 }
        L_0x01e0:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x0275
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x02b0 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x02b0 }
            java.lang.Object r8 = r1.getValue()     // Catch:{ all -> 0x02b0 }
            X.09E r8 = (X.AnonymousClass09E) r8     // Catch:{ all -> 0x02b0 }
            boolean r6 = r8.A03     // Catch:{ all -> 0x02b0 }
            boolean r0 = r8.A02     // Catch:{ all -> 0x02b0 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x0272
            java.lang.String r1 = "form-data; filename=\"file\"; name="
        L_0x01fe:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x02b0 }
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r1, r0}     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = "--%s\r\nContent-Disposition: %s\"%s\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x02b0 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x02b0 }
            r4.write(r0)     // Catch:{ all -> 0x02b0 }
            if (r6 == 0) goto L_0x024c
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | OutOfMemoryError -> 0x0252 }
            r9.<init>()     // Catch:{ IOException | OutOfMemoryError -> 0x0252 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0247 }
            r6.<init>(r9)     // Catch:{ all -> 0x0247 }
            java.io.InputStream r0 = r8.A01     // Catch:{ all -> 0x0242 }
            X.C04940Py.A00(r0, r6)     // Catch:{ all -> 0x0242 }
            r6.finish()     // Catch:{ all -> 0x0242 }
            byte[] r0 = r9.toByteArray()     // Catch:{ all -> 0x0242 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0242 }
            r1.<init>(r0)     // Catch:{ all -> 0x0242 }
            X.C04940Py.A00(r1, r4)     // Catch:{ all -> 0x023d }
            r1.close()     // Catch:{ all -> 0x0242 }
            r6.close()     // Catch:{ all -> 0x0247 }
            r9.close()     // Catch:{ IOException | OutOfMemoryError -> 0x0252 }
            goto L_0x0267
        L_0x023d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0241 }
        L_0x0241:
            throw r0     // Catch:{ all -> 0x0242 }
        L_0x0242:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0246 }
        L_0x0246:
            throw r0     // Catch:{ all -> 0x0247 }
        L_0x0247:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x024b }
        L_0x024b:
            throw r0     // Catch:{ IOException | OutOfMemoryError -> 0x0252 }
        L_0x024c:
            java.io.InputStream r0 = r8.A01     // Catch:{ IOException | OutOfMemoryError -> 0x0252 }
            X.C04940Py.A00(r0, r4)     // Catch:{ IOException | OutOfMemoryError -> 0x0252 }
            goto L_0x0267
        L_0x0252:
            r6 = move-exception
            long r0 = r8.A00     // Catch:{ all -> 0x02b0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02b0 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}     // Catch:{ all -> 0x02b0 }
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Attachment failed: %s %d"
            X.AnonymousClass0LU.A0L(r1, r0, r6, r2)     // Catch:{ all -> 0x02b0 }
            X.C04790Pd.A00()     // Catch:{ all -> 0x02b0 }
        L_0x0267:
            java.lang.String r0 = "\r\n"
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x02b0 }
            r4.write(r0)     // Catch:{ all -> 0x02b0 }
            goto L_0x01e0
        L_0x0272:
            java.lang.String r1 = "form-data; name="
            goto L_0x01fe
        L_0x0275:
            java.lang.Object[] r1 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x02b0 }
            java.lang.String r0 = "--%s--\r\n"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x02b0 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x02b0 }
            r4.write(r0)     // Catch:{ all -> 0x02b0 }
            r4.flush()     // Catch:{ all -> 0x02b0 }
            int r2 = r3.getResponseCode()     // Catch:{ all -> 0x02b0 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L_0x029c
            r0 = -1976237592(0xffffffff8a3501e8, float:-8.7151915E-33)
            java.io.InputStream r0 = X.C13770oH.A00(r3, r0)     // Catch:{ all -> 0x02b0 }
        L_0x0298:
            r0.close()     // Catch:{ all -> 0x02b0 }
            goto L_0x02a3
        L_0x029c:
            java.io.InputStream r0 = r3.getErrorStream()     // Catch:{ all -> 0x02b0 }
            if (r0 == 0) goto L_0x02a3
            goto L_0x0298
        L_0x02a3:
            r4.close()     // Catch:{ all -> 0x02b5 }
            r4.close()     // Catch:{ all -> 0x02ba }
            r3.disconnect()
            if (r2 != r1) goto L_0x02af
            r5 = 1
        L_0x02af:
            return r5
        L_0x02b0:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x02b4 }
        L_0x02b4:
            throw r0     // Catch:{ all -> 0x02b5 }
        L_0x02b5:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x02b9 }
        L_0x02b9:
            throw r0     // Catch:{ all -> 0x02ba }
        L_0x02ba:
            r0 = move-exception
            r3.disconnect()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07430bV.A01(X.0O7, java.util.Map, int):boolean");
    }

    public C07430bV(Uri uri, AnonymousClass09B r2, AnonymousClass0Q1 r3) {
        this.A00 = uri;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final boolean A00(Context context) {
        NetworkInfo activeNetworkInfo;
        if (SystemClock.uptimeMillis() - AnonymousClass0Pz.A00 < 5000) {
            return AnonymousClass0Pz.A01;
        }
        boolean z = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                z = true;
            }
        } catch (Throwable th) {
            AnonymousClass0LU.A0E("lacrima", "Connectivity check failed", th);
            C04790Pd.A00();
        }
        AnonymousClass0Pz.A01 = z;
        AnonymousClass0Pz.A00 = SystemClock.uptimeMillis();
        return z;
    }
}
