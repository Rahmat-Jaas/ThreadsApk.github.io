package androidx.media3.extractor.metadata.vorbis;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(48);

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
