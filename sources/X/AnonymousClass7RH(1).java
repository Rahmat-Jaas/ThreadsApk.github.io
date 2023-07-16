package X;

import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0202000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape161S0100000_I2_16;

/* renamed from: X.7RH  reason: invalid class name */
public final class AnonymousClass7RH implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C35387Itt A01;
    public final /* synthetic */ AnonymousClass5x9 A02;
    public final /* synthetic */ Set A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass7RH(C35387Itt itt, AnonymousClass5x9 r2, Set set, int i, boolean z) {
        this.A02 = r2;
        this.A04 = z;
        this.A01 = itt;
        this.A00 = i;
        this.A03 = set;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1732456155);
        AnonymousClass5x9 r5 = this.A02;
        KK5 kk5 = (KK5) r5.A0B.getValue();
        I6I i6i = r5.A04;
        if (i6i == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        C35387Itt itt = i6i.A02;
        C35355ItJ itJ = i6i.A01;
        Integer num = AnonymousClass006.A00;
        KK5.A03(kk5, itJ, itt, num, AnonymousClass006.A0N, (Integer) null, (Integer) null, i6i.A04, (String) null, r5.A06, (Map) null, 480);
        I6I i6i2 = r5.A04;
        if (i6i2 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        if (!this.A04) {
            num = AnonymousClass006.A01;
        }
        C35387Itt itt2 = this.A01;
        i6i2.A0C(num, (String) null, C18180wK.A0n(itt2.A00));
        I6I i6i3 = r5.A04;
        if (i6i3 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        int i = this.A00;
        Set set = this.A03;
        C880856r r1 = i6i3.A0B;
        Object A08 = r1.A08();
        if (A08 != null) {
            KtCSuperShape0S0202000_I2 ktCSuperShape0S0202000_I2 = (KtCSuperShape0S0202000_I2) A08;
            ktCSuperShape0S0202000_I2.A00 = i;
            ktCSuperShape0S0202000_I2.A01 = i;
            ktCSuperShape0S0202000_I2.A03 = set;
            ktCSuperShape0S0202000_I2.A02 = itt2;
            r1.A0G(ktCSuperShape0S0202000_I2);
            Object A082 = i6i3.A0D.A08();
            if (A082 != null) {
                C880856r r8 = i6i3.A0C;
                List list = ((IM8) A082).A0e;
                ArrayList A0w = AnonymousClass0wJ.A0w(list);
                int i2 = 0;
                for (Object next : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C06750aI.A1A();
                        throw null;
                    }
                    C148148qW B0h = ((C148428r2) next).B0h();
                    if (B0h != null) {
                        C148548rG A9g = B0h.A9g();
                        C04220Ms.A06(A9g);
                        A0w.add(new KtCSuperShape0S0210000_I2(A9g, (AnonymousClass0YY) new KtLambdaShape161S0100000_I2_16(i6i3, 26), AnonymousClass0wJ.A1T(i2, i)));
                        i2 = i3;
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                C25786Drz A002 = AnonymousClass5x9.A00(r8, r5, A0w);
                A002.A03 = new CRN();
                A002.A07 = AnonymousClass000.A00(107);
                A002.A05();
                C14030oh.A0C(-49157835, A05);
                return;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
