package X;

/* renamed from: X.5C8  reason: invalid class name */
public abstract class AnonymousClass5C8 extends AnonymousClass7JN {
    public abstract void A01(C28051Exi exi, Object obj);

    public final void A02(Iterable iterable) {
        C04220Ms.A0B(iterable, 0);
        C28051Exi acquire = acquire();
        try {
            for (Object A01 : iterable) {
                A01(acquire, A01);
                acquire.AKx();
            }
        } finally {
            release(acquire);
        }
    }

    public abstract String createQuery();

    public final int A00(Object obj) {
        C28051Exi acquire = acquire();
        try {
            A01(acquire, obj);
            return acquire.AKx();
        } finally {
            release(acquire);
        }
    }

    public AnonymousClass5C8(C41259M6w m6w) {
        super(m6w);
    }
}
