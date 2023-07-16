package com.facebook.video.common.playerorigin;

import X.AnonymousClass7CU;
import X.C32572Cj;
import X.C35372Ita;
import X.C86124wJ;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;

public class PlayerOrigin implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(21);
    public String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerOrigin)) {
            return false;
        }
        PlayerOrigin playerOrigin = (PlayerOrigin) obj;
        return C32572Cj.A00(this.A01, playerOrigin.A01) && C32572Cj.A00(this.A02, playerOrigin.A02);
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A01, this.A02);
    }

    public final String toString() {
        String str = this.A00;
        if (str == null) {
            String str2 = this.A02;
            boolean A002 = AnonymousClass7CU.A00(str2);
            str = this.A01;
            if (!A002) {
                str = StringFormatUtil.formatStrLocaleSafe("%s::%s", str, str2);
            }
            this.A00 = str;
        }
        return str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public PlayerOrigin(Parcel parcel) {
        C35372Ita ita;
        String readString = parcel.readString();
        if (readString != null) {
            C35372Ita[] values = C35372Ita.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ita = values[i];
                if (ita.toString().equals(readString.toLowerCase())) {
                    break;
                }
                i++;
            }
            this.A01 = ita.A00;
            this.A02 = parcel.readString();
        }
        ita = C35372Ita.A02;
        this.A01 = ita.A00;
        this.A02 = parcel.readString();
    }
}
