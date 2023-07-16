package com.instagram.model.hashtag.response;

import X.AnonymousClass0wJ;
import X.AnonymousClass1j3;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.List;

public class HashtagCollection extends AnonymousClass1j3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(78);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeList(this.A00);
    }

    public HashtagCollection(Parcel parcel) {
        if (parcel.readByte() == 1) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            this.A00 = A0v;
            C86134wK.A17(parcel, Hashtag.class, A0v);
            return;
        }
        this.A00 = null;
    }

    public HashtagCollection() {
    }
}
