package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass74O;
import X.C02220Ah;
import X.C115796vv;
import X.C142638fL;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S2602001_I2 extends C02220Ah implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public String A09;
    public String A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S2602001_I2(C142638fL r2, C142638fL r3, Modifier modifier, String str, String str2, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0YP r9, float f, int i, int i2) {
        super(2);
        this.A09 = str;
        this.A0A = str2;
        this.A05 = modifier;
        this.A00 = f;
        this.A07 = r7;
        this.A08 = r2;
        this.A06 = r3;
        this.A04 = r8;
        this.A03 = r9;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        String str = this.A09;
        String str2 = this.A0A;
        float f = this.A00;
        AnonymousClass74O.A00((C142638fL) this.A08, (C142638fL) this.A06, A0H, (Modifier) this.A05, str, str2, (AnonymousClass0ZU) this.A07, (AnonymousClass0ZU) this.A04, (AnonymousClass0YP) this.A03, f, C115796vv.A00(this.A01), this.A02);
        return Unit.A00;
    }
}
