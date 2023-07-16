package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0100000_I2_3;

/* renamed from: X.1uL  reason: invalid class name and case insensitive filesystem */
public final class C28461uL extends C134647y7 {
    public final UserSession A00;
    public final C86064wD A01;
    public final C84714tk A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28461uL(UserSession userSession) {
        super("Direct", AnonymousClass2TZ.A00(1695661322));
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
        C27441EnX enX = new C27441EnX();
        this.A01 = enX;
        this.A02 = AnonymousClass7C4.A02(enX);
    }

    public final C84714tk A00(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I22, KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I23) {
        String str;
        H1T A0N;
        String str2;
        if (ktCSuperShape0S2000000_I22 != null) {
            UserSession userSession = this.A00;
            str = ktCSuperShape0S2000000_I22.A00;
            A0N = AnonymousClass0wJ.A0N(userSession);
            A0N.A0J("direct_v2/join_thread_via_story_join_chat/");
            str2 = "story_id";
        } else if (ktCSuperShape0S2000000_I2 != null) {
            UserSession userSession2 = this.A00;
            String str3 = ktCSuperShape0S2000000_I2.A00;
            String str4 = ktCSuperShape0S2000000_I2.A01;
            A0N = AnonymousClass0wJ.A0N(userSession2);
            A0N.A0J("direct_v2/join_thread_via_group_link/");
            A0N.A0O("group_link_hash", str3);
            A0N.A0B(AnonymousClass1SB.class, AnonymousClass3ML.class);
            if (str4 != null) {
                A0N.A0O("group_link_source", str4);
            }
            return C63623hv.A03(A0N.A02(), 1695661322, 0, 14);
        } else if (ktCSuperShape0S2000000_I23 == null) {
            return null;
        } else {
            UserSession userSession3 = this.A00;
            String str5 = ktCSuperShape0S2000000_I23.A01;
            str = ktCSuperShape0S2000000_I23.A00;
            A0N = AnonymousClass0wJ.A0N(userSession3);
            A0N.A0J("direct_v2/join_pinned_subscriber_social_channel/");
            A0N.A0O("thread_id", str5);
            str2 = "fan_club_id";
        }
        A0N.A0O(str2, str);
        A0N.A0B(AnonymousClass1SB.class, AnonymousClass3ML.class);
        return C63623hv.A03(A0N.A02(), 1695661322, 0, 14);
    }

    public final C84714tk A01(String str, String str2, boolean z) {
        String str3;
        boolean A1X = C18240wQ.A1X(str2);
        H1T A0N = AnonymousClass0wJ.A0N(this.A00);
        A0N.A0J("direct_v2/update_channel_invite/");
        A0N.A0O("channel_invite_id", str);
        if (z) {
            str3 = "accepted";
        } else {
            str3 = "declined_by_receiver";
        }
        A0N.A0O("invite_state", str3);
        A0N.A0O("threadId", str2);
        return C63623hv.A07(new KtSLambdaShape0S0000000_I2(20, (C146958n9) null), C63623hv.A08(new KtSLambdaShape14S0100000_I2_3(8, (C146958n9) null), C63623hv.A03(AnonymousClass0wJ.A0T(A0N, AnonymousClass1SC.class, AnonymousClass3MM.class), 1695661322, A1X ? 1 : 0, 14)));
    }
}
