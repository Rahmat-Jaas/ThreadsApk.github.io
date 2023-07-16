package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass69R;
import X.C04220Ms;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class EcpUIConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(26);
    public final AuthScreenStyle A00;
    public final AnonymousClass69R A01;
    public final AnonymousClass69R A02;
    public final AnonymousClass69R A03;
    public final AnonymousClass69R A04;
    public final AnonymousClass69R A05;
    public final AnonymousClass69R A06;
    public final AnonymousClass69R A07;
    public final EcpNuxLearnMoreScreenStyle A08;
    public final ItemDetails A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A04);
        C86104wH.A1B(parcel, this.A02);
        C86104wH.A1B(parcel, this.A05);
        C86104wH.A1B(parcel, this.A06);
        C86104wH.A1B(parcel, this.A01);
        C86104wH.A1B(parcel, this.A07);
        this.A09.writeToParcel(parcel, i);
        AuthScreenStyle authScreenStyle = this.A00;
        if (authScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authScreenStyle.writeToParcel(parcel, i);
        }
        EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle = this.A08;
        if (ecpNuxLearnMoreScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ecpNuxLearnMoreScreenStyle.writeToParcel(parcel, i);
        }
        C86104wH.A1B(parcel, this.A03);
    }

    public EcpUIConfiguration(AuthScreenStyle authScreenStyle, AnonymousClass69R r3, AnonymousClass69R r4, AnonymousClass69R r5, AnonymousClass69R r6, AnonymousClass69R r7, AnonymousClass69R r8, AnonymousClass69R r9, EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle, ItemDetails itemDetails) {
        AnonymousClass0wJ.A1O(r3, r4);
        AnonymousClass0wJ.A1R(r5, r6);
        C04220Ms.A0B(r7, 5);
        C86104wH.A1P(r8, 6, itemDetails);
        C04220Ms.A0B(r9, 10);
        this.A04 = r3;
        this.A02 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A01 = r7;
        this.A07 = r8;
        this.A09 = itemDetails;
        this.A00 = authScreenStyle;
        this.A08 = ecpNuxLearnMoreScreenStyle;
        this.A03 = r9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EcpUIConfiguration() {
        /*
            r11 = this;
            r1 = 0
            X.69R r2 = X.AnonymousClass69R.A0C
            X.69R r3 = X.AnonymousClass69R.A0A
            X.69R r4 = X.AnonymousClass69R.A0D
            X.69R r5 = X.AnonymousClass69R.A0E
            X.69R r6 = X.AnonymousClass69R.A09
            X.69R r7 = X.AnonymousClass69R.A0Z
            java.lang.Integer r0 = X.AnonymousClass006.A00
            com.facebookpay.expresscheckout.models.ItemDetails r10 = new com.facebookpay.expresscheckout.models.ItemDetails
            r10.<init>(r0, r1)
            r0 = r11
            r8 = r2
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.models.EcpUIConfiguration.<init>():void");
    }
}
