package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass601;
import X.AnonymousClass9F6;
import X.B5b;
import X.C04220Ms;
import X.C09760gd;
import X.C09860go;
import X.C109326jp;
import X.C1193274p;
import X.C18180wK;
import X.C18240wQ;
import X.C18266Acd;
import X.C19556AyH;
import X.C38232KRr;
import X.C61043Rr;
import X.C63893iY;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C86144wL;
import X.M0S;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

public class IDxUListenerShape34S0400000_2_I2 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxUListenerShape34S0400000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A02 = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int A022;
        switch (this.A04) {
            case 0:
                C63893iY r1 = (C63893iY) this.A01;
                C61043Rr.A00((AnonymousClass601) this.A02, r1, (C109326jp) this.A03);
                return;
            case 1:
                float A002 = C18240wQ.A00(C86114wI.A0c(valueAnimator));
                int A003 = (int) C09860go.A00((Context) this.A00, ((float) 12) + (((float) 4) * (((float) 1) - A002)));
                TextView A0G = C86134wK.A0G(this.A03, A002);
                A0G.setAlpha(A002);
                A0G.setScaleX(A002);
                A0G.setScaleY(A002);
                Drawable background = ((View) this.A01).getBackground();
                if (background != null) {
                    background.setAlpha((int) (A002 * ((float) 255)));
                }
                View view = (View) this.A02;
                view.getLayoutParams().width = A003;
                view.getLayoutParams().height = A003;
                return;
            case 2:
                float A004 = C18240wQ.A00(C86114wI.A0c(valueAnimator));
                C38232KRr kRr = (C38232KRr) this.A03;
                float A042 = ((float) AnonymousClass0wJ.A04(kRr.A0A.getValue())) * A004;
                boolean A1X = AnonymousClass0wJ.A1X(kRr.A0J.getValue());
                View view2 = (View) this.A01;
                if (A1X) {
                    f = 1.0f;
                } else {
                    f = ((float) 1) - A004;
                }
                view2.setAlpha(f);
                float f2 = -A042;
                ((View) this.A02).setTranslationY(f2);
                ((View) this.A00).setTranslationY(f2);
                return;
            default:
                C04220Ms.A0B(valueAnimator, 0);
                AnonymousClass9F6 r3 = (AnonymousClass9F6) this.A01;
                String str = r3.A03;
                if (str != null) {
                    A022 = Color.parseColor(str);
                } else {
                    A022 = C19556AyH.A02((B5b) this.A03, R.color.canvas_bottom_sheet_description_text_color);
                }
                ((C18266Acd) this.A00).A00(AnonymousClass9F6.A00(r3, C09760gd.A02(C18240wQ.A00(C86144wL.A0e(valueAnimator)), A022, C19556AyH.A02((B5b) this.A03, R.color.primary_text_disabled_material_dark))));
                if (C04220Ms.A0I(valueAnimator.getAnimatedValue(), C86124wJ.A0g())) {
                    Boolean A0Y = C18180wK.A0Y();
                    M0S.A00();
                    ((C1193274p) this.A02).A00 = A0Y;
                    return;
                }
                return;
        }
    }
}
