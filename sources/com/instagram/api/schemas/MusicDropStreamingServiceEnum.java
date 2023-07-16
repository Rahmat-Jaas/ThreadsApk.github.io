package com.instagram.api.schemas;

import X.AnonymousClass0wJ;
import X.AnonymousClass4WK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MusicDropStreamingServiceEnum implements Parcelable {
    UNRECOGNIZED("MusicDropStreamingServiceEnum_unspecified"),
    SMART_LINK("smart_link"),
    SPOTIFY("spotify"),
    APPLE_MUSIC("apple_music"),
    YOUTUBE_MUSIC("youtube_music"),
    MIXCLOUD("mixcloud"),
    AMAZON_MUSIC("amazon_music"),
    SOUNDCLOUD("soundcloud"),
    TIDAL("tidal"),
    DEEZER("deezer"),
    BEATPORT("beatport");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r4));
        for (MusicDropStreamingServiceEnum musicDropStreamingServiceEnum : values()) {
            A0v.put(musicDropStreamingServiceEnum.A00, musicDropStreamingServiceEnum);
        }
        A01 = A0v;
        CREATOR = new PCreatorCreatorShape8S0000000_I2_8(61);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MusicDropStreamingServiceEnum(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass0wJ.A15(parcel, this);
    }
}