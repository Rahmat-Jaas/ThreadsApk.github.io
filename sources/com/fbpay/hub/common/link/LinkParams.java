package com.fbpay.hub.common.link;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C1196376f;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class LinkParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(93);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public LinkParams(String str, int i, String str2) {
        this.A00 = 0;
        this.A01 = i;
        this.A02 = 0;
        AnonymousClass3ZT.A02(str, "token");
        this.A03 = str;
        AnonymousClass3ZT.A02(str2, "url");
        this.A04 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkParams) {
                LinkParams linkParams = (LinkParams) obj;
                if (!(this.A00 == linkParams.A00 && this.A01 == linkParams.A01 && this.A02 == linkParams.A02 && AnonymousClass3ZT.A03(this.A03, linkParams.A03) && AnonymousClass3ZT.A03(this.A04, linkParams.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public LinkParams(C1196376f r3) {
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        String str = r3.A03;
        AnonymousClass3ZT.A02(str, "token");
        this.A03 = str;
        String str2 = r3.A04;
        AnonymousClass3ZT.A02(str2, "url");
        this.A04 = str2;
    }

    public LinkParams(Parcel parcel) {
        this.A00 = C86114wI.A08(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
    }
}
