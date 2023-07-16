package X;

import kotlin.Unit;

/* renamed from: X.4kx  reason: invalid class name and case insensitive filesystem */
public final class C79974kx extends C02220Ah implements AnonymousClass0YY {
    public static final C79974kx A00 = new C79974kx();

    public C79974kx() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (!(th instanceof AnonymousClass8A0)) {
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            C10450iM.A03(C28174Ezk.A00(332), AnonymousClass00U.A0L("Error while waiting on cross posting media configure : ", str));
        }
        return Unit.A00;
    }
}
