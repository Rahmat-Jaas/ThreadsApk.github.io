package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.87j  reason: invalid class name */
public abstract class AnonymousClass87j implements SerialDescriptor {
    public final String A00;
    public final SerialDescriptor A01;
    public final SerialDescriptor A02;

    public final SerialDescriptor Af9(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.A01;
            }
            if (i2 == 1) {
                return this.A02;
            }
            throw C18180wK.A0a("Unreached");
        }
        throw C18190wL.A0a(AnonymousClass00U.A06(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    public final int AfA(String str) {
        C04220Ms.A0B(str, 0);
        Integer A012 = AnonymousClass4n2.A01(str);
        if (A012 != null) {
            return A012.intValue();
        }
        throw C18190wL.A0a(C04220Ms.A01(str, " is not a valid map index"));
    }

    public final boolean BT5(int i) {
        if (i >= 0) {
            return false;
        }
        throw C18190wL.A0a(AnonymousClass00U.A06(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass87j) {
                AnonymousClass87j r5 = (AnonymousClass87j) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
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
        throw C18190wL.A0a(AnonymousClass00U.A06(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    public final int AfE() {
        return 2;
    }

    public final C113316r9 Aqu() {
        return C39232Kpz.A00;
    }

    public final String BAP() {
        return this.A00;
    }

    public final boolean BWZ() {
        return false;
    }

    public final List getAnnotations() {
        return AnonymousClass0ZV.A00;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A05(this.A01, C18180wK.A03(this.A00)));
    }

    public final boolean isInline() {
        return false;
    }

    public AnonymousClass87j(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.A00 = str;
        this.A01 = serialDescriptor;
        this.A02 = serialDescriptor2;
    }

    public final String AfB(int i) {
        return String.valueOf(i);
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A00);
        A0r.append('(');
        A0r.append(this.A01);
        C86144wL.A1T(A0r);
        return C86104wH.A0y(this.A02, A0r);
    }
}
