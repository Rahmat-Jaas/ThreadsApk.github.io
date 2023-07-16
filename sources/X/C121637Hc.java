package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;

/* renamed from: X.7Hc  reason: invalid class name and case insensitive filesystem */
public final class C121637Hc {
    public static final C142868fj A01(AnonymousClass0YP r2) {
        C04220Ms.A0B(r2, 0);
        C122127Kl.A08(C122127Kl.A08);
        synchronized (C122127Kl.A04) {
            C122127Kl.A05.add(r2);
        }
        return new AnonymousClass7We(r2);
    }

    public static final Object A03(AnonymousClass0ZU r9, AnonymousClass0YY r10) {
        Snapshot snapshot;
        Snapshot A05;
        AnonymousClass53I r4;
        C04220Ms.A0B(r9, 2);
        AnonymousClass0YY r5 = r10;
        if (r10 == null) {
            return r9.invoke();
        }
        C40948Lsi lsi = C122127Kl.A02;
        Snapshot snapshot2 = (Snapshot) lsi.A00();
        if (snapshot2 == null || (snapshot2 instanceof AnonymousClass53I)) {
            if (snapshot2 instanceof AnonymousClass53I) {
                r4 = (AnonymousClass53I) snapshot2;
            } else {
                r4 = null;
            }
            snapshot = new AnonymousClass53E(r4, r5, (AnonymousClass0YY) null, true, false);
        } else {
            snapshot = snapshot2.A06(r10);
        }
        try {
            A05 = snapshot.A05();
            Object invoke = r9.invoke();
            lsi.A01(A05);
            snapshot.A0A();
            return invoke;
        } catch (Throwable th) {
            snapshot.A0A();
            throw th;
        }
    }

    public static final Snapshot A02() {
        return C122127Kl.A01((Snapshot) C122127Kl.A02.A00(), (AnonymousClass0YY) null, false);
    }

    public static final void A04() {
        boolean z;
        synchronized (C122127Kl.A04) {
            Set A0N = ((AnonymousClass53C) C122127Kl.A07.get()).A0N();
            z = false;
            if (A0N != null && C18190wL.A1a(A0N)) {
                z = true;
            }
        }
        if (z) {
            C122127Kl.A08(AnonymousClass8LS.A00);
        }
    }

    public static final AnonymousClass53I A00(AnonymousClass0YY r2, AnonymousClass0YY r3) {
        AnonymousClass53I r1;
        AnonymousClass53I A0K;
        Snapshot A00 = C122127Kl.A00();
        if ((A00 instanceof AnonymousClass53I) && (r1 = (AnonymousClass53I) A00) != null && (A0K = r1.A0K(r2, r3)) != null) {
            return A0K;
        }
        throw C18180wK.A0a("Cannot create a mutable snapshot of an read-only snapshot");
    }
}
