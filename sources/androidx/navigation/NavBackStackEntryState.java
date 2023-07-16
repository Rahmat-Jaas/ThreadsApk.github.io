package androidx.navigation;

import X.C04220Ms;
import X.C123917Zx;
import X.C18180wK;
import X.C86124wJ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(49);
    public final int A00;
    public final Bundle A01;
    public final Bundle A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeBundle(this.A01);
        parcel.writeBundle(this.A02);
    }

    public NavBackStackEntryState(Parcel parcel) {
        String readString = parcel.readString();
        C04220Ms.A0A(readString);
        this.A03 = readString;
        this.A00 = parcel.readInt();
        Class<?> cls = getClass();
        this.A01 = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        C04220Ms.A0A(readBundle);
        this.A02 = readBundle;
    }

    public NavBackStackEntryState(C123917Zx r3) {
        C04220Ms.A0B(r3, 1);
        this.A03 = r3.A0A;
        this.A00 = r3.A03.A00;
        this.A01 = r3.A06;
        Bundle A06 = C18180wK.A06();
        this.A02 = A06;
        r3.A09.A01.A02(A06);
    }
}
