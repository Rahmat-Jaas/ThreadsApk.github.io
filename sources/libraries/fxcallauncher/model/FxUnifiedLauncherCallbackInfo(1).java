package libraries.fxcallauncher.model;

import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class FxUnifiedLauncherCallbackInfo implements Parcelable {
    public String A00;
    public String A01 = "";
    public String A02;
    public List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelableArray((Parcelable[]) this.A03.toArray(new FxUnifiedLauncherAddedAccount[0]), i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public FxUnifiedLauncherCallbackInfo() {
        AnonymousClass0ZV r2 = AnonymousClass0ZV.A00;
        C04220Ms.A0B("", 1);
        AnonymousClass0wJ.A1R("", "");
        this.A03 = r2;
        this.A02 = "";
        this.A00 = "";
    }
}
