package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;

public final class MiniShopColorCustomization extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape8S0000000_I2_8(51);
    public final MiniShopColorPaletteCustomization A00;
    public final MiniShopColorPaletteCustomization A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MiniShopColorCustomization) {
                MiniShopColorCustomization miniShopColorCustomization = (MiniShopColorCustomization) obj;
                if (!C04220Ms.A0I(this.A00, miniShopColorCustomization.A00) || !C04220Ms.A0I(this.A01, miniShopColorCustomization.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public MiniShopColorCustomization(MiniShopColorPaletteCustomization miniShopColorPaletteCustomization, MiniShopColorPaletteCustomization miniShopColorPaletteCustomization2) {
        AnonymousClass0wJ.A1O(miniShopColorPaletteCustomization, miniShopColorPaletteCustomization2);
        this.A00 = miniShopColorPaletteCustomization;
        this.A01 = miniShopColorPaletteCustomization2;
    }
}
