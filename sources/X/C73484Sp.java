package X;

import android.content.Context;
import com.facebook.redex.IDxRCallbackShape39S0400000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape4S0110000_I2;

/* renamed from: X.4Sp  reason: invalid class name and case insensitive filesystem */
public final class C73484Sp implements Runnable {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ C109326jp A02;
    public final /* synthetic */ boolean A03;

    public C73484Sp(AnonymousClass601 r1, C109326jp r2, C109326jp r3, boolean z) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = z;
    }

    public final void run() {
        AnonymousClass601 r4 = this.A00;
        UserSession A0J = C63913ic.A0J(r4);
        C109326jp r5 = this.A02;
        C109326jp r6 = this.A01;
        boolean z = this.A03;
        if (C63803iN.A0E(C18180wK.A0J(A0J), A0J, 36315700834929367L)) {
            if (AnonymousClass2NN.A00(A0J).A00 == null) {
                AnonymousClass2NN.A00(A0J).A00();
            }
            GJS gjs = AnonymousClass2NN.A00(A0J).A00;
            if (gjs != null) {
                gjs.A01(true, new KtLambdaShape4S0110000_I2(11, A0J, true));
            }
        } else {
            Context A08 = C18230wP.A08();
            C04220Ms.A0B(r4, 0);
            C63493hb.A06(A08, AnonymousClass06E.A00(C63913ic.A05(r4)), A0J, new IDxRCallbackShape39S0400000_1_I2(r4, r5, r6, A0J, 2), "disabled", true);
        }
        if (z) {
            Context A082 = C18230wP.A08();
            C04220Ms.A0B(r4, 0);
            C63493hb.A06(A082, AnonymousClass06E.A00(C63913ic.A05(r4)), A0J, new IDxRCallbackShape39S0400000_1_I2(r4, r5, r6, A0J, 2), "copresence_disabled", true);
        }
    }
}
