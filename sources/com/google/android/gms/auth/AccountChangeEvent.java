package com.google.android.gms.auth;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(94);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AccountChangeEvent) {
                AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
                if (!(this.A00 == accountChangeEvent.A00 && this.A03 == accountChangeEvent.A03 && C117046y2.A01(this.A04, accountChangeEvent.A04) && this.A01 == accountChangeEvent.A01 && this.A02 == accountChangeEvent.A02 && C117046y2.A01(this.A05, accountChangeEvent.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A03), this.A04, Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A05});
    }

    public final String toString() {
        String str;
        int i = this.A01;
        if (i == 1) {
            str = "ADDED";
        } else if (i == 2) {
            str = "REMOVED";
        } else if (i == 3) {
            str = "RENAMED_FROM";
        } else if (i != 4) {
            str = "UNKNOWN";
        } else {
            str = "RENAMED_TO";
        }
        String str2 = this.A04;
        String str3 = this.A05;
        int i2 = this.A02;
        StringBuilder A0s = C86114wI.A0s(C86154wM.A06(str, C86104wH.A0A(str2) + 91) + C86104wH.A0A(str3));
        A0s.append("AccountChangeEvent {accountName = ");
        A0s.append(str2);
        A0s.append(", changeType = ");
        A0s.append(str);
        A0s.append(", changeData = ");
        A0s.append(str3);
        A0s.append(", eventIndex = ");
        A0s.append(i2);
        return C18180wK.A0i("}", A0s);
    }

    public AccountChangeEvent(String str, String str2, int i, int i2, int i3, long j) {
        this.A00 = i;
        this.A03 = j;
        C13320nQ.A01(str);
        this.A04 = str;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A09(parcel, 2, this.A03);
        C122167Ky.A0H(parcel, this.A04, 3, false);
        C122167Ky.A08(parcel, 4, this.A01);
        C122167Ky.A08(parcel, 5, this.A02);
        C122167Ky.A0H(parcel, this.A05, 6, false);
        C122167Ky.A05(parcel, A002);
    }
}
