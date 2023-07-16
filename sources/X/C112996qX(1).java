package X;

import android.content.Context;
import com.google.android.gms.internal.vision.zzk;

/* renamed from: X.6qX  reason: invalid class name and case insensitive filesystem */
public final class C112996qX {
    public Object A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Context A03;
    public final zzk A04;
    public final Object A05 = C86144wL.A0d();
    public final String A06;

    public C112996qX(Context context, zzk zzk) {
        String str;
        this.A03 = context;
        String valueOf = String.valueOf("barcode");
        if (valueOf.length() != 0) {
            str = "com.google.android.gms.vision.dynamite.".concat(valueOf);
        } else {
            str = new String("com.google.android.gms.vision.dynamite.");
        }
        this.A06 = str;
        this.A04 = zzk;
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        if (r5 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        android.util.Log.e("BarcodeNativeHandle", "Error creating remote native handle", r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0136 A[ExcHandler: 6CT | RemoteException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:32:0x00b2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r11 = this;
            java.lang.Object r3 = r11.A05
            monitor-enter(r3)
            java.lang.Object r0 = r11.A00     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x0151
            r5 = 0
            r4 = 1
            android.content.Context r2 = r11.A03     // Catch:{ 6CT -> 0x0015 }
            X.8hO r1 = X.AnonymousClass7KA.A07     // Catch:{ 6CT -> 0x0015 }
            java.lang.String r0 = r11.A06     // Catch:{ 6CT -> 0x0015 }
            X.7KA r5 = X.AnonymousClass7KA.A04(r2, r1, r0)     // Catch:{ 6CT -> 0x0015 }
            goto L_0x00b0
        L_0x0015:
            r0 = 84
            java.lang.String r1 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "com.google.android.gms.vision"
            java.lang.String r6 = "barcode"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6}     // Catch:{ all -> 0x0162 }
            java.lang.String r9 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = "Cannot load thick client module, fall back to load optional module %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x0162 }
            java.lang.String r8 = "Vision"
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0039
            java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0162 }
        L_0x0039:
            android.content.Context r1 = r11.A03     // Catch:{ 6CT -> 0x0042 }
            X.8hO r0 = X.AnonymousClass7KA.A08     // Catch:{ 6CT -> 0x0042 }
            X.7KA r5 = X.AnonymousClass7KA.A04(r1, r0, r9)     // Catch:{ 6CT -> 0x0042 }
            goto L_0x00b0
        L_0x0042:
            r10 = move-exception
            java.lang.String r2 = "Error loading optional module %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r9}     // Catch:{ all -> 0x0162 }
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r8, r0)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x005d
            boolean r0 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r9 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x008d
            android.util.Log.e(r8, r9, r10)     // Catch:{ all -> 0x0162 }
        L_0x005d:
            boolean r0 = r11.A01     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x00b0
            java.lang.String r2 = "Broadcasting download intent for dependency %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0162 }
            boolean r0 = android.util.Log.isLoggable(r8, r7)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0070
            java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0162 }
        L_0x0070:
            android.content.Intent r2 = X.C18230wP.A0B()     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = "com.google.android.gms.vision.DependencyBroadcastReceiverProxy"
            r2.setClassName(r1, r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCIES"
            r2.putExtra(r0, r6)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "com.google.android.gms.vision.DEPENDENCY"
            r2.setAction(r0)     // Catch:{ all -> 0x0162 }
            android.content.Context r0 = r11.A03     // Catch:{ all -> 0x0162 }
            r0.sendBroadcast(r2)     // Catch:{ all -> 0x0162 }
            r11.A01 = r4     // Catch:{ all -> 0x0162 }
            goto L_0x00b0
        L_0x008d:
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0162 }
            int r0 = X.C86104wH.A0A(r9)     // Catch:{ all -> 0x0162 }
            int r1 = r0 + 2
            int r0 = X.C86104wH.A0A(r2)     // Catch:{ all -> 0x0162 }
            int r1 = r1 + r0
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r1)     // Catch:{ all -> 0x0162 }
            r1.append(r9)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = X.C18180wK.A0i(r2, r1)     // Catch:{ all -> 0x0162 }
            android.util.Log.e(r8, r0)     // Catch:{ all -> 0x0162 }
            goto L_0x005d
        L_0x00b0:
            if (r5 == 0) goto L_0x013e
            android.content.Context r6 = r11.A03     // Catch:{ 6CT | RemoteException -> 0x0136 }
            java.lang.String r1 = "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"
            android.content.Context r0 = r5.A00     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0125, 6CT | RemoteException -> 0x0136 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0125, 6CT | RemoteException -> 0x0136 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0125, 6CT | RemoteException -> 0x0136 }
            java.lang.Object r2 = r0.newInstance()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0125, 6CT | RemoteException -> 0x0136 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x0125, 6CT | RemoteException -> 0x0136 }
            r1 = 0
            if (r2 == 0) goto L_0x00d7
            java.lang.String r0 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator"
            android.os.IInterface r5 = r2.queryLocalInterface(r0)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            boolean r0 = r5 instanceof com.google.android.gms.internal.vision.zzn     // Catch:{ 6CT | RemoteException -> 0x0136 }
            if (r0 == 0) goto L_0x00da
            com.google.android.gms.internal.vision.zzn r5 = (com.google.android.gms.internal.vision.zzn) r5     // Catch:{ 6CT | RemoteException -> 0x0136 }
            if (r5 != 0) goto L_0x00df
        L_0x00d7:
            r11.A00 = r1     // Catch:{ 6CT | RemoteException -> 0x0136 }
            goto L_0x013e
        L_0x00da:
            com.google.android.gms.internal.vision.zzp r5 = new com.google.android.gms.internal.vision.zzp     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r5.<init>(r2)     // Catch:{ 6CT | RemoteException -> 0x0136 }
        L_0x00df:
            com.google.android.gms.dynamic.ObjectWrapper r1 = new com.google.android.gms.dynamic.ObjectWrapper     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r1.<init>(r6)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            com.google.android.gms.internal.vision.zzk r2 = r11.A04     // Catch:{ 6CT | RemoteException -> 0x0136 }
            X.C13320nQ.A01(r2)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            com.google.android.gms.internal.vision.zzp r5 = (com.google.android.gms.internal.vision.zzp) r5     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r0 = 996171622(0x3b605f66, float:0.003423655)
            int r6 = X.C14030oh.A03(r0)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            android.os.Parcel r1 = com.google.android.gms.internal.vision.zzb.A00(r1, r5)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r0 = 0
            r1.writeInt(r4)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r2.writeToParcel(r1, r0)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            android.os.Parcel r5 = r5.A01(r1, r4)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            android.os.IBinder r2 = r5.readStrongBinder()     // Catch:{ 6CT | RemoteException -> 0x0136 }
            if (r2 != 0) goto L_0x0109
            r1 = 0
            goto L_0x0115
        L_0x0109:
            java.lang.String r0 = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            boolean r0 = r1 instanceof com.google.android.gms.internal.vision.zzl     // Catch:{ 6CT | RemoteException -> 0x0136 }
            if (r0 == 0) goto L_0x011f
            com.google.android.gms.internal.vision.zzl r1 = (com.google.android.gms.internal.vision.zzl) r1     // Catch:{ 6CT | RemoteException -> 0x0136 }
        L_0x0115:
            r5.recycle()     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r0 = -1837134743(0xffffffff927f8c69, float:-8.063688E-28)
            X.C14030oh.A0A(r0, r6)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            goto L_0x00d7
        L_0x011f:
            com.google.android.gms.internal.vision.zzo r1 = new com.google.android.gms.internal.vision.zzo     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r1.<init>(r2)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            goto L_0x0115
        L_0x0125:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            java.lang.String r0 = "Failed to instantiate module class: "
            java.lang.String r1 = X.C86114wI.A0p(r1, r0)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            X.6CT r0 = new X.6CT     // Catch:{ 6CT | RemoteException -> 0x0136 }
            r0.<init>(r1, r2)     // Catch:{ 6CT | RemoteException -> 0x0136 }
            throw r0     // Catch:{ 6CT | RemoteException -> 0x0136 }
        L_0x0136:
            r2 = move-exception
            java.lang.String r1 = "BarcodeNativeHandle"
            java.lang.String r0 = "Error creating remote native handle"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0162 }
        L_0x013e:
            boolean r1 = r11.A02     // Catch:{ all -> 0x0162 }
            if (r1 != 0) goto L_0x0153
            java.lang.Object r0 = r11.A00     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x0153
            java.lang.String r1 = "BarcodeNativeHandle"
            java.lang.String r0 = "Native handle not yet available. Reverting to no-op handle."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0162 }
            r11.A02 = r4     // Catch:{ all -> 0x0162 }
        L_0x014f:
            java.lang.Object r0 = r11.A00     // Catch:{ all -> 0x0162 }
        L_0x0151:
            monitor-exit(r3)     // Catch:{ all -> 0x0162 }
            goto L_0x0161
        L_0x0153:
            if (r1 == 0) goto L_0x014f
            java.lang.Object r0 = r11.A00     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x014f
            java.lang.String r1 = "BarcodeNativeHandle"
            java.lang.String r0 = "Native handle is now available."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0162 }
            goto L_0x014f
        L_0x0161:
            return r0
        L_0x0162:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0162 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112996qX.A00():java.lang.Object");
    }
}
