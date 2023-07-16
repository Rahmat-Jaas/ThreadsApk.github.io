package X;

import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0402000_I2;

/* renamed from: X.7x8  reason: invalid class name */
public final class AnonymousClass7x8 implements C04860Pl {
    public final /* bridge */ /* synthetic */ void AKs(UserSession userSession, C04850Pk r11, AnonymousClass0PT r12) {
        C134177xA r122 = (C134177xA) r12;
        UserSession userSession2 = userSession;
        C04850Pk r5 = r11;
        AnonymousClass0wJ.A1M(userSession, 0, r11);
        if (r122 != null) {
            ConfigureMediaStep configureMediaStep = r122.A02;
            C30936GbS gbS = r122.A01;
            int i = r122.A00;
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0402000_I2((Object) configureMediaStep, (Object) gbS, (Object) userSession2, (Object) r5, (C146958n9) null, i, 3), AnonymousClass7Ja.A03(C25295DjG.A02), 3);
            return;
        }
        throw C18180wK.A0a("Payload for ConfigureMediaOperation cannot be null!");
    }
}
