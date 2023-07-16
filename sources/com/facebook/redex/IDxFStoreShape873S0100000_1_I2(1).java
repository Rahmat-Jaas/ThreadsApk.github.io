package com.facebook.redex;

import X.C23211cm;
import X.C82774qF;
import android.os.Bundle;
import com.instagram.nux.cal.model.ConnectContent;

public class IDxFStoreShape873S0100000_1_I2 implements C82774qF {
    public Object A00;
    public final int A01;

    public IDxFStoreShape873S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CwK(Bundle bundle) {
        ConnectContent connectContent;
        if (this.A01 != 0) {
            connectContent = (ConnectContent) this.A00;
        } else {
            connectContent = ((C23211cm) this.A00).A02;
            connectContent.getClass();
        }
        bundle.putParcelable("extra_cal_nux_content", connectContent);
    }
}
