package com.instagram.shopping.model.analytics;

import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;

public final class ShoppingVisualSearchLoggingInfo extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape16S0000000_I2_16(69);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingVisualSearchLoggingInfo) {
                ShoppingVisualSearchLoggingInfo shoppingVisualSearchLoggingInfo = (ShoppingVisualSearchLoggingInfo) obj;
                if (!C04220Ms.A0I(this.A00, shoppingVisualSearchLoggingInfo.A00) || !C04220Ms.A0I(this.A01, shoppingVisualSearchLoggingInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("ShoppingVisualSearchLoggingInfo(glintId=", this.A00, ", strippedMediaId=", this.A01, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A00) * 31) + C18200wM.A09(this.A01);
    }

    public ShoppingVisualSearchLoggingInfo(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
