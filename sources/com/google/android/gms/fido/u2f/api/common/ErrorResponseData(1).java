package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass5q5;
import X.C113686ry;
import X.C117046y2;
import X.C122167Ky;
import X.C18210wN;
import X.C86124wJ;
import X.C97796Cu;
import android.os.Parcel;
import android.os.Parcelable;

public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(76);
    public final ErrorCode A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (C117046y2.A01(this.A00, errorResponseData.A00)) {
            return C117046y2.A00(this.A01, errorResponseData.A01);
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A00, this.A01);
    }

    public ErrorResponseData(int i, String str) {
        ErrorCode errorCode;
        ErrorCode[] values = ErrorCode.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                errorCode = ErrorCode.OTHER_ERROR;
                break;
            }
            errorCode = values[i2];
            if (i == errorCode.A00) {
                break;
            }
            i2++;
        }
        this.A00 = errorCode;
        this.A01 = str;
    }

    public final String toString() {
        C113686ry r4 = new C113686ry(C18210wN.A0e(this));
        String valueOf = String.valueOf(this.A00.A00);
        AnonymousClass5q5 r1 = new AnonymousClass5q5((C97796Cu) null);
        r4.A00.A00 = r1;
        r4.A00 = r1;
        r1.A01 = valueOf;
        r1.A02 = "errorCode";
        String str = this.A01;
        if (str != null) {
            r4.A00(str, "errorMessage");
        }
        return r4.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 2, this.A00.A00);
        C122167Ky.A0H(parcel, this.A01, 3, false);
        C122167Ky.A05(parcel, A002);
    }
}
