package X;

import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.Unit;

/* renamed from: X.8R3  reason: invalid class name */
public final class AnonymousClass8R3 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ AnonymousClass0ZU A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8R3(AnonymousClass0ZU r2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A03 = z;
        this.A02 = z2;
        this.A00 = r2;
        this.A01 = z3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        C147188nY r12 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) == 2 && r12.BCM()) {
            r12.CuJ();
        } else if (this.A03) {
            C123327Wm r4 = Modifier.A00;
            Modifier A002 = C117646z1.A00(AnonymousClass7Kq.A04(r4), AnonymousClass799.A00(0), (String) null, this.A00, 5, this.A02);
            boolean z = this.A01;
            C146288ly A07 = AnonymousClass7KV.A07(r12, false);
            Object A0p = C147188nY.A0p(r12);
            AnonymousClass534 r7 = AnonymousClass7DE.A07;
            Object AEA = r12.AEA(r7);
            Object A0m = C147188nY.A0m(r12);
            AnonymousClass0ZU r1 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A002);
            AnonymousClass7W3 r5 = (AnonymousClass7W3) r12;
            C147188nY.A0w(r12, r5, r1);
            AnonymousClass7W3.A0a(r12, r5, A07, A0p);
            AnonymousClass7KP.A07(r12, AEA, A0m, A003);
            AnonymousClass7V3 r6 = AnonymousClass7V3.A00;
            r12.Cvb(-502426242);
            r12.Cvb(603432155);
            if (z) {
                i = R.drawable.barcelona_outline_check_24;
            } else {
                boolean A1Z = C18180wK.A1Z(C147188nY.A0t(r12, r7, 603432253), AnonymousClass69J.Rtl);
                AnonymousClass7W3.A0w(r5, false);
                i = R.drawable.barcelona_outline_arrow_forward_24;
                if (A1Z) {
                    i = R.drawable.barcelona_outline_arrow_back_24;
                }
            }
            AnonymousClass7W3.A0w(r5, false);
            C86114wI.A17(r12, AnonymousClass7Kq.A0F(AnonymousClass7KV.A01(r6, r4), 24), AnonymousClass6QP.A00(r12, i), AnonymousClass7JS.A01(r12, 2131831737));
            AnonymousClass7W3.A0f(r5);
        }
        return Unit.A00;
    }
}
