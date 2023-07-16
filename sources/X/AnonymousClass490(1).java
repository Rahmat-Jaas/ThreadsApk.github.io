package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.KtLambdaShape158S0100000_I2_13;

/* renamed from: X.490  reason: invalid class name */
public final class AnonymousClass490 implements AnonymousClass0i4 {
    public final C62113Xe A00;
    public final UserSession A01;
    public final Map A02 = C18220wO.A0y();
    public final C83224qz A03;

    public /* synthetic */ AnonymousClass490(C62113Xe r3, UserSession userSession) {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        C04220Ms.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r3;
        this.A03 = AnonymousClass7Ja.A03(A0J.A03);
    }

    public final Object A00(Context context, Integer num, String str, C146958n9 r9) {
        C62113Xe r4 = this.A00;
        C27420EnC enC = new C27420EnC(1, C25598DoY.A02(r9));
        enC.A0D();
        r4.A00.A02(new AnonymousClass47M(r4, num, str, enC), ((E1T) r4.A04.getValue()).A00(context, C62113Xe.A05));
        enC.BQt(new KtLambdaShape158S0100000_I2_13(r4, 46));
        return enC.A0B();
    }

    public final void onSessionWillEnd() {
        C62113Xe r1 = this.A00;
        r1.A00.A01();
        ((E1T) r1.A04.getValue()).A00.A0C();
        AnonymousClass7Ja.A05((CancellationException) null, this.A03);
    }
}
