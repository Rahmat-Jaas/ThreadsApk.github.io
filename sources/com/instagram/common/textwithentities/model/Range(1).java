package com.instagram.common.textwithentities.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C144638ip;
import X.C18180wK;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class Range extends AnonymousClass0Sf implements Parcelable, C144638ip {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(96);
    public final Entity A00;
    public final Integer A01;
    public final Integer A02;

    public final Range D3W() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Range) {
                Range range = (Range) obj;
                if (!C04220Ms.A0I(this.A00, range.A00) || !C04220Ms.A0I(this.A01, range.A01) || !C04220Ms.A0I(this.A02, range.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        Entity entity = this.A00;
        if (entity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entity.writeToParcel(parcel, i);
        }
        C18180wK.A0y(parcel, this.A01, 0, 1);
        C18180wK.A0y(parcel, this.A02, 0, 1);
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A02);
    }

    public Range(Entity entity, Integer num, Integer num2) {
        this.A00 = entity;
        this.A01 = num;
        this.A02 = num2;
    }
}
