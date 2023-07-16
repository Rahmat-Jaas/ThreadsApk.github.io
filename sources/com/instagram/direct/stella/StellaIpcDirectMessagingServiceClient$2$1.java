package com.instagram.direct.stella;

import X.C14030oh;
import X.C15740ro;
import X.C16240si;
import android.content.Intent;
import com.facebook.redex.IDxFCallbackShape79S0300000_2_I2;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

public final class StellaIpcDirectMessagingServiceClient$2$1 extends ISendDirectMessageCallback.Stub {
    public final /* synthetic */ IDxFCallbackShape79S0300000_2_I2 A00;

    public StellaIpcDirectMessagingServiceClient$2$1(IDxFCallbackShape79S0300000_2_I2 iDxFCallbackShape79S0300000_2_I2) {
        this.A00 = iDxFCallbackShape79S0300000_2_I2;
        C14030oh.A0A(-1888952753, C14030oh.A03(-1431931754));
    }

    public final void C7O(String str, boolean z) {
        int A03 = C14030oh.A03(-508691068);
        StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A00.A00;
        if (stellaIpcDirectMessagingServiceClient.mContext != null) {
            C15740ro r0 = new C15740ro();
            r0.A05(StellaIpcDirectMessagingServiceClient.FB_PERMISSION);
            r0.A00().A00(stellaIpcDirectMessagingServiceClient.mContext, (Intent) null, (C16240si) null);
        }
        C14030oh.A0A(-1567049879, A03);
    }
}
