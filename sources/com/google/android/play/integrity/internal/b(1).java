package com.google.android.play.integrity.internal;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class b extends Binder implements IInterface {
    public final IBinder asBinder() {
        C14030oh.A0A(-1313686943, C14030oh.A03(163954456));
        return this;
    }

    public b() {
        int A03 = C14030oh.A03(354494532);
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        C14030oh.A0A(2004969641, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r10 = this;
            r0 = 277221383(0x10861007, float:5.2878375E-29)
            int r3 = X.C14030oh.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r11, r12, r13, r14)
            if (r0 == 0) goto L_0x001d
            r1 = 1
            r0 = 487345273(0x1d0c4c79, float:1.8568381E-21)
        L_0x0016:
            X.C14030oh.A0A(r0, r3)
            return r1
        L_0x001a:
            X.C86144wL.A1A(r10, r12)
        L_0x001d:
            r8 = r10
            com.google.android.play.integrity.internal.i r8 = (com.google.android.play.integrity.internal.i) r8
            r0 = 1735054892(0x676ad62c, float:1.1089845E24)
            int r4 = X.C14030oh.A03(r0)
            r0 = 2
            if (r11 != r0) goto L_0x006e
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = X.C86104wH.A0F(r12, r0)
            android.os.BaseBundle r7 = (android.os.BaseBundle) r7
            int r1 = r12.dataAvail()
            if (r1 > 0) goto L_0x00d5
            com.google.android.play.core.integrity.s r8 = (com.google.android.play.core.integrity.s) r8
            r0 = -1001810849(0xffffffffc449945f, float:-806.3183)
            int r5 = X.C14030oh.A03(r0)
            X.6jI r0 = r8.A02
            X.7EO r2 = r0.A01
            X.6rN r6 = r8.A00
            java.lang.Object r9 = r2.A07
            monitor-enter(r9)
            java.util.Set r0 = r2.A0A     // Catch:{ all -> 0x00d2 }
            r0.remove(r6)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d2 }
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.A0B     // Catch:{ all -> 0x00cf }
            int r0 = r1.get()     // Catch:{ all -> 0x00cf }
            if (r0 <= 0) goto L_0x006c
            int r0 = r1.decrementAndGet()     // Catch:{ all -> 0x00cf }
            if (r0 <= 0) goto L_0x006c
            X.77Q r2 = r2.A06     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            java.lang.Object[] r0 = X.C86164wN.A1T()     // Catch:{ all -> 0x00cf }
            r2.A01(r1, r0)     // Catch:{ all -> 0x00cf }
            monitor-exit(r9)     // Catch:{ all -> 0x00cf }
            goto L_0x007f
        L_0x006c:
            monitor-exit(r9)     // Catch:{ all -> 0x00cf }
            goto L_0x0073
        L_0x006e:
            r1 = 0
            r0 = -1004332104(0xffffffffc4231bb8, float:-652.4331)
            goto L_0x00a5
        L_0x0073:
            X.5rB r1 = new X.5rB
            r1.<init>(r2)
            android.os.Handler r0 = r2.A01()
            r0.post(r1)
        L_0x007f:
            X.77Q r2 = r8.A01
            java.lang.Object[] r1 = X.C86164wN.A1T()
            java.lang.String r0 = "onRequestIntegrityToken"
            r2.A01(r0, r1)
            java.lang.String r0 = "error"
            int r1 = r7.getInt(r0)
            r2 = 0
            if (r1 == 0) goto L_0x00ad
            X.5lA r0 = new X.5lA
            r0.<init>(r1, r2)
            r6.A00(r0)
            r0 = -1670897561(0xffffffff9c682067, float:-7.680424E-22)
        L_0x009e:
            X.C14030oh.A0A(r0, r5)
            r1 = 1
            r0 = -2013443003(0xffffffff87fd4c45, float:-3.8112036E-34)
        L_0x00a5:
            X.C14030oh.A0A(r0, r4)
            r0 = 1606579641(0x5fc275b9, float:2.8024618E19)
            goto L_0x0016
        L_0x00ad:
            java.lang.String r0 = "token"
            java.lang.String r1 = r7.getString(r0)
            if (r1 != 0) goto L_0x00c3
            r1 = -100
            X.5lA r0 = new X.5lA
            r0.<init>(r1, r2)
            r6.A00(r0)
            r0 = 360108791(0x1576d2f7, float:4.9845726E-26)
            goto L_0x009e
        L_0x00c3:
            X.5qv r0 = new X.5qv
            r0.<init>(r1)
            r6.A01(r0)
            r0 = 1453337108(0x56a02a14, float:8.8051292E13)
            goto L_0x009e
        L_0x00cf:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00cf }
            throw r1
        L_0x00d2:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d2 }
            throw r1
        L_0x00d5:
            java.lang.String r0 = "Parcel data not fully consumed, unread size: "
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.integrity.internal.b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
