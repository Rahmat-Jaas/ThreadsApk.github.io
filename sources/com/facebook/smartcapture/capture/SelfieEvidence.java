package com.facebook.smartcapture.capture;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C1366783w;
import X.C18180wK;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class SelfieEvidence implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(10);
    public final ImmutableList A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;

    public SelfieEvidence(ImmutableList immutableList, Float f, Integer num, Integer num2, Integer num3, Long l, String str, String str2) {
        this.A06 = str;
        this.A00 = immutableList;
        this.A02 = num;
        this.A01 = f;
        this.A03 = num2;
        this.A07 = str2;
        this.A05 = l;
        this.A04 = num3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelfieEvidence) {
                SelfieEvidence selfieEvidence = (SelfieEvidence) obj;
                if (!AnonymousClass3ZT.A03(this.A06, selfieEvidence.A06) || !AnonymousClass3ZT.A03(this.A00, selfieEvidence.A00) || !AnonymousClass3ZT.A03(this.A02, selfieEvidence.A02) || !AnonymousClass3ZT.A03(this.A01, selfieEvidence.A01) || !AnonymousClass3ZT.A03(this.A03, selfieEvidence.A03) || !AnonymousClass3ZT.A03(this.A07, selfieEvidence.A07) || !AnonymousClass3ZT.A03(this.A05, selfieEvidence.A05) || !AnonymousClass3ZT.A03(this.A04, selfieEvidence.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C86124wJ.A0E(this.A06) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A03(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A06, 0, 1);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1366783w A0U = C86134wK.A0U(parcel, immutableList);
            while (A0U.hasNext()) {
                parcel.writeString(C18180wK.A0k(A0U));
            }
        }
        C18180wK.A0y(parcel, this.A02, 0, 1);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        C18180wK.A0y(parcel, this.A03, 0, 1);
        C18190wL.A16(parcel, this.A07, 0, 1);
        Long l = this.A05;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C86134wK.A18(parcel, l, 1);
        }
        C18180wK.A0y(parcel, this.A04, 0, 1);
    }

    public SelfieEvidence(Parcel parcel) {
        Integer num = null;
        if (C86114wI.A08(parcel, this) == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A00 = ImmutableList.copyOf((Object[]) strArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = C86114wI.A0b(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = C86114wI.A0b(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = Long.valueOf(parcel.readLong());
        }
        this.A04 = parcel.readInt() != 0 ? C86114wI.A0b(parcel) : num;
    }
}
