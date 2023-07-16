package com.instagram.common.api.base;

import X.AnonymousClass3XX;
import X.AnonymousClass601;
import X.BKU;
import X.C04220Ms;
import X.C10300i6;
import X.C109326jp;
import X.C112746q7;
import X.C11630kW;
import X.C133887wd;
import X.C1374588q;
import X.C13950oZ;
import X.C14030oh;
import X.C156169Me;
import X.C171229wH;
import X.C18240wQ;
import X.C19462Awj;
import X.C63813iO;
import X.C63873iU;
import X.C86124wJ;
import X.C86134wK;
import X.C94225tx;
import X.C95115yt;
import X.C95355zy;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape52S0100000_I2_32;

public class IDxACallbackShape16S0300000_2_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxACallbackShape16S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = obj3;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A032;
        int i;
        switch (this.A03) {
            case 0:
                A032 = C86134wK.A09(this, -539012310);
                i = 1566749058;
                break;
            case 1:
                A032 = C86134wK.A09(this, -1308603969);
                i = 655364595;
                break;
            case 2:
                A032 = C86134wK.A09(this, 3502579);
                i = -1999874026;
                break;
            case 3:
                A032 = C14030oh.A03(81222843);
                i = 1779096938;
                break;
            case 4:
                A032 = C14030oh.A03(985617820);
                super.onFail(r7);
                BKU bku = (BKU) this.A01;
                bku.A3o(false);
                C63813iO.A03((Context) this.A00, "disable_commenting_network_error", 2131831662, 0);
                bku.AAy((C10300i6) this.A02);
                i = 320699439;
                break;
            case 5:
                A032 = C14030oh.A03(-1436429165);
                super.onFail(r7);
                BKU bku2 = (BKU) this.A01;
                bku2.A3o(true);
                C63813iO.A03((Context) this.A00, "enable_commenting_network_error", 2131831662, 0);
                bku2.AAy((C10300i6) this.A02);
                i = 1798506779;
                break;
            default:
                A032 = C14030oh.A03(1635930751);
                C63813iO.A00(((C133887wd) this.A00).A00, 2131836068);
                ((Dialog) this.A01).dismiss();
                i = 1685994405;
                break;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onFinish() {
        if (3 - this.A03 != 0) {
            super.onFinish();
        } else {
            C14030oh.A0A(-388746547, C14030oh.A03(-1338268293));
        }
    }

    public final void onStart() {
        if (6 - this.A03 != 0) {
            super.onStart();
            return;
        }
        int A032 = C14030oh.A03(-30151297);
        C13950oZ.A00((Dialog) this.A01);
        C14030oh.A0A(-188558659, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        switch (this.A03) {
            case 0:
                i = C14030oh.A03(-733722269);
                int A032 = C14030oh.A03(1658585040);
                C86124wJ.A1Q((AnonymousClass601) this.A00, (C109326jp) this.A02, ((C95115yt) obj).A00);
                C14030oh.A0A(1378875647, A032);
                i2 = -900934929;
                break;
            case 1:
                i = C14030oh.A03(-487998704);
                int A033 = C14030oh.A03(817064330);
                C86124wJ.A1Q((AnonymousClass601) this.A00, (C109326jp) this.A02, ((C95115yt) obj).A00);
                C14030oh.A0A(323967908, A033);
                i2 = -2142078008;
                break;
            case 2:
                i = C14030oh.A03(-1616812113);
                int A034 = C14030oh.A03(804071353);
                C86124wJ.A1Q((AnonymousClass601) this.A00, (C109326jp) this.A02, ((C95115yt) obj).A00);
                C14030oh.A0A(748228638, A034);
                i2 = 508043795;
                break;
            case 3:
                i = C14030oh.A03(-975752712);
                int A035 = C14030oh.A03(-1424890812);
                UserSession userSession = (UserSession) this.A02;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A00;
                C04220Ms.A0B(userSession, 0);
                Reel A002 = ((C112746q7) userSession.A01(C112746q7.class, new KtLambdaShape52S0100000_I2_32(userSession, 30))).A00((C94225tx) obj);
                new C95355zy(fragmentActivity).A01(C86134wK.A0E(), fragmentActivity, (C11630kW) this.A01, A002, C171229wH.A0H, userSession);
                C14030oh.A0A(733653502, A035);
                i2 = 807119411;
                break;
            case 6:
                i = C14030oh.A03(-1809309087);
                C156169Me r13 = (C156169Me) obj;
                int A036 = C14030oh.A03(-1474831618);
                if (!r13.A04.isEmpty()) {
                    BKU bku = (BKU) C18240wQ.A0b(r13.A04);
                    ((C19462Awj) this.A02).A03(bku);
                    C133887wd.A00(bku, (C133887wd) this.A00);
                } else {
                    C63813iO.A00(((C133887wd) this.A00).A00, 2131836068);
                }
                new Handler().postDelayed(new C1374588q(this), 200);
                C14030oh.A0A(-1181662563, A036);
                i2 = 307782210;
                break;
            default:
                super.onSuccess(obj);
                return;
        }
        C14030oh.A0A(i2, i);
    }
}
