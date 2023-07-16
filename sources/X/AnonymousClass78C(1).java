package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.78C  reason: invalid class name */
public final class AnonymousClass78C {
    public final int A00;
    public final int A01;
    public final C143988hd A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public static AnonymousClass78C A00(Class cls, Object obj, Class... clsArr) {
        C113906sM r1 = new C113906sM(cls, clsArr);
        r1.A02 = new AnonymousClass7o5(obj);
        return r1.A00();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Component<");
        A0s.append(Arrays.toString(this.A04.toArray()));
        A0s.append(">{");
        A0s.append(this.A00);
        A0s.append(", type=");
        A0s.append(this.A01);
        A0s.append(", deps=");
        A0s.append(Arrays.toString(this.A03.toArray()));
        return C18180wK.A0i("}", A0s);
    }

    public AnonymousClass78C(C143988hd r2, Set set, Set set2, Set set3, int i, int i2) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A05 = Collections.unmodifiableSet(set3);
    }
}
