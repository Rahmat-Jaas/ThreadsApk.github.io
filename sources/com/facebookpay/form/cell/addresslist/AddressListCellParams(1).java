package com.facebookpay.form.cell.addresslist;

import X.AnonymousClass0wJ;
import X.AnonymousClass3JE;
import X.C04220Ms;
import X.C110616lz;
import X.C18180wK;
import X.C86134wK;
import X.C91825gu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionShippingAddressItem;
import com.facebookpay.form.cell.CellParams;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.List;

public final class AddressListCellParams extends CellParams {
    public int A00;
    public BaseCheckoutItem A01;
    public LoggingContext A02;
    public List A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public AddressListCellParams(Parcel parcel) {
        super(parcel);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A03 = A0v;
        C86134wK.A17(parcel, SelectionShippingAddressItem.class, A0v);
        Parcelable A0A = C18180wK.A0A(parcel, BaseCheckoutItem.class);
        if (A0A != null) {
            this.A01 = (BaseCheckoutItem) A0A;
            this.A00 = parcel.readInt();
            Parcelable A0A2 = C18180wK.A0A(parcel, LoggingContext.class);
            if (A0A2 != null) {
                this.A02 = (LoggingContext) A0A2;
                this.A04 = AnonymousClass3JE.A00(parcel);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public AddressListCellParams(C91825gu r2) {
        super((C110616lz) r2);
        this.A03 = AnonymousClass0wJ.A0v();
        this.A03 = r2.A02;
        this.A01 = r2.A00;
        this.A00 = R.string.f0nameremoved;
        this.A02 = r2.A01;
        this.A04 = r2.A03;
    }
}
