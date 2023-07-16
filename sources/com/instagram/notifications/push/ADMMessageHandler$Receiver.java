package com.instagram.notifications.push;

import X.C10450iM;
import com.amazon.device.messaging.ADMMessageReceiver;

public class ADMMessageHandler$Receiver extends ADMMessageReceiver {
    public static boolean A00 = true;

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
        } catch (ClassNotFoundException unused) {
            C10450iM.A03("ADMMessagehandler ADMMessageHandlerJob", "ADMMessageHandlerJobBase is not available. Need to fall back to legacy implementation");
        }
    }

    public ADMMessageHandler$Receiver() {
        super(ADMMessageLegacyHandler.class);
        if (A00) {
            registerJobServiceClass(ADMMessageJobHandler.class, 8941);
        }
    }
}
