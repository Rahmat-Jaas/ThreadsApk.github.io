package com.facebook.fbpay.hub.p2pwidget.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C1366783w;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import com.google.common.collect.ImmutableList;

public class FbPayP2pWidgetSendRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(76);
    public final ImmutableList A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pWidgetSendRequest) {
                FbPayP2pWidgetSendRequest fbPayP2pWidgetSendRequest = (FbPayP2pWidgetSendRequest) obj;
                if (!AnonymousClass3ZT.A03(this.A00, fbPayP2pWidgetSendRequest.A00) || !AnonymousClass3ZT.A03(this.A01, fbPayP2pWidgetSendRequest.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass0wJ.A03(this.A00) + 31) * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        parcel.writeInt(immutableList.size());
        C1366783w it = immutableList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((FbPayP2pFriend) it.next(), i);
        }
        String str = this.A01;
        if (str == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(str);
    }

    public FbPayP2pWidgetSendRequest(Parcel parcel) {
        String readString;
        ClassLoader classLoader = getClass().getClassLoader();
        int readInt = parcel.readInt();
        Object[] objArr = new FbPayP2pFriend[readInt];
        for (int i = 0; i < readInt; i++) {
            objArr[i] = parcel.readParcelable(classLoader);
        }
        this.A00 = ImmutableList.copyOf(objArr);
        if (parcel.readInt() == 0) {
            readString = null;
        } else {
            readString = parcel.readString();
        }
        this.A01 = readString;
    }
}
