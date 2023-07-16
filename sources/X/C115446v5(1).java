package X;

import java.util.Set;

/* renamed from: X.6v5  reason: invalid class name and case insensitive filesystem */
public abstract class C115446v5 {
    public final C143998hf A01(Class cls) {
        C143998hf r0;
        if (this instanceof AnonymousClass5rr) {
            AnonymousClass5rr r1 = (AnonymousClass5rr) this;
            if (r1.A02.contains(cls)) {
                return r1.A00.A01(cls);
            }
            throw new AnonymousClass88R(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
        }
        AnonymousClass5rs r12 = (AnonymousClass5rs) this;
        synchronized (r12) {
            if (cls != null) {
                r0 = (C143998hf) r12.A02.get(cls);
            } else {
                throw C18210wN.A0W("Null interface requested.");
            }
        }
        return r0;
    }

    public final C143998hf A02(Class cls) {
        C143998hf r0;
        if (this instanceof AnonymousClass5rr) {
            AnonymousClass5rr r1 = (AnonymousClass5rr) this;
            if (r1.A05.contains(cls)) {
                return r1.A00.A02(cls);
            }
            throw new AnonymousClass88R(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
        }
        AnonymousClass5rs r12 = (AnonymousClass5rs) this;
        synchronized (r12) {
            r0 = (AnonymousClass7oI) r12.A03.get(cls);
            if (r0 == null) {
                r0 = AnonymousClass5rs.A06;
            }
        }
        return r0;
    }

    public final Object A03(Class cls) {
        if (this instanceof AnonymousClass5rr) {
            AnonymousClass5rr r1 = (AnonymousClass5rr) this;
            if (r1.A01.contains(cls)) {
                Object A03 = r1.A00.A03(cls);
                if (!cls.equals(AnonymousClass8eW.class)) {
                    return A03;
                }
                return new AnonymousClass7oE((AnonymousClass8eW) A03, r1.A03);
            }
            throw new AnonymousClass88R(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
        }
        C143998hf A01 = A01(cls);
        if (A01 == null) {
            return null;
        }
        return A01.get();
    }

    public final Set A04(Class cls) {
        if (!(this instanceof AnonymousClass5rr)) {
            return (Set) A02(cls).get();
        }
        AnonymousClass5rr r1 = (AnonymousClass5rr) this;
        if (r1.A04.contains(cls)) {
            return r1.A00.A04(cls);
        }
        throw new AnonymousClass88R(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
