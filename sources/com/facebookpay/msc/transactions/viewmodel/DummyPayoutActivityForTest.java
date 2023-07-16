package com.facebookpay.msc.transactions.viewmodel;

import X.C128497jh;
import X.C128507ji;
import X.C128517jj;
import X.C128527jk;
import X.C147908q7;
import X.C147918q8;
import X.C148448r4;
import X.C148458r5;
import X.C148528rE;
import X.C968066t;
import X.C97396Be;
import android.os.Parcel;
import android.os.Parcelable;

public final class DummyPayoutActivityForTest implements Parcelable, C148528rE {
    public final String B0O() {
        return "2021-04-01";
    }

    public final String B0P() {
        return "123456789";
    }

    public final String B0Z() {
        return "PAID";
    }

    public final String getId() {
        return "2053892059";
    }

    public final C147908q7 B0V() {
        return new C128497jh();
    }

    public final C968066t B0X() {
        return C968066t.SETTLED;
    }

    public final C148448r4 B0d() {
        return new C128507ji();
    }

    public final C148458r5 B0l() {
        return new C128517jj();
    }

    public final C147918q8 B0o() {
        return new C128527jk();
    }

    public final int describeContents() {
        throw C97396Be.A00("Not yet implemented");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        throw C97396Be.A00("Not yet implemented");
    }
}
