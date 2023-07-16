package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;

/* renamed from: X.6yw  reason: invalid class name and case insensitive filesystem */
public final class C117596yw {
    public static final C38078KJx A00() {
        C38078KJx kJx = C38078KJx.A0D;
        if (kJx != null) {
            return kJx;
        }
        throw C18180wK.A0a("IgSystemAudioVolumeObserver never initialized");
    }

    public static final void A01(Context context, UserSession userSession) {
        C38078KJx.A0D = (C38078KJx) userSession.A01(C38078KJx.class, new KtLambdaShape18S0200000_I2_2(17, context, userSession));
    }
}
