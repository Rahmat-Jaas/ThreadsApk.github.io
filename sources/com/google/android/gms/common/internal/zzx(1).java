package com.google.android.gms.common.internal;

import X.C14030oh;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;

public final class zzx extends zza implements zzz {
    public zzx(IBinder iBinder) {
        super("com.google.android.gms.common.internal.ICertData", iBinder);
        C14030oh.A0A(-218464535, C14030oh.A03(-560444638));
    }

    public final int DBz() {
        int A03 = C14030oh.A03(56588168);
        Parcel A01 = A01(A00(), 2);
        int readInt = A01.readInt();
        A01.recycle();
        C14030oh.A0A(398893633, A03);
        return readInt;
    }

    public final IObjectWrapper DC2() {
        int A03 = C14030oh.A03(-895016029);
        IObjectWrapper A00 = zzb.A00(A00(), this, 1);
        C14030oh.A0A(159169362, A03);
        return A00;
    }
}
