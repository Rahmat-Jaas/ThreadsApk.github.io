package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass69U;
import X.C04220Ms;
import X.C116826xc;
import X.C86104wH;
import X.C86114wI;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public class SelectionFulfillmentOptionItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(88);
    public Integer A00;
    public final CurrencyAmount A01;
    public final AnonymousClass69U A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final CurrencyAmount A00() {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            return ((SelectionFulfillmentShippingOptionItem) this).A01;
        }
        if (this instanceof SelectionFulfillmentPickupOptionItem) {
            return ((SelectionFulfillmentPickupOptionItem) this).A01;
        }
        return this.A01;
    }

    public final String A01() {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            return ((SelectionFulfillmentShippingOptionItem) this).A03;
        }
        if (this instanceof SelectionFulfillmentPickupOptionItem) {
            return ((SelectionFulfillmentPickupOptionItem) this).A06;
        }
        return this.A03;
    }

    public final String A02() {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            return ((SelectionFulfillmentShippingOptionItem) this).A05;
        }
        if (this instanceof SelectionFulfillmentPickupOptionItem) {
            return ((SelectionFulfillmentPickupOptionItem) this).A08;
        }
        return this.A05;
    }

    public final AnonymousClass69U AqR() {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            return ((SelectionFulfillmentShippingOptionItem) this).A02;
        }
        if (this instanceof SelectionFulfillmentPickupOptionItem) {
            return ((SelectionFulfillmentPickupOptionItem) this).A03;
        }
        return this.A02;
    }

    public final Integer BA9() {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            return ((SelectionFulfillmentShippingOptionItem) this).A00;
        }
        if (this instanceof SelectionFulfillmentPickupOptionItem) {
            return ((SelectionFulfillmentPickupOptionItem) this).A00;
        }
        return this.A00;
    }

    public final void Cpe(Integer num) {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            C04220Ms.A0B(num, 0);
            ((SelectionFulfillmentShippingOptionItem) this).A00 = num;
        } else if (this instanceof SelectionFulfillmentPickupOptionItem) {
            C04220Ms.A0B(num, 0);
            ((SelectionFulfillmentPickupOptionItem) this).A00 = num;
        } else {
            C04220Ms.A0B(num, 0);
            this.A00 = num;
        }
    }

    public final String getId() {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            return ((SelectionFulfillmentShippingOptionItem) this).A04;
        }
        if (this instanceof SelectionFulfillmentPickupOptionItem) {
            return ((SelectionFulfillmentPickupOptionItem) this).A07;
        }
        return this.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof SelectionFulfillmentShippingOptionItem) {
            SelectionFulfillmentShippingOptionItem selectionFulfillmentShippingOptionItem = (SelectionFulfillmentShippingOptionItem) this;
            C04220Ms.A0B(parcel, 0);
            C86104wH.A1B(parcel, selectionFulfillmentShippingOptionItem.A02);
            parcel.writeString(C116826xc.A01(selectionFulfillmentShippingOptionItem.A00));
            parcel.writeString(selectionFulfillmentShippingOptionItem.A04);
            parcel.writeString(selectionFulfillmentShippingOptionItem.A05);
            parcel.writeParcelable(selectionFulfillmentShippingOptionItem.A01, i);
            parcel.writeString(selectionFulfillmentShippingOptionItem.A03);
            parcel.writeSerializable(selectionFulfillmentShippingOptionItem.A07);
            parcel.writeSerializable(selectionFulfillmentShippingOptionItem.A06);
        } else if (this instanceof SelectionFulfillmentPickupOptionItem) {
            SelectionFulfillmentPickupOptionItem selectionFulfillmentPickupOptionItem = (SelectionFulfillmentPickupOptionItem) this;
            C04220Ms.A0B(parcel, 0);
            C86104wH.A1B(parcel, selectionFulfillmentPickupOptionItem.A03);
            parcel.writeString(C116826xc.A01(selectionFulfillmentPickupOptionItem.A00));
            parcel.writeString(selectionFulfillmentPickupOptionItem.A07);
            parcel.writeString(selectionFulfillmentPickupOptionItem.A08);
            parcel.writeParcelable(selectionFulfillmentPickupOptionItem.A01, i);
            parcel.writeString(selectionFulfillmentPickupOptionItem.A06);
            parcel.writeSerializable(selectionFulfillmentPickupOptionItem.A0A);
            parcel.writeSerializable(selectionFulfillmentPickupOptionItem.A09);
            parcel.writeParcelable(selectionFulfillmentPickupOptionItem.A04, i);
            parcel.writeInt(C86114wI.A1W(parcel, selectionFulfillmentPickupOptionItem.A05) ? 1 : 0);
            parcel.writeParcelable(selectionFulfillmentPickupOptionItem.A02, i);
            parcel.writeInt(selectionFulfillmentPickupOptionItem.A0B ? 1 : 0);
        } else {
            C04220Ms.A0B(parcel, 0);
            C86104wH.A1B(parcel, this.A02);
            parcel.writeString(C116826xc.A01(this.A00));
            parcel.writeString(this.A04);
            parcel.writeString(this.A05);
            parcel.writeParcelable(this.A01, i);
            parcel.writeString(this.A03);
        }
    }

    public SelectionFulfillmentOptionItem(CurrencyAmount currencyAmount, AnonymousClass69U r2, Integer num, String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(r2, num);
        AnonymousClass0wJ.A1R(str, str2);
        this.A02 = r2;
        this.A00 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = currencyAmount;
        this.A03 = str3;
    }
}
