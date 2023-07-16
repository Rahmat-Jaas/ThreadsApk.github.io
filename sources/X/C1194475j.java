package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.75j  reason: invalid class name and case insensitive filesystem */
public final class C1194475j {
    public int A00;
    public final C18399Aen A01;

    public static final List A00(int i) {
        AnonymousClass8bH A02 = AnonymousClass8bH.A02(1, i);
        ArrayList A0w = AnonymousClass0wJ.A0w(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            ((C1367083z) it).A00();
            A0w.add(new C131907t0((String) null, (DefaultConstructorMarker) null, 1));
        }
        return A0w;
    }

    public C1194475j(C18399Aen aen) {
        this.A01 = aen;
    }
}
