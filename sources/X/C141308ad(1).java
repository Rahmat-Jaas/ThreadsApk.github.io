package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4120000_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape4S0400000_I2;

/* renamed from: X.8ad  reason: invalid class name and case insensitive filesystem */
public final class C141308ad extends C02220Ah implements AnonymousClass0YC {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ AnonymousClass0YY A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141308ad(Context context, UserSession userSession, List list, AnonymousClass0YY r5) {
        super(4);
        this.A02 = list;
        this.A03 = r5;
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A04 = AnonymousClass0wJ.A04(obj2);
        C147188nY r8 = (C147188nY) obj3;
        int A042 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = obj;
        C04220Ms.A0B(obj5, 0);
        if ((A042 & 14) == 0) {
            i = A042 | C147188nY.A0F(r8, obj5);
        } else {
            i = A042;
        }
        if ((A042 & 112) == 0) {
            i |= C147188nY.A04(r8, A04);
        }
        if ((i & 731) != 146 || !r8.BCM()) {
            int i2 = i & 14;
            KtCSuperShape0S4120000_I2 ktCSuperShape0S4120000_I2 = (KtCSuperShape0S4120000_I2) this.A02.get(A04);
            r8.Cvb(-961769795);
            if ((i2 & 112) == 0) {
                i2 |= C147188nY.A08(r8, ktCSuperShape0S4120000_I2);
            }
            if ((i2 & 721) != 144 || !r8.BCM()) {
                ImageUrl imageUrl = (ImageUrl) ktCSuperShape0S4120000_I2.A00;
                String str = ktCSuperShape0S4120000_I2.A04;
                Modifier A043 = Modifier.A04(Modifier.A00);
                float f = 0.4f;
                if (ktCSuperShape0S4120000_I2.A05) {
                    f = 1.0f;
                }
                Modifier A002 = AnonymousClass6EV.A00(A043, f);
                String str2 = ktCSuperShape0S4120000_I2.A01;
                boolean z = ktCSuperShape0S4120000_I2.A06;
                AnonymousClass5I4 r7 = AnonymousClass5I4.A04;
                float f2 = (float) 12;
                float f3 = (float) 0;
                AnonymousClass6MG.A00(r8, A002, new AnonymousClass5I4(new AnonymousClass7V9(f2, f3, f2, f3), r7.A01, r7.A00), imageUrl, str, str2, new KtLambdaShape4S0400000_I2(10, this.A00, this.A03, ktCSuperShape0S4120000_I2, this.A01), (AnonymousClass0YY) null, (AnonymousClass0YM) null, 0, 0, 3296, z, false, false, false);
            } else {
                r8.CuJ();
            }
            AnonymousClass7W3.A0z(r8, false);
        } else {
            r8.CuJ();
        }
        return Unit.A00;
    }
}
