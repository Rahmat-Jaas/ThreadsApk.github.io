package X;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.instagram.barcelona.R;

/* renamed from: X.7LI  reason: invalid class name */
public final class AnonymousClass7LI implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ B5b A00;
    public final /* synthetic */ C18266Acd A01;
    public final /* synthetic */ C1193274p A02;
    public final /* synthetic */ Lu1 A03;
    public final /* synthetic */ AnonymousClass9F7 A04;

    public AnonymousClass7LI(B5b b5b, C18266Acd acd, C1193274p r3, Lu1 lu1, AnonymousClass9F7 r5) {
        this.A04 = r5;
        this.A00 = b5b;
        this.A01 = acd;
        this.A03 = lu1;
        this.A02 = r3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A022;
        C04220Ms.A0B(valueAnimator, 0);
        String str = this.A04.A04;
        if (str != null) {
            A022 = Color.parseColor(str);
        } else {
            A022 = C19556AyH.A02(this.A00, R.color.canvas_bottom_sheet_description_text_color);
        }
        this.A01.A00(AnonymousClass9F7.A00(C18240wQ.A00(this.A03.A02), C09760gd.A02(C18240wQ.A00(C86144wL.A0e(valueAnimator)), A022, C19556AyH.A02(this.A00, R.color.primary_text_disabled_material_dark))));
        if (C04220Ms.A0I(valueAnimator.getAnimatedValue(), C86124wJ.A0g())) {
            C1193274p r1 = this.A02;
            Boolean A0Y = C18180wK.A0Y();
            M0S.A00();
            r1.A00 = A0Y;
        }
    }
}
