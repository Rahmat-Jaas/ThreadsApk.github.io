package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass7WY;
import X.AnonymousClass8OB;
import X.C02220Ah;
import X.C04220Ms;
import X.C115716vn;
import X.C145078jn;
import X.C78424iP;
import X.C78504iX;
import X.C86104wH;
import X.C86124wJ;
import X.C86134wK;
import X.C86164wN;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape8S0501000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape8S0501000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        super(1);
        this.A06 = i2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A01 = obj5;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145078jn r15;
        int i;
        Object obj2;
        Object obj3;
        int i2;
        int size;
        KtLambdaShape41S0200000_I2_2 ktLambdaShape41S0200000_I2_2;
        KtLambdaShape41S0200000_I2_2 ktLambdaShape41S0200000_I2_22;
        List list;
        Object obj4;
        Object obj5;
        switch (this.A06) {
            case 0:
                Canvas canvas = (Canvas) obj;
                C04220Ms.A0B(canvas, 0);
                int save = canvas.save();
                canvas.clipRect((Rect) this.A03);
                RectF rectF = (RectF) this.A04;
                if (rectF != null) {
                    canvas.clipRect(rectF);
                }
                C86134wK.A1L(this.A05, canvas);
                canvas.restoreToCount(save);
                break;
            case 1:
                C145078jn r152 = (C145078jn) obj;
                C04220Ms.A0B(r152, 0);
                KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = (KtCSuperShape0S0210000_I2) this.A03;
                List list2 = (List) ktCSuperShape0S0210000_I2.A01;
                KtLambdaShape168S0100000_I2_1 ktLambdaShape168S0100000_I2_1 = new KtLambdaShape168S0100000_I2_1(this.A01, 0);
                Object obj6 = this.A05;
                int i3 = this.A00;
                Object obj7 = this.A02;
                Object obj8 = this.A04;
                r152.Ba5(new KtLambdaShape41S0200000_I2_2(18, (Object) ktLambdaShape168S0100000_I2_1, (Object) list2), C86164wN.A0s(list2, 41), AnonymousClass7WY.A01(new KtLambdaShape13S0401000_I2(list2, obj6, obj7, obj8, i3, 0), -1091073711, true), list2.size());
                if (ktCSuperShape0S0210000_I2.A02) {
                    C115716vn.A00(r152, new KtLambdaShape30S0201000_I2(i3, 2, ktCSuperShape0S0210000_I2, obj6), 33882336);
                    break;
                }
                break;
            case 2:
                r15 = (C145078jn) obj;
                i = 0;
                C04220Ms.A0B(r15, 0);
                List list3 = (List) this.A04;
                AnonymousClass0YY r7 = (AnonymousClass0YY) this.A03;
                obj2 = this.A01;
                obj3 = this.A05;
                Object obj9 = this.A02;
                i2 = this.A00;
                C78424iP r4 = C78424iP.A00;
                size = list3.size();
                if (r7 != null) {
                    ktLambdaShape41S0200000_I2_2 = new KtLambdaShape41S0200000_I2_2(list3, r7, 33);
                } else {
                    ktLambdaShape41S0200000_I2_2 = null;
                }
                ktLambdaShape41S0200000_I2_22 = new KtLambdaShape41S0200000_I2_2(list3, (AnonymousClass0YY) r4, 34);
                obj4 = list3;
                obj5 = r7;
                list = obj9;
                break;
            default:
                r15 = C86124wJ.A0M(obj);
                List list4 = (List) ((KtCSuperShape0S0201000_I2) C86104wH.A0f(this.A04)).A01;
                AnonymousClass8OB r3 = AnonymousClass8OB.A00;
                Object obj10 = this.A03;
                Object obj11 = this.A02;
                i2 = this.A00;
                obj3 = this.A05;
                obj2 = this.A01;
                C78504iX r42 = C78504iX.A00;
                size = list4.size();
                ktLambdaShape41S0200000_I2_2 = new KtLambdaShape41S0200000_I2_2(list4, (AnonymousClass0YY) r3, 44);
                ktLambdaShape41S0200000_I2_22 = new KtLambdaShape41S0200000_I2_2(list4, (AnonymousClass0YY) r42, 45);
                i = 1;
                list = list4;
                obj5 = obj10;
                obj4 = obj11;
                break;
        }
        r15.Ba5(ktLambdaShape41S0200000_I2_2, ktLambdaShape41S0200000_I2_22, AnonymousClass7WY.A01(new KtLambdaShape9S0501000_I2(obj2, obj5, obj3, obj4, list, i2, i), -632812321, true), size);
        return Unit.A00;
    }
}
