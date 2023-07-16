package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.83C  reason: invalid class name */
public final class AnonymousClass83C implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C11630kW A03;
    public final /* synthetic */ C30857GZr A04;
    public final /* synthetic */ String A05;

    public AnonymousClass83C(Context context, View view, ViewGroup viewGroup, C11630kW r4, C30857GZr gZr, String str) {
        this.A05 = str;
        this.A00 = context;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A04 = gZr;
        this.A03 = r4;
    }

    public final void run() {
        C25553Dnn dnn = new C25553Dnn(this.A00, this.A02, new C26431qd((CharSequence) this.A05));
        dnn.A01(this.A01);
        dnn.A03(D0f.ABOVE_ANCHOR);
        dnn.A05 = new AnonymousClass623(this.A03, this.A04);
        dnn.A00().A05();
    }
}
