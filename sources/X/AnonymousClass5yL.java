package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.5yL  reason: invalid class name */
public final class AnonymousClass5yL extends AnonymousClass436 {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int i2;
        int A03 = C14030oh.A03(1128275650);
        AnonymousClass0wJ.A1O(view, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.partneraccounts.PartnerSearchEmptyStateViewBinder.Holder");
        C108406iJ r3 = (C108406iJ) tag;
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        C04220Ms.A0B(r3, 0);
        TextView textView2 = r3.A00;
        if (A1X) {
            textView2.setVisibility(8);
            textView = r3.A01;
            i2 = 2131821110;
        } else {
            textView2.setVisibility(0);
            textView2.setText(2131821108);
            textView = r3.A01;
            i2 = 2131821109;
        }
        textView.setText(i2);
        C14030oh.A0A(191970065, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A00 = AnonymousClass436.A00(299694733, viewGroup);
        View A0D = C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.add_partner_account_empty_view, false);
        A0D.setTag(new C108406iJ(A0D));
        C14030oh.A0A(-1966172040, A00);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }
}
