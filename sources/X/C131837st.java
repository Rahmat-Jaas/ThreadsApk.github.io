package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7st  reason: invalid class name and case insensitive filesystem */
public final class C131837st implements C41882MfV {
    public final String A00;
    public final List A01;
    public final AnonymousClass0YY A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C131837st r8 = (C131837st) obj;
        if (r8 == null) {
            return false;
        }
        List list = this.A01;
        int size = list.size();
        List list2 = r8.A01;
        if (size != list2.size()) {
            return false;
        }
        AnonymousClass8bH r1 = new AnonymousClass8bH(0, list.size() - 1);
        if (!(r1 instanceof Collection) || !((Collection) r1).isEmpty()) {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                int A002 = ((C1367083z) it).A00();
                if (!C04220Ms.A0I(((C111056mi) list.get(A002)).A03, ((C111056mi) list2.get(A002)).A03)) {
                    return false;
                }
            }
        }
        return true;
    }

    public C131837st(String str, List list, AnonymousClass0YY r3, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A03 = z;
        this.A02 = r3;
    }
}
