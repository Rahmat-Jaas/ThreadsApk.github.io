package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass7pP;
import X.C02220Ah;
import X.C94335uk;
import X.C94345ul;
import java.util.Queue;
import kotlin.Unit;

public class KtLambdaShape0S7101000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public int A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S7101000_I2(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2) {
        super(0);
        this.A09 = i2;
        this.A01 = obj;
        this.A08 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A00 = i;
        this.A03 = str5;
        this.A02 = str6;
        this.A04 = str7;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object r1;
        int i = this.A09;
        Queue queue = ((AnonymousClass7pP) this.A01).A01;
        if (i != 0) {
            r1 = new C94345ul(this.A00, this.A03, this.A07, this.A02, this.A08, this.A05, this.A06, this.A04);
        } else {
            String str = this.A08;
            String str2 = this.A05;
            String str3 = this.A07;
            String str4 = this.A06;
            int i2 = this.A00;
            String str5 = this.A03;
            String str6 = this.A02;
            if (str6 == null) {
                str6 = "null";
            }
            String str7 = this.A04;
            if (str7 == null) {
                str7 = "null";
            }
            r1 = new C94335uk(i2, str, str2, str3, str4, str5, str6, str7);
        }
        queue.add(r1);
        return Unit.A00;
    }
}
