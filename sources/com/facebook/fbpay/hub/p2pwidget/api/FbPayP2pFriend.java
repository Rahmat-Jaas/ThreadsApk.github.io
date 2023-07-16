package com.facebook.fbpay.hub.p2pwidget.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18190wL;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class FbPayP2pFriend implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(75);
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pFriend) {
                FbPayP2pFriend fbPayP2pFriend = (FbPayP2pFriend) obj;
                if (!AnonymousClass3ZT.A03(this.A03, fbPayP2pFriend.A03) || !AnonymousClass3ZT.A03(this.A04, fbPayP2pFriend.A04) || !AnonymousClass3ZT.A03(this.A05, fbPayP2pFriend.A05) || !AnonymousClass3ZT.A03(this.A00, fbPayP2pFriend.A00) || !AnonymousClass3ZT.A03(this.A01, fbPayP2pFriend.A01) || !AnonymousClass3ZT.A03(this.A02, fbPayP2pFriend.A02) || !AnonymousClass3ZT.A03(this.A06, fbPayP2pFriend.A06) || !AnonymousClass3ZT.A03(this.A07, fbPayP2pFriend.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((AnonymousClass0wJ.A03(this.A03) + 31) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A07);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A03, 0, 1);
        C18190wL.A16(parcel, this.A04, 0, 1);
        C18190wL.A16(parcel, this.A05, 0, 1);
        Uri uri = this.A00;
        if (uri == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uri.writeToParcel(parcel, i);
        }
        Uri uri2 = this.A01;
        if (uri2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uri2.writeToParcel(parcel, i);
        }
        Uri uri3 = this.A02;
        if (uri3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uri3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    public FbPayP2pFriend(Parcel parcel) {
        getClass().getClassLoader();
        Uri uri = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) Uri.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) Uri.CREATOR.createFromParcel(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : uri;
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
    }
}
