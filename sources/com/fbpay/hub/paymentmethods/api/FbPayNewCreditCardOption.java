package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass233;
import X.AnonymousClass3ZT;
import X.AnonymousClass69W;
import X.C104956ce;
import X.C1366783w;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class FbPayNewCreditCardOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(3);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewCreditCardOption) {
                FbPayNewCreditCardOption fbPayNewCreditCardOption = (FbPayNewCreditCardOption) obj;
                if (!AnonymousClass3ZT.A03(this.A01, fbPayNewCreditCardOption.A01) || !AnonymousClass3ZT.A03(this.A03, fbPayNewCreditCardOption.A03) || !AnonymousClass3ZT.A03(this.A02, fbPayNewCreditCardOption.A02) || !AnonymousClass3ZT.A03(this.A00, fbPayNewCreditCardOption.A00) || !AnonymousClass3ZT.A03(this.A04, fbPayNewCreditCardOption.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((C86124wJ.A0E(this.A01) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1366783w A0U = C86134wK.A0U(parcel, immutableList);
            while (A0U.hasNext()) {
                parcel.writeParcelable((FbPayAdditionalField) A0U.next(), i);
            }
        }
        C18190wL.A16(parcel, this.A03, 0, 1);
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1366783w A0U2 = C86134wK.A0U(parcel, immutableList2);
            while (A0U2.hasNext()) {
                parcel.writeInt(((AnonymousClass233) A0U2.next()).ordinal());
            }
        }
        ImmutableList immutableList3 = this.A00;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1366783w A0U3 = C86134wK.A0U(parcel, immutableList3);
            while (A0U3.hasNext()) {
                parcel.writeInt(((AnonymousClass69W) A0U3.next()).ordinal());
            }
        }
        C18190wL.A16(parcel, this.A04, 0, 1);
    }

    public FbPayNewCreditCardOption(Parcel parcel) {
        ClassLoader A0Z = C86114wI.A0Z(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            Object[] objArr = new FbPayAdditionalField[readInt];
            for (int i = 0; i < readInt; i++) {
                objArr[i] = parcel.readParcelable(A0Z);
            }
            this.A01 = ImmutableList.copyOf(objArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt2 = parcel.readInt();
            AnonymousClass233[] r3 = new AnonymousClass233[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                r3[i2] = AnonymousClass233.values()[parcel.readInt()];
            }
            this.A02 = ImmutableList.copyOf((Object[]) r3);
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            AnonymousClass69W[] r2 = new AnonymousClass69W[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                r2[i3] = AnonymousClass69W.values()[parcel.readInt()];
            }
            immutableList = ImmutableList.copyOf((Object[]) r2);
        }
        this.A00 = immutableList;
        this.A04 = C86114wI.A0l(parcel);
    }

    public FbPayNewCreditCardOption(C104956ce r2) {
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04 = r2.A00;
    }
}
