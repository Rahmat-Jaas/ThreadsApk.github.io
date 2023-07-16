package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.2MZ  reason: invalid class name */
public final class AnonymousClass2MZ {
    public static final C58363Ff A00(FragmentActivity fragmentActivity, AnonymousClass24S r5, UserSession userSession) {
        AnonymousClass0wJ.A1M(fragmentActivity, 0, r5);
        Bundle A06 = C18180wK.A06();
        C58363Ff r2 = new C58363Ff(A06, fragmentActivity);
        AnonymousClass4BQ r0 = new AnonymousClass4BQ();
        ConcurrentLinkedQueue concurrentLinkedQueue = r2.A02;
        concurrentLinkedQueue.add(r0);
        concurrentLinkedQueue.add(new AnonymousClass4BS(userSession));
        concurrentLinkedQueue.add(new AnonymousClass4BV(userSession));
        concurrentLinkedQueue.add(new AnonymousClass4BT(r5));
        concurrentLinkedQueue.add(new AnonymousClass4BU(userSession));
        concurrentLinkedQueue.add(new AnonymousClass4BW(userSession));
        concurrentLinkedQueue.add(new AnonymousClass4BR(userSession));
        AnonymousClass4BZ r02 = new AnonymousClass4BZ(A06, userSession);
        ConcurrentLinkedQueue concurrentLinkedQueue2 = r2.A03;
        concurrentLinkedQueue2.add(r02);
        concurrentLinkedQueue2.add(new AnonymousClass4Ba(A06, userSession));
        concurrentLinkedQueue2.add(new C69904Bb(A06, userSession));
        concurrentLinkedQueue2.add(new AnonymousClass4Bd(A06, userSession));
        concurrentLinkedQueue2.add(new C69914Bc(A06, userSession));
        concurrentLinkedQueue2.add(new AnonymousClass4BY(A06, userSession));
        concurrentLinkedQueue2.add(new AnonymousClass4BX(A06, userSession));
        return r2;
    }
}
