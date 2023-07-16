package X;

import android.view.View;
import kotlin.Unit;

/* renamed from: X.7Vm  reason: invalid class name and case insensitive filesystem */
public final class C123147Vm implements C142788fa {
    public final View A00;

    public C123147Vm(View view) {
        C04220Ms.A0B(view, 1);
        this.A00 = view;
    }

    public final Object AAw(C146508mM r7, C146958n9 r8, AnonymousClass0ZU r9) {
        long Bb0 = r7.Bb0(AnonymousClass7KC.A03);
        AnonymousClass7F6 r0 = (AnonymousClass7F6) r9.invoke();
        if (r0 != null) {
            AnonymousClass7F6 A03 = r0.A03(Bb0);
            this.A00.requestRectangleOnScreen(C86164wN.A0F((int) A03.A01, (int) A03.A03, (int) A03.A02, (int) A03.A00), false);
        }
        return Unit.A00;
    }
}
