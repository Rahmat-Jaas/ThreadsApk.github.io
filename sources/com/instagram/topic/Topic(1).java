package com.instagram.topic;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C144978jb;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public final class Topic extends AnonymousClass0Sf implements Parcelable, C144978jb {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(40);
    public final String A00;
    public final String A01;

    public Topic(String str, String str2) {
        C04220Ms.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final Topic D7D() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Topic) {
                Topic topic = (Topic) obj;
                if (!C04220Ms.A0I(this.A00, topic.A00) || !C04220Ms.A0I(this.A01, topic.A01)) {
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
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, AnonymousClass0wJ.A06(this.A00) * 31);
    }
}
