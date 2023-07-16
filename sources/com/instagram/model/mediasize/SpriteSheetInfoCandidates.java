package com.instagram.model.mediasize;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C144768jF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public final class SpriteSheetInfoCandidates extends AnonymousClass0Sf implements Parcelable, C144768jF {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(86);
    public final SpritesheetInfo A00;

    public final SpriteSheetInfoCandidates D4u() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpriteSheetInfoCandidates) && C04220Ms.A0I(this.A00, ((SpriteSheetInfoCandidates) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        SpritesheetInfo spritesheetInfo = this.A00;
        if (spritesheetInfo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        spritesheetInfo.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00);
    }

    public SpriteSheetInfoCandidates(SpritesheetInfo spritesheetInfo) {
        this.A00 = spritesheetInfo;
    }
}
