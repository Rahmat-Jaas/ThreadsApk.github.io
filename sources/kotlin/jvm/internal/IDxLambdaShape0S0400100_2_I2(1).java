package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass5D4;
import X.AnonymousClass67W;
import X.AnonymousClass7Hr;
import X.AnonymousClass7KC;
import X.AnonymousClass7Kr;
import X.AnonymousClass7X1;
import X.AnonymousClass7X9;
import X.C02220Ah;
import X.C04220Ms;
import X.C104136bI;
import X.C110686m6;
import X.C120857Cv;
import X.C121167El;
import X.C142908fn;
import X.C146278lx;
import X.C146708mj;
import X.C147018nF;
import X.C147848q1;
import X.C18180wK;
import X.C18240wQ;
import X.C40307LcE;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86144wL;
import X.C86164wN;
import X.C877253w;
import X.C89355Dh;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.react.uimanager.BaseViewManager;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

public class IDxLambdaShape0S0400100_2_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape0S0400100_2_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, long j) {
        super(1);
        this.A05 = i;
        this.A04 = obj2;
        this.A00 = j;
        this.A02 = obj;
        this.A01 = obj3;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A05 != 0) {
            C147848q1 r4 = (C147848q1) obj2;
            C04220Ms.A0B(r4, 0);
            float CxL = r4.CxL(C120857Cv.A00);
            float f = CxL / 277.68f;
            float A012 = AnonymousClass7KC.A01(r4.AX0()) - ((243.63f * f) / 2.0f);
            float A022 = AnonymousClass7KC.A02(r4.AX0()) - (CxL / 2.0f);
            C110686m6 r6 = (C110686m6) this.A04;
            long j = this.A00;
            Object obj3 = this.A01;
            C146708mj Ae6 = r4.Ae6();
            AnonymousClass7X9 r1 = (AnonymousClass7X9) Ae6;
            C121167El r15 = r1.A01.A02;
            long A002 = C121167El.A00(r15);
            C146278lx r11 = r1.A00;
            r11.D7f(A012, A022);
            r11.Cg3(f, f, AnonymousClass7KC.A03);
            C147018nF r112 = r6.A03;
            C877253w r24 = new C877253w(24.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 0, 30);
            float A003 = C18240wQ.A00(((AnonymousClass0ZU) this.A02).invoke());
            float f2 = (float) 1;
            C147848q1 r16 = r4;
            r16.AJ7((C104136bI) null, r112, r24, C86144wL.A00(f2 - A003, 0.3f, A003, 1.0f), 3, j);
            C147018nF r8 = r6.A04;
            ((AnonymousClass7X1) r8).A01.reset();
            float f3 = r6.A00;
            float f4 = r6.A02;
            float f5 = r6.A01;
            float A004 = C18240wQ.A00(((AnonymousClass0ZU) this.A03).invoke());
            float A005 = C86144wL.A00(f2 - A004, f3 + f4, A004, -(f4 + f5));
            C142908fn r5 = r6.A05;
            float f6 = A005;
            if (obj3 == AnonymousClass67W.Start) {
                f6 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            if (obj3 != AnonymousClass67W.End) {
                f3 = f5 + A005;
            }
            r5.B9f(r8, f6, f3, true);
            r4.AJ7((C104136bI) null, r8, new C877253w(24.5f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 0, 30), 1.0f, 3, j);
            C146708mj.A00(r15, Ae6, A002);
            return Unit.A00;
        }
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj2;
        AnonymousClass5D4 r62 = new AnonymousClass5D4();
        LoggingContext loggingContext = (LoggingContext) this.A04;
        C86104wH.A1K(r62, loggingContext);
        C89355Dh r2 = new C89355Dh();
        C86164wN.A1D(r2, this.A00);
        C86164wN.A1B(AnonymousClass7Kr.A03((C40307LcE) this.A02), r2);
        r62.A0B("credential_container", C18180wK.A0n(r2));
        Iterable iterable = (Iterable) this.A01;
        ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0w.add(AnonymousClass0wJ.A0d(C18180wK.A0k(it)));
        }
        r62.A0B("container_ids", A0w);
        AnonymousClass7Hr.A03(r62, loggingContext);
        C86124wJ.A1K(r62, "checkout");
        C86114wI.A1C(uSLEBaseShape0S0000000, r62);
        uSLEBaseShape0S0000000.A1g((Map) this.A03);
        return uSLEBaseShape0S0000000;
    }
}
