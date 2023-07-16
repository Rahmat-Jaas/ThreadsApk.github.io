package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.1kV  reason: invalid class name */
public final class AnonymousClass1kV extends AnonymousClass1lO {
    public final Context A00;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(layoutInflater, 1);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.bca_ad_code_description);
        C04220Ms.A06(A0H);
        return new C198512c(A0H);
    }

    public final Class modelClass() {
        return AnonymousClass487.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C198512c r7 = (C198512c) m5o;
        C04220Ms.A0B(r7, 1);
        Context context = this.A00;
        SpannableStringBuilder A0E = C18200wM.A0E(context.getString(2131832165));
        A0E.append("\n");
        A0E.append(context.getString(2131822532));
        A0E.append("\n");
        A0E.append(context.getString(2131822533));
        A0E.append("\n");
        A0E.append(context.getString(2131822534));
        AnonymousClass3Zw.A01(A0E, new C18670xb(C15430rJ.A01("https://help.instagram.com/907404106266466")), AnonymousClass0wJ.A0k(context, 2131821009));
        IgTextView igTextView = r7.A00;
        igTextView.setText(A0E);
        C18180wK.A0z(igTextView);
        C18200wM.A15(context, r7.A01, 2131832162);
    }

    public AnonymousClass1kV(Context context) {
        this.A00 = context;
    }
}
