package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass7JP;
import X.AnonymousClass8f7;
import X.C02220Ah;
import X.C115796vv;
import X.C1203679w;
import X.C1203779x;
import X.C122087Kb;
import X.C142758fX;
import X.C147188nY;
import X.C28032ExM;
import X.C86104wH;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2010000_I2;
import kotlin.Unit;

public class KtLambdaShape0S1602000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public String A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1602000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i, int i2, int i3) {
        super(2);
        this.A09 = i3;
        this.A06 = obj;
        this.A07 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A08 = str;
        this.A02 = obj6;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A09 != 0) {
            KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2 = (KtCSuperShape0S0210000_I2) this.A04;
            AnonymousClass8f7 r5 = (AnonymousClass8f7) this.A02;
            Modifier modifier = (Modifier) this.A05;
            String str = this.A08;
            C122087Kb.A03(C86104wH.A0H(obj, obj2), modifier, ktCSuperShape0S0210000_I2, (KtCSuperShape0S2010000_I2) this.A03, r5, (C28032ExM) this.A07, str, (AnonymousClass0YY) this.A06, C115796vv.A00(this.A00), this.A01);
        } else {
            C147188nY A0H = C86104wH.A0H(obj, obj2);
            MutableTransitionState mutableTransitionState = (MutableTransitionState) this.A07;
            AnonymousClass7JP.A01((C1203679w) this.A03, (C1203779x) this.A04, mutableTransitionState, (C142758fX) this.A06, A0H, (Modifier) this.A05, this.A08, (AnonymousClass0YM) this.A02, this.A00 | 1, this.A01);
        }
        return Unit.A00;
    }
}
