package com.facebook.redex;

import X.AnonymousClass2A8;
import X.AnonymousClass2A9;
import X.AnonymousClass3AD;
import X.AnonymousClass3AE;
import X.AnonymousClass3VO;
import X.AnonymousClass601;
import X.C109326jp;
import X.C318729h;
import X.C62383Zj;
import X.C63893iY;
import android.content.DialogInterface;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

public class IDxCListenerShape100S0300000_1_I2 implements DialogInterface.OnCancelListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape100S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A00 = obj3;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        UserSession userSession;
        AnonymousClass2A8 r3;
        AnonymousClass2A9 r2;
        C318729h r1;
        Map map;
        switch (this.A03) {
            case 2:
                userSession = ((AnonymousClass3AD) this.A02).A02;
                r3 = AnonymousClass2A8.A0E;
                r2 = (AnonymousClass2A9) this.A01;
                r1 = C318729h.CAL_FLOW;
                map = (Map) this.A00;
                break;
            case 3:
                userSession = ((AnonymousClass3AE) this.A02).A02;
                r3 = AnonymousClass2A8.A0E;
                r2 = (AnonymousClass2A9) this.A01;
                r1 = C318729h.CP_FLOW;
                map = (HashMap) this.A00;
                break;
            default:
                Object obj = this.A01;
                C63893iY.A0F((AnonymousClass601) this.A02, AnonymousClass3VO.A00(), (C109326jp) this.A00, obj, 0);
                return;
        }
        C62383Zj.A00(r1, r2, r3, userSession, map);
    }
}
