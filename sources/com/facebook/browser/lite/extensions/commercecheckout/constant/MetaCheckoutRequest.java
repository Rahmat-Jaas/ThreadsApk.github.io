package com.facebook.browser.lite.extensions.commercecheckout.constant;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class MetaCheckoutRequest extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(96);
    public final Integer A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaCheckoutRequest) {
                MetaCheckoutRequest metaCheckoutRequest = (MetaCheckoutRequest) obj;
                if (this.A00 != metaCheckoutRequest.A00 || !C04220Ms.A0I(this.A01, metaCheckoutRequest.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        if (this.A00.intValue() != 0) {
            str = "IGNORE_META_CHECKOUT";
        } else {
            str = "LOAD_URL";
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "IGNORE_META_CHECKOUT";
        } else {
            str = "LOAD_URL";
        }
        return (C86144wL.A0B(str, intValue) * 31) + AnonymousClass0wJ.A06(this.A01);
    }

    public MetaCheckoutRequest(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
