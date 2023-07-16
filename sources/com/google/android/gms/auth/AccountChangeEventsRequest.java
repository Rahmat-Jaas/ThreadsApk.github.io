package com.google.android.gms.auth;

import X.C122167Ky;
import X.C86124wJ;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(95);
    public int A00;
    public Account A01;
    public String A02;
    public final int A03;

    public AccountChangeEventsRequest(Account account, String str, int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
        this.A02 = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.A01 = account;
        } else {
            this.A01 = new Account(str, "com.google");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A03);
        C122167Ky.A08(parcel, 2, this.A00);
        C122167Ky.A0H(parcel, this.A02, 3, false);
        C122167Ky.A0D(parcel, this.A01, 4, i, false);
        C122167Ky.A05(parcel, A002);
    }

    public AccountChangeEventsRequest() {
        this.A03 = 1;
    }
}
