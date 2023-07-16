package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2;
import com.instagram.barcelona.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1fj  reason: invalid class name and case insensitive filesystem */
public final class C23761fj extends AnonymousClass436 {
    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r5, Object obj, Object obj2) {
        AnonymousClass398 r6 = (AnonymousClass398) obj;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r6);
        r5.A5L(0, r6.A00, 0);
        List<KtCSuperShape0S1000000_I2> unmodifiableList = Collections.unmodifiableList(r6.A01);
        C04220Ms.A06(unmodifiableList);
        for (KtCSuperShape0S1000000_I2 ktCSuperShape0S1000000_I2 : unmodifiableList) {
            r5.A5L(A1Z ? 1 : 0, ktCSuperShape0S1000000_I2.A00, 0);
        }
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        String str;
        StringBuilder A0s;
        int A03 = C14030oh.A03(346894163);
        AnonymousClass0wJ.A1M(view, 1, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.shippingandreturns.PurchaseProtectionSectionBinderGroup.Holder");
        AnonymousClass36H r1 = (AnonymousClass36H) tag;
        if (i == 0) {
            textView = r1.A00;
            str = (String) obj;
        } else if (i == 1) {
            boolean A02 = AnonymousClass0hB.A02(view.getContext());
            textView = r1.A00;
            if (A02) {
                A0s = C18200wM.A0r();
                A0s.append(obj);
                A0s.append(" •");
            } else {
                A0s = C18190wL.A0s("• ");
                A0s.append(obj);
            }
            str = A0s.toString();
        } else {
            IllegalStateException A0a = C18180wK.A0a(AnonymousClass00U.A0J("Unknown view type while binding view: ", i));
            C14030oh.A0A(181376055, A03);
            throw A0a;
        }
        textView.setText(str);
        C14030oh.A0A(-990553354, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        TextView textView;
        int i2;
        int A03 = C14030oh.A03(-1565344087);
        C04220Ms.A0B(viewGroup, 1);
        LayoutInflater A0C = C18180wK.A0C(viewGroup);
        if (i == 0) {
            View inflate = A0C.inflate(R.layout.purchase_protection_header_row, viewGroup, false);
            C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
            textView.setTag(new AnonymousClass36H(textView));
            i2 = -43692701;
        } else if (i == 1) {
            View inflate2 = A0C.inflate(R.layout.purchase_protection_bullet_row, viewGroup, false);
            C04220Ms.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate2;
            textView.setTag(new AnonymousClass36H(textView));
            i2 = -574333187;
        } else {
            IllegalStateException A0a = C18180wK.A0a(AnonymousClass00U.A0J("Unknown view type while creating view: ", i));
            C14030oh.A0A(-1161626842, A03);
            throw A0a;
        }
        C14030oh.A0A(i2, A03);
        return textView;
    }
}
