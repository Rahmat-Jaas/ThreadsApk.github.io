package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass75O;
import X.C02220Ah;
import X.C1371586i;
import com.facebook.react.modules.intent.IntentModule;
import kotlin.Unit;

public class KtLambdaShape1S0420000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0420000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z, boolean z2) {
        super(1);
        this.A06 = i;
        this.A05 = z;
        this.A01 = obj;
        this.A00 = obj2;
        this.A04 = z2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object A002;
        String str;
        int i = this.A06;
        C1371586i A003 = AnonymousClass75O.A00(obj);
        Boolean valueOf = Boolean.valueOf(this.A05);
        if (i != 0) {
            A002 = C1371586i.A00(A003, valueOf, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, this);
            str = "onValueChange";
        } else {
            A002 = C1371586i.A00(A003, valueOf, "selected", this);
            str = "onClick";
        }
        A003.A01(str, A002);
        return Unit.A00;
    }
}
