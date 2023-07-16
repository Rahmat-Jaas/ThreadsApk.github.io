package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.1ke  reason: invalid class name and case insensitive filesystem */
public final class C24801ke extends AnonymousClass1lO {
    public final AnonymousClass36I A00;

    public final Class modelClass() {
        return AnonymousClass1l7.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass12N r8 = (AnonymousClass12N) m5o;
        AnonymousClass0wJ.A1N(mfV, r8);
        AnonymousClass36I r5 = this.A00;
        IgTextView igTextView = r8.A00;
        Context context = igTextView.getContext();
        String A0k = AnonymousClass0wJ.A0k(context, 2131821088);
        String A0l = AnonymousClass0wJ.A0l(context, A0k, 2131821087);
        C04220Ms.A06(A0l);
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        C18730xl.A01(A0E, r5, A0k, C18220wO.A02(context, R.attr.textColorRegularLink), 51);
        igTextView.setText(A0E);
        C18180wK.A0z(igTextView);
    }

    public C24801ke(AnonymousClass36I r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass12N(C18180wK.A0D(layoutInflater, viewGroup, R.layout.shop_management_learn_more, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
