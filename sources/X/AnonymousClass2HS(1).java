package X;

import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.2HS  reason: invalid class name */
public final class AnonymousClass2HS {
    public static final Object A00(AnonymousClass601 r3, C63893iY r4) {
        C18930yB r0;
        C127397h3 A02 = C63893iY.A02(r4, AnonymousClass0wJ.A1Y(r4, r3) ? 1 : 0);
        if (A02 == null) {
            return null;
        }
        int i = A02.A03;
        if (i == 13616) {
            InlineSearchBox inlineSearchBox = (InlineSearchBox) A02.A0J(r3.A00);
            if (inlineSearchBox == null) {
                return null;
            }
            inlineSearchBox.clearFocus();
            inlineSearchBox.A02();
            return null;
        } else if (i != 13697 || (r0 = (C18930yB) A02.A0J(r3.A00)) == null) {
            return null;
        } else {
            SearchEditText searchEditText = r0.A01;
            searchEditText.clearFocus();
            searchEditText.A02();
            return null;
        }
    }
}
