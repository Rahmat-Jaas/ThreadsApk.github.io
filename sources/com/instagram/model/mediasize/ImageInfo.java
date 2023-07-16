package com.instagram.model.mediasize;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C144758jE;
import X.C144768jF;
import X.C146478mJ;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.Iterator;
import java.util.List;

public final class ImageInfo extends AnonymousClass0Sf implements Parcelable, C146478mJ {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(84);
    public final AdditionalCandidates A00;
    public final SpriteSheetInfoCandidates A01;
    public final SpriteSheetInfoCandidates A02;
    public final Boolean A03;
    public final String A04;
    public final List A05;

    public final ImageInfo D4s() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImageInfo) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (!C04220Ms.A0I(this.A00, imageInfo.A00) || !C04220Ms.A0I(this.A01, imageInfo.A01) || !C04220Ms.A0I(this.A05, imageInfo.A05) || !C04220Ms.A0I(this.A02, imageInfo.A02) || !C04220Ms.A0I(this.A03, imageInfo.A03) || !C04220Ms.A0I(this.A04, imageInfo.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        AdditionalCandidates additionalCandidates = this.A00;
        if (additionalCandidates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalCandidates.writeToParcel(parcel, i);
        }
        SpriteSheetInfoCandidates spriteSheetInfoCandidates = this.A01;
        if (spriteSheetInfoCandidates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spriteSheetInfoCandidates.writeToParcel(parcel, i);
        }
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0v = C18200wM.A0v(parcel, list);
            while (A0v.hasNext()) {
                ((ExtendedImageUrl) A0v.next()).writeToParcel(parcel, i);
            }
        }
        SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = this.A02;
        if (spriteSheetInfoCandidates2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spriteSheetInfoCandidates2.writeToParcel(parcel, i);
        }
        C18190wL.A14(parcel, this.A03);
        parcel.writeString(this.A04);
    }

    public final /* bridge */ /* synthetic */ C144758jE APW() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C144768jF AQk() {
        return this.A01;
    }

    public final List AWI() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ C144768jF B9A() {
        return this.A02;
    }

    public final Boolean BCS() {
        return this.A03;
    }

    public final String BHl() {
        return null;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A09(this.A04);
    }

    public ImageInfo(AdditionalCandidates additionalCandidates, SpriteSheetInfoCandidates spriteSheetInfoCandidates, SpriteSheetInfoCandidates spriteSheetInfoCandidates2, Boolean bool, String str, List list) {
        this.A00 = additionalCandidates;
        this.A01 = spriteSheetInfoCandidates;
        this.A05 = list;
        this.A02 = spriteSheetInfoCandidates2;
        this.A03 = bool;
        this.A04 = str;
    }
}
