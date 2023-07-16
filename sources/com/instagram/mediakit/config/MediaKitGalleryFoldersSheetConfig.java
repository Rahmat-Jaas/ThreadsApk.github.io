package com.instagram.mediakit.config;

import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.Iterator;
import java.util.List;

public final class MediaKitGalleryFoldersSheetConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(32);
    public final List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        Iterator A0v = C18200wM.A0v(parcel, this.A00);
        while (A0v.hasNext()) {
            C86124wJ.A1F(parcel, A0v, i);
        }
    }

    public MediaKitGalleryFoldersSheetConfig(List list) {
        this.A00 = list;
    }
}
