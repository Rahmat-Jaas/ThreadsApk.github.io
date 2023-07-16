package X;

import android.app.Dialog;

/* renamed from: X.6nn  reason: invalid class name and case insensitive filesystem */
public abstract class C111506nn {
    public final void A00() {
        if (this instanceof C93455ld) {
            C93455ld r3 = (C93455ld) this;
            C93375lV r2 = r3.A01.A01;
            r2.A02.set((Object) null);
            r2.A09();
            Dialog dialog = r3.A00;
            if (dialog.isShowing()) {
                dialog.dismiss();
                return;
            }
            return;
        }
        C93285lJ r0 = (C93285lJ) ((C93445lc) this).A00.get();
        if (r0 != null) {
            C93285lJ.A01(r0);
        }
    }
}
