package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;

/* renamed from: X.7dS  reason: invalid class name and case insensitive filesystem */
public final class C125547dS implements C33982HyP {
    public String A00;
    public final EffectCollectionService A01;
    public final C105406dN A02;
    public final UserSession A03;
    public final C83224qz A04;

    public final void Bac(GQN gqn, String str) {
        C04220Ms.A0B(gqn, 0);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape15S0201000_I2_1((Object) this, (Object) gqn, (C146958n9) null, 16), this.A04, 3);
    }

    public /* synthetic */ C125547dS(Context context, C105406dN r6, UserSession userSession) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        this.A03 = userSession;
        this.A02 = r6;
        this.A01 = AnonymousClass6LZ.A00(context, userSession);
        this.A04 = C84874u0.A00(A0J, 345149159, 3);
    }

    public final void CkU(String str) {
        this.A00 = str;
    }
}
