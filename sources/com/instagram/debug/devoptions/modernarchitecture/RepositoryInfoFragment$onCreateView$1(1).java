package com.instagram.debug.devoptions.modernarchitecture;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6ED;
import X.AnonymousClass70T;
import X.AnonymousClass72M;
import X.AnonymousClass74X;
import X.AnonymousClass79L;
import X.AnonymousClass7Aj;
import X.AnonymousClass7J3;
import X.AnonymousClass7JR;
import X.AnonymousClass7K4;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C120537Bh;
import X.C123327Wm;
import X.C142918fo;
import X.C146288ly;
import X.C147188nY;
import X.C81784oM;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.Unit;

public final class RepositoryInfoFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$onCreateView$1(RepositoryInfoFragment repositoryInfoFragment) {
        super(2);
        this.this$0 = repositoryInfoFragment;
    }

    public final void invoke(C147188nY r16, int i) {
        C147188nY r5 = r16;
        if ((i & 11) != 2 || !r5.BCM()) {
            final C81784oM A01 = AnonymousClass7Aj.A01(r5, this.this$0.getViewModel().repositories);
            final RepositoryInfoFragment repositoryInfoFragment = this.this$0;
            AnonymousClass70T.A01((AnonymousClass79L) null, r5, (Modifier) null, (C142918fo) null, AnonymousClass7JR.A00(r5, new AnonymousClass0YP() {
                public final void invoke(C147188nY r21, int i) {
                    C147188nY r12 = r21;
                    if ((i & 11) != 2 || !r12.BCM()) {
                        RepositoryInfoFragment repositoryInfoFragment = RepositoryInfoFragment.this;
                        C81784oM r6 = A01;
                        C123327Wm A00 = Modifier.A00(r12);
                        C146288ly A002 = AnonymousClass72M.A00(AnonymousClass7J3.A07, r12, AnonymousClass7KV.A02);
                        Object A0p = C147188nY.A0p(r12);
                        Object A0n = C147188nY.A0n(r12);
                        Object A0m = C147188nY.A0m(r12);
                        AnonymousClass0ZU r1 = AnonymousClass74X.A00;
                        AnonymousClass0YM A003 = C98236Es.A00(A00);
                        AnonymousClass7W3 r3 = (AnonymousClass7W3) r12;
                        C147188nY.A0w(r12, r3, r1);
                        AnonymousClass7W3.A0a(r12, r3, A002, A0p);
                        AnonymousClass7KP.A07(r12, A0n, A0m, A003);
                        r12.Cvb(1923358528);
                        float f = (float) 12;
                        float f2 = (float) 0;
                        repositoryInfoFragment.Header(AnonymousClass7K4.A05(Modifier.A04(A00), f2, f, f2, f), r12, 70, 0);
                        AnonymousClass6ED.A00(r12, (Modifier) null, (float) 1, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 384, 9, C120537Bh.A00(r12).A0p);
                        repositoryInfoFragment.RepositoryList((List) r6.getValue(), (Modifier) null, r12, 520, 2);
                        AnonymousClass7W3.A0v(r3, true);
                        return;
                    }
                    r12.CuJ();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
                    return Unit.A00;
                }
            }, 982328266), 196608, 31, 0, 0);
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
