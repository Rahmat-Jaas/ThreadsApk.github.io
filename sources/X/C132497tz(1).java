package X;

import android.content.Context;
import com.facebook.papaya.store.PapayaStore;
import com.facebook.redex.IDxAFunctionShape269S0200000_2_I2;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.7tz  reason: invalid class name and case insensitive filesystem */
public final class C132497tz implements AnonymousClass0i1 {
    public final Context A00;
    public final UserSession A01;

    public static final ListenableFuture A00(C132497tz r5) {
        Context context = r5.A00;
        UserSession userSession = r5.A01;
        AnonymousClass0wJ.A1N(context, userSession);
        C127057gS r3 = (C127057gS) userSession.A01(C127057gS.class, C86154wM.A11(context, userSession, 4));
        AnonymousClass0wJ.A1N(context, userSession);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C1366783w it = ((C132437tt) userSession.A01(C132437tt.class, C86154wM.A11(context, userSession, 6))).A00().iterator();
        while (it.hasNext()) {
            C146148lj r0 = (C146148lj) it.next();
            C04220Ms.A04(r0);
            A0v.add(r3.CwR(r0));
        }
        return new C34500IYm(ImmutableList.copyOf((Iterable) A0v), C1368484q.A00, C97356Ba.A01);
    }

    public final void A01() {
        ListenableFuture listenableFuture;
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (!C63803iN.A0E(r2, userSession, 36320850500327715L)) {
            Context context = this.A00;
            AnonymousClass0wJ.A1N(context, userSession);
            C132437tt r3 = (C132437tt) userSession.A01(C132437tt.class, C86154wM.A11(context, userSession, 6));
            PapayaStore A002 = AnonymousClass6HW.A00(userSession, C63803iN.A0C(r2, userSession, 36882335870812444L));
            if (((long) AnonymousClass7AM.A01.A03(100)) < AnonymousClass8bI.A07(C63803iN.A03(r2, userSession, 36600860893580889L), 0, 100)) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                Random random = new Random();
                Iterator it = AnonymousClass6XK.A00.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C04220Ms.A04(next);
                    A0y.put(next, Double.valueOf(random.nextDouble()));
                }
                C112966qU r10 = new C112966qU(9001);
                Iterator A0z = AnonymousClass0wJ.A0z(A0y);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    r10.A01.put(Long.valueOf(C18190wL.A08(A0o.getKey())), Double.valueOf(C86124wJ.A00(A0o.getValue())));
                }
                listenableFuture = C34497IYj.A00(AnonymousClass7n8.A00, r10.A00().A00(A002, 604800000), C97356Ba.A01);
            } else {
                listenableFuture = AnonymousClass5ro.A01;
            }
            C34497IYj.A01(new IDxAFunctionShape269S0200000_2_I2(0, r3, this), listenableFuture, context.getMainExecutor());
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        UserSession userSession = this.A01;
        if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36320850500327715L)) {
            Context context = this.A00;
            AnonymousClass0wJ.A1N(context, userSession);
            ((C127057gS) userSession.A01(C127057gS.class, C86154wM.A11(context, userSession, 4))).D8A();
        }
    }

    public C132497tz(Context context, UserSession userSession) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
