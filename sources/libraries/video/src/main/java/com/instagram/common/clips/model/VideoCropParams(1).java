package libraries.video.src.main.java.com.instagram.common.clips.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C122307Mi;
import X.C18190wL;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public final class VideoCropParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C122307Mi();
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoCropParams) {
                VideoCropParams videoCropParams = (VideoCropParams) obj;
                if (!(this.A03 == videoCropParams.A03 && Float.compare(this.A00, videoCropParams.A00) == 0 && Float.compare(this.A02, videoCropParams.A02) == 0 && Float.compare(this.A01, videoCropParams.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C86104wH.A05(this.A03 * 31, this.A00), this.A02), this.A01);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("VideoCropParams(timestampMs=");
        A0s.append(this.A03);
        A0s.append(", leftPercent=");
        A0s.append(this.A00);
        A0s.append(", topPercent=");
        A0s.append(this.A02);
        A0s.append(", scale=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public VideoCropParams(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
    }
}
