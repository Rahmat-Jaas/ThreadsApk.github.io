package com.facebook.ui.emoji.model;

import X.C18210wN;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;

public class DrawableBackedEmoji extends Emoji {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(18);
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableBackedEmoji)) {
            return false;
        }
        DrawableBackedEmoji drawableBackedEmoji = (DrawableBackedEmoji) obj;
        return this.A00 == drawableBackedEmoji.A00 && this.A01.equals(drawableBackedEmoji.A01);
    }

    public final String A01() {
        return this.A01;
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, this.A00 * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public DrawableBackedEmoji(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }
}
