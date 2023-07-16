package com.facebook.common.locale;

import X.C86164wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Locale;

public abstract class LocaleMember implements Parcelable {
    public final Locale A00;

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return C86164wN.A0f(this).equals(C86164wN.A0f((LocaleMember) obj));
    }

    public final String toString() {
        Locale locale = Locale.US;
        Locale locale2 = this.A00;
        return StringFormatUtil.formatStrLocaleSafe("%s (%s/%s)", locale2.getDisplayCountry(locale), locale2.getCountry(), locale2.getISO3Country());
    }

    public LocaleMember(Locale locale) {
        this.A00 = locale;
    }

    public final int describeContents() {
        return hashCode();
    }

    public final int hashCode() {
        return C86164wN.A0f(this).hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C86164wN.A0f(this));
    }
}
