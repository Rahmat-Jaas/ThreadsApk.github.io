package fxcache.model;

import X.AnonymousClass0ZV;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class FxCalAccountLinkageInfoForSwitcher implements Parcelable {
    public long A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeParcelableArray((Parcelable[]) this.A01.toArray(new FxCalAccountWithSwitcherInfo[0]), i);
        parcel.writeLong(this.A00);
    }

    public FxCalAccountLinkageInfoForSwitcher(List list, long j) {
        this.A01 = list;
        this.A00 = j;
    }

    public FxCalAccountLinkageInfoForSwitcher() {
        this(AnonymousClass0ZV.A00, System.currentTimeMillis());
    }
}
