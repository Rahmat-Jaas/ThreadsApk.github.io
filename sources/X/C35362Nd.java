package X;

import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape66S0100000_I2_46;

/* renamed from: X.2Nd  reason: invalid class name and case insensitive filesystem */
public final class C35362Nd {
    public static final MutedWordsFilterManager A00(UserSession userSession) {
        if (C549130w.A00 == null) {
            return null;
        }
        return (MutedWordsFilterManager) userSession.A01(MutedWordsFilterManager.class, new KtLambdaShape66S0100000_I2_46(userSession, 34));
    }
}
