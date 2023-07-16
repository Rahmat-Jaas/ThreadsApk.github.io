package com.google.android.flexbox;

import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

public class FlexboxLayout$LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(56);
    public float A00 = -1.0f;
    public float A01;
    public float A02 = 1.0f;
    public int A03 = -1;
    public int A04 = 16777215;
    public int A05 = 16777215;
    public int A06;
    public int A07;
    public int A08 = 1;
    public boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlexboxLayout$LayoutParams(Parcel parcel) {
        super(0, 0);
        boolean z = false;
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A07 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readByte() != 0 ? true : z;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final int AQ6() {
        return this.A03;
    }

    public final float Aiu() {
        return this.A00;
    }

    public final float Aiv() {
        return this.A01;
    }

    public final float Aix() {
        return this.A02;
    }

    public final int AtP() {
        return this.bottomMargin;
    }

    public final int AtQ() {
        return this.leftMargin;
    }

    public final int AtR() {
        return this.rightMargin;
    }

    public final int AtS() {
        return this.topMargin;
    }

    public final int AtZ() {
        return this.A04;
    }

    public final int Atk() {
        return this.A05;
    }

    public final int Avi() {
        return this.A06;
    }

    public final int Avo() {
        return this.A07;
    }

    public final boolean BZy() {
        return this.A09;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
