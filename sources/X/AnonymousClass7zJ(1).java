package X;

import android.app.Dialog;
import android.content.Context;
import com.facebookpay.widget.paybutton.FBPayAnimationButton;

/* renamed from: X.7zJ  reason: invalid class name */
public final class AnonymousClass7zJ implements Runnable {
    public final /* synthetic */ FBPayAnimationButton A00;

    public AnonymousClass7zJ(FBPayAnimationButton fBPayAnimationButton) {
        this.A00 = fBPayAnimationButton;
    }

    public final void run() {
        FBPayAnimationButton fBPayAnimationButton = this.A00;
        C111306n7 r5 = new C111306n7();
        C121097Ec A0G = AnonymousClass7Kz.A0G();
        Context context = fBPayAnimationButton.getContext();
        r5.A0D = A0G.A04(context, 45, 62);
        r5.A0I = context.getString(2131826594);
        r5.A0F = context.getString(2131826593);
        r5.A0H = context.getString(2131826486);
        r5.A0B = AnonymousClass7Ll.A00;
        Dialog A01 = AnonymousClass7Kz.A0M().A01(context, new C114026sZ(r5));
        fBPayAnimationButton.A00 = A01;
        C13950oZ.A00(A01);
    }
}
