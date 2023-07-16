package com.fbpay.hub.form.params;

import X.AnonymousClass0wJ;
import X.AnonymousClass7EL;
import X.C18180wK;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

public class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(97);
    public FormDialogParams A00;
    public FormLogEvents A01;
    public FBPayLoggerData A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public FormParams(FormLogEvents formLogEvents, FBPayLoggerData fBPayLoggerData, ImmutableList immutableList, String str) {
        this.A04 = 1;
        this.A07 = immutableList;
        this.A06 = 0;
        this.A0A = str;
        this.A08 = null;
        this.A05 = 0;
        this.A0B = false;
        this.A02 = fBPayLoggerData;
        this.A01 = formLogEvents;
        this.A00 = null;
        this.A09 = null;
        this.A03 = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeList(this.A07);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
    }

    public FormParams(Parcel parcel) {
        this.A04 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0A = parcel.readString();
        this.A08 = parcel.readString();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C86134wK.A17(parcel, CellParams.class, A0v);
        this.A07 = ImmutableList.copyOf((Collection) A0v);
        this.A05 = parcel.readInt();
        this.A0B = C18180wK.A1V(parcel.readByte());
        this.A02 = (FBPayLoggerData) C18180wK.A0A(parcel, FBPayLoggerData.class);
        this.A01 = (FormLogEvents) C18180wK.A0A(parcel, FormLogEvents.class);
        this.A00 = (FormDialogParams) C18180wK.A0A(parcel, FormDialogParams.class);
        this.A09 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public FormParams(AnonymousClass7EL r3) {
        this.A04 = r3.A06;
        this.A07 = r3.A03;
        this.A06 = r3.A08;
        this.A0A = r3.A0B;
        String str = r3.A0A;
        this.A08 = str;
        this.A05 = r3.A07;
        this.A0B = true;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A09 = r3.A05;
        String str2 = r3.A04;
        this.A03 = str2 == null ? str : str2;
    }
}
