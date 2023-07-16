package X;

import android.app.ActivityThread;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Method;

/* renamed from: X.0F0  reason: invalid class name */
public final class AnonymousClass0F0 {
    public static AnonymousClass0F0 A0C;
    public static final AnonymousClass0K9 A0D = new AnonymousClass0K9("ClientTranLifecycleHelper");
    public static final Object A0E = new Object();
    public static volatile boolean A0F;
    public static volatile boolean A0G;
    public ActivityThread A00 = null;
    public Parcelable.Creator A01 = null;
    public Class A02 = null;
    public Class A03 = null;
    public Object A04;
    public Method A05 = null;
    public Method A06 = null;
    public Method A07 = null;
    public Method A08;
    public final C03190Eu A09;
    public final AnonymousClass0F2 A0A;
    public final C03410If A0B;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114 A[Catch:{ Exception -> 0x00f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0F0 A00(X.C03410If r13) {
        /*
            r2 = 0
            r3 = -2346(0xfffffffffffff6d6, float:NaN)
            r1 = 0
            boolean r0 = A0G
            if (r0 == 0) goto L_0x000b
            X.0F0 r0 = A0C
            return r0
        L_0x000b:
            java.lang.Object r7 = A0E
            monitor-enter(r7)
            boolean r0 = A0G     // Catch:{ all -> 0x0120 }
            if (r0 != 0) goto L_0x011c
            X.0If r8 = X.C03410If.A01(r13, r3, r1)     // Catch:{ all -> 0x0120 }
            X.0Eu r3 = X.C03190Eu.A00(r8)     // Catch:{ all -> 0x0120 }
            r6 = 1
            if (r3 == 0) goto L_0x0115
            X.0F0 r0 = new X.0F0     // Catch:{ all -> 0x0120 }
            r0.<init>(r3, r8)     // Catch:{ all -> 0x0120 }
            boolean r3 = X.C03200Ew.A00     // Catch:{ all -> 0x0120 }
            if (r3 != 0) goto L_0x0039
            X.0K9 r3 = A0D     // Catch:{ all -> 0x0120 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0120 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r2 = new java.lang.Object[]{r1}     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "Android %d is not currently supported"
        L_0x0034:
            r3.A07(r1, r2)     // Catch:{ all -> 0x0120 }
            goto L_0x010e
        L_0x0039:
            android.app.ActivityThread r3 = X.AnonymousClass0Ep.A00()     // Catch:{ all -> 0x0120 }
            r0.A00 = r3     // Catch:{ all -> 0x0120 }
            if (r3 != 0) goto L_0x0048
            X.0K9 r3 = A0D     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "Could not find ActivityThread"
            goto L_0x0034
        L_0x0048:
            X.0Id r9 = X.C03400Id.LikelyHidden     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = "android.app.servertransaction.ActivityLifecycleItem"
            java.lang.Class r10 = r8.A0C(r9, r4)     // Catch:{ Exception -> 0x0104 }
            r0.A02 = r10     // Catch:{ Exception -> 0x0104 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0104 }
            java.lang.String r12 = "getTargetState"
            java.lang.Class[] r13 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0104 }
            java.lang.reflect.Method r4 = r8.A0J(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0104 }
            r0.A05 = r4     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = "android.app.servertransaction.ClientTransaction"
            java.lang.Class r10 = r8.A0C(r9, r4)     // Catch:{ Exception -> 0x0104 }
            r0.A03 = r10     // Catch:{ Exception -> 0x0104 }
            java.lang.Class r11 = r0.A02     // Catch:{ Exception -> 0x0104 }
            java.lang.String r12 = "getLifecycleStateRequest"
            java.lang.Class[] r13 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0104 }
            java.lang.reflect.Method r4 = r8.A0J(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0104 }
            r0.A07 = r4     // Catch:{ Exception -> 0x0104 }
            java.lang.Class r10 = r0.A03     // Catch:{ Exception -> 0x0104 }
            java.lang.Class<android.os.IBinder> r11 = android.os.IBinder.class
            java.lang.String r12 = "getActivityToken"
            java.lang.Class[] r13 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0104 }
            java.lang.reflect.Method r4 = r8.A0J(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0104 }
            r0.A06 = r4     // Catch:{ Exception -> 0x0104 }
            java.lang.Class r5 = r0.A03     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = "CREATOR"
            java.lang.reflect.Field r4 = r8.A0H(r9, r5, r2, r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x0104 }
            android.os.Parcelable$Creator r4 = (android.os.Parcelable.Creator) r4     // Catch:{ Exception -> 0x0104 }
            r0.A01 = r4     // Catch:{ Exception -> 0x0104 }
            if (r4 != 0) goto L_0x00a4
            X.0K9 r4 = A0D     // Catch:{ Exception -> 0x0104 }
            java.lang.String r3 = "Failed getting servertransaction links because Parcelable CREATOR field for %s was null."
            java.lang.Class r2 = r0.A03     // Catch:{ Exception -> 0x0104 }
            java.lang.String r2 = r2.getName()     // Catch:{ Exception -> 0x0104 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ Exception -> 0x0104 }
            r4.A07(r3, r2)     // Catch:{ Exception -> 0x0104 }
            goto L_0x010e
        L_0x00a4:
            java.lang.Class r5 = r0.A03     // Catch:{ all -> 0x0120 }
            r5.getClass()     // Catch:{ all -> 0x0120 }
            java.lang.String r12 = "getCallbacks"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00f7 }
            r10 = r5
            r11 = r2
            r13 = r4
            java.lang.reflect.Method r4 = r8.A0J(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00f7 }
            r0.A08 = r4     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r4 = "android.app.servertransaction.TransactionExecutorHelper"
            r8.A0C(r9, r4)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r4 = "android.app.servertransaction.TransactionExecutor"
            java.lang.Class r11 = r8.A0C(r9, r4)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r4 = "mHelper"
            java.lang.reflect.Field r5 = r8.A0H(r9, r11, r2, r4)     // Catch:{ Exception -> 0x00f7 }
            java.lang.Class r10 = r3.getClass()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r12 = "getTransactionExecutor"
            java.lang.Class[] r13 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x00f7 }
            java.lang.reflect.Method r4 = r8.A0J(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f7 }
            java.lang.Object r2 = r4.invoke(r3, r2)     // Catch:{ Exception -> 0x00f7 }
            if (r2 != 0) goto L_0x00e5
            X.0K9 r4 = A0D     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r3 = "Got a null TransactionExecutor via ActivityThread.getTransactionExecutor()"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f7 }
            r4.A07(r3, r2)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0101
        L_0x00e5:
            java.lang.Object r2 = r5.get(r2)     // Catch:{ Exception -> 0x00f7 }
            r0.A04 = r2     // Catch:{ Exception -> 0x00f7 }
            if (r2 != 0) goto L_0x0101
            X.0K9 r4 = A0D     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r3 = "Got a null TransactionExecutorHelper via TransactionExecutor.mHelper"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f7 }
            r4.A07(r3, r2)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0101
        L_0x00f7:
            r4 = move-exception
            X.0K9 r3 = A0D     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "Could not get additional servertransaction lifecycle links"
            r3.A0B(r4, r1, r2)     // Catch:{ all -> 0x0120 }
        L_0x0101:
            r2 = 1
            r1 = 0
            goto L_0x0110
        L_0x0104:
            r4 = move-exception
            X.0K9 r3 = A0D     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "Could not get critical servertransaction links"
            r3.A0B(r4, r1, r2)     // Catch:{ all -> 0x0120 }
        L_0x010e:
            r2 = 0
            r1 = 1
        L_0x0110:
            A0F = r1     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x011a
            goto L_0x0118
        L_0x0115:
            A0F = r6     // Catch:{ all -> 0x0120 }
            goto L_0x011a
        L_0x0118:
            A0C = r0     // Catch:{ all -> 0x0120 }
        L_0x011a:
            A0G = r6     // Catch:{ all -> 0x0120 }
        L_0x011c:
            X.0F0 r0 = A0C     // Catch:{ all -> 0x0120 }
            monitor-exit(r7)     // Catch:{ all -> 0x0120 }
            return r0
        L_0x0120:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0120 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0F0.A00(X.0If):X.0F0");
    }

    public final Parcelable A01(Parcel parcel) {
        Parcelable parcelable;
        if (parcel == null) {
            return null;
        }
        parcel.enforceInterface("android.app.IApplicationThread");
        try {
            Parcelable.Creator creator = this.A01;
            if (creator == null) {
                A0D.A06("Cannot get the ClientTransaction obj since we are missing the CREATOR inst", new Object[0]);
                parcelable = null;
            } else {
                parcelable = (Parcelable) parcel.readTypedObject(creator);
            }
        } catch (ClassCastException e) {
            A0D.A05("Trouble reading a client transaction object from the given parcel.", e, new Object[0], 6, 0);
            parcelable = null;
        }
        if (parcelable != null) {
            return parcelable;
        }
        A0D.A07("Can't create a client transaction obj from the given data since we don't know how to parse it", new Object[0]);
        return null;
    }

    public AnonymousClass0F0(C03190Eu r2, C03410If r3) {
        this.A0B = r3;
        this.A09 = r2;
        this.A0A = new AnonymousClass0F2(r2, r3);
    }
}
