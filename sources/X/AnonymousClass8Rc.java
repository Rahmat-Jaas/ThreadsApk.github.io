package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0610000_I2;
import com.instagram.barcelona.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape4S0210000_I2;

/* renamed from: X.8Rc  reason: invalid class name */
public final class AnonymousClass8Rc extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C879956a A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Rc(Context context, C81784oM r3, Modifier modifier, C879956a r5, int i, boolean z) {
        super(2);
        this.A03 = modifier;
        this.A00 = i;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = context;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        C115286uo r33;
        Modifier modifier;
        Integer num;
        C147188nY r1 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r1.BCM()) {
            float f = (float) 16;
            Modifier A032 = AnonymousClass7K4.A03(AnonymousClass73S.A00(r1, this.A03), f);
            C147268p4 A012 = AnonymousClass7J3.A01(f);
            C81784oM r40 = this.A02;
            C879956a r6 = this.A04;
            Context context = this.A01;
            boolean z = this.A05;
            r1.Cvb(-483455358);
            C142878fk r25 = AnonymousClass7KV.A02;
            C146288ly A002 = AnonymousClass72M.A00(A012, r1, r25);
            AnonymousClass534 A0a = C147188nY.A0a(r1);
            Object AEA = r1.AEA(A0a);
            AnonymousClass534 r23 = AnonymousClass7DE.A07;
            Object AEA2 = r1.AEA(r23);
            AnonymousClass534 r22 = AnonymousClass7DE.A0B;
            Object AEA3 = r1.AEA(r22);
            AnonymousClass0ZU r21 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A032);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r1;
            C147188nY.A0w(r1, r2, r21);
            r2.A0T = false;
            AnonymousClass0YP r20 = AnonymousClass74X.A03;
            AnonymousClass0YP A004 = AnonymousClass7Ak.A00(r1, A002, AEA, r20);
            AnonymousClass0YP r15 = AnonymousClass74X.A02;
            AnonymousClass0YP A013 = AnonymousClass7Ak.A01(r1, AEA2, r15);
            Integer A052 = AnonymousClass7KP.A05(r1, AEA3, A013, A003);
            r1.Cvb(2058660585);
            Iterator A0q = C86154wM.A0q(((KtCSuperShape0S0610000_I2) C147188nY.A0u(r1, r40, -1470799816)).A01);
            while (A0q.hasNext()) {
                C123327Wm r5 = Modifier.A00;
                r1.AEA(AnonymousClass6YT.A00);
                Modifier A005 = C115656vh.A00(C115826vy.A01(r5, AnonymousClass7D5.A00), C120537Bh.A00(r1).A0c);
                C04220Ms.A0B(A005, 0);
                AnonymousClass54z r3 = AnonymousClass7Kq.A02;
                Modifier Cx6 = A005.Cx6(r3);
                C146288ly A006 = AnonymousClass72M.A00(C147188nY.A0V(r1), r1, r25);
                Object A0s = C147188nY.A0s(r1, A0a);
                Object AEA4 = r1.AEA(r23);
                Object AEA5 = r1.AEA(r22);
                AnonymousClass0YM A007 = C98236Es.A00(Cx6);
                C147188nY.A0w(r1, r2, r21);
                r2.A0T = false;
                AnonymousClass7Ak.A02(r1, A006, r20);
                AnonymousClass7Ak.A02(r1, A0s, A004);
                AnonymousClass7Ak.A02(r1, AEA4, r15);
                AnonymousClass7KP.A06(r1, AEA5, A052, A013, A007);
                r1.Cvb(-796954977);
                int i = 0;
                for (Object next : (Iterable) A0q.next()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C06750aI.A1A();
                        throw null;
                    }
                    C147188nY.A0v(r1, -1189696820, i);
                    AnonymousClass7W3.A0w(r2, false);
                    int ordinal = ((AnonymousClass689) next).ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            r1.Cvb(-1447372308);
                            str = AnonymousClass7JS.A01(r1, 2131822105);
                            r33 = AnonymousClass6QP.A00(r1, R.drawable.barcelona_sharevia_outline_20);
                            modifier = Modifier.A06(AnonymousClass7HZ.A03(r5, C86154wM.A14(r6, 37), false), r3);
                            num = (Integer) ((KtCSuperShape0S0610000_I2) r40.getValue()).A02;
                        } else if (ordinal == 2) {
                            r1.Cvb(-1447371841);
                            str = AnonymousClass7JS.A01(r1, 2131822101);
                            r33 = AnonymousClass6QP.A00(r1, R.drawable.barcelona_newstory_outline_20);
                            modifier = Modifier.A06(AnonymousClass7HZ.A03(r5, new KtLambdaShape4S0210000_I2(9, context, r6, z), false), r3);
                            num = (Integer) ((KtCSuperShape0S0610000_I2) r40.getValue()).A04;
                        } else if (ordinal == 3) {
                            r1.Cvb(-1447371278);
                            str = AnonymousClass7JS.A01(r1, 2131822103);
                            r33 = AnonymousClass6QP.A00(r1, R.drawable.barcelona_instagram_outline_20);
                            modifier = Modifier.A06(AnonymousClass7HZ.A03(r5, new KtLambdaShape4S0210000_I2(10, context, r6, z), false), r3);
                            num = (Integer) ((KtCSuperShape0S0610000_I2) r40.getValue()).A03;
                        } else if (ordinal != 4) {
                            r1.Cvb(-1447370338);
                        } else {
                            r1.Cvb(-1447370712);
                            String A014 = AnonymousClass7JS.A01(r1, 2131822104);
                            C147188nY r27 = r1;
                            C117926zT.A00(r27, Modifier.A06(AnonymousClass7HZ.A03(r5, C86154wM.A14(r6, 38), false), r3), AnonymousClass6QP.A00(r1, R.drawable.barcelona_twitter_outline_20), (Integer) null, A014, 64, 8);
                        }
                        C117926zT.A00(r1, modifier, r33, num, str, 64, 0);
                    } else {
                        r1.Cvb(-1447372765);
                        String A015 = AnonymousClass7JS.A01(r1, 2131822102);
                        C147188nY r31 = r1;
                        C117926zT.A00(r31, Modifier.A06(AnonymousClass7HZ.A03(r5, C86154wM.A14(r6, 36), false), r3), AnonymousClass6QP.A00(r1, R.drawable.barcelona_link_outline_20), (Integer) ((KtCSuperShape0S0610000_I2) r40.getValue()).A00, A015, 64, 0);
                    }
                    AnonymousClass7W3.A0w(r2, false);
                    i = i2;
                }
                AnonymousClass7W3.A0v(r2, true);
            }
            AnonymousClass7W3.A0f(r2);
        } else {
            r1.CuJ();
        }
        return Unit.A00;
    }
}
