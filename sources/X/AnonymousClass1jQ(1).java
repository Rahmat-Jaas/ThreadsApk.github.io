package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape46S0400000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;

/* renamed from: X.1jQ  reason: invalid class name */
public final class AnonymousClass1jQ extends C90995fQ {
    public final /* bridge */ /* synthetic */ View A0O(Context context) {
        return new InlineSearchBox(context, false);
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return new InlineSearchBox(context, false);
    }

    public final /* bridge */ /* synthetic */ Object A0P(View view, AnonymousClass3HX r13, C127397h3 r14, Object obj) {
        InlineSearchBox inlineSearchBox = (InlineSearchBox) view;
        AnonymousClass3HX r8 = r13;
        C127397h3 r9 = r14;
        C570139k r4 = (C570139k) AnonymousClass7K7.A04(r13, r14);
        if (r4 != null) {
            if (r14.A0T(49, false)) {
                inlineSearchBox.setSearchRowBackgroundColor(R.drawable.elevated_searchbar_background);
            }
            if (r14.A0N(35) != null) {
                inlineSearchBox.setHint(r14.A0N(35));
            }
            String str = r4.A02;
            if (str != null) {
                inlineSearchBox.A07(str, false);
            }
            int i = r4.A01;
            if (i == -1) {
                String str2 = r4.A02;
                if (str2 != null) {
                    inlineSearchBox.setSelection(str2.length());
                }
            } else {
                int i2 = r4.A00;
                BackInterceptEditText backInterceptEditText = inlineSearchBox.A0D;
                if (backInterceptEditText != null) {
                    backInterceptEditText.setSelection(i, i2);
                }
            }
            C109326jp A0L = r14.A0L(38);
            if (A0L != null) {
                inlineSearchBox.A00 = new IDxCListenerShape46S0400000_1_I2(0, this, r8, r9, A0L);
            }
            String A0O = r14.A0O(48, "");
            if (!A0O.equals("slider")) {
                C30967GcS.A03("BKSearchBarBinderUtils", new C29721zB(AnonymousClass00U.A0L("Unsupported icon type: ", A0O)));
            } else {
                inlineSearchBox.A06(new IDxCListenerShape41S0300000_1_I2(7, (Object) this, (Object) r13, (Object) r14), R.drawable.instagram_sliders_outline_16, 2131827480);
            }
            inlineSearchBox.A02 = new AnonymousClass4D1(this, r4, r13, r14);
            inlineSearchBox.A03 = r14.A0T(41, false);
            return null;
        }
        throw C18250wR.A0V("A controller was defined for this component but none was found");
    }

    public final /* bridge */ /* synthetic */ void A0R(View view, AnonymousClass3HX r5, C127397h3 r6, Object obj, Object obj2) {
        InlineSearchBox inlineSearchBox = (InlineSearchBox) view;
        Object A04 = AnonymousClass7K7.A04(r5, r6);
        AnonymousClass7Ko.A07(A04, "Extension mapper missing controller for extension with id: 13616");
        C570139k r1 = (C570139k) A04;
        if (inlineSearchBox.getSelectionStart() != null) {
            r1.A01 = inlineSearchBox.getSelectionStart().intValue();
        }
        if (inlineSearchBox.getSelectionEnd() != null) {
            r1.A00 = inlineSearchBox.getSelectionEnd().intValue();
        }
        inlineSearchBox.A02 = null;
        inlineSearchBox.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        inlineSearchBox.A07("", false);
    }

    public AnonymousClass1jQ(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
