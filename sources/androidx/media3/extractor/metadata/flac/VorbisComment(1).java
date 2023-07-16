package androidx.media3.extractor.metadata.flac;

import X.AnonymousClass00U;
import X.C18210wN;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(24);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (!this.A00.equals(vorbisComment.A00) || !this.A01.equals(vorbisComment.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18210wN.A00(this.A00.hashCode()));
    }

    public final String toString() {
        return AnonymousClass00U.A0d("VC: ", this.A00, "=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public VorbisComment(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
