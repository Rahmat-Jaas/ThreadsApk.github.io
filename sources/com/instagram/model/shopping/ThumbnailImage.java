package com.instagram.model.shopping;

import X.C18180wK;
import X.C32572Cj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape14S0000000_I2_14;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;

public class ThumbnailImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape14S0000000_I2_14(73);
    public ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C32572Cj.A00(this.A00, ((ThumbnailImage) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ThumbnailImage(Parcel parcel) {
        this.A00 = (ImageUrl) C18180wK.A0A(parcel, ImageUrl.class);
    }

    public ThumbnailImage() {
    }
}
