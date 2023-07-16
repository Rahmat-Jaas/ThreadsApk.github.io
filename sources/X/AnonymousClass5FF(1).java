package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5FF  reason: invalid class name */
public final class AnonymousClass5FF extends C126077eX {
    public static final C145808l7 A01 = new C126087eY();
    public final Set A00 = C18200wM.A0u();

    public AnonymousClass5FF(Context context) {
        super(context, A01);
    }

    public final void AHx() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C145808l7 r1 = (C145808l7) it.next();
            r1.CG7(A00());
            r1.Btu();
            it.remove();
        }
        super.AHx();
    }
}
