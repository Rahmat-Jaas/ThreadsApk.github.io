package com.instagram.debug.devoptions.igds.compose;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass534;
import X.AnonymousClass541;
import X.AnonymousClass70T;
import X.AnonymousClass74X;
import X.AnonymousClass79L;
import X.AnonymousClass7Ad;
import X.AnonymousClass7Ak;
import X.AnonymousClass7DE;
import X.AnonymousClass7I9;
import X.AnonymousClass7JR;
import X.AnonymousClass7K4;
import X.AnonymousClass7KE;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C06750aI;
import X.C06810aP;
import X.C101246Ql;
import X.C114236su;
import X.C120577Bm;
import X.C120767Cj;
import X.C121117Ee;
import X.C121807If;
import X.C122847Ub;
import X.C123327Wm;
import X.C134817yQ;
import X.C142918fo;
import X.C146288ly;
import X.C147188nY;
import X.C18220wO;
import X.C98236Es;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

public final class IgdsFacepileAvatarsComposeFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ IgdsFacepileAvatarsComposeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsFacepileAvatarsComposeFragment$onCreateView$1(IgdsFacepileAvatarsComposeFragment igdsFacepileAvatarsComposeFragment) {
        super(2);
        this.this$0 = igdsFacepileAvatarsComposeFragment;
    }

    public final void invoke(C147188nY r16, int i) {
        C147188nY r5 = r16;
        if ((i & 11) != 2 || !r5.BCM()) {
            User A01 = C06810aP.A01.A01(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
            r5.Cvb(1857841259);
            List A17 = C06750aI.A17(A01, A01, A01);
            final ArrayList A0w = AnonymousClass0wJ.A0w(A17);
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                A0w.add(C120577Bm.A01(r5, C18220wO.A0c(it).B4M()));
            }
            AnonymousClass7W3.A0z(r5, false);
            final C122847Ub A00 = AnonymousClass7Ad.A00(r5);
            AnonymousClass70T.A01((AnonymousClass79L) null, r5, (Modifier) null, (C142918fo) null, AnonymousClass7JR.A00(r5, new AnonymousClass0YP() {
                public final void invoke(C147188nY r49, int i) {
                    C147188nY r0 = r49;
                    if ((i & 11) != 2 || !r0.BCM()) {
                        C123327Wm r3 = Modifier.A00;
                        Modifier A02 = AnonymousClass7Ad.A02(C122847Ub.this, Modifier.A04(r3), 14, false);
                        List list = A0w;
                        C146288ly A05 = AnonymousClass7KV.A05(r0);
                        AnonymousClass534 A0a = C147188nY.A0a(r0);
                        Object AEA = r0.AEA(A0a);
                        AnonymousClass534 r13 = AnonymousClass7DE.A07;
                        Object AEA2 = r0.AEA(r13);
                        AnonymousClass534 r12 = AnonymousClass7DE.A0B;
                        Object AEA3 = r0.AEA(r12);
                        AnonymousClass0ZU r11 = AnonymousClass74X.A00;
                        AnonymousClass0YM A00 = C98236Es.A00(A02);
                        AnonymousClass7W3 r1 = (AnonymousClass7W3) r0;
                        C147188nY.A0w(r0, r1, r11);
                        r1.A0T = false;
                        AnonymousClass0YP r10 = AnonymousClass74X.A03;
                        AnonymousClass0YP A002 = AnonymousClass7Ak.A00(r0, A05, AEA, r10);
                        AnonymousClass0YP r6 = AnonymousClass74X.A02;
                        AnonymousClass0YP A01 = AnonymousClass7Ak.A01(r0, AEA2, r6);
                        Integer A052 = AnonymousClass7KP.A05(r0, AEA3, A01, A00);
                        r0.Cvb(2058660585);
                        r0.Cvb(1582889609);
                        float f = (float) 16;
                        C147188nY r23 = r0;
                        AnonymousClass7I9.A02(r23, AnonymousClass7K4.A03(r3, f), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "FacePile with default sizes", 0, 0, 0, 54, 0, 4092, 0, 0, false);
                        float f2 = (float) 0;
                        float f3 = f2;
                        Modifier A04 = AnonymousClass7K4.A04(r3, f, f2);
                        r0.Cvb(733328855);
                        Alignment alignment = AnonymousClass7KV.A0E;
                        C146288ly A003 = C120767Cj.A00(r0, alignment, false);
                        Object A0s = C147188nY.A0s(r0, A0a);
                        Object AEA4 = r0.AEA(r13);
                        Object AEA5 = r0.AEA(r12);
                        AnonymousClass0YM A004 = C98236Es.A00(A04);
                        C147188nY.A0w(r0, r1, r11);
                        r1.A0T = false;
                        AnonymousClass7Ak.A02(r0, A003, r10);
                        AnonymousClass7Ak.A02(r0, A0s, A002);
                        AnonymousClass7Ak.A02(r0, AEA4, r6);
                        AnonymousClass7KP.A06(r0, AEA5, A052, A01, A004);
                        r0.Cvb(-356774641);
                        C101246Ql.A00(r0, list, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 8, 14);
                        AnonymousClass7W3.A0v(r1, true);
                        AnonymousClass7I9.A02(r23, AnonymousClass7K4.A03(r3, f), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "96dp FacePile with 8dp gap and 50% overlap", 0, 0, 0, 54, 0, 4092, 0, 0, false);
                        Modifier A042 = AnonymousClass7K4.A04(r3, f, f3);
                        C146288ly A0i = C147188nY.A0i(r0, alignment);
                        Object A0s2 = C147188nY.A0s(r0, A0a);
                        Object AEA6 = r0.AEA(r13);
                        Object AEA7 = r0.AEA(r12);
                        AnonymousClass0YM A005 = C98236Es.A00(A042);
                        C147188nY.A0w(r0, r1, r11);
                        r1.A0T = false;
                        AnonymousClass7Ak.A02(r0, A0i, r10);
                        AnonymousClass7Ak.A02(r0, A0s2, A002);
                        AnonymousClass7Ak.A02(r0, AEA6, r6);
                        AnonymousClass7KP.A06(r0, AEA7, A052, A01, A005);
                        r0.Cvb(882754566);
                        float f4 = (float) 96;
                        C101246Ql.A00(r0, list, f4, 0.5f, (float) 8, 3512, 0);
                        AnonymousClass7W3.A0v(r1, true);
                        AnonymousClass7I9.A02(r23, AnonymousClass7K4.A03(r3, f), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "96dp FacePile with 4dp gap and 40% overlap", 0, 0, 0, 54, 0, 4092, 0, 0, false);
                        Modifier A043 = AnonymousClass7K4.A04(r3, f, f3);
                        C146288ly A0i2 = C147188nY.A0i(r0, alignment);
                        Object A0s3 = C147188nY.A0s(r0, A0a);
                        Object AEA8 = r0.AEA(r13);
                        Object AEA9 = r0.AEA(r12);
                        AnonymousClass0YM A006 = C98236Es.A00(A043);
                        C147188nY.A0w(r0, r1, r11);
                        r1.A0T = false;
                        AnonymousClass7Ak.A02(r0, A0i2, r10);
                        AnonymousClass7Ak.A02(r0, A0s3, A002);
                        AnonymousClass7Ak.A02(r0, AEA8, r6);
                        AnonymousClass7KP.A06(r0, AEA9, A052, A01, A006);
                        r0.Cvb(424119047);
                        float f5 = (float) 4;
                        C101246Ql.A00(r0, list, f4, 0.4f, f5, 3512, 0);
                        AnonymousClass7W3.A0v(r1, true);
                        AnonymousClass7I9.A02(r23, AnonymousClass7K4.A03(r3, f), (C121807If) null, (C114236su) null, (C134817yQ) null, (C121117Ee) null, "96dp white FacePile with 4dp gap and 40% overlap", 0, 0, 0, 54, 0, 4092, 0, 0, false);
                        Modifier A044 = AnonymousClass7K4.A04(r3, f, f3);
                        C146288ly A0i3 = C147188nY.A0i(r0, alignment);
                        Object A0s4 = C147188nY.A0s(r0, A0a);
                        Object AEA10 = r0.AEA(r13);
                        Object AEA11 = r0.AEA(r12);
                        AnonymousClass0YM A007 = C98236Es.A00(A044);
                        C147188nY.A0w(r0, r1, r11);
                        r1.A0T = false;
                        AnonymousClass7Ak.A02(r0, A0i3, r10);
                        AnonymousClass7Ak.A02(r0, A0s4, A002);
                        AnonymousClass7Ak.A02(r0, AEA10, r6);
                        AnonymousClass7KP.A06(r0, AEA11, A052, A01, A007);
                        r0.Cvb(-34516472);
                        long j = AnonymousClass7KE.A07;
                        C101246Ql.A00(r0, C06750aI.A17(new AnonymousClass541(j), new AnonymousClass541(j), new AnonymousClass541(j)), f4, 0.4f, f5, 3512, 0);
                        AnonymousClass7W3.A0v(r1, true);
                        AnonymousClass7W3.A0v(r1, true);
                        return;
                    }
                    r0.CuJ();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
                    return Unit.A00;
                }
            }, -446582637), 196608, 31, 0, 0);
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
