package X;

import android.content.SharedPreferences;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo;
import com.instagram.business.onelink.queries.whatsappbusiness.IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.42S  reason: invalid class name */
public final class AnonymousClass42S implements C84134sb {
    public C110456li A00;
    public final C564337e A01;
    public final AnonymousClass3I4 A02;
    public final C38039KHq A03;
    public final UserSession A04;

    public AnonymousClass42S(AnonymousClass3I4 r2, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = r2;
        this.A01 = new C564337e(userSession);
        this.A03 = AnonymousClass3LY.A00(userSession);
    }

    public final void AD5(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2) {
        C04220Ms.A0B(ktCSuperShape0S4100000_I2, 0);
        if (!C61533Tu.A00.A00(this.A04, ktCSuperShape0S4100000_I2.A01)) {
            this.A02.A00(ktCSuperShape0S4100000_I2, AnonymousClass42T.A00);
            return;
        }
        this.A00 = null;
        SharedPreferences.Editor A06 = C18250wR.A06(this.A01.A00);
        A06.remove("whatsapp_business_info");
        A06.apply();
        this.A03.CWx(C689546c.A00);
    }

    public final void AML(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2, C81354ne r21, C82234pI r22) {
        KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I22 = ktCSuperShape0S4100000_I2;
        C81354ne r15 = r21;
        boolean A1Z = AnonymousClass0wJ.A1Z(ktCSuperShape0S4100000_I22, r15);
        C61533Tu r4 = C61533Tu.A00;
        UserSession userSession = this.A04;
        if (!r4.A00(userSession, ktCSuperShape0S4100000_I22.A01)) {
            this.A02.A00(ktCSuperShape0S4100000_I22, r15);
            return;
        }
        GQLCallInputCInputShape0S0000000 A002 = AnonymousClass2KD.A00(ktCSuperShape0S4100000_I22, r15);
        C67463zb A003 = C67463zb.A00();
        C67463zb A004 = C67463zb.A00();
        C67463zb.A01(A002, A003);
        AnonymousClass3WK.A02(new PandoGraphQLRequest(C63233h2.A04(A1Z), "IGOneLinkMiddlewareWhatsAppBusinessQuery", GraphQlCallInput.A03(A003), GraphQlCallInput.A03(A004), IGOneLinkMiddlewareWhatsAppBusinessQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_one_link_monoschema"), new IDxACallbackShape5S0400000_1_I2(5, r15, r22, this, ktCSuperShape0S4100000_I22), userSession);
    }

    public final /* bridge */ /* synthetic */ Object AbO(KtCSuperShape0S4100000_I2 ktCSuperShape0S4100000_I2) {
        AnonymousClass3EH r3;
        C04220Ms.A0B(ktCSuperShape0S4100000_I2, 0);
        if (!C61533Tu.A00.A00(this.A04, ktCSuperShape0S4100000_I2.A01)) {
            this.A02.A00(ktCSuperShape0S4100000_I2, AnonymousClass42T.A00);
            return null;
        }
        C564337e r2 = this.A01;
        String A0h = C18200wM.A0h(r2.A00, "whatsapp_business_info");
        if (A0h == null) {
            return null;
        }
        C36975Ji8 ji8 = r2.A01;
        WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo = (WhatsAppBusinessCacheInfo) C18240wQ.A0a(WhatsAppBusinessCacheInfo.class, A0h, ji8, ji8.A02);
        if (whatsAppBusinessCacheInfo == null) {
            return null;
        }
        String str = whatsAppBusinessCacheInfo.A01;
        if (str != null) {
            r3 = new AnonymousClass3EH(str);
        } else {
            r3 = null;
        }
        return new C110456li(r3, whatsAppBusinessCacheInfo.A00, whatsAppBusinessCacheInfo.A03, whatsAppBusinessCacheInfo.A04, whatsAppBusinessCacheInfo.A02);
    }
}
