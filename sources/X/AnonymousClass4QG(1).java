package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.4QG  reason: invalid class name */
public final class AnonymousClass4QG implements Runnable {
    public final /* synthetic */ AnonymousClass49G A00;

    public AnonymousClass4QG(AnonymousClass49G r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass49G r5 = this.A00;
        if (r5.A05 != null && AnonymousClass49G.A00(r5)) {
            Context context = r5.A07;
            String string = context.getResources().getString(2131835513);
            UserSession userSession = r5.A08;
            C31084GfL gfL = new C31084GfL(new C25512Dmz(0, 0, 0), (ImageUrl) null, (ImageUrl) null, (String) null, string, I17.A00(325), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "session_level_survey", "session_level_survey", userSession.getUserId(), (String) null, (String) null);
            Intent A05 = C18250wR.A05("android.intent.action.VIEW");
            A05.addCategory("android.intent.category.BROWSABLE");
            A05.setData(C15430rJ.A01(r5.A05));
            C16230sh A0I = C18210wN.A0I(context, A05);
            C58653Gp r10 = new C58653Gp();
            r10.A01(C18210wN.A0h("https"));
            r10.A01.add(new AnonymousClass1QA(Arrays.asList(new String[]{"/survey/"})));
            AnonymousClass3GO A002 = r10.A00();
            long j = A0I.A01 | 1;
            A0I.A01 = j;
            A0I.A01 = j | 4;
            A0I.A07(A002);
            A0I.A08 = new C36890Jge("IgSecurePendingIntent").A01;
            PendingIntent A01 = A0I.A01(context, 19602, 1073741824);
            String userId = userSession.getUserId();
            String str = gfL.A0M;
            C04220Ms.A06(str);
            C04220Ms.A0B(userId, 0);
            C30949Gbq A03 = C31104Gfo.A03(context, gfL, userSession, "session_level_survey", AnonymousClass00U.A0N(userId, str, '_'));
            A03.A0A = A01;
            Notification A012 = A03.A01();
            C04220Ms.A06(A012);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.add("session_level_survey");
            GD7 gd7 = new GD7(A012, "session_level_survey", (String) null, A0v);
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A00((C11630kW) null, C10690il.A06, userSession), "instagram_session_survey_invitation_impression"), 1989);
            A0I2.A0S("survey_id", r5.A02);
            A0I2.A0T("leaf_id", r5.A03);
            A0I2.A0T("root_id", r5.A04);
            A0I2.A0T("survey_uri", r5.A05);
            A0I2.Bb4();
            C30877GaH.A00().A02(gd7, userSession, (Runnable) null, "session_level_survey_notification", 0);
            C28161tl A013 = AnonymousClass3WS.A01(userSession);
            AnonymousClass0wJ.A12(C28161tl.A02(A013), "last_session_survey_notification_seen_timestamp_ms", System.currentTimeMillis());
            r5.A06 = true;
        }
    }
}
