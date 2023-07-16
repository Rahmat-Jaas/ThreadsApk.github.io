package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.4Sy  reason: invalid class name and case insensitive filesystem */
public final class C73574Sy implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ D0f A01;
    public final /* synthetic */ AnonymousClass1ZH A02;
    public final /* synthetic */ String A03;

    public C73574Sy(View view, D0f d0f, AnonymousClass1ZH r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = view;
        this.A01 = d0f;
    }

    public final void run() {
        try {
            C25553Dnn A012 = AnonymousClass4DS.A01(this.A02.getActivity(), this.A03);
            A012.A01(this.A00);
            A012.A03(this.A01);
            A012.A0A = true;
            C18200wM.A1Q(A012);
        } catch (Resources.NotFoundException e) {
            AnonymousClass0LU.A0E(AnonymousClass1ZH.__redex_internal_original_name, "Resource not found", e);
        }
    }
}
