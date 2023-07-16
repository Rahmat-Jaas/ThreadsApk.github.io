package com.facebook.graphql.modelutil.parcel;

import X.AnonymousClass0wJ;
import X.AnonymousClass7Ko;
import X.C121697Hn;
import X.C18180wK;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class ModelParcelHelper$LazyHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(79);
    public final Parcelable A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        AnonymousClass7Ko.A0C(AnonymousClass0wJ.A1T(i2, 2));
        parcel.writeParcelable(this.A00, 0);
    }

    public ModelParcelHelper$LazyHolder(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        AnonymousClass7Ko.A0C(AnonymousClass0wJ.A1T(readInt, 2));
        this.A00 = C18180wK.A0A(parcel, C121697Hn.class);
    }

    public ModelParcelHelper$LazyHolder(Object obj) {
        if (obj instanceof Parcelable) {
            this.A00 = (Parcelable) obj;
            this.A01 = 2;
            return;
        }
        throw C18190wL.A0a("Object param must implement a serialization format");
    }
}
