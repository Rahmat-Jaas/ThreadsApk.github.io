package X;

import android.content.Context;
import java.util.HashSet;

/* renamed from: X.771  reason: invalid class name */
public final class AnonymousClass771 {
    public static final HashSet A0A;
    public static final HashSet A0B;
    public static final HashSet A0C;
    public final Context A00;
    public final Throwable A01;
    public final C04530Oa A02 = C86124wJ.A12(this, 37);
    public final C04530Oa A03 = C86124wJ.A12(this, 38);
    public final C04530Oa A04 = C86124wJ.A12(this, 39);
    public final C04530Oa A05 = C86124wJ.A12(this, 40);
    public final C04530Oa A06 = C86124wJ.A12(this, 41);
    public final C04530Oa A07 = C86124wJ.A12(this, 42);
    public final C04530Oa A08 = C86124wJ.A12(this, 43);
    public final C04530Oa A09 = C86124wJ.A12(this, 44);

    static {
        HashSet A0u = C18200wM.A0u();
        C18200wM.A1U(A0u, 5202);
        C18200wM.A1U(A0u, 3088003);
        C18200wM.A1U(A0u, 3088004);
        A0B = A0u;
        HashSet A0u2 = C18200wM.A0u();
        C18200wM.A1U(A0u2, 5204);
        C18200wM.A1U(A0u2, 3088002);
        C18200wM.A1U(A0u2, 3088006);
        A0A = A0u2;
        HashSet A0u3 = C18200wM.A0u();
        A0u3.addAll(A0u);
        A0u3.addAll(A0u2);
        A0C = A0u3;
    }

    public AnonymousClass771(Context context, Throwable th) {
        this.A00 = context;
        this.A01 = th;
    }
}
