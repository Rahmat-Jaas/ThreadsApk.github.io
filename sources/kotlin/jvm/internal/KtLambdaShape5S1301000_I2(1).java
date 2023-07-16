package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass65D;
import X.AnonymousClass92l;
import X.C02220Ah;
import X.C115796vv;
import X.C1183570p;
import X.C2P;
import X.C86104wH;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape5S1301000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View view;
        MotionEvent motionEvent;
        C2P c2p;
        String str;
        AnonymousClass65D r3;
        Object obj3;
        Object obj4 = obj2;
        Object obj5 = obj;
        switch (this.A05) {
            case 0:
                C1183570p.A01(C86104wH.A0H(obj, obj2), this.A04, (List) this.A01, (AnonymousClass0ZU) this.A02, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00));
                return Unit.A00;
            case 1:
                view = (View) obj5;
                motionEvent = (MotionEvent) obj4;
                AnonymousClass0wJ.A1N(view, motionEvent);
                c2p = (C2P) this.A01;
                str = this.A04;
                r3 = (AnonymousClass65D) this.A02;
                obj3 = this.A03;
                break;
            default:
                view = (View) obj5;
                motionEvent = (MotionEvent) obj4;
                AnonymousClass0wJ.A1N(view, motionEvent);
                c2p = (C2P) this.A01;
                str = this.A04;
                r3 = (AnonymousClass65D) this.A03;
                obj3 = this.A02;
                break;
        }
        return Boolean.valueOf(c2p.C7i(motionEvent, view, r3, (AnonymousClass92l) obj3, str, this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S1301000_I2(C2P c2p, AnonymousClass65D r3, AnonymousClass92l r4, String str, int i, int i2) {
        super(2);
        this.A05 = i2;
        this.A01 = c2p;
        this.A04 = str;
        if (1 - i2 != 0) {
            this.A03 = r3;
            this.A02 = r4;
        } else {
            this.A02 = r3;
            this.A03 = r4;
        }
        this.A00 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S1301000_I2(String str, List list, AnonymousClass0ZU r4, AnonymousClass0YY r5, int i) {
        super(2);
        this.A05 = 0;
        this.A01 = list;
        this.A04 = str;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = i;
    }
}
