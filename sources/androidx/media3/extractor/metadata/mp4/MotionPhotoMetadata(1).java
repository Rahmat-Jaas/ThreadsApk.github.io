package androidx.media3.extractor.metadata.mp4;

import X.C18190wL;
import X.C18210wN;
import X.C86104wH;
import X.C86124wJ;
import X.C86134wK;
import X.C86154wM;
import X.I17;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(39);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (!(this.A02 == motionPhotoMetadata.A02 && this.A01 == motionPhotoMetadata.A01 && this.A00 == motionPhotoMetadata.A00 && this.A04 == motionPhotoMetadata.A04 && this.A03 == motionPhotoMetadata.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        return C86134wK.A06(C86104wH.A06(C86104wH.A06(C86104wH.A06(C18210wN.A00((int) (j ^ (j >>> 32))), this.A01), this.A00), this.A04), this.A03);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Motion photo metadata: photoStartPosition=");
        A0s.append(this.A02);
        A0s.append(", photoSize=");
        A0s.append(this.A01);
        A0s.append(", photoPresentationTimestampUs=");
        A0s.append(this.A00);
        A0s.append(", videoStartPosition=");
        A0s.append(this.A04);
        A0s.append(I17.A00(344));
        return C86154wM.A0n(A0s, this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.A02 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }
}
