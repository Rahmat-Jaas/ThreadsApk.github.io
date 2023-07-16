package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.2zA  reason: invalid class name and case insensitive filesystem */
public final class C54262zA {
    public static final void A00(C10300i6 r8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Long l;
        Long l2;
        String str9 = str;
        AnonymousClass0wJ.A1M(r8, 0, str9);
        double A00 = C18200wM.A00();
        double A002 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "register_account_failed"), 2616);
        AnonymousClass0wJ.A1A(A0I, A00, A002);
        C18180wK.A19(A0I);
        AnonymousClass269.A05(A0I);
        C18180wK.A1A(A0I, A002);
        C18210wN.A19(A0I, str9);
        C18190wL.A1I(A0I, "done");
        C18180wK.A1B(A0I, A00);
        C63683i7.A08(A0I);
        A0I.A0T("retry_strategy", str5);
        Long l3 = null;
        if (num != null) {
            l = C18230wP.A0f(num.intValue());
        } else {
            l = null;
        }
        A0I.A0S("attempt_count", l);
        A0I.A0T("types", str2);
        A0I.A0T(DialogModule.KEY_MESSAGE, str3);
        if (str8 != null) {
            l2 = AnonymousClass4n2.A02(str8);
        } else {
            l2 = null;
        }
        A0I.A0S("actor_id", l2);
        A0I.A0Q("has_server_response", bool);
        A0I.A0T(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str4);
        A0I.A0Q("checkpointed", bool2);
        A0I.A0Q("is_consent_required", bool3);
        A0I.A0Q("is_feedback_required", bool4);
        A0I.A0Q("is_login_required", bool5);
        A0I.A0Q("is_no_content", bool6);
        A0I.A0Q("is_violating_branded_content_policy", bool7);
        if (num2 != null) {
            l3 = C18230wP.A0f(num2.intValue());
        }
        A0I.A0S(TraceFieldType.StatusCode, l3);
        A0I.A0T("error_type", str6);
        A0I.A1J(str7);
        A0I.A0Q("is_existing_user", bool8);
        A0I.Bb4();
    }
}
