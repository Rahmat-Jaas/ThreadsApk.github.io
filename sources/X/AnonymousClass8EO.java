package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Color;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxAListenerShape371S0100000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.8EO  reason: invalid class name */
public final class AnonymousClass8EO extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ AnimatorSet A00;
    public final /* synthetic */ B5b A01;
    public final /* synthetic */ C18266Acd A02;
    public final /* synthetic */ C1193274p A03;
    public final /* synthetic */ C1193274p A04;
    public final /* synthetic */ Lu1 A05;
    public final /* synthetic */ AnonymousClass9F7 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8EO(AnimatorSet animatorSet, B5b b5b, C18266Acd acd, C1193274p r5, C1193274p r6, Lu1 lu1, AnonymousClass9F7 r8) {
        super(0);
        this.A06 = r8;
        this.A04 = r5;
        this.A02 = acd;
        this.A01 = b5b;
        this.A05 = lu1;
        this.A03 = r6;
        this.A00 = animatorSet;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        int A022;
        AnonymousClass9F7 r10 = this.A06;
        if (!r10.A07 && AnonymousClass0wJ.A1X(r10.A01.A02)) {
            C1193274p r8 = this.A04;
            M0S.A00();
            if (AnonymousClass0wJ.A1X(r8.A00)) {
                C18266Acd acd = this.A02;
                String str = r10.A04;
                if (str != null) {
                    A022 = Color.parseColor(str);
                } else {
                    A022 = C19556AyH.A02(this.A01, R.color.canvas_bottom_sheet_description_text_color);
                }
                acd.A00(AnonymousClass9F7.A00(C18240wQ.A00(this.A05.A02), A022));
            } else {
                C1193274p r4 = this.A03;
                C1193274p.A00(r4);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
                B5b b5b = this.A01;
                C18266Acd acd2 = this.A02;
                Lu1 lu1 = this.A05;
                AnimatorSet animatorSet = this.A00;
                if (r10.A06) {
                    j = 300;
                } else {
                    j = 0;
                }
                ofFloat.setDuration(j);
                ofFloat.addUpdateListener(new AnonymousClass7LI(b5b, acd2, r8, lu1, r10));
                ofFloat.addListener(new IDxAListenerShape371S0100000_2_I2(animatorSet, 3));
                ofFloat.start();
                M0S.A00();
                r4.A00 = ofFloat;
            }
        }
        return new C126737fq(this.A03);
    }
}
