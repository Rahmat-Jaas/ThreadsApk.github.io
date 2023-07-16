package com.facebookpay.form.cell.card;

import X.C91895h1;
import X.C92085ha;
import android.os.Parcel;
import com.facebookpay.form.cell.text.TextCellParams;
import com.google.common.collect.ImmutableList;

public class CardCellParams extends TextCellParams {
    public final int A00;
    public final ImmutableList A01;

    public CardCellParams(C92085ha r2) {
        super((C91895h1) r2);
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00);
    }
}
