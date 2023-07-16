package com.facebook.smartcapture.capture;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18240wQ;
import X.C86144wL;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class DefaultEvidenceRecorderProvider implements SelfieEvidenceRecorderProvider {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(9);
    public int A00;
    public long A01;
    public RectF A02;
    public Integer A03;
    public String A04;
    public String A05;
    public final List A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        parcel.writeStringList(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03.intValue());
        parcel.writeParcelable(this.A02, i);
    }

    public DefaultEvidenceRecorderProvider(Parcel parcel) {
        this.A01 = 0;
        this.A00 = 224;
        this.A03 = AnonymousClass006.A00;
        this.A02 = null;
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A05 = parcel.readString();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A06 = A0v;
        parcel.readStringList(A0v);
        this.A00 = parcel.readInt();
        this.A03 = C18240wQ.A1Z()[parcel.readInt()];
        this.A02 = (RectF) C18180wK.A0A(parcel, RectF.class);
    }

    public DefaultEvidenceRecorderProvider() {
        this.A01 = 0;
        this.A00 = 224;
        this.A03 = AnonymousClass006.A00;
        this.A02 = null;
        this.A06 = AnonymousClass0wJ.A0v();
    }
}
