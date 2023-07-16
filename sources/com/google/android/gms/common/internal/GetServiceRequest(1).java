package com.google.android.gms.common.internal;

import X.C14030oh;
import X.C86124wJ;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.redex.PCreatorCreatorShape5S0000000_I2_5;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(16);
    public int A00;
    public int A01;
    public Account A02;
    public Bundle A03;
    public IBinder A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public Feature[] A09;
    public Feature[] A0A;
    public Scope[] A0B;
    public final int A0C;
    public final int A0D;

    public GetServiceRequest(int i, String str) {
        this.A0C = 6;
        this.A00 = 12451000;
        this.A0D = i;
        this.A07 = true;
        this.A06 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        PCreatorCreatorShape5S0000000_I2_5.A00(parcel, this, i);
    }

    public GetServiceRequest(Account account, Bundle bundle, IBinder iBinder, String str, String str2, Feature[] featureArr, Feature[] featureArr2, Scope[] scopeArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Object zzv;
        Parcelable parcelable;
        this.A0C = i;
        this.A0D = i2;
        this.A00 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A05 = "com.google.android.gms";
        } else {
            this.A05 = str;
        }
        if (i >= 2) {
            this.A04 = iBinder;
        } else if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof IAccountAccessor) {
                zzv = (IAccountAccessor) queryLocalInterface;
            } else {
                zzv = new zzv(iBinder);
            }
            account = null;
            if (zzv != null) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    zzv zzv2 = (zzv) zzv;
                    int A032 = C14030oh.A03(-1510435056);
                    Parcel A012 = zzv2.A01(zzv2.A00(), 2);
                    Parcelable.Creator creator = Account.CREATOR;
                    if (A012.readInt() == 0) {
                        parcelable = null;
                    } else {
                        parcelable = (Parcelable) creator.createFromParcel(A012);
                    }
                    Account account2 = (Account) parcelable;
                    A012.recycle();
                    C14030oh.A0A(-1688257284, A032);
                    account = account2;
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } else {
            account = null;
        }
        this.A02 = account;
        this.A0B = scopeArr;
        this.A03 = bundle;
        this.A09 = featureArr;
        this.A0A = featureArr2;
        this.A07 = z;
        this.A01 = i4;
        this.A08 = z2;
        this.A06 = str2;
    }
}
