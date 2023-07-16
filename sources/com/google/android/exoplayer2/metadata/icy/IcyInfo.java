package com.google.android.exoplayer2.metadata.icy;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(32);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ byte[] BMK() {
        return null;
    }

    public final /* synthetic */ Format BML() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Util.A0C(this.A00, ((IcyInfo) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata=\"%s\"", new Object[]{this.A01, this.A02, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public IcyInfo(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public IcyInfo(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A00 = readString;
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
