package X;

import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: X.1eU  reason: invalid class name */
public final class AnonymousClass1eU extends AnonymousClass1eR {
    public final /* synthetic */ C22541Ym A00;

    public AnonymousClass1eU(C22541Ym r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        C22541Ym r4 = this.A00;
        A0y.put("abc", r4.A04);
        LLF llf = new LLF(r4.requireContext());
        llf.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        r4.A00.addView(llf);
        C58513Fy r0 = new C58513Fy(r4.requireContext(), (C121997Jj) obj, r4.A01);
        r0.A01 = A0y;
        C121247Ez A002 = r0.A00();
        r4.A02 = A002;
        A002.A06(llf);
    }
}
