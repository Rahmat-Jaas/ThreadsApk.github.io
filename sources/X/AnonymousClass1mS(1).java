package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1mS  reason: invalid class name */
public final class AnonymousClass1mS extends AnonymousClass0gG {
    public final /* synthetic */ C86774yF A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mS(C86774yF r4, List list) {
        super(104, 3, false, false);
        this.A01 = list;
        this.A00 = r4;
    }

    public final void run() {
        List list = this.A01;
        C86774yF r4 = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C37030Jj7 A0A = C37744K2e.A01().A0A(C18250wR.A0K(C18180wK.A0k(it)), "STORIES_AVATAR_DEFAULT_SEARCH");
            A0A.A02(r4);
            A0A.A01();
        }
    }
}
