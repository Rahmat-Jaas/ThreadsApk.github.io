package X;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedElement;
import androidx.compose.ui.focus.FocusRequesterElement;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.bds.components.header.EnterAlwaysState;
import com.instagram.barcelona.search.SearchScreenViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape10S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape153S0100000_I2_8;
import kotlin.jvm.internal.KtLambdaShape2S0100001_I2;
import kotlin.jvm.internal.KtLambdaShape36S0100000_I2_16;
import kotlin.jvm.internal.KtLambdaShape5S0500000_I2;

/* renamed from: X.8Tf  reason: invalid class name */
public final class AnonymousClass8Tf extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ LazyListState A03;
    public final /* synthetic */ C81784oM A04;
    public final /* synthetic */ C81784oM A05;
    public final /* synthetic */ C142888fl A06;
    public final /* synthetic */ AnonymousClass77X A07;
    public final /* synthetic */ EnterAlwaysState A08;
    public final /* synthetic */ C111216my A09;
    public final /* synthetic */ SearchScreenViewModel A0A;
    public final /* synthetic */ C83224qz A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Tf(Context context, LazyListState lazyListState, C81784oM r4, C81784oM r5, C142888fl r6, AnonymousClass77X r7, EnterAlwaysState enterAlwaysState, C111216my r9, SearchScreenViewModel searchScreenViewModel, C83224qz r11, float f, float f2) {
        super(2);
        this.A09 = r9;
        this.A08 = enterAlwaysState;
        this.A03 = lazyListState;
        this.A05 = r4;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = r7;
        this.A0B = r11;
        this.A0A = searchScreenViewModel;
        this.A06 = r6;
        this.A02 = context;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r0 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r0.BCM()) {
            C81784oM r5 = this.A05;
            Integer num = ((AnonymousClass5IV) r5.getValue()).A02;
            Integer num2 = AnonymousClass006.A00;
            C123327Wm r3 = Modifier.A00;
            AnonymousClass54z r28 = AnonymousClass7Kq.A01;
            Modifier Cx6 = r3.Cx6(r28);
            if (num == num2) {
                Cx6 = C98186En.A00(AnonymousClass6MH.A00(Cx6, this.A09), this.A08.A04, (NestedScrollDispatcher) null);
            }
            float f = this.A00;
            float f2 = this.A01;
            EnterAlwaysState enterAlwaysState = this.A08;
            AnonymousClass77X r33 = this.A07;
            LazyListState lazyListState = this.A03;
            C83224qz r31 = this.A0B;
            SearchScreenViewModel searchScreenViewModel = this.A0A;
            C142888fl r30 = this.A06;
            C111216my r56 = this.A09;
            Context context = this.A02;
            C81784oM r54 = this.A04;
            Alignment A002 = AnonymousClass7KV.A00(r0);
            C146288ly A003 = C120767Cj.A00(r0, A002, false);
            AnonymousClass534 A0a = C147188nY.A0a(r0);
            Object AEA = r0.AEA(A0a);
            AnonymousClass534 r25 = AnonymousClass7DE.A07;
            Object AEA2 = r0.AEA(r25);
            AnonymousClass534 r24 = AnonymousClass7DE.A0B;
            Object AEA3 = r0.AEA(r24);
            AnonymousClass0ZU r23 = AnonymousClass74X.A00;
            AnonymousClass0YM A004 = C98236Es.A00(Cx6);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r0;
            C147188nY.A0w(r0, r2, r23);
            r2.A0T = false;
            AnonymousClass0YP r22 = AnonymousClass74X.A03;
            AnonymousClass0YP A005 = AnonymousClass7Ak.A00(r0, A003, AEA, r22);
            AnonymousClass0YP r20 = AnonymousClass74X.A02;
            AnonymousClass0YP A012 = AnonymousClass7Ak.A01(r0, AEA2, r20);
            Integer A052 = AnonymousClass7KP.A05(r0, AEA3, A012, A004);
            r0.Cvb(2058660585);
            AnonymousClass7V3 r18 = AnonymousClass7V3.A00;
            r0.Cvb(1633913531);
            Modifier A082 = AnonymousClass7Kq.A08(r3, f);
            C04220Ms.A0B(A082, 0);
            AnonymousClass54z r6 = AnonymousClass7Kq.A02;
            AnonymousClass7CW.A01(r0, C115876w3.A01(A082.Cx6(r6), new KtLambdaShape2S0100001_I2(enterAlwaysState, 4.0f, 4)), AnonymousClass7JR.A01(r0, enterAlwaysState, 20, 1709622118), 48, 0);
            float f3 = (float) 0;
            Modifier A013 = C115876w3.A01(Modifier.A06(AnonymousClass7K4.A05(r3, f3, f2, f3, f3), r28), new KtLambdaShape153S0100000_I2_8(enterAlwaysState, 7));
            C146288ly A053 = AnonymousClass7KV.A05(r0);
            Object A0t = C147188nY.A0t(r0, A0a, -1323940314);
            Object AEA4 = r0.AEA(r25);
            Object AEA5 = r0.AEA(r24);
            AnonymousClass0YM A006 = C98236Es.A00(A013);
            C147188nY.A0w(r0, r2, r23);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A053, r22);
            AnonymousClass7Ak.A02(r0, A0t, A005);
            AnonymousClass7Ak.A02(r0, AEA4, r20);
            AnonymousClass7KP.A06(r0, AEA5, A052, A012, A006);
            String str = ((AnonymousClass5IV) C147188nY.A0u(r0, r5, -1727657679)).A05;
            AnonymousClass698 r32 = AnonymousClass698.Up;
            KtLambdaShape5S0500000_I2 ktLambdaShape5S0500000_I2 = new KtLambdaShape5S0500000_I2(3, enterAlwaysState, searchScreenViewModel, lazyListState, r31, r30);
            KtLambdaShape153S0100000_I2_8 ktLambdaShape153S0100000_I2_8 = new KtLambdaShape153S0100000_I2_8(searchScreenViewModel, 8);
            String A014 = AnonymousClass7JS.A01(r0, 2131822195);
            Modifier A054 = AnonymousClass7K4.A05(r3.Cx6(r6), f3, f3, f3, (float) 10);
            KtLambdaShape10S0300000_I2 A0y = C86154wM.A0y(enterAlwaysState, searchScreenViewModel, r31, 44);
            AnonymousClass0wJ.A1N(A054, A0y);
            Modifier Cx62 = A054.Cx6(new FocusChangedElement(A0y));
            AnonymousClass77X r62 = r33;
            AnonymousClass0wJ.A1N(Cx62, r62);
            Modifier Cx63 = Cx62.Cx6(new FocusRequesterElement(r62));
            Integer num3 = ((AnonymousClass5IV) r5.getValue()).A02;
            Integer num4 = AnonymousClass006.A01;
            C147188nY r302 = r0;
            C117636z0.A00((C147258p3) null, r302, Cx63, r32, str, A014, ktLambdaShape5S0500000_I2, ktLambdaShape153S0100000_I2_8, 48, 128, C18180wK.A1Z(num3, num4));
            if (AnonymousClass8bQ.A0m(((AnonymousClass5IV) C147188nY.A0u(r0, r5, -1761062674)).A05) && ((AnonymousClass5IV) r5.getValue()).A07.isEmpty() && ((AnonymousClass5IV) r5.getValue()).A08 && ((AnonymousClass5IV) r5.getValue()).A01 == num4) {
                String A022 = AnonymousClass7JS.A02(r0, ((AnonymousClass5IV) r5.getValue()).A05, 2131822194);
                float f4 = (float) 16;
                AnonymousClass7I9.A02(r302, AnonymousClass7K4.A04(r3, f4, f4), AnonymousClass7J9.A04(r0), (C114236su) null, (C134817yQ) null, (C121117Ee) null, A022, 0, 0, 0, 48, 0, 2040, AnonymousClass7KB.A03(r0), 0, false);
                AnonymousClass70V.A01(r0, AnonymousClass7K4.A05(r3, f4, (float) 8, f3, f3), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 6, 0);
            }
            AnonymousClass7W3.A0w(r2, false);
            Modifier A007 = AnonymousClass6EU.A00(r3.Cx6(r28), -1.0f);
            C146288ly A0h = C147188nY.A0h(r0, A002);
            Object A0s = C147188nY.A0s(r0, A0a);
            Object AEA6 = r0.AEA(r25);
            Object AEA7 = r0.AEA(r24);
            AnonymousClass0YM A008 = C98236Es.A00(A007);
            C147188nY.A0w(r0, r2, r23);
            r2.A0T = false;
            AnonymousClass7Ak.A02(r0, A0h, r22);
            AnonymousClass7Ak.A02(r0, A0s, A005);
            AnonymousClass7Ak.A02(r0, AEA6, r20);
            AnonymousClass7KP.A06(r0, AEA7, A052, A012, A008);
            if (((AnonymousClass5IV) C147188nY.A0u(r0, r5, 193682487)).A08) {
                r0.Cvb(2137730688);
                C115696vl.A01((C142708fS) null, (C145058jl) null, (C145068jm) null, lazyListState, r0, (C142878fk) null, (Modifier) null, C86154wM.A0y(context, searchScreenViewModel, r5, 45), 12582912, 125, false, true);
            } else if (((AnonymousClass5IV) r5.getValue()).A00 != null) {
                C100476Nl.A00(r0, searchScreenViewModel, ((AnonymousClass5IV) C147188nY.A0u(r0, r5, 2137734220)).A00, 72);
            } else {
                r0.Cvb(2137734307);
            }
            AnonymousClass7W3.A0w(r2, false);
            AnonymousClass7V3 r1 = r18;
            C147188nY r182 = r0;
            AnonymousClass7DB.A00(r182, r1.A86(AnonymousClass7KV.A0C, r3), r56, 64, 56, 0, 0, C86104wH.A1X(r54), false);
            AnonymousClass7W3.A0v(r2, true);
            AnonymousClass7W3.A0v(r2, true);
            AnonymousClass7W3.A0v(r2, true);
            AnonymousClass70X.A00(lazyListState, r0, new KtLambdaShape36S0100000_I2_16(searchScreenViewModel, 36), 0, 0, 1);
        } else {
            r0.CuJ();
        }
        return Unit.A00;
    }
}
