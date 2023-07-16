package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape41S0100000_I2_21;

/* renamed from: X.3aR  reason: invalid class name and case insensitive filesystem */
public final class C62633aR {
    public final C04530Oa A00;

    public final void A03(C81354ne r4, Integer num, String str) {
        C04220Ms.A0B(num, 1);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) C18190wL.A0f(this.A00), "one_link_graphql_event"), 2462);
        A0I.A0T("info_type", A01(num));
        A0I.A0T("event", "graphql_error");
        A0I.A0T("auth_policy", A00(r4));
        A0I.A1J(str);
        A0I.Bb4();
    }

    public static final String A00(C81354ne r1) {
        if (r1.equals(AnonymousClass42T.A00)) {
            return "ig_business_user_auth_config";
        }
        if (r1 instanceof C210618t) {
            return "facebook_access_token_auth_config";
        }
        throw AnonymousClass4VZ.A00();
    }

    public static final void A02(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2, C62633aR r5, C81354ne r6, Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) C18190wL.A0f(r5.A00), "one_link_debug_event"), 2461);
        C18210wN.A1B(A0I, ktCSuperShape0S4100000_I2.A02);
        C18210wN.A19(A0I, ktCSuperShape0S4100000_I2.A03);
        C18190wL.A1I(A0I, ktCSuperShape0S4100000_I2.A04);
        A0I.A0T("caller_context", ((CallerContext) ktCSuperShape0S4100000_I2.A00).A02);
        A0I.A0T("caller_name", ktCSuperShape0S4100000_I2.A01);
        A0I.A0T("event", "graphql_empty_response_not_found");
        A0I.A0T("auth_policy", A00(r6));
        if (num != null) {
            str = A01(num);
        } else {
            str = null;
        }
        A0I.A0T("info_type", str);
        A0I.Bb4();
    }

    public C62633aR(UserSession userSession) {
        this.A00 = AnonymousClass0OY.A02(new KtLambdaShape41S0100000_I2_21(userSession, 3));
    }

    public static final String A01(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "fb_page";
        }
        if (intValue == 1) {
            return "whatsapp_business";
        }
        if (intValue == 2) {
            return "business_account";
        }
        if (intValue == 3) {
            return "ad_account";
        }
        throw AnonymousClass4VZ.A00();
    }
}
