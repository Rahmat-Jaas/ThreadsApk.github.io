package X;

import com.facebook.memorytimeline.MemoryTimeline;
import java.lang.ref.WeakReference;

/* renamed from: X.0VV  reason: invalid class name */
public final class AnonymousClass0VV {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = false;
    public boolean A03 = false;
    public final AnonymousClass0T0 A04 = new C08180cv(this);
    public final AnonymousClass0VU A05;
    public final C03570Jn A06 = new AnonymousClass077(this);
    public final C08150cr A07 = new C08150cr(this);
    public final C08170cu A08 = new C08170cu(this);
    public final Object A09 = new Object();
    public final Object A0A = new Object();

    public static void A00(MemoryTimeline memoryTimeline, AnonymousClass0VV r6) {
        if (r6.A01 != 0) {
            synchronized (r6.A0A) {
                if (memoryTimeline == null) {
                    C08170cu r3 = r6.A08;
                    synchronized (AnonymousClass0T8.class) {
                        if (AnonymousClass0T8.A00 == null && r3 != null) {
                            AnonymousClass0T8.A01.add(new WeakReference(r3));
                        }
                        memoryTimeline = AnonymousClass0T8.A00;
                    }
                    if (memoryTimeline == null) {
                    }
                }
                r6.A03 = true;
                memoryTimeline.A7k(r6.A04);
            }
        }
    }

    public static void A01(AnonymousClass0T4 r5, AnonymousClass0VV r6) {
        if (r6.A00 != 0) {
            synchronized (r6.A09) {
                if (r5 == null) {
                    C08150cr r3 = r6.A07;
                    synchronized (AnonymousClass0T7.class) {
                        if (AnonymousClass0T7.A00 == null && r3 != null) {
                            AnonymousClass0T7.A01.add(new WeakReference(r3));
                        }
                        r5 = AnonymousClass0T7.A00;
                    }
                    if (r5 == null) {
                    }
                }
                if (r5.BW1()) {
                    r6.A02 = true;
                    r5.A6Q(r6.A06);
                }
            }
        }
    }

    public final void A02() {
        MemoryTimeline memoryTimeline;
        AnonymousClass0T4 r1;
        synchronized (this.A09) {
            if (this.A02) {
                synchronized (AnonymousClass0T7.class) {
                    r1 = AnonymousClass0T7.A00;
                }
                if (r1 != null) {
                    r1.Cbt(this.A06);
                    this.A02 = false;
                }
            }
        }
        synchronized (this.A0A) {
            if (this.A03) {
                synchronized (AnonymousClass0T8.class) {
                    memoryTimeline = AnonymousClass0T8.A00;
                }
                if (memoryTimeline != null) {
                    memoryTimeline.CcT(this.A04);
                    this.A03 = false;
                }
            }
        }
    }

    public AnonymousClass0VV(AnonymousClass0VU r3, int i) {
        this.A05 = r3;
        if ((i & 1) != 0) {
            this.A00 = (i & -256) >> 8;
            A01((AnonymousClass0T4) null, this);
        }
        if ((i & 2) != 0) {
            this.A01 = (i & -256) >> 8;
            A00((MemoryTimeline) null, this);
        }
    }
}
