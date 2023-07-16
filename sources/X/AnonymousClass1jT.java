package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape46S0400000_1_I2;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.1jT  reason: invalid class name */
public final class AnonymousClass1jT extends C90995fQ {
    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        return new C18930yB(context);
    }

    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r11, C127397h3 r12, Object obj) {
        C18930yB r10 = (C18930yB) view;
        AnonymousClass3HX r6 = r11;
        C127397h3 r7 = r12;
        C570139k r2 = (C570139k) AnonymousClass7K7.A04(r11, r12);
        if (r2 != null) {
            SearchEditText searchEditText = r10.A01;
            String A0N = r12.A0N(40);
            if (A0N != null) {
                searchEditText.setHint(A0N);
            }
            String str = r2.A02;
            if (str != null) {
                searchEditText.setText(str);
            }
            C109326jp A0L = r12.A0L(36);
            if (A0L != null) {
                searchEditText.setOnFocusChangeListener(new IDxCListenerShape46S0400000_1_I2(1, this, r6, r7, A0L));
            }
            searchEditText.A06 = new AnonymousClass4MP(this, r2, r11, r12);
            searchEditText.setClearButtonEnabled(!r12.A0T(35, false));
            C109326jp A0L2 = r12.A0L(42);
            if (A0L2 == null) {
                return null;
            }
            r10.A00.A0P.setOnClickListener(new IDxCListenerShape15S0400000_1_I2(0, r12, A0L2, this, r6));
            return null;
        }
        throw C18250wR.A0V("A controller was defined for this component but none was found");
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r4, C127397h3 r5, Object obj, Object obj2) {
        C18930yB r3 = (C18930yB) view;
        SearchEditText searchEditText = r3.A01;
        searchEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        searchEditText.A06 = null;
        C18250wR.A0t(searchEditText);
        searchEditText.setHint((CharSequence) null);
        r3.A00.A0P.setOnClickListener((View.OnClickListener) null);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return new C18930yB(context);
    }

    public AnonymousClass1jT(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
