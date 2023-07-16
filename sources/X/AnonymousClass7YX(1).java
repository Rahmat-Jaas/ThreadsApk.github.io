package X;

import android.view.ActionMode;
import android.view.View;

/* renamed from: X.7YX  reason: invalid class name */
public final class AnonymousClass7YX implements C143048g1 {
    public ActionMode A00;
    public Integer A01 = AnonymousClass006.A01;
    public final View A02;
    public final AnonymousClass7Dg A03 = new AnonymousClass7Dg(C86154wM.A13(this, 28), 62);

    public final void Ctn(AnonymousClass7F6 r5, AnonymousClass0ZU r6, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0ZU r9) {
        C04220Ms.A0B(r5, 0);
        AnonymousClass7Dg r3 = this.A03;
        r3.A00 = r5;
        r3.A01 = r6;
        r3.A02 = r8;
        r3.A03 = r7;
        r3.A04 = r9;
        ActionMode actionMode = this.A00;
        if (actionMode == null) {
            this.A01 = AnonymousClass006.A00;
            this.A00 = this.A02.startActionMode(new AnonymousClass506(r3), 1);
            return;
        }
        actionMode.invalidate();
    }

    public AnonymousClass7YX(View view) {
        this.A02 = view;
    }
}
