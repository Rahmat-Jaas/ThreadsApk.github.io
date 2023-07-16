package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7GD  reason: invalid class name */
public final class AnonymousClass7GD {
    public static final ClassLoader A00 = AnonymousClass7GD.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        return C86104wH.A0F(parcel, creator);
    }
}
