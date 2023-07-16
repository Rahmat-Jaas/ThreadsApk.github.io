package libraries.fxcallauncher.model;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public final class FxUnifiedLauncherAddedAccount implements Parcelable {
    public static final Parcelable.Creator A03 = new PCreatorCreatorShape17S0000000_I2_17(98);
    public String A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FxUnifiedLauncherAddedAccount) {
                FxUnifiedLauncherAddedAccount fxUnifiedLauncherAddedAccount = (FxUnifiedLauncherAddedAccount) obj;
                if (!C04220Ms.A0I(this.A02, fxUnifiedLauncherAddedAccount.A02) || !C04220Ms.A0I(this.A01, fxUnifiedLauncherAddedAccount.A01) || !C04220Ms.A0I(this.A00, fxUnifiedLauncherAddedAccount.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public FxUnifiedLauncherAddedAccount() {
        this("", "", "");
    }

    public final int hashCode() {
        return C18210wN.A05(this.A00, AnonymousClass0wJ.A07(this.A01, C18180wK.A03(this.A02)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FxUnifiedLauncherAddedAccount(userId_DEPRECATED_DO_NOT_USE=");
        A0s.append(this.A02);
        A0s.append(", obId=");
        A0s.append(this.A01);
        A0s.append(", accountType=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public FxUnifiedLauncherAddedAccount(String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }
}
