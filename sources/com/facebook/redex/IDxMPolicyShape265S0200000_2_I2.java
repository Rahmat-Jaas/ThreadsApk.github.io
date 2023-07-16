package com.facebook.redex;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass69J;
import X.AnonymousClass6ZP;
import X.AnonymousClass7FP;
import X.AnonymousClass7IG;
import X.C04220Ms;
import X.C123657Xy;
import X.C146098ld;
import X.C146288ly;
import X.C147578pZ;
import X.C147618pd;
import X.C147838q0;
import X.C18170wI;
import X.C78034hm;
import X.C78074hq;
import X.C86164wN;
import X.C872050o;
import X.C877854n;
import X.C98226Er;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.KtLambdaShape2S0502000_I2;

public class IDxMPolicyShape265S0200000_2_I2 implements C146288ly {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxMPolicyShape265S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final /* synthetic */ int Bf9(C147838q0 r4, List list, int i) {
        if (1 - this.A02 != 0) {
            return AnonymousClass7FP.A00(r4, this, list, i);
        }
        C872050o r2 = (C872050o) this.A01;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        C04220Ms.A0A(layoutParams);
        r2.measure(C872050o.A00(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return r2.getMeasuredHeight();
    }

    public final /* synthetic */ int BfC(C147838q0 r5, List list, int i) {
        if (1 - this.A02 != 0) {
            return AnonymousClass7FP.A01(r5, this, list, i);
        }
        C872050o r3 = (C872050o) this.A01;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
        C04220Ms.A0A(layoutParams);
        r3.measure(makeMeasureSpec, C872050o.A00(0, i, layoutParams.height));
        return r3.getMeasuredWidth();
    }

    public final C146098ld Bg2(C147618pd r16, List list, long j) {
        int i;
        int i2;
        AnonymousClass0YY r6;
        AnonymousClass0YY A11;
        C123657Xy r7;
        C123657Xy r8;
        int i3;
        float f;
        Integer num;
        C147618pd r9 = r16;
        long j2 = j;
        switch (this.A02) {
            case 0:
                List<C147578pZ> list2 = list;
                boolean A1Y = AnonymousClass0wJ.A1Y(r9, list2);
                Object obj = this.A01;
                String A002 = C18170wI.A00(6);
                Integer num2 = null;
                if (obj != null) {
                    for (C147578pZ r72 : list2) {
                        if (C04220Ms.A0I(C98226Er.A00(r72), "text")) {
                            r7 = r72.Bg4(Constraints.A05(Constraints.A04(j2), Constraints.A02(j2), A1Y ? 1 : 0, Constraints.A01(j2)));
                        }
                    }
                    throw new NoSuchElementException(A002);
                }
                r7 = null;
                if (this.A00 != null) {
                    for (C147578pZ r4 : list2) {
                        if (C04220Ms.A0I(C98226Er.A00(r4), "icon")) {
                            r8 = r4.Bg4(j2);
                        }
                    }
                    throw new NoSuchElementException(A002);
                }
                r8 = null;
                int i4 = 0;
                if (r7 != null) {
                    i3 = r7.A01;
                } else {
                    i3 = 0;
                }
                if (r8 != null) {
                    i4 = r8.A01;
                }
                i2 = Math.max(i3, i4);
                if (r7 == null || r8 == null) {
                    f = AnonymousClass7IG.A03;
                } else {
                    f = AnonymousClass7IG.A01;
                }
                i = r9.CfL(f);
                if (r7 != null) {
                    num2 = Integer.valueOf(r7.ANp(AnonymousClass6ZP.A00));
                    num = Integer.valueOf(r7.ANp(AnonymousClass6ZP.A01));
                } else {
                    num = null;
                }
                r6 = new KtLambdaShape2S0502000_I2(r7, r8, r9, num2, num, i2, i, A1Y);
                break;
            case 1:
                C04220Ms.A0B(r9, 0);
                C872050o r62 = (C872050o) this.A01;
                if (r62.getChildCount() == 0) {
                    i2 = Constraints.A04(j2);
                    i = Constraints.A03(j2);
                    A11 = C78034hm.A00;
                } else {
                    if (Constraints.A04(j2) != 0) {
                        r62.getChildAt(0).setMinimumWidth(Constraints.A04(j2));
                    }
                    if (Constraints.A03(j2) != 0) {
                        r62.getChildAt(0).setMinimumHeight(Constraints.A03(j2));
                    }
                    int A04 = Constraints.A04(j2);
                    int A022 = Constraints.A02(j2);
                    ViewGroup.LayoutParams layoutParams = r62.getLayoutParams();
                    C04220Ms.A0A(layoutParams);
                    int A003 = C872050o.A00(A04, A022, layoutParams.width);
                    int A03 = Constraints.A03(j2);
                    int A012 = Constraints.A01(j2);
                    ViewGroup.LayoutParams layoutParams2 = r62.getLayoutParams();
                    C04220Ms.A0A(layoutParams2);
                    r62.measure(A003, C872050o.A00(A03, A012, layoutParams2.height));
                    i2 = r62.getMeasuredWidth();
                    i = r62.getMeasuredHeight();
                    A11 = C86164wN.A11(r62, this.A00, 22);
                }
                r6 = A11;
                break;
            default:
                C04220Ms.A0B(r9, 0);
                ((C877854n) this.A01).setParentLayoutDirection((AnonymousClass69J) this.A00);
                return r9.BaT(AnonymousClass4WJ.A0A(), C78074hq.A00, 0, 0);
        }
        return C147618pd.A00(r9, r6, i2, i);
    }

    public final /* synthetic */ int BgK(C147838q0 r4, List list, int i) {
        if (1 - this.A02 != 0) {
            return AnonymousClass7FP.A02(r4, this, list, i);
        }
        C872050o r2 = (C872050o) this.A01;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        C04220Ms.A0A(layoutParams);
        r2.measure(C872050o.A00(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return r2.getMeasuredHeight();
    }

    public final /* synthetic */ int BgN(C147838q0 r5, List list, int i) {
        if (1 - this.A02 != 0) {
            return AnonymousClass7FP.A03(r5, this, list, i);
        }
        C872050o r3 = (C872050o) this.A01;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
        C04220Ms.A0A(layoutParams);
        r3.measure(makeMeasureSpec, C872050o.A00(0, i, layoutParams.height));
        return r3.getMeasuredWidth();
    }
}
