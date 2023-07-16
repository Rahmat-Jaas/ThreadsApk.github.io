package com.google.android.gms.common.images;

import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(4);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof WebImage)) {
                WebImage webImage = (WebImage) obj;
                if (!(C117046y2.A01(this.A03, webImage.A03) && this.A01 == webImage.A01 && this.A02 == webImage.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A03.toString()});
    }

    public WebImage(Uri uri, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = uri;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0D(parcel, this.A03, 2, i, false);
        C122167Ky.A08(parcel, 3, this.A01);
        C122167Ky.A08(parcel, 4, this.A02);
        C122167Ky.A05(parcel, A002);
    }
}
