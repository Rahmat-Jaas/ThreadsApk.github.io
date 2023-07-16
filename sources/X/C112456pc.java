package X;

import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;

/* renamed from: X.6pc  reason: invalid class name and case insensitive filesystem */
public final class C112456pc {
    public final C31580Grx A00;
    public final UserSession A01;
    public final String A02;

    public C112456pc(C31580Grx grx, UserSession userSession, String str) {
        C04220Ms.A0B(grx, 2);
        this.A01 = userSession;
        this.A00 = grx;
        this.A02 = str;
    }

    public final C84714tk A00() {
        UserSession userSession = this.A01;
        String str = this.A02;
        H1T A0P = C18180wK.A0P(userSession);
        String A002 = C18170wI.A00(159);
        A0P.A0F(AnonymousClass006.A0N);
        String A0V = AnonymousClass00U.A0V("creators/", A002, "async_get_content_appreciation_settings/");
        C04220Ms.A06(A0V);
        A0P.A0J(A0V);
        A0P.A0B(AnonymousClass5sf.class, C117186yH.class);
        C32165H8c A0T = C18200wM.A0T(A0P, C61953Wm.A00(), str);
        C04220Ms.A0C(A0T, AnonymousClass000.A00(1017));
        return C63623hv.A08(new KtSLambdaShape5S0200000_I2(this, (C146958n9) null, 16), new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape11S0100000_I2(29, (C146958n9) null), AnonymousClass2L9.A00(new KtSLambdaShape11S0100000_I2(28, (C146958n9) null), C86164wN.A13(A0T, 909209444, 0)), 3));
    }
}
