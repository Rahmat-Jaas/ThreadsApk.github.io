package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C25238DiJ;
import X.C31155GhB;
import X.C32165H8c;
import X.C39142Kno;
import X.C63623hv;
import X.C63873iU;
import X.C86054wC;
import X.D0E;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape50S0100000_I2_30;

public class KtSLambdaShape0S0223000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0223000_I2(C32165H8c h8c, C146958n9 r3, int i, int i2, int i3, boolean z, boolean z2) {
        super(2, r3);
        this.A07 = i3;
        this.A03 = h8c;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = z;
        this.A05 = z2;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        int i;
        int i2 = this.A07;
        C32165H8c h8c = (C32165H8c) this.A03;
        int i3 = this.A01;
        int i4 = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape0S0223000_I2 ktSLambdaShape0S0223000_I2 = new KtSLambdaShape0S0223000_I2(h8c, r10, i3, i4, i, z, z2);
        ktSLambdaShape0S0223000_I2.A04 = obj;
        return ktSLambdaShape0S0223000_I2;
    }

    public final Object invokeSuspend(Object obj) {
        C86054wC r5;
        C32165H8c h8c;
        int i;
        int i2 = this.A07;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i3 = this.A02;
        if (i2 != 0) {
            if (i3 == 0) {
                AnonymousClass0OU.A00(obj);
                r5 = (C86054wC) this.A04;
                C63623hv.A09("LoadingFlow loading", new KtLambdaShape50S0100000_I2_30(r5, 39));
                h8c = (C32165H8c) this.A03;
                C63873iU.A0E(h8c, r5, 45);
                C31155GhB.A05(h8c, this.A01, this.A00, this.A06, this.A05);
                i = 40;
            }
            AnonymousClass0OU.A00(obj);
            return Unit.A00;
        }
        if (i3 == 0) {
            AnonymousClass0OU.A00(obj);
            r5 = (C86054wC) this.A04;
            h8c = (C32165H8c) this.A03;
            C63873iU.A0E(h8c, r5, 44);
            C31155GhB.A05(h8c, this.A01, this.A00, this.A06, this.A05);
            i = 38;
        }
        AnonymousClass0OU.A00(obj);
        return Unit.A00;
        KtLambdaShape50S0100000_I2_30 ktLambdaShape50S0100000_I2_30 = new KtLambdaShape50S0100000_I2_30(h8c, i);
        this.A02 = 1;
        if (C25238DiJ.A00(this, ktLambdaShape50S0100000_I2_30, r5) == d0e) {
            return d0e;
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0223000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
