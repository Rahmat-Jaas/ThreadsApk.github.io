package com.google.android.gms.common.api;

import X.C113596rm;
import X.C117046y2;
import X.C122167Ky;
import X.C82014ow;
import X.C86124wJ;
import X.C86154wM;
import X.C99296Iw;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Status extends AbstractSafeParcelable implements C82014ow, ReflectedParcelable {
    public static final Status A05 = new Status(16, (String) null);
    public static final Status A06 = new Status(18, (String) null);
    public static final Status A07 = new Status(8, (String) null);
    public static final Status A08 = new Status(14, (String) null);
    public static final Status A09 = new Status(0, (String) null);
    public static final Status A0A = new Status(15, (String) null);
    public static final Status A0B = new Status(17, (String) null);
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(1);
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final ConnectionResult A03;
    public final String A04;

    public Status(int i, String str) {
        this((PendingIntent) null, (ConnectionResult) null, str, 1, i);
    }

    public Status(PendingIntent pendingIntent, ConnectionResult connectionResult, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A02 = pendingIntent;
        this.A03 = connectionResult;
    }

    public final Status BDf() {
        return this;
    }

    public final void A00(Activity activity, int i) {
        PendingIntent pendingIntent = this.A02;
        if (pendingIntent != null) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.A00 != status.A00 || this.A01 != status.A01 || !C117046y2.A01(this.A04, status.A04) || !C117046y2.A01(this.A02, status.A02)) {
            return false;
        }
        return C117046y2.A00(this.A03, status.A03);
    }

    public final int hashCode() {
        return C86154wM.A05(Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A04, this.A02, this.A03);
    }

    public final String toString() {
        C113596rm r2 = new C113596rm(this);
        String str = this.A04;
        if (str == null) {
            str = C99296Iw.A00(this.A01);
        }
        r2.A00(str, "statusCode");
        r2.A00(this.A02, "resolution");
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A01);
        boolean A0S = C122167Ky.A0S(parcel, this.A04);
        C122167Ky.A0D(parcel, this.A02, 3, i, A0S);
        C122167Ky.A0D(parcel, this.A03, 4, i, A0S);
        C122167Ky.A07(parcel, this.A00, A002);
    }
}
