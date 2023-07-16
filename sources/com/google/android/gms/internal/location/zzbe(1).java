package com.google.android.gms.internal.location;

import X.C122167Ky;
import X.C86124wJ;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzap;
import com.google.android.gms.location.zzaq;
import com.google.android.gms.location.zzar;
import com.google.android.gms.location.zzas;

public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(96);
    public int A00;
    public PendingIntent A01;
    public zzai A02;
    public zzbc A03;
    public zzap A04;
    public zzaq A05;

    public zzbe(PendingIntent pendingIntent, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, zzbc zzbc, int i) {
        zzaq zzas;
        zzap zzar;
        this.A00 = i;
        this.A03 = zzbc;
        zzai zzai = null;
        if (iBinder == null) {
            zzas = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof zzaq) {
                zzas = (zzaq) queryLocalInterface;
            } else {
                zzas = new zzas(iBinder);
            }
        }
        this.A05 = zzas;
        this.A01 = pendingIntent;
        if (iBinder2 == null) {
            zzar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof zzap) {
                zzar = (zzap) queryLocalInterface2;
            } else {
                zzar = new zzar(iBinder2);
            }
        }
        this.A04 = zzar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof zzai) {
                zzai = (zzai) queryLocalInterface3;
            } else {
                zzai = new zzak(iBinder3);
            }
        }
        this.A02 = zzai;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        boolean A0Q = C122167Ky.A0Q(parcel, this.A03, i);
        zzaq zzaq = this.A05;
        IBinder iBinder = null;
        if (zzaq == null) {
            asBinder = null;
        } else {
            asBinder = zzaq.asBinder();
        }
        C122167Ky.A03(asBinder, parcel, 3);
        C122167Ky.A0D(parcel, this.A01, 4, i, A0Q);
        zzap zzap = this.A04;
        if (zzap == null) {
            asBinder2 = null;
        } else {
            asBinder2 = zzap.asBinder();
        }
        C122167Ky.A03(asBinder2, parcel, 5);
        zzai zzai = this.A02;
        if (zzai != null) {
            iBinder = zzai.asBinder();
        }
        C122167Ky.A03(iBinder, parcel, 6);
        C122167Ky.A05(parcel, A002);
    }
}
