package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7RM  reason: invalid class name */
public final class AnonymousClass7RM implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FrameLayout A01;
    public final /* synthetic */ AnonymousClass97l A02;
    public final /* synthetic */ C00 A03;
    public final /* synthetic */ C145958lO A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass7RM(FrameLayout frameLayout, AnonymousClass97l r2, C00 c00, C145958lO r4, int i, boolean z) {
        this.A02 = r2;
        this.A05 = z;
        this.A04 = r4;
        this.A03 = c00;
        this.A00 = i;
        this.A01 = frameLayout;
    }

    public final void onClick(View view) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        int i;
        int A052 = C14030oh.A05(-724900437);
        AnonymousClass97l r6 = this.A02;
        Integer A022 = C19410Avs.A02(r6);
        if (A022 == null) {
            i = -240757056;
        } else {
            int intValue = A022.intValue();
            if (intValue != 2) {
                if (intValue == 3) {
                    this.A04.C9Y(r6, this.A03, this.A00);
                } else if (intValue != 0 && intValue == 4) {
                    this.A04.BtU(r6, this.A03, this.A00);
                }
            } else if (!this.A05) {
                this.A04.Bp4(r6, this.A03, this.A00);
                i = 1749474661;
            } else {
                FrameLayout frameLayout = this.A01;
                AnonymousClass4wT r3 = new AnonymousClass4wT(r6, this.A03, this.A04, this.A00);
                if (!(frameLayout == null || (animate = frameLayout.animate()) == null || (alpha = animate.alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) == null || (duration = alpha.setDuration(200)) == null)) {
                    duration.setListener(r3);
                }
            }
            i = 667315261;
        }
        C14030oh.A0C(i, A052);
    }
}
