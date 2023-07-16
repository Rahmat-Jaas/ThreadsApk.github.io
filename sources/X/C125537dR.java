package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

/* renamed from: X.7dR  reason: invalid class name and case insensitive filesystem */
public final class C125537dR implements C33982HyP {
    public String A00;
    public final C104416bk A01;
    public final EffectCollectionService A02;
    public final UserSession A03;
    public final C83224qz A04;

    public final void Bac(GQN gqn, String str) {
        C04220Ms.A0B(gqn, 0);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0201000_I2((Object) gqn, (Object) this, (C146958n9) null, 48), this.A04, 3);
    }

    public C125537dR(Context context, C104416bk r3, UserSession userSession, C83224qz r5) {
        this.A03 = userSession;
        this.A01 = r3;
        this.A04 = r5;
        this.A02 = AnonymousClass6LZ.A00(context, userSession);
    }

    public final void CkU(String str) {
        this.A00 = str;
    }
}
