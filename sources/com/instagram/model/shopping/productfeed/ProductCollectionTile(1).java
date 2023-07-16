package com.instagram.model.shopping.productfeed;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C170999vu;
import X.C18200wM;
import X.C86104wH;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape15S0000000_I2_15;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;

public final class ProductCollectionTile extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape15S0000000_I2_15(8);
    public Merchant A00;
    public ProductCollectionCover A01;
    public C170999vu A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductCollectionTile) {
                ProductCollectionTile productCollectionTile = (ProductCollectionTile) obj;
                if (!C04220Ms.A0I(this.A04, productCollectionTile.A04) || this.A02 != productCollectionTile.A02 || !C04220Ms.A0I(this.A05, productCollectionTile.A05) || !C04220Ms.A0I(this.A07, productCollectionTile.A07) || !C04220Ms.A0I(this.A06, productCollectionTile.A06) || !C04220Ms.A0I(this.A00, productCollectionTile.A00) || !C04220Ms.A0I(this.A01, productCollectionTile.A01) || !C04220Ms.A0I(this.A03, productCollectionTile.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A04);
        C170999vu r0 = this.A02;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r0);
        }
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        Long l = this.A03;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C86134wK.A18(parcel, l, 1);
        }
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass0wJ.A06(this.A04) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A03);
    }

    public ProductCollectionTile(Merchant merchant, ProductCollectionCover productCollectionCover, C170999vu r3, Long l, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = r3;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A00 = merchant;
        this.A01 = productCollectionCover;
        this.A03 = l;
    }

    public ProductCollectionTile() {
        this((Merchant) null, (ProductCollectionCover) null, (C170999vu) null, (Long) null, (String) null, (String) null, (String) null, (String) null);
    }
}
