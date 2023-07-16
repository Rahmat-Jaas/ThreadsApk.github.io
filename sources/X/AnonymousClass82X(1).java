package X;

import android.view.View;

/* renamed from: X.82X  reason: invalid class name */
public final class AnonymousClass82X implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ Object A02;

    public AnonymousClass82X(View view, AnonymousClass3HX r2, Object obj) {
        this.A02 = obj;
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        String valueOf;
        C127397h3 r0;
        Object obj = this.A02;
        if (obj instanceof String) {
            valueOf = (String) obj;
        } else {
            valueOf = String.valueOf(obj);
        }
        AnonymousClass3HX r1 = this.A01;
        C110936mW r02 = AnonymousClass7K7.A01(r1).A03;
        if (r02 == null) {
            r0 = null;
        } else {
            r0 = r02.A02;
        }
        C127397h3 A002 = AnonymousClass7r5.A00(r0, valueOf);
        if (A002 != null) {
            View A0J = A002.A0J(r1);
            if (A0J == null) {
                C30967GcS.A02("AccessibilityUtils", AnonymousClass00U.A0L("No View found for component with id: ", valueOf));
                return;
            }
            int id = A0J.getId();
            if (id == -1) {
                id = View.generateViewId();
                A0J.setId(id);
            }
            this.A00.setLabelFor(id);
            return;
        }
        throw C18180wK.A0a(String.format("Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work.", new Object[]{valueOf}));
    }
}
