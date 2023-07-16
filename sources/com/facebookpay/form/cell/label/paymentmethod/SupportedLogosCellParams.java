package com.facebookpay.form.cell.label.paymentmethod;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C110616lz;
import X.C86124wJ;
import X.C86134wK;
import X.C91785gq;
import android.os.Parcel;
import com.facebook.redex.PCreatorCreatorShape3S0000000_I2_3;
import com.facebookpay.form.cell.CellParams;
import java.util.ArrayList;
import java.util.List;

public final class SupportedLogosCellParams extends CellParams {
    public static final PCreatorCreatorShape3S0000000_I2_3 CREATOR = C86124wJ.A0X(52);
    public List A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
    }

    public SupportedLogosCellParams(Parcel parcel) {
        super(parcel);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A00 = A0v;
        C86134wK.A17(parcel, Integer.TYPE, A0v);
    }

    public SupportedLogosCellParams(C91785gq r2) {
        super((C110616lz) r2);
        this.A00 = AnonymousClass0wJ.A0v();
        this.A00 = r2.A00;
    }
}
