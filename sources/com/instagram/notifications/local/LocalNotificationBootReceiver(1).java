package com.instagram.notifications.local;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3ES;
import X.AnonymousClass3OP;
import X.AnonymousClass3Zd;
import X.AnonymousClass49F;
import X.C04220Ms;
import X.C102086Tt;
import X.C10300i6;
import X.C14030oh;
import X.C16100sU;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C28161tl;
import X.C31155GhB;
import X.C32165H8c;
import X.C36402Re;
import android.app.NotificationChannel;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape12S0300000_I2_2;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;
import kotlin.jvm.internal.KtLambdaShape8S0300000_I2_3;

public final class LocalNotificationBootReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        NotificationChannel A00;
        int A01 = C14030oh.A01(-992010558);
        boolean A1Z = AnonymousClass0wJ.A1Z(context, intent);
        if (!C16100sU.A00().A01(context, intent, this) || !C04220Ms.A0I(intent.getAction(), AnonymousClass000.A00(287))) {
            i = -1707810282;
        } else {
            C10300i6 A0W = C18200wM.A0W(this);
            if (!(A0W instanceof UserSession)) {
                i = 1025048738;
            } else {
                UserSession userSession = (UserSession) A0W;
                C102086Tt.A00(context, userSession);
                AnonymousClass3ES r4 = new AnonymousClass3ES(context);
                if (C36402Re.A00(context)) {
                    Integer num = AnonymousClass006.A00;
                    long currentTimeMillis = System.currentTimeMillis();
                    C04220Ms.A0B(num, 0);
                    if (currentTimeMillis - C18180wK.A05(C18200wM.A0C(), "last_unseen_like_local_notification_timestamp") >= 86400000) {
                        C04220Ms.A0B(userSession, A1Z ? 1 : 0);
                        AnonymousClass49F r5 = (AnonymousClass49F) userSession.A01(AnonymousClass49F.class, new KtLambdaShape8S0300000_I2_3(3, context, r4, userSession));
                        KtLambdaShape12S0300000_I2_2 ktLambdaShape12S0300000_I2_2 = new KtLambdaShape12S0300000_I2_2(10, A0W, r4, this);
                        UserSession userSession2 = r5.A04;
                        if (!(C18190wL.A04(C28161tl.A04(userSession2), "notification_settings") != 1 || (A00 = AnonymousClass3Zd.A00(r5.A02, "ig_likes")) == null || A00.getImportance() == 0)) {
                            IDxACallbackShape35S0200000_1_I2 iDxACallbackShape35S0200000_1_I2 = new IDxACallbackShape35S0200000_1_I2(26, new KtLambdaShape31S0200000_I2_15(46, ktLambdaShape12S0300000_I2_2, r5), r5);
                            C32165H8c A002 = AnonymousClass3OP.A00(userSession2, "post_and_comments");
                            A002.A00 = iDxACallbackShape35S0200000_1_I2;
                            C31155GhB.A03(A002);
                        }
                    }
                }
                i = 30377340;
            }
        }
        C14030oh.A0E(i, A01, intent);
    }
}
