package com.instagram.model.business;

import X.AnonymousClass266;
import X.C18180wK;
import X.C62163Xl;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public class BusinessInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(44);
    public Address A00;
    public PublicPhoneContact A01;
    public AnonymousClass266 A02;
    public AnonymousClass266 A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0L);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
        parcel.writeByte(this.A0O ? (byte) 1 : 0);
        AnonymousClass266 r1 = this.A02;
        String str2 = null;
        if (r1 != null) {
            str = String.valueOf(r1.A00);
        } else {
            str = null;
        }
        parcel.writeString(str);
        AnonymousClass266 r12 = this.A03;
        if (r12 != null) {
            str2 = String.valueOf(r12.A00);
        }
        parcel.writeString(str2);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0H);
    }

    public BusinessInfo(Parcel parcel) {
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A01 = (PublicPhoneContact) C18180wK.A0A(parcel, PublicPhoneContact.class);
        this.A0J = parcel.readString();
        this.A0L = parcel.readString();
        this.A00 = (Address) C18180wK.A0A(parcel, Address.class);
        this.A0K = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        this.A0E = parcel.readString();
        this.A0F = parcel.readString();
        boolean z = true;
        this.A0M = C18180wK.A1V(parcel.readByte());
        this.A0P = C18180wK.A1Y(parcel);
        this.A0R = C18180wK.A1Y(parcel);
        this.A0Q = C18180wK.A1Y(parcel);
        this.A0N = C18180wK.A1Y(parcel);
        this.A0O = parcel.readByte() == 0 ? false : z;
        String readString = parcel.readString();
        if (readString != null) {
            this.A02 = AnonymousClass266.A00(Integer.parseInt(readString));
        }
        String readString2 = parcel.readString();
        if (readString2 != null) {
            this.A03 = AnonymousClass266.A00(Integer.parseInt(readString2));
        }
        this.A0G = parcel.readString();
        this.A0I = parcel.readString();
        this.A0H = parcel.readString();
    }

    public BusinessInfo(C62163Xl r2) {
        this.A09 = r2.A09;
        this.A0A = r2.A0A;
        this.A0B = r2.A0B;
        this.A01 = r2.A01;
        this.A0J = r2.A0J;
        this.A0L = r2.A0L;
        this.A00 = r2.A00;
        this.A0K = r2.A0K;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A06 = r2.A06;
        this.A07 = r2.A07;
        this.A08 = r2.A08;
        this.A0M = r2.A0M;
        this.A0C = r2.A0C;
        this.A0D = r2.A0D;
        this.A0E = r2.A0E;
        this.A0F = r2.A0F;
        this.A0P = r2.A0P;
        this.A0R = r2.A0R;
        this.A0Q = r2.A0Q;
        this.A0N = r2.A0N;
        this.A0O = r2.A0O;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A0G = r2.A0G;
        this.A0I = r2.A0I;
        this.A0H = r2.A0H;
    }
}
