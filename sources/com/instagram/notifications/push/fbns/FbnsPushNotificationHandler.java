package com.instagram.notifications.push.fbns;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0DB;
import X.AnonymousClass0gN;
import X.AnonymousClass3WS;
import X.AnonymousClass61L;
import X.AnonymousClass7GV;
import X.C04220Ms;
import X.C05030Qo;
import X.C102096Tu;
import X.C10300i6;
import X.C10450iM;
import X.C1190873l;
import X.C13750oF;
import X.C14030oh;
import X.C15270r2;
import X.C16520tF;
import X.C16850tr;
import X.C16900tw;
import X.C18180wK;
import X.C18200wM;
import X.C28161tl;
import X.C29620FrP;
import X.C30843GYs;
import X.C31084GfL;
import X.C86104wH;
import X.C86134wK;
import X.C91175fj;
import X.HGC;
import X.KJ8;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.instagram.barcelona.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.service.session.UserSession;

public class FbnsPushNotificationHandler extends C16900tw {
    public boolean A00 = false;

    public final void onHandleIntent(Intent intent) {
        try {
            super.onHandleIntent(intent);
        } finally {
            if (this.A00) {
                stopForeground(true);
            }
        }
    }

    public class IgFbnsCallbackReceiver extends C15270r2 {
        public final void onReceive(Context context, Intent intent) {
            int i;
            int A01 = C14030oh.A01(-99682050);
            if (intent.getAction() == null) {
                i = -234269544;
            } else {
                C91175fj r3 = new C91175fj(context, C18200wM.A0W(this));
                PowerManager.WakeLock A00 = C13750oF.A00((PowerManager) context.getSystemService("power"), "WakefulPushExecutor", 1);
                C13750oF.A03(A00);
                A00.acquire(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                AnonymousClass0DB.A01(A00, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                AnonymousClass0gN.A00().AKp(new AnonymousClass61L(intent, A00, r3));
                KJ8.A0G.A0G(intent, AnonymousClass006.A0N);
                i = 280916435;
            }
            C14030oh.A0E(i, A01, intent);
        }
    }

    public FbnsPushNotificationHandler() {
        super(FbnsPushNotificationHandler.class.getName());
    }

    public final void A02(String str) {
        C10450iM.A03("FbnsPushNotificationHandler onRegistrationError", str);
        HGC hgc = AnonymousClass7GV.A00;
        if (hgc != null) {
            hgc.A09(getApplicationContext(), PushChannelType.FBNS, str, 1);
        } else {
            C10450iM.A03("FbnsPushNotificationHandler onRegistrationError", "Unable to log because delegate was null");
        }
    }

    public final void A00() {
        C29620FrP.A00();
    }

    public final void A01(Intent intent) {
        UserSession userSession;
        String str;
        C16850tr.A00(this, intent);
        C31084GfL A002 = C31084GfL.A00(intent, (String) null, false);
        if (A002 == null || (str = A002.A0U) == null) {
            userSession = null;
        } else {
            userSession = C30843GYs.A00(str);
        }
        PushChannelType pushChannelType = PushChannelType.FBNS;
        C102096Tu.A00(intent, pushChannelType, userSession);
        if (userSession == null || !C30843GYs.A01(userSession)) {
            C29620FrP.A00().A0B(intent, pushChannelType, AnonymousClass7GV.A00(pushChannelType));
        } else {
            C86134wK.A0Y(userSession).A00(intent, pushChannelType);
        }
    }

    public final void A03(String str, boolean z) {
        HGC A002 = C29620FrP.A00();
        Context applicationContext = getApplicationContext();
        PushChannelType pushChannelType = PushChannelType.FBNS;
        int i = 2;
        if (z) {
            i = 3;
        }
        A002.A0A(applicationContext, pushChannelType, str, i, pushChannelType.equals(C1190873l.A00().B59()));
        HGC hgc = AnonymousClass7GV.A00;
        if (hgc != null) {
            hgc.A08(getApplicationContext(), pushChannelType, 1);
        } else {
            C10450iM.A03("FbnsPushNotificationHandler onRegistered", "Unable to log because delegate was null");
        }
        C10300i6 A0W = C18200wM.A0W(this);
        if (A0W instanceof UserSession) {
            C28161tl A01 = AnonymousClass3WS.A01(C05030Qo.A02(A0W));
            C04220Ms.A0B(str, 0);
            C18180wK.A0v(C28161tl.A02(A01), "fbns_token", str);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(1066759614);
        if (intent != null) {
            this.A00 = intent.getBooleanExtra(AnonymousClass000.A00(888), false);
        }
        if (this.A00) {
            Context applicationContext = getApplicationContext();
            int i3 = R.drawable.notification_icon;
            int i4 = C86104wH.A0G(this, R.attr.defaultNotificationIcon).resourceId;
            if (i4 != 0) {
                i3 = i4;
            }
            Integer valueOf = Integer.valueOf(i3);
            C16520tF r0 = C16520tF.A01;
            if (r0 == null) {
                synchronized (C16520tF.class) {
                    r0 = C16520tF.A01;
                    if (r0 == null) {
                        r0 = new C16520tF(applicationContext, valueOf);
                        C16520tF.A01 = r0;
                    }
                }
            }
            startForeground(20014, r0.A00);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C14030oh.A0B(148376345, A04);
        return onStartCommand;
    }
}
