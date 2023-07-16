package com.instagram.notifications.push;

import X.C10450iM;
import X.C29620FrP;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.instagram.common.notifications.push.intf.PushChannelType;

public class ADMMessageLegacyHandler extends ADMMessageHandlerBase {
    public ADMMessageLegacyHandler() {
        super(ADMMessageLegacyHandler.class.getName());
    }

    public final void onRegistrationError(String str) {
        C10450iM.A03("ADMMessagehandler onRegistrationError", str);
    }

    public final void onMessage(Intent intent) {
        C29620FrP.A00().A0B(intent, PushChannelType.AMAZON, (String) null);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.notifications.push.ADMMessageLegacyHandler] */
    public final void onRegistered(String str) {
        C29620FrP.A00().A0A(getApplicationContext(), PushChannelType.AMAZON, str, 2, false);
    }

    public final void onUnregistered(String str) {
        C29620FrP.A00();
    }
}
