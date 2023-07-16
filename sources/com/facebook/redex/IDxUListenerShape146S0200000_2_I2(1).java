package com.facebook.redex;

import X.AnonymousClass0MZ;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C109326jp;
import X.C149158t2;
import X.C18240wQ;
import X.C61043Rr;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86144wL;
import X.Lu1;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import kotlin.jvm.internal.KtLambdaShape43S0200000_I2_4;

public class IDxUListenerShape146S0200000_2_I2 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxUListenerShape146S0200000_2_I2(ValueAnimator valueAnimator, AnonymousClass0YY r2, int i) {
        this.A02 = i;
        if (4 - i != 0) {
            this.A01 = valueAnimator;
            this.A00 = r2;
        } else {
            this.A00 = r2;
            this.A01 = valueAnimator;
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A02) {
            case 0:
            case 1:
            case 2:
                C04220Ms.A0B(valueAnimator, 0);
                C61043Rr.A00((AnonymousClass601) this.A00, C86104wH.A0W(valueAnimator), (C109326jp) this.A01);
                return;
            case 3:
                C04220Ms.A0B(valueAnimator, 0);
                ((Lu1) this.A00).A01(new KtLambdaShape43S0200000_I2_4(27, valueAnimator, this.A01));
                return;
            case 4:
                C04220Ms.A0B(valueAnimator, 0);
                ((AnonymousClass0YY) this.A00).invoke(C86134wK.A0e(valueAnimator));
                return;
            case 5:
                C86134wK.A0z((ValueAnimator) this.A01, this.A00, 6);
                return;
            case 6:
                float A002 = C18240wQ.A00(C86114wI.A0c(valueAnimator));
                ((View) this.A00).setAlpha(((float) 1) - A002);
                TextView A0G = C86134wK.A0G(this.A01, A002);
                A0G.setAlpha(A002);
                A0G.setScaleX(A002);
                A0G.setScaleY(A002);
                return;
            case 7:
                Iterator A0y = C86144wL.A0y(this.A01);
                while (A0y.hasNext()) {
                    ((View) A0y.next()).setAlpha(C18240wQ.A00(valueAnimator.getAnimatedValue()));
                }
                return;
            case 8:
                C04220Ms.A0B(valueAnimator, 0);
                int A04 = AnonymousClass0wJ.A04(C86134wK.A0e(valueAnimator));
                AnonymousClass0MZ r1 = (AnonymousClass0MZ) this.A00;
                if (A04 != r1.A00) {
                    r1.A00 = A04;
                    C149158t2 r0 = (C149158t2) this.A01;
                    r0.A00 = A04;
                    r0.invalidateSelf();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public IDxUListenerShape146S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
