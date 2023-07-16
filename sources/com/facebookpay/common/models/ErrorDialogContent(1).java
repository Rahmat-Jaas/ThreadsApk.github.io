package com.facebookpay.common.models;

import X.AnonymousClass0wJ;
import X.AnonymousClass67N;
import X.AnonymousClass6I1;
import X.C04220Ms;
import X.C108816iz;
import X.C18180wK;
import X.C86104wH;
import X.C86144wL;
import X.C973368y;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public final class ErrorDialogContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(62);
    public final C108816iz A00;
    public final C108816iz A01;
    public final Integer A02;
    public final Integer A03;
    public final C973368y A04;
    public final C973368y A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        C18180wK.A0y(parcel, this.A07, 0, 1);
        C18180wK.A0y(parcel, this.A06, 0, 1);
        C973368y r0 = this.A04;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r0);
        }
        C973368y r02 = this.A05;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C86104wH.A1B(parcel, r02);
        }
        C18180wK.A0y(parcel, this.A02, 0, 1);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(AnonymousClass6I1.A00(num));
    }

    public final AnonymousClass67N A00() {
        AnonymousClass67N r0;
        C108816iz r02 = this.A00;
        if (r02 != null) {
            return r02.A00;
        }
        C973368y r03 = this.A04;
        if (r03 != null && (r0 = r03.A01) != null) {
            return r0;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final AnonymousClass67N A01() {
        C108816iz r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        C973368y r02 = this.A05;
        if (r02 != null) {
            return r02.A01;
        }
        return null;
    }

    public final String A02(Context context) {
        String str = this.A08;
        if (str != null) {
            return str;
        }
        Integer num = this.A06;
        if (num != null) {
            return AnonymousClass0wJ.A0k(context, num.intValue());
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String A03(Context context) {
        C108816iz r0 = this.A00;
        if (r0 != null) {
            return r0.A01;
        }
        C973368y r02 = this.A04;
        if (r02 != null) {
            int i = r02.A00;
            if (Integer.valueOf(i) != null) {
                return AnonymousClass0wJ.A0k(context, i);
            }
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String A04(Context context) {
        C108816iz r0 = this.A01;
        if (r0 != null) {
            return r0.A01;
        }
        C973368y r02 = this.A05;
        if (r02 == null) {
            return null;
        }
        int i = r02.A00;
        if (Integer.valueOf(i) != null) {
            return context.getString(i);
        }
        return null;
    }

    public final String A05(Context context) {
        String str = this.A09;
        if (str != null) {
            return str;
        }
        Integer num = this.A07;
        if (num != null) {
            return AnonymousClass0wJ.A0k(context, num.intValue());
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final boolean A06() {
        AnonymousClass67N r1;
        C108816iz r0 = this.A00;
        if (r0 != null) {
            r1 = r0.A00;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass67N.DISMISS_AND_CLOSE || this.A04 == C973368y.A04) {
            return true;
        }
        return false;
    }

    public ErrorDialogContent(C973368y r1, C973368y r2, C108816iz r3, C108816iz r4, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        this.A09 = str;
        this.A08 = str2;
        this.A00 = r3;
        this.A01 = r4;
        this.A07 = num;
        this.A06 = num2;
        this.A04 = r1;
        this.A05 = r2;
        this.A02 = num3;
        this.A03 = num4;
    }

    public ErrorDialogContent() {
        this((C973368y) null, (C973368y) null, (C108816iz) null, (C108816iz) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null);
    }
}
