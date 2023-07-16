package com.instagram.bugreporter;

import X.AnonymousClass0wJ;
import X.AnonymousClass25S;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class BugReport implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(93);
    public final AnonymousClass25S A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final ArrayList A0A;
    public final ArrayList A0B;
    public final HashMap A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A0B);
        parcel.writeStringList(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00.name());
        HashMap hashMap = this.A0C;
        parcel.writeInt(hashMap.size());
        Iterator A0u = C18190wL.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0u);
            parcel.writeString(C18200wM.A0p(A0o));
            parcel.writeString(C18230wP.A0u(A0o));
        }
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
    }

    public BugReport(AnonymousClass25S r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap, boolean z, boolean z2) {
        AnonymousClass0wJ.A1R(arrayList, arrayList2);
        C04220Ms.A0B(r2, 9);
        this.A05 = str;
        this.A02 = str2;
        this.A0B = arrayList;
        this.A0A = arrayList2;
        this.A03 = str3;
        this.A04 = str4;
        this.A09 = str5;
        this.A01 = str6;
        this.A00 = r2;
        this.A0C = hashMap;
        this.A06 = str7;
        this.A0D = z;
        this.A0E = z2;
        this.A08 = str8;
        this.A07 = str9;
    }
}
