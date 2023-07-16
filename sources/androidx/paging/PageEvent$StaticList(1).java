package androidx.paging;

import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4n8;
import X.C04220Ms;
import X.C113226qx;
import X.C1201779c;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C86104wH;
import java.util.List;

public final class PageEvent$StaticList extends C113226qx {
    public final C1201779c A00;
    public final C1201779c A01;
    public final List A02;

    public PageEvent$StaticList(C1201779c r2, C1201779c r3, List list) {
        C04220Ms.A0B(list, 1);
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageEvent$StaticList) {
                PageEvent$StaticList pageEvent$StaticList = (PageEvent$StaticList) obj;
                if (!C04220Ms.A0I(this.A02, pageEvent$StaticList.A02) || !C04220Ms.A0I(this.A01, pageEvent$StaticList.A01) || !C04220Ms.A0I(this.A00, pageEvent$StaticList.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A02) + AnonymousClass0wJ.A03(this.A01)) * 31) + C18200wM.A07(this.A00);
    }

    public final String toString() {
        C1201779c r3 = this.A00;
        StringBuilder A0s = C18190wL.A0s("PageEvent.StaticList with ");
        List list = this.A02;
        A0s.append(list.size());
        A0s.append(" items (\n                    |   first item: ");
        A0s.append(AnonymousClass00J.A0D(list));
        A0s.append("\n                    |   last item: ");
        A0s.append(AnonymousClass00J.A0F(list));
        A0s.append("\n                    |   sourceLoadStates: ");
        A0s.append(this.A01);
        return AnonymousClass4n8.A09(AnonymousClass00U.A0L(C86104wH.A0v(r3, C18180wK.A0i("\n                    ", A0s)), "|)"), "|");
    }
}
