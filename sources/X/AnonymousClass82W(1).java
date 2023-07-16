package X;

import android.view.View;
import java.util.List;

/* renamed from: X.82W  reason: invalid class name */
public final class AnonymousClass82W implements Runnable {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;
    public final /* synthetic */ List A02;

    public AnonymousClass82W(AnonymousClass3HX r1, C127397h3 r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        String valueOf;
        int i = -1;
        for (Object next : this.A02) {
            C127397h3 r1 = this.A01;
            if (next == null) {
                valueOf = null;
            } else if (next instanceof String) {
                valueOf = (String) next;
            } else {
                valueOf = String.valueOf(next);
            }
            C127397h3 A002 = AnonymousClass7r5.A00(r1, valueOf);
            if (A002 != null) {
                View A0J = A002.A0J(this.A00);
                if (A0J != null) {
                    A0J.setFocusable(true);
                    if (A0J.getId() == -1) {
                        A0J.setId(View.generateViewId());
                    }
                    if (i != -1) {
                        A0J.setAccessibilityTraversalAfter(i);
                    }
                    i = A0J.getId();
                } else {
                    return;
                }
            } else {
                throw C18180wK.A0a(AnonymousClass0wJ.A0t("Component does not exists in this hierarchy for id: ", next));
            }
        }
    }
}
