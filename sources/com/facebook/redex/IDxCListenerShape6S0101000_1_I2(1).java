package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass11A;
import X.AnonymousClass11K;
import X.AnonymousClass1dM;
import X.AnonymousClass31T;
import X.AnonymousClass3ZB;
import X.AnonymousClass4QK;
import X.C04220Ms;
import X.C14030oh;
import X.C18190wL;
import X.C61723Vc;
import X.C63733iD;
import X.C82604py;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;

public class IDxCListenerShape6S0101000_1_I2 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape6S0101000_1_I2(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.A02) {
            case 0:
                i = AnonymousClass11K.A00(view, this, 270477772);
                i2 = -122396311;
                break;
            case 1:
                i = AnonymousClass11K.A00(view, this, 121593796);
                i2 = -1721542356;
                break;
            case 2:
                i = AnonymousClass11K.A00(view, this, -1153989325);
                i2 = -2141206591;
                break;
            case 3:
                i = C14030oh.A05(118065154);
                C82604py r1 = ((AnonymousClass11A) this.A01).A00;
                if (r1 != null) {
                    int i3 = this.A00;
                    C04220Ms.A07(view);
                    r1.CHo(view, i3);
                }
                i2 = -1147379620;
                break;
            case 4:
                i = C14030oh.A05(2050598972);
                ((AnonymousClass0YY) ((KtCSuperShape0S0210000_I2) this.A01).A01).invoke(Integer.valueOf(this.A00));
                i2 = 323604853;
                break;
            case 5:
                i = C14030oh.A05(-1556603125);
                ((AnonymousClass0YY) ((KtCSuperShape0S0210000_I2) this.A01).A00).invoke(Integer.valueOf(this.A00));
                i2 = -699332767;
                break;
            case 6:
                i = C14030oh.A05(367287049);
                AnonymousClass3ZB r4 = (AnonymousClass3ZB) this.A01;
                DialogInterface.OnClickListener onClickListener = r4.A00;
                if (onClickListener != null) {
                    onClickListener.onClick(r4.A0E, this.A00);
                }
                r4.A0E.dismiss();
                i2 = 1998154235;
                break;
            default:
                i = C14030oh.A05(389061199);
                AnonymousClass1dM r5 = (AnonymousClass1dM) this.A01;
                Set set = r5.A0H;
                long j = (long) AnonymousClass31T.A00;
                Set<C61723Vc> set2 = r5.A0G;
                set2.addAll(set);
                ArrayList A0w = AnonymousClass0wJ.A0w(set2);
                for (C61723Vc r12 : set2) {
                    r12.A04 = true;
                    A0w.add(Unit.A00);
                }
                r5.A0D.postDelayed(new AnonymousClass4QK(r5), j);
                set.clear();
                AnonymousClass1dM.A00(r5);
                C63733iD A012 = C63733iD.A01();
                A012.A0A = AnonymousClass0wJ.A0m(AnonymousClass0wJ.A0B(r5), this.A00, R.plurals.x_comments_deleted);
                View view2 = r5.A00;
                if (view2 != null) {
                    A012.A02 = view2.getHeight() + 2;
                    A012.A0D = C18190wL.A0g(AnonymousClass0wJ.A0B(r5), 2131837219);
                    A012.A07 = new IDxCBackShape392S0100000_1_I2(r5, 11);
                    A012.A0I = true;
                    A012.A0C();
                    C63733iD.A0A(A012);
                    i2 = 1132390808;
                    break;
                } else {
                    C04220Ms.A0E("composerView");
                    throw null;
                }
        }
        C14030oh.A0C(i2, i);
    }
}
