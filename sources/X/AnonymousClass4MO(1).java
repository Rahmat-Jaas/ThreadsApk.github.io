package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.4MO  reason: invalid class name */
public final class AnonymousClass4MO implements C33686HsX {
    public final /* synthetic */ AnonymousClass13N A00;
    public final /* synthetic */ C57593Br A01;

    public AnonymousClass4MO(AnonymousClass13N r1, C57593Br r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C83874s8 r1 = this.A00.A01;
        if (r1 != null) {
            r1.searchTextChanged(AnonymousClass0hA.A02(str));
        }
        searchEditText.A02();
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        AnonymousClass13N r2 = this.A00;
        if (r2.A01 != null) {
            C57593Br r0 = this.A01;
            String charSequence2 = charSequence.toString();
            SearchEditText searchEditText2 = r0.A00;
            if (searchEditText2 != null) {
                searchEditText2.setText(charSequence2);
            }
            r2.A01.searchTextChanged(AnonymousClass0hA.A02(AnonymousClass0wJ.A0n(searchEditText).trim()));
        }
    }
}
