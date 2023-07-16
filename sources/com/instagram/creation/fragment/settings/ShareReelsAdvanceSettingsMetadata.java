package com.instagram.creation.fragment.settings;

import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import com.instagram.pendingmedia.model.BrandedContentTag;

public class ShareReelsAdvanceSettingsMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape11S0000000_I2_11(40);
    public final BrandedContentTag A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ShareReelsAdvanceSettingsMetadata(Parcel parcel) {
        this.A00 = (BrandedContentTag) C18180wK.A0A(parcel, BrandedContentTag.class);
    }
}
