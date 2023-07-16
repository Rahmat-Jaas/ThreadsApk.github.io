package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7IQ;
import X.AnonymousClass9F6;
import X.B5b;
import X.C02220Ah;
import X.C1193274p;
import X.C18240wQ;
import X.C18266Acd;
import X.C19556AyH;
import X.M0S;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxUListenerShape34S0400000_2_I2;
import com.instagram.barcelona.R;

public class IDxLambdaShape24S0500000_2_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape24S0500000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.A05 = i;
        this.A01 = obj3;
        this.A00 = obj4;
        this.A04 = obj2;
        this.A02 = obj;
        this.A03 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        int A022;
        if (this.A05 != 0) {
            AnonymousClass9F6 r9 = (AnonymousClass9F6) this.A02;
            if (r9.A05 || !AnonymousClass0wJ.A1X(r9.A01.A02)) {
                return null;
            }
            C1193274p r7 = (C1193274p) this.A03;
            M0S.A00();
            if (AnonymousClass0wJ.A1X(r7.A00)) {
                C18266Acd acd = (C18266Acd) this.A00;
                String str = r9.A03;
                if (str != null) {
                    A022 = Color.parseColor(str);
                } else {
                    A022 = C19556AyH.A02((B5b) this.A04, R.color.canvas_bottom_sheet_description_text_color);
                }
                acd.A00(AnonymousClass9F6.A00(r9, A022));
                return null;
            }
            C1193274p r3 = (C1193274p) this.A01;
            C1193274p.A00(r3);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
            Object obj = this.A04;
            Object obj2 = this.A00;
            if (r9.A04) {
                j = 300;
            } else {
                j = 0;
            }
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new IDxUListenerShape34S0400000_2_I2(3, obj2, r7, obj, r9));
            ofFloat.start();
            M0S.A00();
            r3.A00 = ofFloat;
            return null;
        }
        C18240wQ.A1G(this.A00);
        if (!((AnonymousClass7IQ) this.A01).A0A.A0B) {
            return null;
        }
        ((View) this.A04).setTag(-345497869, (Object) null);
        return null;
    }
}
