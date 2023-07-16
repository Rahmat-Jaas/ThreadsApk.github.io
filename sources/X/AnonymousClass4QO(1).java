package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.4QO  reason: invalid class name */
public final class AnonymousClass4QO implements Runnable {
    public final /* synthetic */ Context A00;

    public AnonymousClass4QO(Context context) {
        this.A00 = context;
    }

    public final void run() {
        Context context = this.A00;
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            C25828Dsm A0W = C18190wL.A0W(context);
            A0W.A0L(2131826851);
            A0W.A0K(2131831662);
            A0W.A0P((DialogInterface.OnClickListener) null, 2131826195);
            AnonymousClass0wJ.A1K(A0W);
        }
    }
}
