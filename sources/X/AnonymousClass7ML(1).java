package X;

import android.os.IBinder;
import java.util.List;

/* renamed from: X.7ML  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7ML implements IBinder.DeathRecipient {
    public final /* synthetic */ AnonymousClass7EO A00;

    public /* synthetic */ AnonymousClass7ML(AnonymousClass7EO r1) {
        this.A00 = r1;
    }

    public final void binderDied() {
        AnonymousClass7EO r5 = this.A00;
        AnonymousClass77Q r2 = r5.A06;
        r2.A01("reportBinderDeath", C86164wN.A1T());
        r5.A08.get();
        r2.A01("%s : Binder has died.", "IntegrityService");
        List<AnonymousClass83O> list = r5.A09;
        for (AnonymousClass83O A002 : list) {
            A002.A00(C86144wL.A0H("IntegrityService"));
        }
        list.clear();
        AnonymousClass7EO.A00(r5);
    }
}
