package com.facebookpay.fulfillmentoption.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public class FulfillmentOptionComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(76);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final CurrencyAmount A00() {
        if (this instanceof FulfillmentShippingOptionComponent) {
            return ((FulfillmentShippingOptionComponent) this).A00;
        }
        if (this instanceof FulfillmentPickupOptionComponent) {
            return ((FulfillmentPickupOptionComponent) this).A00;
        }
        return this.A00;
    }

    public final String A01() {
        if (this instanceof FulfillmentShippingOptionComponent) {
            return ((FulfillmentShippingOptionComponent) this).A01;
        }
        if (this instanceof FulfillmentPickupOptionComponent) {
            return ((FulfillmentPickupOptionComponent) this).A04;
        }
        return this.A01;
    }

    public final String A02() {
        if (this instanceof FulfillmentShippingOptionComponent) {
            return ((FulfillmentShippingOptionComponent) this).A02;
        }
        if (this instanceof FulfillmentPickupOptionComponent) {
            return ((FulfillmentPickupOptionComponent) this).A05;
        }
        return this.A02;
    }

    public final String A03() {
        if (this instanceof FulfillmentShippingOptionComponent) {
            return ((FulfillmentShippingOptionComponent) this).A03;
        }
        if (this instanceof FulfillmentPickupOptionComponent) {
            return ((FulfillmentPickupOptionComponent) this).A06;
        }
        return this.A03;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof FulfillmentShippingOptionComponent) {
            FulfillmentShippingOptionComponent fulfillmentShippingOptionComponent = (FulfillmentShippingOptionComponent) this;
            C04220Ms.A0B(parcel, 0);
            parcel.writeString(fulfillmentShippingOptionComponent.A02);
            parcel.writeString(fulfillmentShippingOptionComponent.A03);
            parcel.writeParcelable(fulfillmentShippingOptionComponent.A00, i);
            parcel.writeString(fulfillmentShippingOptionComponent.A01);
            parcel.writeSerializable(fulfillmentShippingOptionComponent.A05);
            parcel.writeSerializable(fulfillmentShippingOptionComponent.A04);
        } else if (this instanceof FulfillmentPickupOptionComponent) {
            FulfillmentPickupOptionComponent fulfillmentPickupOptionComponent = (FulfillmentPickupOptionComponent) this;
            C04220Ms.A0B(parcel, 0);
            parcel.writeString(fulfillmentPickupOptionComponent.A05);
            parcel.writeString(fulfillmentPickupOptionComponent.A06);
            parcel.writeParcelable(fulfillmentPickupOptionComponent.A00, i);
            parcel.writeString(fulfillmentPickupOptionComponent.A04);
            parcel.writeSerializable(fulfillmentPickupOptionComponent.A08);
            parcel.writeSerializable(fulfillmentPickupOptionComponent.A07);
            parcel.writeInt(C86114wI.A1W(parcel, fulfillmentPickupOptionComponent.A03) ? 1 : 0);
            parcel.writeParcelable(fulfillmentPickupOptionComponent.A02, i);
            parcel.writeParcelable(fulfillmentPickupOptionComponent.A01, i);
            parcel.writeInt(fulfillmentPickupOptionComponent.A09 ? 1 : 0);
        } else {
            C04220Ms.A0B(parcel, 0);
            parcel.writeString(this.A02);
            parcel.writeString(this.A03);
            parcel.writeParcelable(this.A00, i);
            parcel.writeString(this.A01);
        }
    }

    public FulfillmentOptionComponent(CurrencyAmount currencyAmount, String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = currencyAmount;
        this.A01 = str3;
    }
}
