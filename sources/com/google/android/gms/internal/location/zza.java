package com.google.android.gms.internal.location;

import X.C14030oh;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class zza extends Binder implements IInterface {
    public zza() {
        int A03 = C14030oh.A03(1432871374);
        attachInterface(this, "com.google.android.gms.location.internal.ISettingsCallbacks");
        C14030oh.A0A(-703433712, A03);
    }

    public final IBinder asBinder() {
        C14030oh.A0A(-65678159, C14030oh.A03(1813310896));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r0 = -1221644972(0xffffffffb72f2d54, float:-1.0441367E-5)
            int r5 = X.C14030oh.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 <= r0) goto L_0x001a
            boolean r0 = super.onTransact(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x001d
            r3 = 1
            r0 = -62759463(0xfffffffffc425dd9, float:-4.0368362E36)
        L_0x0016:
            X.C14030oh.A0A(r0, r5)
            return r3
        L_0x001a:
            X.C86144wL.A1A(r7, r9)
        L_0x001d:
            r6 = r7
            com.google.android.gms.internal.location.zzaq r6 = (com.google.android.gms.internal.location.zzaq) r6
            r0 = 1226516167(0x491b26c7, float:635500.44)
            int r4 = X.C14030oh.A03(r0)
            r3 = 1
            if (r8 != r3) goto L_0x0055
            android.os.Parcelable$Creator r0 = com.google.android.gms.location.LocationSettingsResult.CREATOR
            android.os.Parcelable r2 = X.C86104wH.A0F(r9, r0)
            com.google.android.gms.location.LocationSettingsResult r2 = (com.google.android.gms.location.LocationSettingsResult) r2
            com.google.android.gms.internal.location.zzaz r6 = (com.google.android.gms.internal.location.zzaz) r6
            r0 = -1860818505(0xffffffff911629b7, float:-1.1845768E-28)
            int r1 = X.C14030oh.A03(r0)
            X.8eF r0 = r6.A00
            com.google.android.gms.common.api.internal.BasePendingResult r0 = (com.google.android.gms.common.api.internal.BasePendingResult) r0
            r0.A07(r2)
            r0 = 0
            r6.A00 = r0
            r0 = 1377546889(0x521bb289, float:1.67178813E11)
            X.C14030oh.A0A(r0, r1)
            r0 = -343838041(0xffffffffeb8172a7, float:-3.1298572E26)
        L_0x004e:
            X.C14030oh.A0A(r0, r4)
            r0 = 1093600575(0x412f053f, float:10.938781)
            goto L_0x0016
        L_0x0055:
            r3 = 0
            r0 = -1697043938(0xffffffff9ad92a1e, float:-8.981714E-23)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
