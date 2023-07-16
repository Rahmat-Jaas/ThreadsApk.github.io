package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.1kK  reason: invalid class name */
public final class AnonymousClass1kK extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass194.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass194 r5 = (AnonymousClass194) mfV;
        AnonymousClass12C r6 = (AnonymousClass12C) m5o;
        AnonymousClass0wJ.A1N(r5, r6);
        C19030yW r3 = r6.A00;
        r3.A00();
        C18190wL.A17(r3);
        Context A0A = C18190wL.A0A(r3);
        r3.A01(C59523Ld.A00(A0A, r5.A02));
        IgTextView igTextView = r3.A03;
        if (igTextView == null) {
            C04220Ms.A0E("headerText");
            throw null;
        }
        igTextView.setMaxLines(2);
        C57943Dd r0 = r5.A01;
        if (r0 != null) {
            r3.A03(C59523Ld.A00(A0A, r0).toString(), C18190wL.A0H(r5, 421));
        }
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C18240wQ.A1H(viewGroup);
        return new AnonymousClass12C(new C19030yW(C18190wL.A0A(viewGroup)));
    }
}
