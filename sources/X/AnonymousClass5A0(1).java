package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.5A0  reason: invalid class name */
public final class AnonymousClass5A0 extends LBP {
    public final /* synthetic */ Context A00;

    public final int A08() {
        return -1;
    }

    public final int A0B(int i) {
        return 100;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5A0(Context context, Context context2) {
        super(context);
        this.A00 = context2;
    }

    public final int A0D(View view, int i) {
        return super.A0D(view, i) + C86134wK.A07(this.A00);
    }
}
