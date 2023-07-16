package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.4MP  reason: invalid class name */
public final class AnonymousClass4MP implements C33686HsX {
    public final /* synthetic */ AnonymousClass1jT A00;
    public final /* synthetic */ C570139k A01;
    public final /* synthetic */ AnonymousClass3HX A02;
    public final /* synthetic */ C127397h3 A03;

    public AnonymousClass4MP(AnonymousClass1jT r1, C570139k r2, AnonymousClass3HX r3, C127397h3 r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C127397h3 r4 = this.A03;
        C109326jp A0L = r4.A0L(45);
        C109326jp A0L2 = r4.A0L(43);
        if (A0L != null) {
            C122047Jt.A03(this.A02, r4, C63893iY.A04(AnonymousClass3VO.A00(), this.A01.A02, 0), A0L);
        } else if (A0L2 != null) {
            C122047Jt.A03(this.A02, r4, new C63893iY(AnonymousClass3VO.A00().A00), A0L2);
        }
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2;
        C127397h3 r5 = this.A03;
        C109326jp A0L = r5.A0L(38);
        C570139k r3 = this.A01;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        r3.A02 = charSequence2;
        if (A0L != null) {
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A03(r5, 0);
            A002.A03(r3.A02, 1);
            AnonymousClass3HX r1 = this.A02;
            C122047Jt.A03(r1, r5, C63893iY.A04(A002, r1, 2), A0L);
        }
    }
}
