package X;

import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import com.instagram.business.promote.util.PromoteCtwaLinkUtil$Companion$openWhatsAppLinkingFlow$fragment$1;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3hI  reason: invalid class name and case insensitive filesystem */
public final class C63333hI {
    public static final C110456li A01(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C110456li) ((C84134sb) AnonymousClass3LA.A00(userSession).A03.getValue()).AbO(ktCSuperShape0S4100000_I2);
    }

    public final SpannableStringBuilder A05(FragmentActivity fragmentActivity, PromoteData promoteData, UserSession userSession) {
        String string;
        C04220Ms.A0B(userSession, 2);
        String A0k = AnonymousClass0wJ.A0k(fragmentActivity, 2131833314);
        String A0k2 = AnonymousClass0wJ.A0k(fragmentActivity, 2131833321);
        if (promoteData.A26) {
            string = AnonymousClass0wJ.A0l(fragmentActivity, A0k2, 2131833315);
        } else {
            string = fragmentActivity.getString(2131833316);
        }
        C04220Ms.A09(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (promoteData.A2W) {
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(A0k);
        }
        if (promoteData.A2P) {
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(string);
            if (promoteData.A26) {
                A02(spannableStringBuilder, fragmentActivity, userSession, A0k2, "https://www.facebook.com/business/help/2058515294227817");
            }
        }
        return spannableStringBuilder;
    }

    public final void A07(UserSession userSession, Class cls) {
        C04220Ms.A0B(userSession, 0);
        KtCSuperShape0S4100000_I2 A00 = A00(cls);
        ((C84134sb) AnonymousClass3LA.A00(userSession).A03.getValue()).AML(A00, AnonymousClass42T.A00, new AnonymousClass42U(A00, userSession));
    }

    public static final boolean A04(PromoteData promoteData) {
        C04620Ok r1 = C06810aP.A01;
        UserSession userSession = promoteData.A0v;
        C04220Ms.A05(userSession);
        if (!r1.A01(userSession).A2y() || !PromoteWhatsAppAccountType.SMB.equals(promoteData.A0l)) {
            return false;
        }
        return true;
    }

    public static final KtCSuperShape0S4100000_I2 A00(Class cls) {
        return new KtCSuperShape0S4100000_I2(CallerContext.A00(cls), "ig_android_whatsapp_asset_ig_to_fb_crossposting", "user", "correctnessTest", "hasWhatsappNumber");
    }

    public static final void A02(SpannableStringBuilder spannableStringBuilder, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        AnonymousClass3Zw.A01(spannableStringBuilder, new C29391xw(fragmentActivity, userSession, str2, C18210wN.A01(fragmentActivity)), str);
    }

    public static final void A03(FragmentActivity fragmentActivity, C82274pM r4, UserSession userSession, String str, String str2) {
        AnonymousClass0wJ.A1P(userSession, str);
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36328220664015172L)) {
            C84834tw.A00(fragmentActivity, C34572Kb.A00(C304921n.IG_WHATSAPP_LINK, userSession), str, str2);
            return;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("entrypoint", str2);
        A0y.put("back_stack_tag", str);
        C63743iE A02 = C63743iE.A02("com.instagram.wa_linking.ig_whatsapp_linking_upsell.UpsellScreen", A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(fragmentActivity, A0N, 2131838087);
        A0N.A04 = new PromoteCtwaLinkUtil$Companion$openWhatsAppLinkingFlow$fragment$1(r4);
        AnonymousClass1c8 A022 = C62853b1.A02(A0N, A02);
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        A0Q.A07 = str;
        A0Q.A08();
        A0Q.A03 = A022;
        A0Q.A05();
    }

    public final SpannableStringBuilder A06(FragmentActivity fragmentActivity, UserSession userSession) {
        String A0k = AnonymousClass0wJ.A0k(fragmentActivity, 2131833323);
        String A0k2 = AnonymousClass0wJ.A0k(fragmentActivity, 2131833324);
        String A0h = C18220wO.A0h(fragmentActivity, A0k, A0k2, 2131833322);
        C04220Ms.A06(A0h);
        SpannableStringBuilder A0E = C18200wM.A0E(A0h);
        A02(A0E, fragmentActivity, userSession, A0k, I17.A00(673));
        SpannableStringBuilder A0E2 = C18200wM.A0E(A0E);
        A02(A0E2, fragmentActivity, userSession, A0k2, "https://www.whatsapp.com/legal/commerce-policy/");
        return A0E2;
    }
}
