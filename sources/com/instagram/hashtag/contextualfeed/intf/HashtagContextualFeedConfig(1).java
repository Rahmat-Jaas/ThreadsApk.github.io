package com.instagram.hashtag.contextualfeed.intf;

import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;

public class HashtagContextualFeedConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(88);
    public final EntityContextualFeedConfig A00;
    public final Hashtag A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public HashtagContextualFeedConfig(Parcel parcel) {
        this.A00 = (EntityContextualFeedConfig) C18180wK.A0A(parcel, EntityContextualFeedConfig.class);
        this.A01 = (Hashtag) C18180wK.A0A(parcel, Hashtag.class);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public HashtagContextualFeedConfig(EntityContextualFeedConfig entityContextualFeedConfig, Hashtag hashtag, String str, String str2) {
        this.A00 = entityContextualFeedConfig;
        this.A01 = hashtag;
        str.getClass();
        this.A02 = str;
        this.A03 = str2;
    }
}
