package com.instagram.shopping.model.destination.home;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C86104wH;
import X.C86114wI;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape16S0000000_I2_16;
import com.instagram.shopping.model.destination.home.ShoppingHomeTapTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProductFeedHeader extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape16S0000000_I2_16(89);
    public ShoppingHomeTapTarget A00;
    public Subtitle A01;
    public Boolean A02;
    public String A03;

    public ProductFeedHeader(ShoppingHomeTapTarget shoppingHomeTapTarget, Subtitle subtitle, Boolean bool, String str) {
        C04220Ms.A0B(shoppingHomeTapTarget, 3);
        this.A03 = str;
        this.A01 = subtitle;
        this.A00 = shoppingHomeTapTarget;
        this.A02 = bool;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductFeedHeader) {
                ProductFeedHeader productFeedHeader = (ProductFeedHeader) obj;
                if (!C04220Ms.A0I(this.A03, productFeedHeader.A03) || !C04220Ms.A0I(this.A01, productFeedHeader.A01) || !C04220Ms.A0I(this.A00, productFeedHeader.A00) || !C04220Ms.A0I(this.A02, productFeedHeader.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(C86114wI.A1W(parcel, this.A02) ? 1 : 0);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, ((AnonymousClass0wJ.A06(this.A03) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ProductFeedHeader(title=");
        A0s.append(this.A03);
        A0s.append(C18170wI.A00(31));
        A0s.append(this.A01);
        A0s.append(", tapTarget=");
        A0s.append(this.A00);
        A0s.append(", showTopSeparator=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public ProductFeedHeader() {
        this(new ShoppingHomeTapTarget((ShoppingHomeTapTarget.RichDestinationButton) null, (ShoppingHomeTapTarget.RichDestinationChevron) null, (DefaultConstructorMarker) null, 3), (Subtitle) null, C18180wK.A0X(), (String) null);
    }
}
