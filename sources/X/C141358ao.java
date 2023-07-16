package X;

import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0102000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape0S0900000_I2;

/* renamed from: X.8ao  reason: invalid class name and case insensitive filesystem */
public final class C141358ao extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AnonymousClass0ZU A02;
    public final /* synthetic */ AnonymousClass0ZU A03;
    public final /* synthetic */ AnonymousClass0ZU A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;
    public final /* synthetic */ AnonymousClass0ZU A07;
    public final /* synthetic */ AnonymousClass0YP A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141358ao(UserSession userSession, List list, AnonymousClass0ZU r4, AnonymousClass0ZU r5, AnonymousClass0ZU r6, AnonymousClass0ZU r7, AnonymousClass0ZU r8, AnonymousClass0ZU r9, AnonymousClass0YP r10) {
        super(4);
        this.A01 = list;
        this.A06 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A07 = r7;
        this.A02 = r8;
        this.A05 = r9;
        this.A08 = r10;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r13 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = obj;
        C04220Ms.A0B(obj5, 0);
        if ((A043 & 14) == 0) {
            i = A043 | C147188nY.A0F(r13, obj5);
        } else {
            i = A043;
        }
        if ((A043 & 112) == 0) {
            i |= C147188nY.A04(r13, A042);
        }
        if ((i & 731) != 146 || !r13.BCM()) {
            int i2 = i & 14;
            KtCSuperShape0S0102000_I2 ktCSuperShape0S0102000_I2 = (KtCSuperShape0S0102000_I2) this.A01.get(A042);
            r13.Cvb(718012795);
            if ((i2 & 112) == 0) {
                i2 |= C147188nY.A08(r13, ktCSuperShape0S0102000_I2);
            }
            if ((i2 & 721) != 144 || !r13.BCM()) {
                String A012 = AnonymousClass7JS.A01(r13, ktCSuperShape0S0102000_I2.A01);
                Modifier A044 = Modifier.A04(Modifier.A00);
                AnonymousClass0ZU r5 = this.A06;
                AnonymousClass0ZU r9 = this.A04;
                AnonymousClass0ZU r4 = this.A03;
                AnonymousClass0ZU r11 = this.A07;
                AnonymousClass70S.A00(r13, AnonymousClass7HZ.A03(A044, new KtLambdaShape0S0900000_I2(this.A02, r4, r5, this.A00, this.A05, ktCSuperShape0S0102000_I2, r9, this.A08, r11, 2), false), AnonymousClass6QP.A00(r13, ktCSuperShape0S0102000_I2.A00), (C142508ey) null, A012, (String) null, 32768, 44, false);
            } else {
                r13.CuJ();
            }
            AnonymousClass7W3.A0z(r13, false);
        } else {
            r13.CuJ();
        }
        return Unit.A00;
    }
}
