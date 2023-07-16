package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.04U  reason: invalid class name */
public final class AnonymousClass04U implements C143138gA {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass01I A02;
    public final /* synthetic */ AnonymousClass010 A03;
    public final /* synthetic */ C13370nZ A04;

    public AnonymousClass04U(View view, ViewGroup viewGroup, AnonymousClass01I r3, AnonymousClass010 r4, C13370nZ r5) {
        this.A03 = r4;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void onCancel() {
        View view = this.A00;
        view.clearAnimation();
        this.A01.endViewTransition(view);
        this.A02.A02();
        C12560m7.A0E(2);
    }
}
