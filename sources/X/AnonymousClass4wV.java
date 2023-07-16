package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.instagram.barcelona.R;
import java.util.AbstractMap;

/* renamed from: X.4wV  reason: invalid class name */
public final class AnonymousClass4wV extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass3HX A00;
    public final /* synthetic */ C112856qJ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass4wV(AnonymousClass3HX r1, C112856qJ r2, String str, boolean z) {
        this.A03 = z;
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.A03) {
            AnonymousClass3HX r2 = this.A00;
            ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).remove(this.A02);
        }
        this.A01.A00(this.A02);
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A03) {
            AnonymousClass3HX r2 = this.A00;
            ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).remove(this.A02);
        }
        this.A01.A00(this.A02);
    }
}
