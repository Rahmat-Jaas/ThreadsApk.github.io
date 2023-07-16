package com.facebookpay.form.cell.creditcard;

import X.AnonymousClass0wJ;
import X.AnonymousClass3JE;
import X.AnonymousClass67I;
import X.AnonymousClass69W;
import X.C110616lz;
import X.C18180wK;
import X.C86124wJ;
import X.C86134wK;
import X.C91865gy;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CreditCardCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(48);
    public boolean A00 = true;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AddressCellParams A04;
    public final AnonymousClass67I A05;
    public final AnonymousClass69W A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Map A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public final int describeContents() {
        return 0;
    }

    public CreditCardCellParams(Parcel parcel) {
        super(parcel);
        Enum valueOf;
        Enum valueOf2;
        this.A0B = parcel.readString();
        this.A0G = parcel.readString();
        this.A0F = parcel.readString();
        this.A0H = parcel.readString();
        this.A0C = parcel.readString();
        this.A0E = parcel.readString();
        this.A0D = parcel.readString();
        Class cls = AnonymousClass69W.class;
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = Enum.valueOf(cls, readString);
        }
        this.A06 = (AnonymousClass69W) valueOf;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C86134wK.A17(parcel, cls, A0v);
        this.A07 = ImmutableList.copyOf((Collection) A0v);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        C86134wK.A17(parcel, Integer.class, A0v2);
        this.A08 = ImmutableList.copyOf((Collection) A0v2);
        this.A0A = Boolean.valueOf(AnonymousClass3JE.A00(parcel));
        this.A09 = Boolean.valueOf(AnonymousClass3JE.A00(parcel));
        this.A00 = AnonymousClass3JE.A00(parcel);
        this.A0I = parcel.readHashMap(HashMap.class.getClassLoader());
        this.A02 = parcel.readInt();
        Class cls2 = AnonymousClass67I.class;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Enum.valueOf(cls2, readString2);
        }
        AnonymousClass67I r0 = (AnonymousClass67I) valueOf2;
        this.A05 = r0 == null ? AnonymousClass67I.NONE : r0;
        this.A0K = AnonymousClass3JE.A00(parcel);
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = (AddressCellParams) C18180wK.A0A(parcel, AddressCellParams.class);
        this.A0J = AnonymousClass3JE.A00(parcel);
        this.A0L = AnonymousClass3JE.A00(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String name;
        String name2;
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        AnonymousClass69W r0 = this.A06;
        if (r0 == null) {
            name = null;
        } else {
            name = r0.name();
        }
        parcel.writeString(name);
        parcel.writeList(this.A07);
        parcel.writeList(this.A08);
        parcel.writeInt(this.A0A.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A09.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeMap(this.A0I);
        parcel.writeInt(this.A02);
        AnonymousClass67I r02 = this.A05;
        if (r02 == null) {
            name2 = null;
        } else {
            name2 = r02.name();
        }
        parcel.writeString(name2);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
    }

    public CreditCardCellParams(C91865gy r2) {
        super((C110616lz) r2);
        this.A0B = r2.A0A;
        this.A0G = r2.A0F;
        this.A0F = r2.A0E;
        this.A0H = r2.A0G;
        this.A0C = r2.A0B;
        this.A0E = r2.A0D;
        this.A0D = r2.A0C;
        this.A06 = r2.A05;
        this.A07 = r2.A06;
        this.A08 = r2.A07;
        this.A0A = r2.A09;
        this.A09 = r2.A08;
        this.A00 = r2.A0L;
        this.A0I = r2.A0H;
        this.A02 = r2.A00;
        this.A05 = r2.A04;
        this.A0K = r2.A0J;
        this.A01 = r2.A02;
        this.A03 = r2.A01;
        this.A04 = r2.A03;
        this.A0J = r2.A0I;
        this.A0L = r2.A0K;
    }
}
