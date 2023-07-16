package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass00U;
import X.C18210wN;
import X.C18220wO;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(37);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CommentFrame commentFrame = (CommentFrame) obj;
            if (!Util.A0C(this.A00, commentFrame.A00) || !Util.A0C(this.A01, commentFrame.A01) || !Util.A0C(this.A02, commentFrame.A02)) {
                return false;
            }
        }
        return true;
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final int hashCode() {
        int i = 0;
        int A002 = (C18210wN.A00(C18220wO.A07(this.A01)) + C18220wO.A07(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }

    public final String toString() {
        return AnonymousClass00U.A0h(this.A00, ": language=", this.A01, ", description=", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
