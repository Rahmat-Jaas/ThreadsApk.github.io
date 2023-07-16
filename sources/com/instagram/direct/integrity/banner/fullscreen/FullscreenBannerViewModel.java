package com.instagram.direct.integrity.banner.fullscreen;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape11S0000000_I2_11;
import java.util.Iterator;
import java.util.List;

public final class FullscreenBannerViewModel extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape11S0000000_I2_11(69);
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final class SectionBulletPoint extends AnonymousClass0Sf implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape11S0000000_I2_11(70);
        public final String A00;
        public final String A01;
        public final String A02;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SectionBulletPoint) {
                    SectionBulletPoint sectionBulletPoint = (SectionBulletPoint) obj;
                    if (!C04220Ms.A0I(this.A00, sectionBulletPoint.A00) || !C04220Ms.A0I(this.A02, sectionBulletPoint.A02) || !C04220Ms.A0I(this.A01, sectionBulletPoint.A01)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C04220Ms.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeString(this.A02);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A00)) + AnonymousClass0wJ.A06(this.A01);
        }

        public final String toString() {
            StringBuilder A0s = C18190wL.A0s("SectionBulletPoint(iconURL=");
            A0s.append(this.A00);
            A0s.append(", text=");
            A0s.append(this.A02);
            A0s.append(", subtext=");
            A0s.append(this.A01);
            return AnonymousClass0wJ.A0u(A0s);
        }

        public SectionBulletPoint(String str, String str2, String str3) {
            AnonymousClass0wJ.A1O(str, str2);
            this.A00 = str;
            this.A02 = str2;
            this.A01 = str3;
        }
    }

    public FullscreenBannerViewModel() {
        this((String) null, (String) null, (String) null, AnonymousClass0ZV.A00);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FullscreenBannerViewModel) {
                FullscreenBannerViewModel fullscreenBannerViewModel = (FullscreenBannerViewModel) obj;
                if (!C04220Ms.A0I(this.A00, fullscreenBannerViewModel.A00) || !C04220Ms.A0I(this.A02, fullscreenBannerViewModel.A02) || !C04220Ms.A0I(this.A01, fullscreenBannerViewModel.A01) || !C04220Ms.A0I(this.A03, fullscreenBannerViewModel.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        Iterator A0v = C18200wM.A0v(parcel, this.A03);
        while (A0v.hasNext()) {
            ((SectionBulletPoint) A0v.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return C18220wO.A06(this.A03, ((((AnonymousClass0wJ.A06(this.A00) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A09(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FullscreenBannerViewModel(headlineImageURL=");
        A0s.append(this.A00);
        A0s.append(", headlineTitle=");
        A0s.append(this.A02);
        A0s.append(", headlineSubtitle=");
        A0s.append(this.A01);
        A0s.append(", descriptionSection=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public FullscreenBannerViewModel(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = list;
    }
}
