package com.fbpay.w3c;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C1366783w;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public class Contact implements Parcelable, ContactSpec {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(19);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public Contact(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        AnonymousClass3ZT.A02(immutableList, "emails");
        this.A00 = immutableList;
        this.A02 = str;
        AnonymousClass3ZT.A02(immutableList2, "phones");
        this.A01 = immutableList2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Contact) {
                Contact contact = (Contact) obj;
                if (!AnonymousClass3ZT.A03(this.A00, contact.A00) || !AnonymousClass3ZT.A03(this.A02, contact.A02) || !AnonymousClass3ZT.A03(this.A01, contact.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C1366783w A0U = C86134wK.A0U(parcel, this.A00);
        while (A0U.hasNext()) {
            parcel.writeParcelable((Email) A0U.next(), i);
        }
        String str = this.A02;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        C1366783w A0U2 = C86134wK.A0U(parcel, this.A01);
        while (A0U2.hasNext()) {
            parcel.writeParcelable((Phone) A0U2.next(), i);
        }
    }

    public Contact(Parcel parcel) {
        String readString;
        ClassLoader A0Z = C86114wI.A0Z(this);
        int readInt = parcel.readInt();
        Object[] objArr = new Email[readInt];
        for (int i = 0; i < readInt; i++) {
            objArr[i] = parcel.readParcelable(A0Z);
        }
        this.A00 = ImmutableList.copyOf(objArr);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A02 = readString;
        int readInt2 = parcel.readInt();
        Object[] objArr2 = new Phone[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            objArr2[i2] = parcel.readParcelable(A0Z);
        }
        this.A01 = ImmutableList.copyOf(objArr2);
    }
}
