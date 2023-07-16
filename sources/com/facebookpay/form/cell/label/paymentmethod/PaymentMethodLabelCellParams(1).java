package com.facebookpay.form.cell.label.paymentmethod;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.label.LabelCellParams;
import java.util.Iterator;
import java.util.List;

public final class PaymentMethodLabelCellParams extends LabelCellParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(51);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final List A05;

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        Iterator A0v = C18200wM.A0v(parcel, this.A05);
        while (A0v.hasNext()) {
            parcel.writeInt(AnonymousClass0wJ.A04(A0v.next()));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentMethodLabelCellParams(java.util.List r3, int r4, int r5, int r6, int r7, int r8) {
        /*
            r2 = this;
            X.5h0 r1 = new X.5h0
            r1.<init>(r4)
            r1.A03 = r5
            r1.A02 = r8
            r0 = 1
            r1.A07 = r0
            r2.<init>((X.C91885h0) r1)
            r2.A01 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A00 = r7
            r2.A02 = r8
            r2.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams.<init>(java.util.List, int, int, int, int, int):void");
    }
}
