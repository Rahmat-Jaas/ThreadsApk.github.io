package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3tt  reason: invalid class name and case insensitive filesystem */
public final class C65603tt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C34345IEr A01;
    public final /* synthetic */ String A02;

    public C65603tt(View view, C34345IEr iEr, String str) {
        this.A00 = view;
        this.A01 = iEr;
        this.A02 = str;
    }

    public final void onGlobalLayout() {
        long j;
        View view = this.A00;
        if (view.getViewTreeObserver().isAlive()) {
            C34345IEr iEr = this.A01;
            C34344IEq iEq = iEr.A01;
            Integer num = AnonymousClass006.A00;
            String str = iEr.A02;
            String str2 = this.A02;
            String str3 = iEr.A02.A02;
            if (str3 != null) {
                j = Long.parseLong(str3);
            } else {
                j = 0;
            }
            iEq.A03(num, str, str2, "", j);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
