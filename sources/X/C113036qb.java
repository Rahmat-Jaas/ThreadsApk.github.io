package X;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import kotlin.jvm.internal.KtLambdaShape51S0100000_I2_31;

/* renamed from: X.6qb  reason: invalid class name and case insensitive filesystem */
public final class C113036qb {
    public AnimatorSet A00;
    public final Activity A01;
    public final ViewStub A02;
    public final C04530Oa A03 = AnonymousClass0OY.A02(new KtLambdaShape51S0100000_I2_31(this, 48));
    public final AnonymousClass0ZU A04;
    public final TargetViewSizeProvider A05;
    public final AnonymousClass0ZU A06;

    public final void A00() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.A00;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.A00) == null)) {
            animatorSet.cancel();
        }
        C04530Oa r2 = this.A03;
        C86144wL.A0I(r2).setVisibility(8);
        this.A00 = null;
        View A0I = C86144wL.A0I(r2);
        if (A0I != null) {
            A0I.setVisibility(8);
        }
    }

    public C113036qb(Activity activity, ViewStub viewStub, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass0ZU r6, AnonymousClass0ZU r7) {
        AnonymousClass0wJ.A1O(activity, viewStub);
        C04220Ms.A0B(targetViewSizeProvider, 5);
        this.A01 = activity;
        this.A02 = viewStub;
        this.A04 = r6;
        this.A06 = r7;
        this.A05 = targetViewSizeProvider;
    }
}
