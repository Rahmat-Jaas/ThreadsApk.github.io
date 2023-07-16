package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.87i  reason: invalid class name */
public abstract class AnonymousClass87i implements SerialDescriptor {
    public final SerialDescriptor A00;

    public final int AfA(String str) {
        C04220Ms.A0B(str, 0);
        Integer A01 = AnonymousClass4n2.A01(str);
        if (A01 != null) {
            return A01.intValue();
        }
        throw C18190wL.A0a(C04220Ms.A01(str, " is not a valid list index"));
    }

    public final boolean BT5(int i) {
        if (i >= 0) {
            return false;
        }
        throw C18190wL.A0a(AnonymousClass00U.A06(i, "Illegal index ", ", ", BAP(), " expects only non-negative indices"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass87i) {
                AnonymousClass87i r5 = (AnonymousClass87i) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(BAP(), r5.BAP())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List Af7(int i) {
        if (i >= 0) {
            return AnonymousClass0ZV.A00;
        }
        throw C18190wL.A0a(AnonymousClass00U.A06(i, "Illegal index ", ", ", BAP(), " expects only non-negative indices"));
    }

    public final SerialDescriptor Af9(int i) {
        if (i >= 0) {
            return this.A00;
        }
        throw C18190wL.A0a(AnonymousClass00U.A06(i, "Illegal index ", ", ", BAP(), " expects only non-negative indices"));
    }

    public final int AfE() {
        return 1;
    }

    public final C113316r9 Aqu() {
        return C39231Kpy.A00;
    }

    public final boolean BWZ() {
        return false;
    }

    public final List getAnnotations() {
        return AnonymousClass0ZV.A00;
    }

    public final int hashCode() {
        return C18210wN.A05(BAP(), C18210wN.A04(this.A00));
    }

    public final boolean isInline() {
        return false;
    }

    public AnonymousClass87i(SerialDescriptor serialDescriptor) {
        this.A00 = serialDescriptor;
    }

    public final String AfB(int i) {
        return String.valueOf(i);
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(BAP());
        A0r.append('(');
        return C86104wH.A0y(this.A00, A0r);
    }
}
