package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.4As  reason: invalid class name and case insensitive filesystem */
public final class C69854As implements C84164se {
    public final /* synthetic */ C23391dj A00;

    public final void A4q() {
    }

    public final void CJC() {
    }

    public C69854As(C23391dj r1) {
        this.A00 = r1;
    }

    public final void CCa() {
        CharSequence string;
        C23391dj r7 = this.A00;
        AnonymousClass4MC r1 = r7.A0C;
        r1.getClass();
        r1.A0F = false;
        if (C62183Xq.A00(r7.A05)) {
            r7.A0C.A0C = true;
        }
        r7.A0J = true;
        r7.A0C.A06 = null;
        List list = r7.A0R;
        AnonymousClass1fC r0 = r7.A0A;
        int indexOf = r0.mObjects.indexOf(r7.A0E);
        if (C63803iN.A05(AnonymousClass0TJ.A05, r7.A05, 36327314425915348L).booleanValue()) {
            C696249i A002 = C63073bQ.A00(r7.A05);
            Context requireContext = r7.requireContext();
            string = C63143c0.A01(requireContext, r7.requireActivity(), A002.A05, AnonymousClass0wJ.A0k(requireContext, 2131835668), 2131827377);
        } else {
            string = r7.getString(2131827379);
        }
        list.set(indexOf, new C63293hC(string));
        r7.A0A.setItems(list);
    }
}
