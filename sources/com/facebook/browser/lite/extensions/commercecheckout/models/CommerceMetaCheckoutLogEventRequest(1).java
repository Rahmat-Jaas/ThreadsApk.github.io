package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass6GQ;
import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabadscontext.IABAdsContext;

public final class CommerceMetaCheckoutLogEventRequest extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(97);
    public final IABAdsContext A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public CommerceMetaCheckoutLogEventRequest(IABAdsContext iABAdsContext, Integer num, String str, String str2) {
        C04220Ms.A0B(str, 3);
        this.A01 = num;
        this.A00 = iABAdsContext;
        this.A02 = str;
        this.A03 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceMetaCheckoutLogEventRequest) {
                CommerceMetaCheckoutLogEventRequest commerceMetaCheckoutLogEventRequest = (CommerceMetaCheckoutLogEventRequest) obj;
                if (this.A01 != commerceMetaCheckoutLogEventRequest.A01 || !C04220Ms.A0I(this.A00, commerceMetaCheckoutLogEventRequest.A00) || !C04220Ms.A0I(this.A02, commerceMetaCheckoutLogEventRequest.A02) || !C04220Ms.A0I(this.A03, commerceMetaCheckoutLogEventRequest.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(AnonymousClass6GQ.A00(this.A01));
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        Integer num = this.A01;
        return AnonymousClass0wJ.A07(this.A02, (((AnonymousClass6GQ.A00(num).hashCode() + num.intValue()) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A09(this.A03);
    }
}
