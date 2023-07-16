package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape47S0100000_I2_27;

/* renamed from: X.1sG  reason: invalid class name and case insensitive filesystem */
public final class C27281sG extends AnonymousClass494 {
    public final UserSession A00;

    public C27281sG(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(UserSession userSession, Context context, boolean z) {
        AnonymousClass0wJ.A1N(userSession, context);
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("KEY_IS_NEW_REMIX_VERSION", z);
        ((AnonymousClass494) userSession.A01(C27281sG.class, new KtLambdaShape47S0100000_I2_27(userSession, 19))).A02(context, A06);
    }
}
