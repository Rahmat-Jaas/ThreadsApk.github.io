package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5yS  reason: invalid class name */
public final class AnonymousClass5yS extends AnonymousClass436 {
    public Context A00;
    public final AnonymousClass5yI A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r3, Object obj, Object obj2) {
        C94215tw r4 = (C94215tw) obj;
        if (!r4.A01.equals(AnonymousClass691.A05.A01) || r4.A00 != null) {
            r3.A5K(0);
        }
    }

    public AnonymousClass5yS(Context context, AnonymousClass5yI r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        AnonymousClass5KP r0;
        int A03 = C14030oh.A03(42254090);
        C94215tw r13 = (C94215tw) obj;
        boolean A1W = AnonymousClass0wJ.A1W(r13.A00);
        Object tag = view.getTag();
        tag.getClass();
        C109176ja r9 = (C109176ja) tag;
        Context context = this.A00;
        boolean A1X = AnonymousClass0wJ.A1X(obj2);
        AnonymousClass5yI r4 = this.A01;
        C04220Ms.A0B(r9, 0);
        TextView textView = r9.A02;
        if (!C04220Ms.A0I(r13.A01, AnonymousClass691.A05.A01) || (r0 = r13.A00) == null || (str = r0.A05) == null) {
            str = r13.A02;
            C04220Ms.A06(str);
        }
        textView.setText(str);
        CheckBox checkBox = r9.A01;
        checkBox.setChecked(A1X);
        checkBox.setEnabled(A1W);
        View view2 = r9.A00;
        view2.setEnabled(A1W);
        if (A1W) {
            C86104wH.A1D(view2, 61, r4, r13);
            C86104wH.A1D(checkBox, 62, r4, r13);
        } else {
            C18180wK.A0s(context, textView, R.color.igds_secondary_text);
        }
        C14030oh.A0A(1900094233, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1225710440);
        C04220Ms.A0B(viewGroup, 0);
        View inflate = C18180wK.A0C(viewGroup).inflate(R.layout.row_service_partner_type, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        inflate.setTag(new C109176ja(inflate));
        C14030oh.A0A(1903304620, A03);
        return inflate;
    }
}
