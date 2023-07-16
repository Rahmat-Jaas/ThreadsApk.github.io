package com.fbpay.logging;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C122037Js;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FBPayLoggerData implements Parcelable {
    public static volatile String A09;
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(12);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set A08;

    public FBPayLoggerData(String str, String str2, String str3, String str4, String str5, String str6, Set set) {
        this.A05 = null;
        this.A00 = str;
        this.A01 = str2;
        this.A06 = null;
        this.A02 = str3;
        this.A03 = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayLoggerData) {
                FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) obj;
                if (!AnonymousClass3ZT.A03(this.A05, fBPayLoggerData.A05) || !AnonymousClass3ZT.A03(this.A00, fBPayLoggerData.A00) || !AnonymousClass3ZT.A03(this.A01, fBPayLoggerData.A01) || !AnonymousClass3ZT.A03(this.A06, fBPayLoggerData.A06) || !AnonymousClass3ZT.A03(this.A02, fBPayLoggerData.A02) || !AnonymousClass3ZT.A03(this.A03, fBPayLoggerData.A03) || !AnonymousClass3ZT.A03(A00(), fBPayLoggerData.A00()) || !AnonymousClass3ZT.A03(this.A04, fBPayLoggerData.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        if (this.A08.contains("sessionId")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = C122037Js.A01();
                }
            }
        }
        return A09;
    }

    public final int hashCode() {
        return (((((((((((((C86124wJ.A0E(this.A05) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(A00())) * 31) + AnonymousClass0wJ.A03(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A05, 0, 1);
        C18190wL.A16(parcel, this.A00, 0, 1);
        C18190wL.A16(parcel, this.A01, 0, 1);
        C18190wL.A16(parcel, this.A06, 0, 1);
        C18190wL.A16(parcel, this.A02, 0, 1);
        C18190wL.A16(parcel, this.A03, 0, 1);
        C18190wL.A16(parcel, this.A07, 0, 1);
        C18190wL.A16(parcel, this.A04, 0, 1);
        Iterator A11 = C86124wJ.A11(parcel, this.A08);
        while (A11.hasNext()) {
            parcel.writeString(C18180wK.A0k(A11));
        }
    }

    public FBPayLoggerData(Parcel parcel) {
        String str = null;
        if (C86114wI.A08(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A07 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C86114wI.A0l(parcel);
        HashSet A0u = C18200wM.A0u();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0u.add(parcel.readString());
        }
        this.A08 = Collections.unmodifiableSet(A0u);
    }
}
