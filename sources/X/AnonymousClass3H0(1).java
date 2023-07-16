package X;

import android.content.Context;
import com.instagram.common.api.base.IDxACallbackShape38S0200000_4_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110;
import kotlin.jvm.internal.KtLambdaShape165S0100000_I2_20;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1210000_I2;

/* renamed from: X.3H0  reason: invalid class name */
public final class AnonymousClass3H0 {
    public final UserSession A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape130S0100000_I2_110(this, 41));

    public AnonymousClass3H0(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Context context, AnonymousClass06E r13, C11630kW r14, String str, boolean z) {
        C04530Oa r1 = this.A01;
        Object A0d = C18180wK.A0d(r1);
        C04220Ms.A0A(A0d);
        boolean A1X = AnonymousClass0wJ.A1X(A0d);
        M5J A0J = C18230wP.A0J(r1);
        boolean z2 = z;
        Boolean valueOf = Boolean.valueOf(z2);
        A0J.A0H(valueOf);
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A00;
        C18240wQ.A0W(userSession, r0).Ci4(valueOf);
        KtLambdaShape4S1210000_I2 ktLambdaShape4S1210000_I2 = new KtLambdaShape4S1210000_I2(this, r14, str, 7, z2);
        KtLambdaShape4S0110000_I2 ktLambdaShape4S0110000_I2 = new KtLambdaShape4S0110000_I2(34, this, A1X);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        A0O.A0J("commerce/shopping_auto_highlight/update/");
        A0O.A0R("enable_auto_highlight", z2);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class);
        C63873iU.A0F(A0T, ktLambdaShape4S0110000_I2, ktLambdaShape4S1210000_I2, 47);
        C31155GhB.A01(context, r13, A0T);
    }

    public final void A01(Context context, AnonymousClass06E r12, AnonymousClass0ZU r13, AnonymousClass0YY r14) {
        C04220Ms.A0B(r14, 2);
        UserSession userSession = this.A00;
        KtLambdaShape165S0100000_I2_20 ktLambdaShape165S0100000_I2_20 = new KtLambdaShape165S0100000_I2_20(r14, 5);
        Context context2 = context;
        C32165H8c A002 = C63663i4.A00(context2, userSession, AnonymousClass006.A0Y, (Long) null, userSession.getUserId(), false);
        A002.A00 = new IDxACallbackShape38S0200000_4_I2(14, ktLambdaShape165S0100000_I2_20, r13);
        C31155GhB.A01(context, r12, A002);
    }
}
