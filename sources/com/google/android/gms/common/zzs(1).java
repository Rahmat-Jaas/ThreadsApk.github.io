package com.google.android.gms.common;

import X.C122167Ky;
import X.C86124wJ;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(31);
    public final zzi A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public zzs(IBinder iBinder, String str, boolean z, boolean z2) {
        zzz zzx;
        byte[] bArr;
        this.A01 = str;
        zzj zzj = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof zzz) {
                    zzx = (zzz) queryLocalInterface;
                } else {
                    zzx = new zzx(iBinder);
                }
                IObjectWrapper DC2 = zzx.DC2();
                if (DC2 == null || (bArr = (byte[]) ObjectWrapper.A01(DC2)) == null) {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                } else {
                    zzj = new zzj(bArr);
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.A00 = zzj;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A01, 1, false);
        zzi zzi = this.A00;
        if (zzi == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzi = null;
        }
        C122167Ky.A03(zzi, parcel, 2);
        C122167Ky.A0B(parcel, 3, this.A02);
        C122167Ky.A0B(parcel, 4, this.A03);
        C122167Ky.A05(parcel, A002);
    }
}
