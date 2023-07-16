package X;

import androidx.compose.ui.text.font.AsyncTypefaceCache;

/* renamed from: X.7DQ  reason: invalid class name */
public final class AnonymousClass7DQ {
    public static final C148828sF A02 = new AnonymousClass8AU(C148828sF.A00);
    public C83224qz A00;
    public final AsyncTypefaceCache A01;

    public AnonymousClass7DQ() {
        this((AsyncTypefaceCache) null, 3);
    }

    public /* synthetic */ AnonymousClass7DQ(AsyncTypefaceCache asyncTypefaceCache, int i) {
        AnonymousClass869 r1 = null;
        asyncTypefaceCache = (i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache;
        r1 = (i & 2) != 0 ? AnonymousClass869.A00 : r1;
        AnonymousClass0wJ.A1O(asyncTypefaceCache, r1);
        this.A01 = asyncTypefaceCache;
        this.A00 = AnonymousClass7Ja.A03(A02.CWl(r1).CWl(new AnonymousClass8bb(C148838sG.A00(r1))));
    }
}
