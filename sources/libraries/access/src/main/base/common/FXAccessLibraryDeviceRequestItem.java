package libraries.access.src.main.base.common;

import X.AnonymousClass23U;
import X.C311624m;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public class FXAccessLibraryDeviceRequestItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(96);
    public final C311624m A00;
    public final AnonymousClass23U A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A01.toString());
        parcel.writeString(this.A02);
    }

    public FXAccessLibraryDeviceRequestItem(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (readString == null || readString2 == null || readString3 == null) {
            throw new ParcelFormatException("Did not find expected field");
        }
        this.A00 = C311624m.valueOf(readString);
        this.A01 = AnonymousClass23U.valueOf(readString2);
        this.A02 = readString3;
    }

    public FXAccessLibraryDeviceRequestItem(C311624m r2, AnonymousClass23U r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = "";
    }
}
