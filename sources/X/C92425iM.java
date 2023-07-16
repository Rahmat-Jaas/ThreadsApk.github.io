package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.5iM  reason: invalid class name and case insensitive filesystem */
public final class C92425iM extends C110626m0 {
    public static C128377jT A00(View.OnClickListener onClickListener, C121777Ib r8, AnonymousClass7E5 r9, boolean z) {
        boolean z2;
        C128067iI r1;
        AnonymousClass5iR A00 = AnonymousClass5iR.A00(14);
        A00.A02 = r9;
        AnonymousClass5iC r6 = new AnonymousClass5iC();
        r6.A00 = new C128067iI((Integer) null, 15, R.drawable.radio_button_background, R.dimen.account_recs_header_image_margin);
        if (z) {
            z2 = false;
            r1 = new C128067iI(16, (Integer) null, R.drawable.radio_button_center, 0);
        } else {
            z2 = false;
            r1 = new C128067iI((Integer) null, (Integer) null, 0, 0);
        }
        r6.A01 = r1;
        C92375iF A03 = C128387jU.A03(r6, A00);
        A03.A04 = r8;
        A03.A03 = z2;
        A00.A05 = new AnonymousClass5iL(A03);
        A00.A02 = 1;
        A00.A03 = onClickListener;
        return new C92455iW(A00);
    }
}
