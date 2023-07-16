package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.Unit;

/* renamed from: X.8Rd  reason: invalid class name */
public final class AnonymousClass8Rd extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ C115286uo A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Rd(Modifier modifier, C115286uo r3, Integer num, String str, int i, long j) {
        super(2);
        this.A02 = modifier;
        this.A05 = str;
        this.A01 = j;
        this.A00 = i;
        this.A04 = num;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        C147188nY r2 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r2.BCM()) {
            Modifier A06 = AnonymousClass7K4.A06(AnonymousClass7Kq.A07(AnonymousClass6FI.A00(this.A02, AnonymousClass8PI.A00, true), C103126Xx.A00), (float) 16, 0);
            C141758cu r10 = AnonymousClass7KV.A04;
            String str = this.A05;
            long j = this.A01;
            int i2 = this.A00;
            Integer num = this.A04;
            C115286uo r8 = this.A03;
            C146288ly A0g = C147188nY.A0g(r2, r10);
            Object A0p = C147188nY.A0p(r2);
            Object A0n = C147188nY.A0n(r2);
            Object A0m = C147188nY.A0m(r2);
            AnonymousClass0ZU r11 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A06);
            AnonymousClass7W3 r4 = (AnonymousClass7W3) r2;
            C147188nY.A0w(r2, r4, r11);
            AnonymousClass7W3.A0a(r2, r4, A0g, A0p);
            AnonymousClass7KP.A07(r2, A0n, A0m, A002);
            int i3 = i2 & 14;
            C147188nY r9 = r2;
            AnonymousClass7I9.A02(r9, AnonymousClass7VA.A00.DB5(Modifier.A02(r2, -1090369349), 1.0f, true), AnonymousClass7J9.A00(r2), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str, 0, 0, 0, i3, 0, 2040, C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), 1.0f), 0, false);
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    i = R.drawable.barcelona_more_outline_20;
                } else if (intValue == 2) {
                    i = R.drawable.instagram_circle_check_pano_outline_24;
                } else if (intValue == 3) {
                    i = R.drawable.instagram_error_pano_outline_24;
                } else {
                    throw AnonymousClass4VZ.A00();
                }
                r8 = AnonymousClass6QP.A00(r2, i);
            }
            C1190173e.A00(r2, (Modifier) null, r8, (String) null, 56, 4, C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), 1.0f));
            AnonymousClass7W3.A0v(r4, true);
        } else {
            r2.CuJ();
        }
        return Unit.A00;
    }
}
