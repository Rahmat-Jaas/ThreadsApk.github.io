package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape3S0701000_I2;
import kotlin.jvm.internal.KtLambdaShape42S0200000_I2_3;

/* renamed from: X.8JU  reason: invalid class name */
public final class AnonymousClass8JU extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ C19210zU A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JU(Context context, C81784oM r3, C19210zU r4, UserSession userSession, AnonymousClass0ZU r6, AnonymousClass0ZU r7, int i) {
        super(1);
        this.A03 = r4;
        this.A06 = r6;
        this.A00 = i;
        this.A05 = r7;
        this.A02 = r3;
        this.A01 = context;
        this.A04 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C145078jn r3 = (C145078jn) obj;
        C04220Ms.A0B(r3, 0);
        C19210zU r11 = this.A03;
        List list = r11.A00;
        AnonymousClass8PG r1 = AnonymousClass8PG.A00;
        AnonymousClass0ZU r12 = this.A06;
        int i = this.A00;
        AnonymousClass0ZU r14 = this.A05;
        C81784oM r15 = this.A02;
        Context context = this.A01;
        UserSession userSession = this.A04;
        C78674io r5 = C78674io.A00;
        r3.Ba5(new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r1, 27), new KtLambdaShape42S0200000_I2_3(list, (AnonymousClass0YY) r5, 28), AnonymousClass7WY.A01(new KtLambdaShape3S0701000_I2(i, 0, list, userSession, r11, r12, context, r14, r15), -632812321, true), list.size());
        r3.Ba2((Object) null, (Object) null, C103536Zo.A01);
        return Unit.A00;
    }
}
