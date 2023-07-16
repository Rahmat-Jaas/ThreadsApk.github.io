package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.8AJ  reason: invalid class name */
public abstract class AnonymousClass8AJ<E> extends AnonymousClass83X<E> implements List<E>, C03740Kn {
    public final int A08() {
        if (this instanceof AnonymousClass8bW) {
            return ((AnonymousClass8bW) this).A00.length;
        }
        if (this instanceof AnonymousClass8bX) {
            return ((AnonymousClass8bX) this).A01;
        }
        if (this instanceof AnonymousClass8AH) {
            return ((AnonymousClass8AH) this).A00;
        }
        if (this instanceof AnonymousClass8AB) {
            return ((AnonymousClass8AB) this).A00.A01.groupCount() + 1;
        }
        if (this instanceof AnonymousClass8AG) {
            return ((AnonymousClass8AG) this).A00;
        }
        if (this instanceof AnonymousClass8A9) {
            return ((AnonymousClass8A9) this).A00.size();
        }
        if (this instanceof AnonymousClass8AF) {
            return ((AnonymousClass8AF) this).A00;
        }
        if (this instanceof AnonymousClass8AE) {
            return ((AnonymousClass8AE) this).A00;
        }
        if (this instanceof AnonymousClass8AA) {
            AnonymousClass8AA r2 = (AnonymousClass8AA) this;
            return C86164wN.A06(r2.A02, r2.A01) + r2.A00;
        } else if (this instanceof AnonymousClass53A) {
            return ((AnonymousClass53A) this).A00.length;
        } else {
            if (this instanceof AnonymousClass53B) {
                return ((AnonymousClass53B) this).A01;
            }
            return ((AnonymousClass8AC) this).A00;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C04220Ms.A0B(collection, 1);
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object A0I : this) {
            if (!C04220Ms.A0I(A0I, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r6 >= r4.A01) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(int r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass8AH
            if (r0 == 0) goto L_0x0016
            r2 = r5
            X.8AH r2 = (X.AnonymousClass8AH) r2
            int r0 = r2.A00
            X.AnonymousClass7C1.A00(r6, r0)
            X.8s2 r1 = r2.A02
            int r0 = r2.A01
            int r0 = r0 + r6
            java.lang.Object r0 = r1.get(r0)
        L_0x0015:
            return r0
        L_0x0016:
            boolean r0 = r5 instanceof X.AnonymousClass8AB
            if (r0 == 0) goto L_0x002a
            r0 = r5
            X.8AB r0 = (X.AnonymousClass8AB) r0
            X.6lE r0 = r0.A00
            java.util.regex.Matcher r0 = r0.A01
            java.lang.String r0 = r0.group(r6)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = ""
            return r0
        L_0x002a:
            boolean r0 = r5 instanceof X.AnonymousClass8AG
            if (r0 == 0) goto L_0x0043
            r3 = r5
            X.8AG r3 = (X.AnonymousClass8AG) r3
            int r0 = r3.size()
            X.C120667By.A00(r6, r0)
            java.lang.Object[] r2 = r3.A03
            int r1 = r3.A01
            int r1 = r1 + r6
            int r0 = r3.A02
            int r1 = r1 % r0
            r0 = r2[r1]
            return r0
        L_0x0043:
            boolean r0 = r5 instanceof X.AnonymousClass8A9
            if (r0 == 0) goto L_0x0055
            r0 = r5
            X.8A9 r0 = (X.AnonymousClass8A9) r0
            java.util.List r1 = r0.A00
            int r0 = X.AnonymousClass00Z.A0n(r0, r6)
            java.lang.Object r0 = r1.get(r0)
            return r0
        L_0x0055:
            boolean r0 = r5 instanceof X.AnonymousClass8AF
            if (r0 == 0) goto L_0x006b
            r2 = r5
            X.8AF r2 = (X.AnonymousClass8AF) r2
            int r0 = r2.A00
            X.C120667By.A00(r6, r0)
            java.util.List r1 = r2.A02
            int r0 = r2.A01
            int r0 = r0 + r6
            java.lang.Object r0 = r1.get(r0)
            return r0
        L_0x006b:
            boolean r0 = r5 instanceof X.AnonymousClass8AE
            if (r0 == 0) goto L_0x0081
            r2 = r5
            X.8AE r2 = (X.AnonymousClass8AE) r2
            int r0 = r2.A00
            X.C120667By.A00(r6, r0)
            X.8AJ r1 = r2.A02
            int r0 = r2.A01
            int r0 = r0 + r6
            java.lang.Object r0 = r1.get(r0)
            return r0
        L_0x0081:
            boolean r0 = r5 instanceof X.AnonymousClass8AA
            if (r0 == 0) goto L_0x00c0
            r4 = r5
            X.8AA r4 = (X.AnonymousClass8AA) r4
            if (r6 < 0) goto L_0x008f
            int r1 = r4.A01
            r0 = 1
            if (r6 < r1) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            r3 = 0
            if (r0 != 0) goto L_0x00a5
            int r2 = r4.A01
            java.util.List r1 = r4.A02
            int r0 = r1.size()
            int r0 = r0 + r2
            if (r6 >= r0) goto L_0x00a6
            if (r2 > r6) goto L_0x00a6
            int r6 = r6 - r2
            java.lang.Object r3 = r1.get(r6)
        L_0x00a5:
            return r3
        L_0x00a6:
            int r1 = X.C86164wN.A06(r1, r2)
            int r0 = r4.size()
            if (r6 >= r0) goto L_0x00b3
            if (r1 > r6) goto L_0x00b3
            return r3
        L_0x00b3:
            java.lang.String r2 = "Illegal attempt to access index "
            java.lang.String r1 = " in ItemSnapshotList of size "
            int r0 = r4.size()
            java.lang.IndexOutOfBoundsException r0 = X.C86114wI.A0a(r2, r1, r6, r0)
            throw r0
        L_0x00c0:
            r2 = r5
            X.8AC r2 = (X.AnonymousClass8AC) r2
            int r0 = r2.A00
            X.C120407Al.A00(r6, r0)
            X.8rx r1 = r2.A02
            int r0 = r2.A01
            int r0 = r0 + r6
            java.lang.Object r0 = r1.get(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AJ.get(int):java.lang.Object");
    }

    public ListIterator listIterator(int i) {
        return new AnonymousClass8A8(this, i);
    }

    public final List subList(int i, int i2) {
        if (this instanceof AnonymousClass8AI) {
            return new AnonymousClass8AH((AnonymousClass8AI) this, i, i2);
        }
        if (this instanceof AnonymousClass8AH) {
            AnonymousClass8AH r2 = (AnonymousClass8AH) this;
            AnonymousClass7C1.A02(i, i2, r2.A00);
            AnonymousClass8s2 r1 = r2.A02;
            int i3 = r2.A01;
            return new AnonymousClass8AH(r1, i + i3, i3 + i2);
        } else if (this instanceof AnonymousClass8AD) {
            return new AnonymousClass8AC((AnonymousClass8AD) this, i, i2);
        } else {
            if (!(this instanceof AnonymousClass8AC)) {
                return new AnonymousClass8AE(this, i, i2);
            }
            AnonymousClass8AC r22 = (AnonymousClass8AC) this;
            C120407Al.A02(i, i2, r22.A00);
            C148748rx r12 = r22.A02;
            int i4 = r22.A01;
            return new AnonymousClass8AC(r12, i + i4, i4 + i2);
        }
    }

    public final void add(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(int i, Collection collection) {
        throw C18220wO.A0v();
    }

    public final int hashCode() {
        int i = 1;
        for (Object A05 : this) {
            i = (i * 31) + C18230wP.A05(A05);
        }
        return i;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C04220Ms.A0I(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C04220Ms.A0I(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final Object remove(int i) {
        throw C18220wO.A0v();
    }

    public final Object set(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final ListIterator listIterator() {
        if ((this instanceof AnonymousClass8AI) || (this instanceof AnonymousClass8AD)) {
            return listIterator(0);
        }
        return new AnonymousClass8A8(this, 0);
    }
}
