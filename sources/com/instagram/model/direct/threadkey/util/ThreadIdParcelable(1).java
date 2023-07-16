package com.instagram.model.direct.threadkey.util;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C23168CnC;
import X.C85834vq;
import X.CMN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class ThreadIdParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(68);
    public final C85834vq A00;

    public ThreadIdParcelable(C85834vq r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        CMN cmn;
        C04220Ms.A0B(parcel, 0);
        C85834vq r1 = this.A00;
        if (r1 instanceof CMN) {
            parcel.writeInt(0);
            cmn = (CMN) r1;
        } else if (r1 instanceof MsysThreadId) {
            parcel.writeInt(1);
            parcel.writeParcelable((MsysThreadId) r1, i);
            return;
        } else if (r1 instanceof C23168CnC) {
            parcel.writeInt(2);
            C23168CnC cnC = (C23168CnC) r1;
            if (cnC != null) {
                parcel.writeParcelable(cnC.A01, i);
                cmn = cnC.A00;
            } else {
                return;
            }
        } else {
            throw C18180wK.A0a(AnonymousClass0wJ.A0t("Unexpected ThreadId: ", r1));
        }
        C04220Ms.A0B(cmn, 1);
        parcel.writeString(cmn.A00);
    }
}
