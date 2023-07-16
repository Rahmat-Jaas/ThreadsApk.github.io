package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass70T;
import X.AnonymousClass79L;
import X.AnonymousClass7Aj;
import X.AnonymousClass7JR;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C142918fo;
import X.C147188nY;
import X.C81784oM;
import androidx.compose.ui.Modifier;
import com.instagram.debug.devoptions.cam.CamDevOptionsViewModel;
import kotlin.Unit;

public final class CamDevOptionsFragment$onCreateView$1 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ CamDevOptionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsFragment$onCreateView$1(CamDevOptionsFragment camDevOptionsFragment) {
        super(2);
        this.this$0 = camDevOptionsFragment;
    }

    public final void invoke(C147188nY r16, int i) {
        C147188nY r5 = r16;
        if ((i & 11) != 2 || !r5.BCM()) {
            final C81784oM A01 = AnonymousClass7Aj.A01(r5, this.this$0.getCamDevOptionsViewModel().uiState);
            final CamDevOptionsFragment camDevOptionsFragment = this.this$0;
            AnonymousClass70T.A01((AnonymousClass79L) null, r5, (Modifier) null, (C142918fo) null, AnonymousClass7JR.A00(r5, new AnonymousClass0YP() {
                public final void invoke(C147188nY r4, int i) {
                    if ((i & 11) != 2 || !r4.BCM()) {
                        Object value = C81784oM.this.getValue();
                        if (value instanceof CamDevOptionsViewModel.UIState.CamSettings) {
                            r4.Cvb(-548981998);
                            camDevOptionsFragment.CamSettingsHome(r4, 8);
                        } else if (value instanceof CamDevOptionsViewModel.UIState.MediaKitResetNux) {
                            r4.Cvb(-548981918);
                            camDevOptionsFragment.ResetMediaKitNuxSurface(r4, 8);
                        } else {
                            r4.Cvb(-548981885);
                        }
                        AnonymousClass7W3.A0y(r4);
                        return;
                    }
                    r4.CuJ();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
                    return Unit.A00;
                }
            }, -1599464385), 196608, 31, 0, 0);
            if (((CamDevOptionsViewModel.UIState) A01.getValue()).loading) {
                LayoutKt.LoadingLayout(r5, 0);
                return;
            }
            return;
        }
        r5.CuJ();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C147188nY) obj, AnonymousClass0wJ.A04(obj2));
        return Unit.A00;
    }
}
