package com.fbpay.hub.form.params;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C109806ke;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FormDialogParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(95);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FormDialogParams) {
                FormDialogParams formDialogParams = (FormDialogParams) obj;
                if (!(AnonymousClass3ZT.A03(this.A04, formDialogParams.A04) && this.A00 == formDialogParams.A00 && this.A01 == formDialogParams.A01 && this.A02 == formDialogParams.A02 && AnonymousClass3ZT.A03(this.A05, formDialogParams.A05) && this.A03 == formDialogParams.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((C86124wJ.A0E(this.A04) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + this.A03;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A04, 0, 1);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        C18190wL.A16(parcel, this.A05, 0, 1);
        parcel.writeInt(this.A03);
    }

    public FormDialogParams(Parcel parcel) {
        this.A04 = C86114wI.A08(parcel, this) != 0 ? parcel.readString() : null;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A05 = C86114wI.A0l(parcel);
        this.A03 = parcel.readInt();
    }

    public FormDialogParams(C109806ke r3) {
        this.A04 = null;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A05 = null;
        this.A03 = r3.A03;
    }
}
