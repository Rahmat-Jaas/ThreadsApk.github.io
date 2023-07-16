package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.3vw  reason: invalid class name and case insensitive filesystem */
public final class C65813vw implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C127397h3 A01;
    public final /* synthetic */ C109326jp A02;

    public C65813vw(AnonymousClass3HX r1, C127397h3 r2, C109326jp r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C109326jp r5 = this.A02;
        if (r5 == null) {
            return false;
        }
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        C127397h3 r2 = this.A01;
        A002.A03(r2, 0);
        AnonymousClass3HX r1 = this.A00;
        C122047Jt.A03(r1, r2, C63893iY.A04(A002, r1, 1), r5);
        return true;
    }
}
