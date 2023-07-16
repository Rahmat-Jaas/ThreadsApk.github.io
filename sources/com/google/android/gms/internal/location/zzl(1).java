package com.google.android.gms.internal.location;

import X.C122167Ky;
import X.C86124wJ;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzak;
import com.google.android.gms.location.zzam;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(99);
    public int A00;
    public zzai A01;
    public zzj A02;
    public zzak A03;

    public zzl(IBinder iBinder, IBinder iBinder2, zzj zzj, int i) {
        zzak zzam;
        this.A00 = i;
        this.A02 = zzj;
        zzai zzai = null;
        if (iBinder == null) {
            zzam = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof zzak) {
                zzam = (zzak) queryLocalInterface;
            } else {
                zzam = new zzam(iBinder);
            }
        }
        this.A03 = zzam;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof zzai) {
                zzai = (zzai) queryLocalInterface2;
            } else {
                zzai = new zzak(iBinder2);
            }
        }
        this.A01 = zzai;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0D(parcel, this.A02, 2, i, false);
        zzak zzak = this.A03;
        IBinder iBinder = null;
        if (zzak == null) {
            asBinder = null;
        } else {
            asBinder = zzak.asBinder();
        }
        C122167Ky.A03(asBinder, parcel, 3);
        zzai zzai = this.A01;
        if (zzai != null) {
            iBinder = zzai.asBinder();
        }
        C122167Ky.A03(iBinder, parcel, 4);
        C122167Ky.A05(parcel, A002);
    }
}
