package X;

import java.util.Map;

/* renamed from: X.6pW  reason: invalid class name and case insensitive filesystem */
public final class C112396pW {
    public final C111916od A00;
    public final AnonymousClass3UO A01;
    public final Map A02 = AnonymousClass0wJ.A0y();

    public final void A00(boolean z) {
        String str;
        AnonymousClass3UO r0 = this.A01;
        Map map = this.A02;
        r0.A00(map);
        if (z) {
            str = "ls_dialog_click";
        } else {
            str = "ls_dialog_dismiss";
        }
        if ("local_search".equals(map.get("source"))) {
            this.A00.A00(str, "browse", new C1375589a(this, map));
        }
    }

    public C112396pW(C111916od r2, AnonymousClass3UO r3) {
        this.A01 = r3;
        this.A00 = r2;
    }
}
