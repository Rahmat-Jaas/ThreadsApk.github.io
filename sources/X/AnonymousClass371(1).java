package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.371  reason: invalid class name */
public final class AnonymousClass371 {
    public final View A00;
    public final C18340wi A01;

    public AnonymousClass371(View view, Fragment fragment, C121997Jj r13, C109326jp r14, C109326jp r15, C109326jp r16, String str, AnonymousClass0ZU r18) {
        List list;
        this.A00 = view;
        C18340wi r3 = new C18340wi(fragment.requireActivity());
        this.A01 = r3;
        boolean z = false;
        String str2 = str;
        if (str != null) {
            r3.A04(new C66823yK(C98856He.A00(str2, 0)));
            r3.A07 = null;
            r3.A09.A04(C18340wi.A02(r3.A08, (C41706Ma1) null), r3.isShowing());
        } else {
            r3.A04(AnonymousClass3yN.A00);
        }
        r3.setContentView(view);
        r3.setCancelable(true);
        C109326jp r6 = r14;
        boolean A1U = C18220wO.A1U(r14);
        L75 l75 = r3.A09;
        if (A1U) {
            list = Collections.singletonList(C18340wi.A0I);
        } else {
            list = null;
        }
        l75.A07 = list;
        l75.A02 = null;
        C109326jp r7 = r15;
        r3.setCanceledOnTouchOutside(r15 != null ? true : z);
        r3.A06 = new C66793yH(r13, r6, r7, r16, r18);
    }
}
