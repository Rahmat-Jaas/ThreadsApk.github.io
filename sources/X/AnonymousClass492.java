package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.492  reason: invalid class name */
public final class AnonymousClass492 implements AnonymousClass0i4 {
    public final C38039KHq A00;
    public final AnonymousClass42J A01;
    public final Map A02 = C18220wO.A0y();
    public final Map A03 = C18220wO.A0y();
    public final C04560Oe A04;
    public final C04560Oe A05;
    public final C83224qz A06;

    public final void A00(DirectThreadKey directThreadKey) {
        AnonymousClass34M r0;
        synchronized (this) {
            r0 = (AnonymousClass34M) this.A02.remove(directThreadKey);
        }
        if (r0 != null) {
            AnonymousClass42J r6 = this.A01;
            StringBuilder A0r = C18200wM.A0r();
            A0r.append(directThreadKey);
            A0r.append(" events being processed ");
            A0r.append(0);
            String A0i = C18180wK.A0i(" messages (added, updated or deleted", A0r);
            LinkedList linkedList = r6.A02;
            StringBuilder A0r2 = C18200wM.A0r();
            A0r2.append(System.currentTimeMillis() - r6.A01);
            A0r2.append(':');
            linkedList.add(C18180wK.A0i(A0i, A0r2));
            while (linkedList.size() > r6.A00) {
                linkedList.removeFirst();
            }
        }
    }

    public final void onSessionWillEnd() {
        AnonymousClass7Ja.A05((CancellationException) null, this.A06);
        this.A02.clear();
        this.A03.clear();
    }

    public AnonymousClass492(C38039KHq kHq, AnonymousClass42J r3, C04560Oe r4, C04560Oe r5, C83224qz r6) {
        this.A06 = r6;
        this.A00 = kHq;
        this.A01 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }
}
