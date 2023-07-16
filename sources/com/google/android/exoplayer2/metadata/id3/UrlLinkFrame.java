package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass00U;
import X.C18210wN;
import X.C18220wO;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(43);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            if (!this.A00.equals(urlLinkFrame.A00) || !Util.A0C(this.A00, urlLinkFrame.A00) || !Util.A0C(this.A01, urlLinkFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A002 = (C18210wN.A00(this.A00.hashCode()) + C18220wO.A07(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }

    public final String toString() {
        return AnonymousClass00U.A0V(this.A00, ": url=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
