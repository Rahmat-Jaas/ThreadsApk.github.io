package com.instagram.monetization.onboarding.model;

import X.AnonymousClass000;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductOnboardingNextStepInfo implements Parcelable {
    public int A00;
    public String A01;
    public String A02;

    public ProductOnboardingNextStepInfo() {
        this((String) null, 0, 7);
    }

    public /* synthetic */ ProductOnboardingNextStepInfo(String str, int i, int i2) {
        String str2 = null;
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? AnonymousClass000.A00(933) : str2;
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
