package libraries.access.src.main.base.common;

import X.AnonymousClass23U;
import X.C18250wR;
import X.C311624m;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;
import java.util.Arrays;

public class FXDeviceItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(97);
    public C311624m A00;
    public final Long A01;
    public final String A02;
    public final AnonymousClass23U A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FXDeviceItem fXDeviceItem = (FXDeviceItem) obj;
            if (this.A00 != fXDeviceItem.A00) {
                return false;
            }
            String str = this.A02;
            String str2 = fXDeviceItem.A02;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.A03 != fXDeviceItem.A03) {
                return false;
            }
            Long l = this.A01;
            Long l2 = fXDeviceItem.A01;
            return l == null ? l2 == null : l.equals(l2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        long longValue;
        C311624m r0 = this.A00;
        String str = null;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.toString();
        }
        parcel.writeString(obj);
        AnonymousClass23U r02 = this.A03;
        if (r02 != null) {
            str = r02.toString();
        }
        parcel.writeString(str);
        parcel.writeString(this.A02);
        Long l = this.A01;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        parcel.writeLong(longValue);
    }

    public FXDeviceItem(Parcel parcel) {
        C311624m valueOf;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        AnonymousClass23U r1 = null;
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = C311624m.valueOf(readString);
        }
        this.A00 = valueOf;
        this.A03 = readString2 != null ? AnonymousClass23U.valueOf(readString2) : r1;
        this.A02 = parcel.readString();
        this.A01 = C18250wR.A0T(parcel);
    }

    public FXDeviceItem(Long l, String str, C311624m r3, AnonymousClass23U r4) {
        this.A00 = r3;
        this.A03 = r4;
        this.A02 = str;
        this.A01 = l;
    }
}
