package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.IDxRImplShape195S0000000_2_I2;

/* renamed from: X.773  reason: invalid class name */
public final class AnonymousClass773 {
    public int A00;
    public AnonymousClass89E A01;
    public AnonymousClass89E A02;
    public C146128lg A03;
    public Executor A04 = L8O.A03;
    public final C113236qy A05;
    public final C112356pR A06;
    public final C108656ij A07;
    public final List A08;
    public final CopyOnWriteArrayList A09 = new CopyOnWriteArrayList();
    public final AnonymousClass0A8 A0A;

    public static final void A00(AnonymousClass773 r1, AnonymousClass89E r2, AnonymousClass89E r3) {
        Iterator it = r1.A09.iterator();
        while (it.hasNext()) {
            ((C124987cE) ((C141908dS) it.next())).A00.invoke(r2, r3);
        }
    }

    public AnonymousClass773(JWT jwt, C41030Luu luu) {
        AnonymousClass59T r2 = new AnonymousClass59T(this);
        this.A06 = r2;
        this.A0A = new IDxRImplShape195S0000000_2_I2(r2, 0);
        this.A08 = new CopyOnWriteArrayList();
        this.A05 = new AnonymousClass59R(this);
        this.A03 = new MAU(luu);
        synchronized (AnonymousClass6ZV.A01) {
            if (AnonymousClass6ZV.A00 == null) {
                AnonymousClass6ZV.A00 = Executors.newFixedThreadPool(2);
            }
        }
        this.A07 = new C108656ij(jwt, (Executor) null, AnonymousClass6ZV.A00);
    }
}
