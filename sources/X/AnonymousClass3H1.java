package X;

import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0311000_I2;

/* renamed from: X.3H1  reason: invalid class name */
public final class AnonymousClass3H1 {
    public final AnonymousClass3V6 A00 = new AnonymousClass3V6(AnonymousClass1k7.A00);
    public final UserSession A01;

    public final Object A01(C83184qv r9, C146958n9 r10) {
        User A012 = C06810aP.A01.A01(this.A01);
        AnonymousClass3V6 r0 = this.A00;
        KtSLambdaShape2S0311000_I2 ktSLambdaShape2S0311000_I2 = new KtSLambdaShape2S0311000_I2(this, A012, r9, (C146958n9) null, 2, true);
        Unit unit = Unit.A00;
        Object A002 = r0.A00(unit, r10, ktSLambdaShape2S0311000_I2);
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return unit;
        }
        return A002;
    }

    public final Object A00(C83924sD r17, Long l, Long l2, C146958n9 r20, long j, long j2, boolean z, boolean z2) {
        User A012 = C06810aP.A01.A01(this.A01);
        AnonymousClass3V6 r0 = this.A00;
        QuietModeRepository$updateQuietModeWithWindows$2 quietModeRepository$updateQuietModeWithWindows$2 = new QuietModeRepository$updateQuietModeWithWindows$2(A012, r17, this, l, l2, (C146958n9) null, j, j2, z, z2);
        Unit unit = Unit.A00;
        Object A002 = r0.A00(unit, r20, quietModeRepository$updateQuietModeWithWindows$2);
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return unit;
        }
        return A002;
    }

    public /* synthetic */ AnonymousClass3H1(UserSession userSession) {
        this.A01 = userSession;
    }
}
