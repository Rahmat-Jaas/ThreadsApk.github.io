package android.support.v4.media;

import X.C013306f;
import X.C18220wO;
import X.C86124wJ;
import X.C86154wM;
import X.C97686Cj;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable {
    public static final C013306f A01;
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(2);
    public final Bundle A00;

    public final int describeContents() {
        return 0;
    }

    static {
        C013306f r3 = new C013306f();
        A01 = r3;
        r3.put("android.media.metadata.TITLE", 1);
        r3.put("android.media.metadata.ARTIST", 1);
        Integer A0d = C18220wO.A0d();
        r3.put("android.media.metadata.DURATION", A0d);
        r3.put("android.media.metadata.ALBUM", 1);
        r3.put("android.media.metadata.AUTHOR", 1);
        r3.put("android.media.metadata.WRITER", 1);
        r3.put("android.media.metadata.COMPOSER", 1);
        r3.put("android.media.metadata.COMPILATION", 1);
        r3.put("android.media.metadata.DATE", 1);
        r3.put("android.media.metadata.YEAR", A0d);
        r3.put("android.media.metadata.GENRE", 1);
        r3.put("android.media.metadata.TRACK_NUMBER", A0d);
        r3.put("android.media.metadata.NUM_TRACKS", A0d);
        r3.put("android.media.metadata.DISC_NUMBER", A0d);
        r3.put("android.media.metadata.ALBUM_ARTIST", 1);
        Integer A0X = C86154wM.A0X();
        r3.put("android.media.metadata.ART", A0X);
        r3.put("android.media.metadata.ART_URI", 1);
        r3.put("android.media.metadata.ALBUM_ART", A0X);
        r3.put("android.media.metadata.ALBUM_ART_URI", 1);
        r3.put("android.media.metadata.USER_RATING", 3);
        r3.put("android.media.metadata.RATING", 3);
        r3.put("android.media.metadata.DISPLAY_TITLE", 1);
        r3.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        r3.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        r3.put("android.media.metadata.DISPLAY_ICON", A0X);
        r3.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        r3.put("android.media.metadata.MEDIA_ID", 1);
        r3.put("android.media.metadata.BT_FOLDER_TYPE", A0d);
        r3.put("android.media.metadata.MEDIA_URI", 1);
        r3.put("android.media.metadata.ADVERTISEMENT", A0d);
        r3.put("android.media.metadata.DOWNLOAD_STATUS", A0d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A00 = parcel.readBundle(C97686Cj.class.getClassLoader());
    }
}
