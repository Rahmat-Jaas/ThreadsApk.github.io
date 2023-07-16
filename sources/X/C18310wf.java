package X;

import android.app.Dialog;
import android.content.Context;
import com.instagram.barcelona.R;

/* renamed from: X.0wf  reason: invalid class name and case insensitive filesystem */
public final class C18310wf extends Dialog {
    public final /* synthetic */ C121997Jj A00;
    public final /* synthetic */ C109326jp A01;
    public final /* synthetic */ AnonymousClass0ZU A02;

    public final void onBackPressed() {
        C109326jp r3 = this.A01;
        if (r3 != null) {
            C121997Jj r1 = this.A00;
            AnonymousClass0ZU r0 = this.A02;
            C122047Jt.A03((AnonymousClass3HX) r0.invoke(), r1.A02, C63893iY.A01, r3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18310wf(Context context, C121997Jj r3, C109326jp r4, AnonymousClass0ZU r5) {
        super(context, R.style.alaska_full_screen_dialog);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
    }
}
