package X;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.5ES  reason: invalid class name */
public abstract class AnonymousClass5ES extends AnonymousClass55x {
    public AnonymousClass7K3 A00;

    public final void onCancel(DialogInterface dialogInterface) {
        String str;
        super.onCancel(dialogInterface);
        AnonymousClass7K3 r3 = this.A00;
        if (r3 != null) {
            r3.A0C((C1200778k) null);
            C89405Ej r2 = r3.A02;
            r2.A01++;
            if (r2.A03() != AnonymousClass006.A00) {
                r2.A03();
                str = "DECLINED_PREFETCH";
            } else {
                str = "DECLINED_AUTOFILL";
            }
            AnonymousClass78Q.A00(AnonymousClass7K3.A00(r2, r3, str));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1491350635);
        if (bundle != null) {
            A06();
        }
        super.onCreate(bundle);
        C14030oh.A09(1363326898, A02);
    }
}
