package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.6ug  reason: invalid class name and case insensitive filesystem */
public final class C115206ug {
    public final int A00;
    public final int A01;
    public final C1188372l A02;
    public final C134817yQ A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115206ug) {
                C115206ug r5 = (C115206ug) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01 || !C04220Ms.A0I(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass0wJ.A05(this.A03, AnonymousClass0wJ.A03(this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + C18200wM.A07(this.A04);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A0s = C18190wL.A0s("TypefaceRequest(fontFamily=");
        A0s.append(this.A02);
        A0s.append(", fontWeight=");
        A0s.append(this.A03);
        A0s.append(", fontStyle=");
        int i = this.A00;
        if (i == 0) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        } else if (i == 1) {
            str = "Italic";
        } else {
            str = "Invalid";
        }
        A0s.append(str);
        A0s.append(", fontSynthesis=");
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = CameraRollManager.ASSET_TYPE_ALL;
        } else if (i2 == 2) {
            str2 = "Weight";
        } else if (i2 == 3) {
            str2 = "Style";
        } else {
            str2 = "Invalid";
        }
        A0s.append(str2);
        A0s.append(", resourceLoaderCacheKey=");
        return C86104wH.A0y(this.A04, A0s);
    }

    public C115206ug(C1188372l r1, C134817yQ r2, Object obj, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj;
    }
}
