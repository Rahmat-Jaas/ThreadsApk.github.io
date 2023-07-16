package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.Unit;

/* renamed from: X.8Sy  reason: invalid class name and case insensitive filesystem */
public final class C140218Sy extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C147258p3 A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C115286uo A05;
    public final /* synthetic */ C142318ef A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140218Sy(C147258p3 r2, Modifier modifier, C115286uo r4, C142318ef r5, String str, float f, int i, long j, boolean z, boolean z2) {
        super(2);
        this.A04 = modifier;
        this.A06 = r5;
        this.A03 = r2;
        this.A08 = z;
        this.A05 = r4;
        this.A02 = j;
        this.A00 = f;
        this.A07 = str;
        this.A09 = z2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C121807If r3;
        C147188nY r0 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r0.BCM()) {
            Modifier modifier = this.A04;
            C142318ef r1 = this.A06;
            C147258p3 r7 = this.A03;
            C142668fO r8 = (C142668fO) r0.AEA(AnonymousClass6WN.A00);
            boolean z = this.A08;
            if (r1 instanceof C130167op) {
                C130167op r2 = (C130167op) r1;
                C147258p3 r9 = r7;
                Modifier modifier2 = modifier;
                modifier = AnonymousClass6E2.A00(r8, r9, modifier2, AnonymousClass799.A00(2), r2.A00, r2.A01, z);
            } else if (r1 instanceof C130157oo) {
                C130157oo r22 = (C130157oo) r1;
                boolean z2 = r22.A01;
                AnonymousClass0ZU r23 = r22.A00;
                if (r23 == null) {
                    r23 = C74504aY.A00;
                }
                modifier = AnonymousClass6E1.A00(r8, r7, modifier, AnonymousClass799.A00(3), r23, z2, z);
            } else if (r1 != null) {
                throw AnonymousClass4VZ.A00();
            }
            float f = (float) 0;
            Modifier A042 = AnonymousClass7K4.A04(AnonymousClass7Kq.A07(modifier, C103126Xx.A00), AnonymousClass6FH.A00(r0, R.dimen.abc_floating_window_z), f);
            C141758cu r92 = AnonymousClass7KV.A04;
            C115286uo r72 = this.A05;
            long j = this.A02;
            float f2 = this.A00;
            String str = this.A07;
            boolean z3 = this.A09;
            int i = this.A01;
            C146288ly A0g = C147188nY.A0g(r0, r92);
            Object A0p = C147188nY.A0p(r0);
            Object A0n = C147188nY.A0n(r0);
            Object A0m = C147188nY.A0m(r0);
            AnonymousClass0ZU r11 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A042);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r5, r11);
            AnonymousClass7W3.A0a(r0, r5, A0g, A0p);
            AnonymousClass7KP.A07(r0, A0n, A0m, A002);
            AnonymousClass7VA r112 = AnonymousClass7VA.A00;
            r0.Cvb(-711417793);
            r0.Cvb(1504557220);
            if (r72 != null) {
                C115286uo r19 = r72;
                C147188nY r17 = r0;
                C1190173e.A00(r17, AnonymousClass7K4.A05(Modifier.A00, f, AnonymousClass6FH.A00(r0, R.dimen.account_section_text_margin_horizontal), AnonymousClass6FH.A00(r0, R.dimen.account_section_text_margin_horizontal), AnonymousClass6FH.A00(r0, R.dimen.account_section_text_margin_horizontal)), r19, (String) null, 56, 0, C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), f2));
            }
            AnonymousClass7W3.A0w(r5, false);
            C123327Wm r93 = Modifier.A00;
            Modifier DB5 = r112.DB5(AnonymousClass7K4.A04(r93, f, AnonymousClass6FH.A00(r0, R.dimen.account_section_text_margin_horizontal)), 1.0f, true);
            long A043 = C121657He.A04(C86154wM.A0G(j), AnonymousClass7KE.A03(j), AnonymousClass7KE.A02(j), AnonymousClass7KE.A01(j), f2);
            AnonymousClass7J9 A022 = C120537Bh.A02(r0);
            if (z3) {
                r3 = A022.A07;
            } else {
                r3 = A022.A06;
            }
            C147188nY r113 = r0;
            AnonymousClass7I9.A02(r113, DB5, r3, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str, 0, 0, 0, i & 14, 0, 2040, A043, 0, false);
            if (r1 != null) {
                C117676z4.A01(r0, AnonymousClass7K4.A05(r93, (float) 8, f, f, f), r1, ((i >> 18) & 14) | 48 | ((i >> 6) & 896), z);
            }
            AnonymousClass7W3.A0v(r5, true);
        } else {
            r0.CuJ();
        }
        return Unit.A00;
    }
}
