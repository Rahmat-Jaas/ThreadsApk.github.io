package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.51t  reason: invalid class name */
public final class AnonymousClass51t extends LinearLayout implements C143538gu {
    public LinearLayout A00;
    public C91995hQ A01;
    public Map A02;
    public final AnonymousClass0YY A03 = C86164wN.A0r(this, 26);

    public void setViewModel(C91995hQ r16) {
        AnonymousClass69U r0;
        C91995hQ r1 = r16;
        C04220Ms.A0B(r1, 0);
        this.A01 = r1;
        this.A00 = (LinearLayout) AnonymousClass0wJ.A0I(this, R.id.address_list_container);
        this.A02 = C18220wO.A0y();
        AnonymousClass0YY r11 = this.A03;
        C91995hQ r02 = this.A01;
        if (r02 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        C91525gN r2 = new C91525gN(r02.A01, r11, true);
        Map map = this.A02;
        if (map == null) {
            C04220Ms.A0E("viewBinders");
            throw null;
        }
        map.put(r2.A02, r2);
        C91995hQ r03 = this.A01;
        if (r03 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        C91675gc r7 = new C91675gc(C18190wL.A0A(this), (AnonymousClass066) null, r03.A01, r11, C78184i1.A00, (AnonymousClass0YY) null, true);
        Map map2 = this.A02;
        if (map2 == null) {
            C04220Ms.A0E("viewBinders");
            throw null;
        }
        map2.put(r7.A02, r7);
        C91995hQ r04 = this.A01;
        if (r04 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        if (!(AnonymousClass7Ih.A0C(r04) instanceof SelectionActionViewItem)) {
            C91995hQ r05 = this.A01;
            if (r05 == null) {
                C04220Ms.A0E("viewModel");
                throw null;
            }
            C91565gR r22 = new C91565gR(r05.A01, r11, true, r05.A03);
            Map map3 = this.A02;
            if (map3 == null) {
                C04220Ms.A0E("viewBinders");
                throw null;
            }
            map3.put(r22.A02, r22);
        }
        C91995hQ r3 = this.A01;
        if (r3 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        ArrayList<AnonymousClass7Kx> A0v = AnonymousClass0wJ.A0v();
        for (Object A0N : r3.A02) {
            AnonymousClass7Kx.A0N(A0N, A0v);
        }
        if (!(AnonymousClass7Ih.A0C(r3) instanceof SelectionActionViewItem)) {
            AnonymousClass7Kx.A0N(r3.A00, A0v);
        }
        for (AnonymousClass7Kx r4 : A0v) {
            Map map4 = this.A02;
            if (map4 == null) {
                C04220Ms.A0E("viewBinders");
                throw null;
            }
            C04220Ms.A0C(r4, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
            BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) r4.A01;
            if (baseCheckoutItem != null) {
                r0 = baseCheckoutItem.AqR();
            } else {
                r0 = null;
            }
            C886359v r32 = (C886359v) map4.get(r0);
            if (r32 != null) {
                M5O A08 = r32.A08(this);
                LinearLayout linearLayout = this.A00;
                if (linearLayout == null) {
                    C04220Ms.A0E("listContainer");
                    throw null;
                } else {
                    linearLayout.addView(A08.itemView);
                    r32.A09(A08, r4);
                }
            }
        }
    }

    public AnonymousClass51t(Context context) {
        super(context);
        LinearLayout.inflate(getContext(), R.layout.fbpay_ui_address_list_cell, this);
    }
}
