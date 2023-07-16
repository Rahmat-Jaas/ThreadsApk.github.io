package com.instagram.common.api.base;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass1bX;
import X.AnonymousClass27k;
import X.AnonymousClass28W;
import X.AnonymousClass29Y;
import X.AnonymousClass3LY;
import X.AnonymousClass3WS;
import X.AnonymousClass3XX;
import X.AnonymousClass4AX;
import X.AnonymousClass4WJ;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C13330nS;
import X.C14030oh;
import X.C15720rm;
import X.C18180wK;
import X.C18220wO;
import X.C18250wR;
import X.C22701Zc;
import X.C28161tl;
import X.C34610Ibg;
import X.C37408JrQ;
import X.C62423Zt;
import X.C63813iO;
import X.C63873iU;
import X.C694148l;
import X.C77464fp;
import X.E2V;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.user.model.User;
import java.util.Map;

public class IDxACallbackShape0S0110000_1_I2 extends C63873iU {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxACallbackShape0S0110000_1_I2(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void onFail(AnonymousClass3XX r14) {
        int A03;
        int i;
        switch (this.A02) {
            case 0:
                A03 = C14030oh.A03(12183882);
                C22701Zc r4 = (C22701Zc) this.A00;
                C63813iO.A03(r4.getContext(), (String) null, 2131826865, 0);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r4.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Bdy(new C37408JrQ("profile_native_calling", r4.A02, (String) null, r4.getString(2131826865), (String) null, (Map) null, AnonymousClass4WJ.A0I(C18180wK.A0p("is_profile_audio_call_enabled", String.valueOf(this.A01))), (Map) null));
                }
                i = -235346261;
                break;
            case 1:
                A03 = AnonymousClass0wJ.A00(-423873455, r14);
                super.onFail(r14);
                i = 670029293;
                break;
            case 2:
                A03 = C14030oh.A03(640561739);
                C63813iO.A06(C18220wO.A0A(this.A00));
                i = -1977055846;
                break;
            case 3:
                A03 = C14030oh.A03(-1100434997);
                AnonymousClass4AX r5 = (AnonymousClass4AX) ((IDxCListenerShape267S0100000_1_I2) this.A00).A00;
                AnonymousClass0wJ.A13(C28161tl.A02(AnonymousClass3WS.A01(r5.A0E)), "allow_story_reshare", !this.A01);
                C63813iO.A03(r5.A0B, "setAllowStoryReshare_error", 2131826851, 0);
                AnonymousClass4AX.A04(r5);
                i = 1424846849;
                break;
            default:
                A03 = C14030oh.A03(1872860143);
                AnonymousClass4AX r52 = (AnonymousClass4AX) ((IDxCListenerShape267S0100000_1_I2) this.A00).A00;
                C63813iO.A03(r52.A0B, "setArchivePreferenceWithOptimisticUpdate_error", 2131826851, 0);
                AnonymousClass4AX.A04(r52);
                i = 754310391;
                break;
        }
        C14030oh.A0A(i, A03);
    }

    public final void onFinish() {
        if (2 - this.A02 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C14030oh.A03(-1480294881);
        E2V e2v = ((C34610Ibg) this.A00).A02;
        if (e2v == null) {
            C04220Ms.A0E("actionBarService");
            throw null;
        }
        e2v.setIsLoading(false);
        C14030oh.A0A(-1204393710, A03);
    }

    public final void onStart() {
        if (2 - this.A02 != 0) {
            super.onStart();
            return;
        }
        int A03 = C14030oh.A03(758339212);
        E2V e2v = ((C34610Ibg) this.A00).A02;
        if (e2v == null) {
            C04220Ms.A0E("actionBarService");
            throw null;
        }
        e2v.setIsLoading(true);
        C14030oh.A0A(-1557238532, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        AnonymousClass29Y r0;
        switch (this.A02) {
            case 0:
                A03 = C14030oh.A03(883469285);
                int A032 = C14030oh.A03(324691575);
                C22701Zc r02 = (C22701Zc) this.A00;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r02.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Bdx(new C37408JrQ("profile_native_calling", r02.A02, "profile_native_calling", (String) null, (String) null, (Map) null, AnonymousClass4WJ.A0I(C18180wK.A0p("is_profile_audio_call_enabled", String.valueOf(this.A01))), (Map) null));
                }
                C14030oh.A0A(-655728960, A032);
                i = -1999114162;
                break;
            case 1:
                A03 = C14030oh.A03(-524356785);
                int A033 = C14030oh.A03(-27573190);
                C04220Ms.A0B(obj, 0);
                super.onSuccess(obj);
                AnonymousClass1bX r5 = (AnonymousClass1bX) this.A00;
                C04530Oa r8 = r5.A02;
                User A0R = C18250wR.A0R(AnonymousClass0wJ.A0X(r8));
                C10300i6 A0U = AnonymousClass0wJ.A0U(r8);
                boolean z = this.A01;
                C04220Ms.A0B(A0U, 1);
                String id = A0R.getId();
                C04220Ms.A0B(id, 0);
                ((C694148l) A0U.A01(C694148l.class, C77464fp.A00)).A00.put(id, Boolean.valueOf(z));
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(new C15720rm("collab_status_fragment"), AnonymousClass0wJ.A0U(r8)), "ig_creator_connections_events"), 1148);
                if (z) {
                    r0 = AnonymousClass29Y.TOGGLE_ON;
                } else {
                    r0 = AnonymousClass29Y.TOGGLE_OFF;
                }
                C18220wO.A1D(r0, A0I);
                A0I.A0O(r5.A01, "project");
                A0I.A0O(AnonymousClass27k.EDIT_SETTINGS, "target");
                A0I.A0O(AnonymousClass28W.EDIT_OPEN_TO_COLLAB_SETTINGS, "screen");
                A0I.Bb4();
                C14030oh.A0A(-1930335210, A033);
                i = 661392851;
                break;
            case 2:
                A03 = C14030oh.A03(-126549675);
                int A034 = C14030oh.A03(-1410880865);
                C34610Ibg ibg = (C34610Ibg) this.A00;
                if (!ibg.A08) {
                    C63873iU.A0H(AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(ibg.A0C)), AnonymousClass006.A01);
                }
                if (this.A01) {
                    C18180wK.A12(ibg);
                }
                C14030oh.A0A(1652544339, A034);
                i = -2066153838;
                break;
            case 3:
                A03 = C14030oh.A03(-1759901023);
                int A035 = C14030oh.A03(1838209769);
                super.onSuccess(obj);
                C62423Zt.A02(((AnonymousClass4AX) ((IDxCListenerShape267S0100000_1_I2) this.A00).A00).A0E);
                C14030oh.A0A(-666543527, A035);
                i = 1327078455;
                break;
            default:
                A03 = C14030oh.A03(-1316337179);
                int A036 = C14030oh.A03(-207984738);
                super.onSuccess(obj);
                C62423Zt.A02(((AnonymousClass4AX) ((IDxCListenerShape267S0100000_1_I2) this.A00).A00).A0E);
                C14030oh.A0A(323337715, A036);
                i = -1106439348;
                break;
        }
        C14030oh.A0A(i, A03);
    }
}
