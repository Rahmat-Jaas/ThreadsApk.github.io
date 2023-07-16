package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.0rl  reason: invalid class name and case insensitive filesystem */
public final class C15710rl {
    public final long A00;
    public final C15780rs A01;
    public final ArrayList A02;
    public final ArrayList A03;

    public C15710rl(C15740ro r6) {
        C15780rs r3 = r6.A01;
        this.A01 = r3;
        this.A02 = r6.A02;
        ArrayList arrayList = r6.A03;
        this.A03 = arrayList;
        this.A00 = r6.A00;
        if (r3 == null && arrayList.isEmpty() && (1 & this.A00) == 0) {
            throw new IllegalArgumentException("TrustedCaller needs to be configured with at least 1 security check");
        }
    }

    public final boolean A01(Context context, Intent intent, C16240si r6) {
        try {
            A00(context, intent, r6);
            return true;
        } catch (SecurityException e) {
            if (r6 == null) {
                return false;
            }
            String message = e.getMessage();
            if (message == null) {
                message = "Cannot trust caller";
            }
            r6.Ccw("TrustedCaller", message, e.getCause());
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v160, types: [java.util.AbstractCollection] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 384 */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        if (r34.contains(r5) == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ac, code lost:
        if (r15.hasNext() == false) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04ae, code lost:
        r14 = (byte[]) r15.next();
        r11 = r14.length;
        r13.write(r11 & 255);
        r13.write(r14, 0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04be, code lost:
        r11 = X.C15830rx.A00;
        r15 = r3.getBytes(r11);
        r14 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04c5, code lost:
        if (r14 > 255) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04c7, code lost:
        r13.write(2);
        r13.write(r14 & 255);
        r13.write(r15, 0, r14);
        r15 = r21.getBytes(r11);
        r14 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04db, code lost:
        if (r14 > 255) goto L_0x053e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04dd, code lost:
        r13.write(3);
        r13.write(r14 & 255);
        r13.write(r15, 0, r14);
        r15 = r25.getBytes(r11);
        r0 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04f2, code lost:
        if (r0 > 255) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04f4, code lost:
        r13.write(4);
        r13.write(r0 & 255);
        r13.write(r15, 0, r0);
        r15 = r20.getBytes(r11);
        r11 = r15.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0507, code lost:
        if (r11 > 255) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0509, code lost:
        r13.write(5);
        r13.write(r11 & 255);
        r13.write(r15, 0, r11);
        r11 = r13.toByteArray();
        r11[1] = (byte) 5;
        r13 = android.util.Base64.decode(r37, 10);
        r12 = java.security.Signature.getInstance(r38);
        r12.initVerify(r19);
        r12.update(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0536, code lost:
        r11 = new X.C15840ry("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x053e, code lost:
        r11 = new X.C15840ry("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0546, code lost:
        r11 = new X.C15840ry("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0556, code lost:
        r11 = new X.C15840ry("String size (UTF-8 encoded) cannot exceed 255");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0591, code lost:
        r28 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05ea, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05eb, code lost:
        if (r35 != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05fe, code lost:
        throw new java.lang.SecurityException(java.lang.String.format("Missing at least one required FBPermission %s from caller %s", new java.lang.Object[]{r41, r6}));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r43, android.content.Intent r44, X.C16240si r45) {
        /*
            r42 = this;
            r3 = 16
            r5 = r42
            long r1 = r5.A00
            long r3 = r3 & r1
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x0010:
            r7 = r43
            r0 = r44
            r4 = r45
            if (r44 == 0) goto L_0x005b
            X.0sO r6 = X.AnonymousClass0sB.A01(r7, r0, r4, r3)
            if (r6 == 0) goto L_0x005b
            r10 = 32
            long r8 = r1 & r10
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00d9
            int r3 = android.os.Binder.getCallingPid()
            int r0 = android.os.Process.myPid()
            if (r3 == r0) goto L_0x00d9
            int r3 = android.os.Binder.getCallingUid()
            int r0 = r6.A00
            if (r3 == r0) goto L_0x00d9
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = android.os.Binder.getCallingUid()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Uid %d from PI not equal to uid %d from binder data"
            java.lang.String r3 = java.lang.String.format(r6, r0, r3)
            if (r45 == 0) goto L_0x005b
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x005b
            r4.Ccv(r3)
        L_0x005b:
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto L_0x007a
            r0 = r7
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.ComponentName r0 = r0.getCallingActivity()
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r0.getPackageName()
            X.0sO r6 = X.C16010sK.A00(r7, r0)
        L_0x0070:
            if (r6 != 0) goto L_0x00d9
            java.lang.String r1 = "Invalid Caller Identity (null)"
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x007a:
            int r3 = android.os.Binder.getCallingPid()
            int r0 = android.os.Process.myPid()
            if (r3 != r0) goto L_0x00a2
            java.lang.String r3 = "This method must be called on behalf of an IPC transaction from binder thread."
            if (r45 == 0) goto L_0x0091
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0091
            r4.Ccv(r3)
        L_0x0091:
            r6 = 0
        L_0x0092:
            if (r6 != 0) goto L_0x0070
            java.lang.String r3 = "AppIdentity not found for caller"
            if (r45 == 0) goto L_0x0070
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0070
            r4.Ccv(r3)
            goto L_0x0070
        L_0x00a2:
            int r8 = android.os.Binder.getCallingUid()
            java.lang.String[] r0 = X.C15980sH.A07(r7, r8)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            X.0rM r10 = X.C15980sH.A02(r7, r0)
            r11 = 0
            X.0sO r6 = new X.0sO
            r9 = r6
            r12 = r11
            r13 = r3
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0092
        L_0x00ca:
            r3 = 8
            long r3 = r3 & r1
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r3 = 60000(0xea60, float:8.4078E-41)
            if (r0 == 0) goto L_0x0010
            r3 = 86400000(0x5265c00, float:7.82218E-36)
            goto L_0x0010
        L_0x00d9:
            java.util.ArrayList r3 = r5.A02
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = r6.A01
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x00f9
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r6}
            java.lang.String r0 = "Missing required Caller Domains %s from caller %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x00f9:
            r10 = 1
            long r10 = r10 & r1
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
            java.lang.String r3 = r7.getPackageName()
            java.lang.String r0 = r6.A01()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0111
        L_0x0110:
            return
        L_0x0111:
            X.0LA r12 = X.AnonymousClass0LA.A03
            if (r12 != 0) goto L_0x0124
            java.lang.Class<X.0LA> r3 = X.AnonymousClass0LA.class
            monitor-enter(r3)
            X.0LA r12 = X.AnonymousClass0LA.A03     // Catch:{ all -> 0x0602 }
            if (r12 != 0) goto L_0x0123
            X.0LA r12 = new X.0LA     // Catch:{ all -> 0x0602 }
            r12.<init>(r7)     // Catch:{ all -> 0x0602 }
            X.AnonymousClass0LA.A03 = r12     // Catch:{ all -> 0x0602 }
        L_0x0123:
            monitor-exit(r3)     // Catch:{ all -> 0x0602 }
        L_0x0124:
            java.lang.String r11 = r7.getPackageName()
            android.content.Context r10 = r12.A00
            java.lang.String r0 = r10.getPackageName()
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x017c
            java.util.concurrent.atomic.AtomicReference r9 = r12.A02
            java.lang.Object r8 = r9.get()
            X.0sM r8 = (X.C16030sM) r8
            if (r8 != 0) goto L_0x0150
            java.util.concurrent.atomic.AtomicInteger r0 = r12.A01
            int r3 = r0.getAndIncrement()
            X.0sO r0 = X.C16010sK.A00(r10, r11)
            X.0sM r8 = new X.0sM
            r8.<init>(r0, r3)
            r9.set(r8)
        L_0x0150:
            X.0sO r0 = r8.A00
            X.0rM r3 = r0.A00()
            if (r3 != 0) goto L_0x0175
            r9 = 0
        L_0x0159:
            X.0rs r0 = r5.A01
            r36 = r0
            if (r0 == 0) goto L_0x018c
            boolean r0 = r0.A06(r6, r9)
            if (r0 != 0) goto L_0x018c
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            java.lang.String r0 = "Caller Identity '%s' is not trusted"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x0175:
            java.util.Set r0 = X.C15470rN.A1H
            boolean r9 = r0.contains(r3)
            goto L_0x0159
        L_0x017c:
            java.util.concurrent.atomic.AtomicInteger r0 = r12.A01
            int r3 = r0.getAndIncrement()
            X.0sO r0 = X.C16010sK.A00(r10, r11)
            X.0sM r8 = new X.0sM
            r8.<init>(r0, r3)
            goto L_0x0150
        L_0x018c:
            java.util.ArrayList r0 = r5.A03
            r41 = r0
            boolean r0 = r41.isEmpty()
            if (r0 != 0) goto L_0x01e8
            r10 = 4
            long r10 = r10 & r1
            r16 = 0
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            r35 = 0
            if (r0 == 0) goto L_0x01a3
            r35 = 1
        L_0x01a3:
            if (r9 == 0) goto L_0x01c2
            java.util.ArrayList r34 = new java.util.ArrayList
            r34.<init>()
            int r0 = r6.A00
            java.lang.String[] r10 = X.C15980sH.A07(r7, r0)
            int r8 = r10.length
            r5 = 0
        L_0x01b2:
            if (r5 >= r8) goto L_0x01c6
            r0 = r10[r5]
            java.util.List r3 = X.C15850rz.A00(r7, r0)
            r0 = r34
            r0.addAll(r3)
            int r5 = r5 + 1
            goto L_0x01b2
        L_0x01c2:
            java.util.List r34 = java.util.Collections.emptyList()
        L_0x01c6:
            java.lang.Class<X.0rz> r3 = X.C15850rz.class
            monitor-enter(r3)
            if (r45 == 0) goto L_0x01d9
            X.0rz r10 = X.C15850rz.A01     // Catch:{ all -> 0x0605 }
            if (r10 != 0) goto L_0x01d6
            X.0rz r10 = new X.0rz     // Catch:{ all -> 0x0605 }
            r10.<init>()     // Catch:{ all -> 0x0605 }
            X.C15850rz.A01 = r10     // Catch:{ all -> 0x0605 }
        L_0x01d6:
            r10.A00 = r4     // Catch:{ all -> 0x0607 }
            goto L_0x01f8
        L_0x01d9:
            X.0rz r10 = X.C15850rz.A01     // Catch:{ all -> 0x0607 }
            if (r10 != 0) goto L_0x01f8
            X.0rz r10 = new X.0rz     // Catch:{ all -> 0x0607 }
            r10.<init>()     // Catch:{ all -> 0x0607 }
            X.C15850rz.A01 = r10     // Catch:{ all -> 0x0607 }
            goto L_0x01f8
        L_0x01e5:
            r3 = 1
            if (r35 == 0) goto L_0x01ff
        L_0x01e8:
            boolean r0 = r41.isEmpty()
            if (r0 == 0) goto L_0x0110
            if (r36 != 0) goto L_0x0110
            java.lang.String r1 = "Calling app is not the same package, and no other identity checks were performed."
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x01f8:
            monitor-exit(r3)
            java.util.Iterator r33 = r41.iterator()
            r8 = 0
            r3 = 0
        L_0x01ff:
            boolean r0 = r33.hasNext()
            r32 = 1
            if (r0 == 0) goto L_0x05b0
            java.lang.Object r5 = r33.next()
            if (r9 == 0) goto L_0x0216
            r0 = r34
            boolean r0 = r0.contains(r5)
            r11 = 1
            if (r0 != 0) goto L_0x0217
        L_0x0216:
            r11 = 0
        L_0x0217:
            r3 = 2
            long r3 = r3 & r1
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            r31 = 0
            if (r0 == 0) goto L_0x0222
            r31 = 1
        L_0x0222:
            if (r11 != 0) goto L_0x01e5
            int r0 = r6.A00
            r40 = r0
            java.lang.String[] r30 = X.C15980sH.A07(r7, r0)
            r0 = r30
            int r0 = r0.length
            r39 = r0
            r29 = 2
            r3 = r0
            r0 = r32
            if (r3 <= r0) goto L_0x024f
            X.0si r4 = r10.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r40)
            java.lang.String r0 = java.util.Arrays.toString(r30)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "UID '%d' is shared by multiple packages: %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r4.Ccv(r0)
        L_0x024f:
            r4 = 0
            r28 = 0
        L_0x0252:
            r0 = r39
            if (r4 >= r0) goto L_0x05b4
            r3 = r30[r4]
            java.lang.String r0 = r7.getPackageName()     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            android.content.pm.PackageInfo r0 = X.C15980sH.A00(r7, r0)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            android.content.pm.Signature r0 = X.C15980sH.A01(r0)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            X.0rM r11 = X.C15980sH.A03(r0)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            java.util.Set r0 = X.C15470rN.A1H     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            boolean r0 = r0.contains(r11)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            if (r0 == 0) goto L_0x027e
            java.util.List r0 = X.C15850rz.A00(r7, r3)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            boolean r0 = r0.isEmpty()     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x029f
            goto L_0x03cc
        L_0x027e:
            android.content.Context r0 = r7.createPackageContext(r3, r8)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            android.content.res.AssetManager r11 = r0.getAssets()     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            java.lang.String r0 = ""
            java.lang.String[] r14 = r11.list(r0)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            if (r14 == 0) goto L_0x03cc
            int r13 = r14.length     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            r12 = 0
        L_0x0290:
            if (r12 >= r13) goto L_0x03cc
            r11 = r14[r12]     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            java.lang.String r0 = "fbpermissions.json"
            boolean r0 = r11.equals(r0)     // Catch:{ NameNotFoundException | IOException -> 0x03cc }
            if (r0 != 0) goto L_0x029f
            int r12 = r12 + 1
            goto L_0x0290
        L_0x029f:
            java.lang.String r12 = r7.getPackageName()
            java.lang.String r15 = "signatures"
            java.util.HashSet r27 = new java.util.HashSet
            r27.<init>()
            java.util.HashSet r18 = new java.util.HashSet
            r18.<init>()
            android.content.Context r0 = r7.createPackageContext(r3, r8)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            android.content.res.AssetManager r11 = r0.getAssets()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r0 = "fbpermissions.json"
            java.io.InputStream r11 = r11.open(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r0.<init>(r11)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r13.<init>(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
        L_0x02cc:
            java.lang.String r0 = r13.readLine()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            if (r0 == 0) goto L_0x02d6
            r11.append(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            goto L_0x02cc
        L_0x02d6:
            r13.close()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            int r0 = r11.length()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            if (r0 != 0) goto L_0x02f0
            X.0si r12 = r10.A00     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r11 = "Consumer app '%s' has an empty FbPermissions asset file"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r0 = java.lang.String.format(r11, r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r12.Ccv(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            goto L_0x03a6
        L_0x02f0:
            java.lang.String r0 = r11.toString()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r11.<init>(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            boolean r0 = r11.has(r12)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            if (r0 == 0) goto L_0x03a6
            org.json.JSONObject r14 = r11.getJSONObject(r12)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r0 = "permissions"
            org.json.JSONArray r13 = r14.getJSONArray(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            int r0 = r13.length()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            if (r0 != 0) goto L_0x0320
            X.0si r11 = r10.A00     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r13 = "Consumer app '%s' has an empty permissions list for '%s' provider"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r12}     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r0 = java.lang.String.format(r13, r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r11.Ccv(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            goto L_0x03a6
        L_0x0320:
            r12 = 0
        L_0x0321:
            int r0 = r13.length()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            if (r12 >= r0) goto L_0x0333
            java.lang.String r11 = r13.getString(r12)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r0 = r27
            r0.add(r11)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            int r12 = r12 + 1
            goto L_0x0321
        L_0x0333:
            boolean r0 = r14.has(r15)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            if (r0 == 0) goto L_0x033e
            org.json.JSONArray r13 = r14.getJSONArray(r15)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            goto L_0x034c
        L_0x033e:
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r13.<init>()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r0 = "signature"
            org.json.JSONObject r0 = r14.getJSONObject(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r13.put(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
        L_0x034c:
            r12 = 0
        L_0x034d:
            int r0 = r13.length()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            if (r12 >= r0) goto L_0x03af
            org.json.JSONObject r14 = r13.getJSONObject(r12)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            X.0s4 r11 = new X.0s4     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r0 = "algorithm"
            java.lang.String r0 = r14.getString(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r11.A00 = r0     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            java.lang.String r0 = "value"
            java.lang.String r0 = r14.getString(r0)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r11.A01 = r0     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            r0 = r18
            r0.add(r11)     // Catch:{ NameNotFoundException -> 0x0382, IOException -> 0x0392, JSONException -> 0x0374 }
            int r12 = r12 + 1
            goto L_0x034d
        L_0x0374:
            r0 = move-exception
            X.0si r11 = r10.A00
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Failed to decode FBPermission asset file from package '%s' due to JSON exception: %s"
            goto L_0x039f
        L_0x0382:
            X.0si r12 = r10.A00
            java.lang.Object[] r11 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Cannot create package context for '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r11)
            r12.Ccv(r0)
            goto L_0x03a6
        L_0x0392:
            r0 = move-exception
            X.0si r11 = r10.A00
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Failed to read FBPermission asset file from package '%s': %s"
        L_0x039f:
            java.lang.String r0 = java.lang.String.format(r0, r12)
            r11.Ccv(r0)
        L_0x03a6:
            X.0si r11 = r10.A00
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Failed to read fb permissions from '%s' asset"
            goto L_0x03c5
        L_0x03af:
            r0 = r27
            boolean r0 = r0.contains(r5)
            r26 = 3
            if (r0 != 0) goto L_0x03d0
            X.0si r11 = r10.A00
            java.lang.String r0 = r7.getPackageName()
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3, r0}
            java.lang.String r0 = "Missing FBPermission '%s' in '%s' required by '%s'"
        L_0x03c5:
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r11.Ccv(r0)
        L_0x03cc:
            int r4 = r4 + 1
            goto L_0x0252
        L_0x03d0:
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x03df
            X.0si r11 = r10.A00
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r0 = "Missing signature entry while verifying '%s' from package '%s'"
            goto L_0x03c5
        L_0x03df:
            android.content.pm.PackageInfo r0 = X.C15980sH.A00(r7, r3)     // Catch:{ SecurityException -> 0x059f }
            android.content.pm.Signature r0 = X.C15980sH.A01(r0)     // Catch:{ SecurityException -> 0x059f }
            X.0rM r0 = X.C15980sH.A03(r0)     // Catch:{ SecurityException -> 0x059f }
            java.lang.String r0 = r0.A01     // Catch:{ SecurityException -> 0x059f }
            r25 = r0
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ NameNotFoundException | RuntimeException -> 0x03fc }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r8)     // Catch:{ NameNotFoundException | RuntimeException -> 0x03fc }
            long r22 = r0.getLongVersionCode()
            goto L_0x03fe
        L_0x03fc:
            r22 = 0
        L_0x03fe:
            if (r25 == 0) goto L_0x0595
            int r0 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0595
            java.util.Iterator r24 = r18.iterator()
        L_0x0408:
            boolean r0 = r24.hasNext()
            if (r0 == 0) goto L_0x03cc
            java.lang.Object r11 = r24.next()
            X.0s4 r11 = (X.C15890s4) r11
            java.lang.String r0 = r11.A00
            r38 = r0
            java.lang.String r0 = r11.A01
            r37 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r37)
            if (r0 != 0) goto L_0x0577
            boolean r0 = android.text.TextUtils.isEmpty(r38)
            if (r0 != 0) goto L_0x0577
            java.lang.String r21 = java.lang.String.valueOf(r22)
            java.lang.String r20 = r7.getPackageName()
            r0 = r20
            android.content.pm.PackageInfo r0 = X.C15980sH.A00(r7, r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            android.content.pm.Signature r11 = X.C15980sH.A01(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r12 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            byte[] r11 = r11.toByteArray()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0.<init>(r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.security.cert.Certificate r0 = r12.generateCertificate(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.security.PublicKey r19 = r0.getPublicKey()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r13.<init>()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = -5
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r13.write(r8)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r12 = 255(0xff, float:3.57E-43)
            java.util.TreeSet r11 = new java.util.TreeSet     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r27
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r0 = r11.size()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r0 > r12) goto L_0x054e
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r14.<init>()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.util.Iterator r18 = r11.iterator()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
        L_0x0475:
            boolean r0 = r18.hasNext()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r0 == 0) goto L_0x0497
            java.lang.Object r15 = r18.next()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.nio.charset.Charset r0 = X.C15830rx.A00     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            byte[] r15 = r15.getBytes(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r0 = r15.length     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r0 > r12) goto L_0x048e
            r14.add(r15)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            goto L_0x0475
        L_0x048e:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.0ry r11 = new X.0ry     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            goto L_0x055d
        L_0x0497:
            r0 = r32
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r0 = r11.size()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r0 & r12
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
        L_0x04a8:
            boolean r0 = r15.hasNext()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r0 == 0) goto L_0x04be
            java.lang.Object r14 = r15.next()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            byte[] r14 = (byte[]) r14     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r11 = r14.length     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r11 & 255(0xff, float:3.57E-43)
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r13.write(r14, r8, r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            goto L_0x04a8
        L_0x04be:
            java.nio.charset.Charset r11 = X.C15830rx.A00     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            byte[] r15 = r3.getBytes(r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r14 = r15.length     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r14 > r12) goto L_0x0546
            r0 = r29
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r14 & 255(0xff, float:3.57E-43)
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r13.write(r15, r8, r14)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r21
            byte[] r15 = r0.getBytes(r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r14 = r15.length     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r14 > r12) goto L_0x053e
            r0 = r26
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r14 & 255(0xff, float:3.57E-43)
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r13.write(r15, r8, r14)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r14 = 4
            r0 = r25
            byte[] r15 = r0.getBytes(r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r0 = r15.length     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r0 > r12) goto L_0x0536
            r13.write(r14)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r14 = r0 & 255(0xff, float:3.57E-43)
            r13.write(r14)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r13.write(r15, r8, r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r14 = 5
            r0 = r20
            byte[] r15 = r0.getBytes(r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            int r11 = r15.length     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r11 > r12) goto L_0x0556
            r13.write(r14)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r11 & 255(0xff, float:3.57E-43)
            r13.write(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r13.write(r15, r8, r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            byte[] r11 = r13.toByteArray()     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            byte r0 = (byte) r14     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r11[r32] = r0     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r12 = 10
            r0 = r37
            byte[] r13 = android.util.Base64.decode(r0, r12)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            java.security.Signature r12 = java.security.Signature.getInstance(r38)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r0 = r19
            r12.initVerify(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r12.update(r11)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            boolean r0 = r12.verify(r13)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            if (r0 == 0) goto L_0x0408
            goto L_0x0591
        L_0x0536:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.0ry r11 = new X.0ry     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            goto L_0x055d
        L_0x053e:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.0ry r11 = new X.0ry     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            goto L_0x055d
        L_0x0546:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.0ry r11 = new X.0ry     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            goto L_0x055d
        L_0x054e:
            java.lang.String r0 = "Collection size (duplicates removed) cannot exceed 255"
            X.0ry r11 = new X.0ry     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            goto L_0x055d
        L_0x0556:
            java.lang.String r0 = "String size (UTF-8 encoded) cannot exceed 255"
            X.0ry r11 = new X.0ry     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
            r11.<init>(r0)     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
        L_0x055d:
            throw r11     // Catch:{ SecurityException -> 0x0572, 0ry -> 0x056d, CertificateException -> 0x0568, InvalidKeyException -> 0x0563, NoSuchAlgorithmException -> 0x055e, SignatureException -> 0x0588 }
        L_0x055e:
            X.0si r12 = r10.A00
            java.lang.String r0 = "Unsupported signature algorithm"
            goto L_0x058c
        L_0x0563:
            X.0si r12 = r10.A00
            java.lang.String r0 = "Invalid public key"
            goto L_0x058c
        L_0x0568:
            X.0si r12 = r10.A00
            java.lang.String r0 = "Failed to get public key due to certificate exception"
            goto L_0x058c
        L_0x056d:
            X.0si r12 = r10.A00
            java.lang.String r0 = "Failed to encode data using FbPermissionEncoder"
            goto L_0x058c
        L_0x0572:
            X.0si r12 = r10.A00
            java.lang.String r0 = "Failed to get provider package signature"
            goto L_0x058c
        L_0x0577:
            X.0si r12 = r10.A00
            r11 = r38
            r0 = r37
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r5, r11, r0}
            java.lang.String r0 = "Invalid signature for package '%s' while verifying '%s': algorithm(%s), value(%s)"
            java.lang.String r0 = java.lang.String.format(r0, r11)
            goto L_0x058c
        L_0x0588:
            X.0si r12 = r10.A00
            java.lang.String r0 = "Signature type wrong or improperly encoded"
        L_0x058c:
            r12.Ccv(r0)
            goto L_0x0408
        L_0x0591:
            r28 = 1
            goto L_0x03cc
        L_0x0595:
            X.0si r11 = r10.A00
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            java.lang.String r0 = "Invalid key hash or version code for package '%s' while verifying '%s'"
            goto L_0x03c5
        L_0x059f:
            X.0si r11 = r10.A00
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            java.lang.String r0 = "Invalid developer key for package '%s' while verifying '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r11.Ccv(r0)
            goto L_0x03cc
        L_0x05b0:
            if (r3 == 0) goto L_0x05ed
            goto L_0x01e8
        L_0x05b4:
            if (r28 != 0) goto L_0x01e5
            X.0si r4 = r10.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r40)
            java.lang.String r0 = java.util.Arrays.toString(r30)
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3, r0}
            java.lang.String r0 = "FBPermission '%s' was not granted to UID '%d' (packages: '%s')"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r4.Ccv(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r6}
            java.lang.String r0 = "FBPermission '%s' was not granted to %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            if (r31 == 0) goto L_0x05ff
            java.lang.String r0 = "%s; request is allowed for fail-open"
        L_0x05df:
            java.lang.String r3 = java.lang.String.format(r0, r3)
            X.0si r0 = r10.A00
            r0.Ccv(r3)
            if (r31 != 0) goto L_0x01e5
            r3 = 0
            if (r35 != 0) goto L_0x01ff
        L_0x05ed:
            r0 = r41
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r6}
            java.lang.String r0 = "Missing at least one required FBPermission %s from caller %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L_0x05ff:
            java.lang.String r0 = "%s; request is denied for fail-close"
            goto L_0x05df
        L_0x0602:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0602 }
            throw r0
        L_0x0605:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0607 }
        L_0x0607:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15710rl.A00(android.content.Context, android.content.Intent, X.0si):void");
    }
}
