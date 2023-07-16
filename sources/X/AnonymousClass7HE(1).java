package X;

import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.7HE  reason: invalid class name */
public final class AnonymousClass7HE {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass7HE(Object obj, String str, int i, int i2) {
        C04220Ms.A0B(str, 4);
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
        if (i > i2) {
            throw C18190wL.A0a("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7HE) {
                AnonymousClass7HE r5 = (AnonymousClass7HE) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(AnonymousClass7HE r2, Object obj, AbstractCollection abstractCollection, int i, int i2) {
        if (AnonymousClass7G7.A02(i, i2, r2.A01, r2.A00)) {
            abstractCollection.add(obj);
        }
    }

    public static void A01(Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new AnonymousClass7HE(obj, "", i, i2));
    }

    public final int hashCode() {
        return C18210wN.A05(this.A03, ((((AnonymousClass0wJ.A03(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Range(item=");
        A0s.append(this.A02);
        A0s.append(", start=");
        A0s.append(this.A01);
        A0s.append(", end=");
        A0s.append(this.A00);
        A0s.append(", tag=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public static void A02(AbstractCollection abstractCollection, List list, int i, int i2, int i3) {
        Object obj = list.get(i);
        AnonymousClass7HE r0 = (AnonymousClass7HE) obj;
        if (AnonymousClass7G7.A02(i2, i3, r0.A01, r0.A00)) {
            abstractCollection.add(obj);
        }
    }
}
