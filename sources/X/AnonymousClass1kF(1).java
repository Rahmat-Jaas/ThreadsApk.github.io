package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.1kF  reason: invalid class name */
public final class AnonymousClass1kF extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass48I.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass48I r5 = (AnonymousClass48I) mfV;
        AnonymousClass120 r6 = (AnonymousClass120) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r6);
        C19030yW r2 = r6.A00;
        r2.A00();
        CharSequence text = r2.getResources().getText(r5.A00);
        C04220Ms.A06(text);
        r2.A02(text, A1Z);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C18240wQ.A1H(viewGroup);
        return new AnonymousClass120(new C19030yW(C18190wL.A0A(viewGroup)));
    }
}
