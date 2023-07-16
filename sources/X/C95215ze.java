package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5ze  reason: invalid class name and case insensitive filesystem */
public final class C95215ze extends C90995fQ {
    public static final void A00(View view, AnonymousClass3HX r7, C127397h3 r8) {
        C04220Ms.A0B(view, 0);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.commerce.cpdp.MiniComponentProductTileNameRenderUnit.Holder");
        Context context = r7.A00;
        C04220Ms.A06(context);
        CharSequence A0B = C127397h3.A0B(r8);
        int A0H = r8.A0H(36, 1);
        C04530Oa r1 = ((AnonymousClass5BK) tag).A01;
        ((TextView) C18190wL.A0f(r1)).setMaxLines(A0H);
        boolean A00 = AnonymousClass2LL.A00(C127397h3.A0A(r8, 35), false);
        TextView textView = (TextView) C18190wL.A0f(r1);
        if (A00) {
            A0B = TextUtils.concat(new CharSequence[]{A0B, C19524Axl.A01(context, context.getResources().getDimensionPixelSize(R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding))});
        }
        textView.setText(A0B);
    }

    public C95215ze(AnonymousClass3HX r1, C127397h3 r2) {
        super(r1, r2);
    }
}
