package com.instagram.notifications.push;

import X.C10450iM;
import X.C29620FrP;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.instagram.common.notifications.push.intf.PushChannelType;

public class ADMMessageJobHandler extends ADMMessageHandlerJobBase {
    public final void onRegistrationError(Context context, String str) {
        C10450iM.A03("ADMMessagehandler onRegistrationError", str);
    }

    public final void onMessage(Context context, Intent intent) {
        C29620FrP.A00().A0B(intent, PushChannelType.AMAZON, (String) null);
    }

    public final void onRegistered(Context context, String str) {
        C29620FrP.A00().A0A(context, PushChannelType.AMAZON, str, 2, false);
    }

    public final void onUnregistered(Context context, String str) {
        C29620FrP.A00();
    }
}
