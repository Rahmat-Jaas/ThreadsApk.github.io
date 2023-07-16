package com.facebookpay.common.recyclerview.adapteritems;

import X.AnonymousClass0wJ;
import X.AnonymousClass67L;
import X.AnonymousClass69U;
import X.AnonymousClass69W;
import X.C04220Ms;
import X.C116826xc;
import X.C148488rA;
import X.C18180wK;
import X.C40307LcE;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.impls.CardVerificationFieldsImpl;

public final class SelectionPaymentMethodItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(94);
    public CardVerificationFieldsImpl A00;
    public AnonymousClass67L A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final C148488rA A07;
    public final C40307LcE A08;
    public final AnonymousClass69W A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final AnonymousClass69U A0J;
    public final boolean A0K;

    public final void Cpe(Integer num) {
        C04220Ms.A0B(num, 0);
        this.A03 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A0J);
        parcel.writeString(C116826xc.A01(this.A03));
        parcel.writeString(this.A0E);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        AnonymousClass67L r0 = this.A01;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r0);
        }
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeValue(this.A07);
        AnonymousClass69W r02 = this.A09;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r02);
        }
        parcel.writeString(this.A0B);
        C18180wK.A0y(parcel, this.A02, 0, 1);
        parcel.writeValue(this.A00);
        C86104wH.A1B(parcel, this.A08);
        parcel.writeString(this.A0C);
        C18180wK.A0y(parcel, this.A0A, 0, 1);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
    }

    public final AnonymousClass69U AqR() {
        return this.A0J;
    }

    public final Integer BA9() {
        return this.A03;
    }

    public final String getId() {
        return this.A0E;
    }

    public SelectionPaymentMethodItem(CardVerificationFieldsImpl cardVerificationFieldsImpl, AnonymousClass69U r4, C148488rA r5, C40307LcE lcE, AnonymousClass67L r7, AnonymousClass69W r8, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        AnonymousClass0wJ.A1O(r4, num);
        AnonymousClass0wJ.A1R(str, str2);
        C04220Ms.A0B(str3, 5);
        C04220Ms.A0B(lcE, 14);
        String str10 = str7;
        C04220Ms.A0B(str10, 15);
        this.A0J = r4;
        this.A03 = num;
        this.A0E = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = r7;
        this.A0H = str4;
        this.A0D = str5;
        this.A07 = r5;
        this.A09 = r8;
        this.A0B = str6;
        this.A02 = num2;
        this.A00 = cardVerificationFieldsImpl;
        this.A08 = lcE;
        this.A0C = str10;
        this.A0A = num3;
        this.A06 = z;
        this.A0I = z2;
        this.A0K = z3;
        this.A0F = str8;
        this.A0G = str9;
    }
}
