package com.facebookpay.form.cell.text;

import X.AnonymousClass006;
import X.C116916xl;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class TextValidatorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(58);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public TextValidatorParams(String str, int i, Integer num) {
        this.A02 = num;
        this.A04 = "";
        this.A03 = str;
        this.A01 = 0;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C116916xl.A01(this.A02));
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public TextValidatorParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        readString.getClass();
        if (readString.equals("MIN_LENGTH")) {
            num = AnonymousClass006.A00;
        } else if (readString.equals("MAX_LENGTH")) {
            num = AnonymousClass006.A01;
        } else if (readString.equals("EXACT_LENGTH")) {
            num = AnonymousClass006.A0C;
        } else if (readString.equals("REGEX")) {
            num = AnonymousClass006.A0N;
        } else if (readString.equals("EMPTY")) {
            num = AnonymousClass006.A0Y;
        } else if (readString.equals("US_STATE")) {
            num = AnonymousClass006.A0j;
        } else if (readString.equals("DATE")) {
            num = AnonymousClass006.A0u;
        } else if (readString.equals("CARD")) {
            num = AnonymousClass006.A15;
        } else if (readString.equals("CARD_TYPE")) {
            num = AnonymousClass006.A1C;
        } else if (readString.equals("PHONE")) {
            num = AnonymousClass006.A1L;
        } else {
            throw C18190wL.A0a(readString);
        }
        this.A02 = num;
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A04 = readString2;
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public TextValidatorParams(Integer num, String str, int i, int i2) {
        this.A02 = num;
        this.A04 = str;
        this.A03 = null;
        this.A01 = i;
        this.A00 = i2;
    }

    public TextValidatorParams(String str, Integer num, String str2) {
        this.A02 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = 0;
        this.A00 = 0;
    }
}
