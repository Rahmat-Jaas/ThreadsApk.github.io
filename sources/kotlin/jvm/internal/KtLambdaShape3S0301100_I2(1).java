package kotlin.jvm.internal;

import X.AnonymousClass000;
import X.AnonymousClass0YY;
import X.AnonymousClass7WY;
import X.AnonymousClass8PR;
import X.BKU;
import X.C02220Ah;
import X.C04220Ms;
import X.C141338ai;
import X.C145078jn;
import X.C18093AZj;
import X.C21730BzH;
import X.C78814j2;
import X.C86124wJ;
import X.C86154wM;
import android.view.View;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape3S0301100_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0301100_I2(Object obj, Object obj2, Object obj3, int i, int i2, long j) {
        super(1);
        this.A05 = i2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = j;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        if (this.A05 != 0) {
            View A0L = C86124wJ.A0L(obj);
            C21730BzH bzH = (C21730BzH) this.A02;
            Product product = (Product) this.A04;
            Merchant merchant = product.A00.A0C;
            if (merchant != null) {
                str = merchant.A06;
            } else {
                str = null;
            }
            C04220Ms.A0A(str);
            long parseLong = Long.parseLong(str);
            String A0m = C86154wM.A0m((BKU) this.A03);
            String str2 = product.A00.A0j;
            long j = this.A01;
            bzH.Bos(A0L, new C18093AZj(A0m, str2, AnonymousClass000.A00(1234), this.A00, parseLong, j));
        } else {
            C145078jn A0M = C86124wJ.A0M(obj);
            List list = (List) this.A02;
            AnonymousClass8PR r1 = AnonymousClass8PR.A00;
            long j2 = this.A01;
            int i = this.A00;
            C78814j2 r5 = C78814j2.A00;
            A0M.Ba5(new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r1, 37), new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r5, 38), AnonymousClass7WY.A00(new C141338ai(list, (AnonymousClass0YY) this.A03, (AnonymousClass0YY) this.A04, i, j2), -632812321), list.size());
        }
        return Unit.A00;
    }
}
