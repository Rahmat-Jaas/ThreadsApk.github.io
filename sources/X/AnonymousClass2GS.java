package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.api.base.IDxACallbackShape2S1200000_1_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.2GS  reason: invalid class name */
public final class AnonymousClass2GS {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        String A0D = C63893iY.A0D(r12, 0);
        boolean A01 = AnonymousClass3WF.A01(r12, A1Z ? 1 : 0);
        C109326jp A06 = C63893iY.A06(r12, 2);
        String A08 = AnonymousClass00U.A08(System.currentTimeMillis(), "");
        C10300i6 A0F = C63913ic.A0F(r11);
        if (!(A0F instanceof UserSession)) {
            AnonymousClass3VO A00 = AnonymousClass3VO.A00();
            A00.A02(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, 0);
            C63893iY.A0F(r11, A00, A06, "", A1Z);
            return null;
        }
        IDxACallbackShape2S1200000_1_I2 iDxACallbackShape2S1200000_1_I2 = new IDxACallbackShape2S1200000_1_I2(r11, A06, A08, 0);
        Context A082 = C18230wP.A08();
        UserSession userSession = (UserSession) A0F;
        Uri A012 = C15430rJ.A01(A0D);
        String A083 = AnonymousClass00U.A08(System.currentTimeMillis(), "");
        H8a A002 = C33322Fg.A00(A082, A012, userSession, A083, A1Z);
        GXN gxn = new GXN();
        gxn.A05("share_to_feed", Boolean.toString(A01));
        A002.A00 = new AnonymousClass1lU(iDxACallbackShape2S1200000_1_I2, gxn, userSession, A083);
        C31155GhB.A00().schedule(A002);
        return null;
    }
}
