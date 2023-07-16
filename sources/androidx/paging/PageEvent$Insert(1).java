package androidx.paging;

import X.AnonymousClass00J;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4n8;
import X.AnonymousClass59K;
import X.AnonymousClass67E;
import X.C04220Ms;
import X.C113226qx;
import X.C1201779c;
import X.C1202779m;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C86104wH;
import X.C86164wN;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

public final class PageEvent$Insert extends C113226qx {
    public static final PageEvent$Insert A06;
    public final int A00;
    public final int A01;
    public final C1201779c A02;
    public final C1201779c A03;
    public final AnonymousClass67E A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageEvent$Insert) {
                PageEvent$Insert pageEvent$Insert = (PageEvent$Insert) obj;
                if (this.A04 != pageEvent$Insert.A04 || !C04220Ms.A0I(this.A05, pageEvent$Insert.A05) || this.A01 != pageEvent$Insert.A01 || this.A00 != pageEvent$Insert.A00 || !C04220Ms.A0I(this.A03, pageEvent$Insert.A03) || !C04220Ms.A0I(this.A02, pageEvent$Insert.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        List A0n = C18180wK.A0n(C1202779m.A04);
        AnonymousClass59K r1 = AnonymousClass59K.A01;
        AnonymousClass59K r0 = AnonymousClass59K.A00;
        A06 = new PageEvent$Insert(new C1201779c(r1, r0, r0), (C1201779c) null, AnonymousClass67E.REFRESH, A0n, 0, 0);
    }

    public final int hashCode() {
        int A042 = C18210wN.A04(this.A04);
        return AnonymousClass0wJ.A05(this.A03, (((AnonymousClass0wJ.A05(this.A05, A042) + this.A01) * 31) + this.A00) * 31) + AnonymousClass0wJ.A03(this.A02);
    }

    public final String toString() {
        String str;
        Object obj;
        List<C1202779m> list = this.A05;
        int i = 0;
        for (C1202779m r0 : list) {
            i = C86164wN.A06(r0.A01, i);
        }
        int i2 = this.A01;
        String str2 = NetInfoModule.CONNECTION_TYPE_NONE;
        if (i2 != -1) {
            str = String.valueOf(i2);
        } else {
            str = str2;
        }
        int i3 = this.A00;
        if (i3 != -1) {
            str2 = String.valueOf(i3);
        }
        C1201779c r2 = this.A02;
        StringBuilder A0s = C18190wL.A0s("PageEvent.Insert for ");
        A0s.append(this.A04);
        A0s.append(", with ");
        A0s.append(i);
        A0s.append(" items (\n                    |   first item: ");
        C1202779m r02 = (C1202779m) AnonymousClass00J.A0D(list);
        Object obj2 = null;
        if (r02 != null) {
            obj = AnonymousClass00J.A0D(r02.A01);
        } else {
            obj = null;
        }
        A0s.append(obj);
        A0s.append("\n                    |   last item: ");
        C1202779m r03 = (C1202779m) AnonymousClass00J.A0F(list);
        if (r03 != null) {
            obj2 = AnonymousClass00J.A0F(r03.A01);
        }
        A0s.append(obj2);
        A0s.append("\n                    |   placeholdersBefore: ");
        A0s.append(str);
        A0s.append("\n                    |   placeholdersAfter: ");
        A0s.append(str2);
        A0s.append("\n                    |   sourceLoadStates: ");
        A0s.append(this.A03);
        return AnonymousClass4n8.A09(AnonymousClass00U.A0L(C86104wH.A0v(r2, C18180wK.A0i("\n                    ", A0s)), "|)"), "|");
    }

    public PageEvent$Insert(C1201779c r2, C1201779c r3, AnonymousClass67E r4, List list, int i, int i2) {
        this.A04 = r4;
        this.A05 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
        this.A02 = r3;
        if (r4 != AnonymousClass67E.APPEND && i < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0J("Prepend insert defining placeholdersBefore must be > 0, but was ", i));
        } else if (r4 != AnonymousClass67E.PREPEND && i2 < 0) {
            throw C18190wL.A0a(AnonymousClass00U.A0J("Append insert defining placeholdersAfter must be > 0, but was ", i2));
        } else if (r4 == AnonymousClass67E.REFRESH && !C18190wL.A1a(list)) {
            throw C18190wL.A0a("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }
}
