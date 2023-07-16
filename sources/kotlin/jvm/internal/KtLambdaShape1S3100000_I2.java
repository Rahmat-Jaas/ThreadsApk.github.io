package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass8cU;
import X.C02220Ah;
import X.C04220Ms;
import X.C18240wQ;
import X.C86104wH;
import com.instagram.barcelona.bds.components.header.EnterAlwaysState;
import java.util.Map;

public class KtLambdaShape1S3100000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S3100000_I2(Object obj, String str, String str2, String str3, int i) {
        super(1);
        this.A04 = i;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = obj;
        this.A03 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A04 == 0) {
            return C86104wH.A0N(obj).B5d(this.A01, this.A03, this.A02, (Map) this.A00);
        }
        Map map = (Map) obj;
        C04220Ms.A0B(map, 0);
        Object obj2 = map.get(this.A02);
        C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.Int");
        int A042 = AnonymousClass0wJ.A04(obj2);
        Object obj3 = map.get(this.A01);
        C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.Boolean");
        boolean A1X = AnonymousClass0wJ.A1X(obj3);
        Object obj4 = map.get(this.A03);
        C04220Ms.A0C(obj4, "null cannot be cast to non-null type kotlin.Float");
        return new EnterAlwaysState((AnonymousClass8cU) this.A00, C18240wQ.A00(obj4), A042, A1X);
    }
}
