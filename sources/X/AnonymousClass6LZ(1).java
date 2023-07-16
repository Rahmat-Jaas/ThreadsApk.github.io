package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;

/* renamed from: X.6LZ  reason: invalid class name */
public final class AnonymousClass6LZ {
    public static final EffectCollectionService A00(Context context, UserSession userSession) {
        AnonymousClass0wJ.A1N(userSession, context);
        return (EffectCollectionService) userSession.A01(EffectCollectionService.class, new KtLambdaShape18S0200000_I2_2(4, context, userSession));
    }
}
