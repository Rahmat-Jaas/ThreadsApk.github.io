package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.redex.IDxCListenerShape6S0101000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.5A3  reason: invalid class name */
public final class AnonymousClass5A3 extends C41030Luu {
    public List A00 = AnonymousClass0ZV.A00;

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return new C88765An(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_manage_financial_entity_list_view_holder, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        String A0o;
        C88765An r13 = (C88765An) m5o;
        C04220Ms.A0B(r13, 0);
        KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = (KtCSuperShape0S0210000_I2) this.A00.get(i);
        C148568rI r2 = (C148568rI) ktCSuperShape0S0210000_I2.A00;
        IDxCListenerShape6S0101000_1_I2 iDxCListenerShape6S0101000_1_I2 = new IDxCListenerShape6S0101000_1_I2(ktCSuperShape0S0210000_I2, i, 4);
        C04220Ms.A0B(r2, 0);
        View view = r13.A00;
        view.setOnClickListener(iDxCListenerShape6S0101000_1_I2);
        AnonymousClass0wJ.A0L(view, R.id.business_type_title).setText(r2.AYb());
        ImmutableList B0f = r2.B0f();
        C04220Ms.A06(B0f);
        Iterator it = B0f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C148398qx r4 = (C148398qx) it.next();
            if (r4.Agi() == AnonymousClass69L.A02 || r4.Agi() == AnonymousClass69L.A01) {
                z = true;
            }
        }
        View requireViewById = view.requireViewById(R.id.error_dot);
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        requireViewById.setVisibility(i2);
        C18190wL.A18(view, R.id.chevron_right_icon, 0);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.type);
        Context context = view.getContext();
        A0L.setText(AnonymousClass0wJ.A0l(context, context.getString(C37416Jrb.A00(C37416Jrb.A02(r2.AYe()))), 2131832281));
        TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.region);
        C147958qD AYZ = r2.AYZ();
        if (AYZ != null) {
            A0L2.setText(AYZ.A9I().AaB());
            ViewGroup A0J = C18220wO.A0J(view, R.id.payment_lists);
            A0J.removeAllViews();
            LinkedHashSet A0u = C86134wK.A0u();
            ImmutableList B0g = r2.B0g();
            C04220Ms.A06(B0g);
            ArrayList<C148548rG> A0x = AnonymousClass0wJ.A0x(B0g, 10);
            Iterator it2 = B0g.iterator();
            while (it2.hasNext()) {
                A0x.add(((C147998qH) it2.next()).A9g());
            }
            ArrayList A0x2 = AnonymousClass0wJ.A0x(A0x, 10);
            for (C148548rG r8 : A0x) {
                if (!AnonymousClass00J.A0k(A0u, r8.Aal())) {
                    Context context2 = A0J.getContext();
                    View inflate = LayoutInflater.from(context2).inflate(R.layout.layout_manage_financial_entity_list_payment_row, A0J, false);
                    C04220Ms.A0C(inflate, C18170wI.A00(5));
                    TextView textView = (TextView) inflate;
                    if (!C37416Jrb.A0B(r8)) {
                        A0o = C18220wO.A0h(context2, r8.ASy(), r8.ASs(), 2131832231);
                    } else {
                        A0o = C86154wM.A0o(C31103Gfm.A02(), "%s %s", C86144wL.A1a(context2.getString(2131832317), r8.B0t()));
                    }
                    textView.setText(A0o);
                    String Aal = r8.Aal();
                    if (Aal != null) {
                        A0u.add(Aal);
                        A0J.addView(textView);
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                A0x2.add(Unit.A00);
            }
            return;
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(2056952122);
        int size = this.A00.size();
        C14030oh.A0A(-1623730782, A03);
        return size;
    }
}
