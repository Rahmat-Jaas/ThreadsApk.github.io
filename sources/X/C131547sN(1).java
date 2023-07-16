package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7sN  reason: invalid class name and case insensitive filesystem */
public final class C131547sN implements C10390iG {
    public static C131547sN A02;
    public AnonymousClass760 A00;
    public C104776cM A01 = new C104776cM();

    public C131547sN(Context context, UserSession userSession) {
        this.A00 = new AnonymousClass760(context, C13330nS.A01(new C130337pm(), userSession), userSession);
    }

    public final void onAppBackgrounded() {
        int i;
        int A03 = C14030oh.A03(1730655972);
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, this.A00.A02, 36311109514297742L)) {
            i = 1046696534;
        } else {
            AtomicBoolean atomicBoolean = this.A01.A00;
            if (!atomicBoolean.getAndSet(true)) {
                if (C18180wK.A05(C18200wM.A0C(), "bigfoot_reporter_last_foreground_measurement") < System.currentTimeMillis() - 86400000) {
                    AnonymousClass0gN.A00().AKp(new C954660v(this));
                } else {
                    atomicBoolean.set(false);
                }
            }
            i = 1001981991;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        C14030oh.A0A(916252009, C14030oh.A03(1805108369));
    }
}
