package com.facebookpay.form.cell.label;

import X.AnonymousClass0wJ;
import X.C110616lz;
import X.C86124wJ;
import X.C86134wK;
import X.C91885h0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Collection;

public class LabelCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(50);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final ImmutableList A07;
    public final String A08;

    public final int describeContents() {
        return 0;
    }

    public LabelCellParams(Parcel parcel) {
        super(parcel);
        this.A08 = parcel.readString();
        this.A03 = parcel.readInt();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C86134wK.A17(parcel, LinkParams.class, A0v);
        this.A07 = ImmutableList.copyOf((Collection) A0v);
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A03);
        parcel.writeList(this.A07);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A01);
    }

    public LabelCellParams(C91885h0 r3) {
        super((C110616lz) r3);
        this.A08 = null;
        this.A03 = r3.A03;
        this.A07 = r3.A06;
        this.A04 = r3.A07 ? R.layout.hub_cell_header : R.layout.hub_cell_label;
        this.A05 = r3.A04;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
        this.A06 = r3.A05;
        this.A01 = r3.A01;
    }
}
