package com.google.android.gms.common.internal;

import X.C122167Ky;
import X.C86124wJ;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(8);
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public zat(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        boolean A0Q = C122167Ky.A0Q(parcel, this.A02, i);
        C122167Ky.A08(parcel, 3, this.A01);
        C122167Ky.A0D(parcel, this.A03, 4, i, A0Q);
        C122167Ky.A05(parcel, A002);
    }
}
