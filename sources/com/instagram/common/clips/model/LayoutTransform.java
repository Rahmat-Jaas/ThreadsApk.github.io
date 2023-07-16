package com.instagram.common.clips.model;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass6QE;
import X.C04220Ms;
import X.C18190wL;
import X.C18220wO;
import X.C86104wH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class LayoutTransform implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(87);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Integer A04;
    public final boolean A05;
    public final int A06;
    public final int A07;

    public LayoutTransform(Integer num, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        C04220Ms.A0B(num, 6);
        this.A05 = z;
        this.A02 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A01 = f4;
        this.A04 = num;
        this.A06 = i;
        this.A07 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LayoutTransform) {
                LayoutTransform layoutTransform = (LayoutTransform) obj;
                if (!(this.A05 == layoutTransform.A05 && Float.compare(this.A02, layoutTransform.A02) == 0 && Float.compare(this.A00, layoutTransform.A00) == 0 && Float.compare(this.A03, layoutTransform.A03) == 0 && Float.compare(this.A01, layoutTransform.A01) == 0 && this.A04 == layoutTransform.A04 && this.A06 == layoutTransform.A06 && this.A07 == layoutTransform.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A01);
        parcel.writeString(AnonymousClass6QE.A00(this.A04));
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
    }

    public final int hashCode() {
        boolean z = this.A05;
        if (z) {
            z = true;
        }
        int A052 = C86104wH.A05(C86104wH.A05(C86104wH.A05(C86104wH.A05((z ? 1 : 0) * true, this.A02), this.A00), this.A03), this.A01);
        Integer num = this.A04;
        return ((C18220wO.A05(num, AnonymousClass6QE.A00(num), A052) + this.A06) * 31) + this.A07;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LayoutTransform(hflip=");
        A0s.append(this.A05);
        A0s.append(", scale=");
        A0s.append(this.A02);
        A0s.append(", leftPercentage=");
        A0s.append(this.A00);
        A0s.append(", topPercentage=");
        A0s.append(this.A03);
        A0s.append(", rotationDegrees=");
        A0s.append(this.A01);
        A0s.append(", cropType=");
        A0s.append(AnonymousClass6QE.A00(this.A04));
        A0s.append(", underlayGradientBottomColor=");
        A0s.append(this.A06);
        A0s.append(", underlayGradientTopColor=");
        A0s.append(this.A07);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public LayoutTransform() {
        this(AnonymousClass006.A00, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 0, false);
    }
}
