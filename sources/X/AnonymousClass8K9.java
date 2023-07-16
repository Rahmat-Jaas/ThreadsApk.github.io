package X;

import androidx.compose.ui.Modifier;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.quickpromotion.presenter.QPLifecyclePresenterImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape14S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6;
import kotlin.jvm.internal.KtLambdaShape30S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2;

/* renamed from: X.8K9  reason: invalid class name */
public final class AnonymousClass8K9 extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ C81784oM A04;
    public final /* synthetic */ C105496dW A05;
    public final /* synthetic */ C146638ma A06;
    public final /* synthetic */ AnonymousClass56T A07;
    public final /* synthetic */ QPLifecyclePresenterImpl A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ AnonymousClass0ZU A0A;
    public final /* synthetic */ AnonymousClass0YY A0B;
    public final /* synthetic */ AnonymousClass0YY A0C;
    public final /* synthetic */ AnonymousClass0YY A0D;
    public final /* synthetic */ AnonymousClass0YP A0E;
    public final /* synthetic */ AnonymousClass0YP A0F;
    public final /* synthetic */ AnonymousClass0YP A0G;
    public final /* synthetic */ AnonymousClass0YP A0H;
    public final /* synthetic */ AnonymousClass0YC A0I;
    public final /* synthetic */ AnonymousClass0YC A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8K9(C147368pE r2, C81784oM r3, C81784oM r4, C81784oM r5, C105496dW r6, C146638ma r7, AnonymousClass56T r8, QPLifecyclePresenterImpl qPLifecyclePresenterImpl, String str, AnonymousClass0ZU r11, AnonymousClass0YY r12, AnonymousClass0YY r13, AnonymousClass0YY r14, AnonymousClass0YP r15, AnonymousClass0YP r16, AnonymousClass0YP r17, AnonymousClass0YP r18, AnonymousClass0YC r19, AnonymousClass0YC r20, int i) {
        super(1);
        this.A04 = r3;
        this.A08 = qPLifecyclePresenterImpl;
        this.A07 = r8;
        this.A03 = r4;
        this.A05 = r6;
        this.A09 = str;
        this.A06 = r7;
        this.A0J = r19;
        this.A0H = r15;
        this.A0I = r20;
        this.A0A = r11;
        this.A0B = r12;
        this.A0C = r13;
        this.A0G = r16;
        this.A0E = r17;
        this.A0D = r14;
        this.A0F = r18;
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145078jn A0M = C86124wJ.A0M(obj);
        Modifier A042 = Modifier.A04(Modifier.A00);
        C81784oM r37 = this.A04;
        Object obj2 = ((KtCSuperShape0S0110000_I2) r37.getValue()).A00;
        if (obj2 != null) {
            A0M.Ba2(C18170wI.A00(HttpStatus.SC_FAILED_DEPENDENCY), (Object) null, AnonymousClass7WY.A01(new KtLambdaShape14S0300000_I2(3, this.A07, obj2, this.A08), 186264322, true));
        }
        C81784oM r36 = this.A03;
        List list = (List) ((KtCSuperShape0S0110000_I2) r36.getValue()).A00;
        AnonymousClass8XY r1 = AnonymousClass8XY.A00;
        C105496dW r35 = this.A05;
        String str = this.A09;
        C146638ma r22 = this.A06;
        AnonymousClass0YC r21 = this.A0J;
        AnonymousClass0YP r20 = this.A0H;
        AnonymousClass0YC r19 = this.A0I;
        AnonymousClass0ZU r17 = this.A0A;
        AnonymousClass0YY r15 = this.A0C;
        AnonymousClass0YP r10 = this.A0G;
        AnonymousClass0YP r9 = this.A0E;
        AnonymousClass0YY r8 = this.A0D;
        AnonymousClass0YP r7 = this.A0F;
        int i = this.A00;
        AnonymousClass56T r5 = this.A07;
        C147368pE r4 = this.A01;
        A0M.Ba5(new KtLambdaShape41S0200000_I2_2(41, (Object) r1, (Object) list), new KtLambdaShape151S0100000_I2_6(list, 40), AnonymousClass7WY.A01(new AnonymousClass8ax(r4, r37, A042, r35, r22, r5, str, list, r17, this.A0B, r15, r8, r20, r10, r9, r7, r21, r19, i), -1091073711, true), list.size());
        if (!((KtCSuperShape0S0110000_I2) r36.getValue()).A01) {
            C115716vn.A00(A0M, new KtLambdaShape30S0201000_I2(i, 5, this.A02, r5), 2018083551);
        }
        return Unit.A00;
    }
}
