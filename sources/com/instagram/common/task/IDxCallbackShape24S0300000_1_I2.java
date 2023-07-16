package com.instagram.common.task;

import X.AnonymousClass3HF;
import X.C04220Ms;
import X.C30809GWj;
import X.C30839GYn;
import X.C32159H7t;
import X.C69794Ai;
import X.I0W;
import android.content.Intent;
import android.net.Uri;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.util.List;

public class IDxCallbackShape24S0300000_1_I2 extends C30809GWj {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallbackShape24S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        switch (this.A03) {
            case 0:
                File file = (File) obj;
                C69794Ai r2 = (C69794Ai) this.A00;
                r2.A05 = file;
                Intent intent = (Intent) this.A01;
                Uri fromFile = Uri.fromFile(file);
                if (fromFile == null) {
                    fromFile = intent.getData();
                }
                fromFile.getClass();
                C69794Ai.A00(fromFile, r2);
                return;
            case 1:
                C32159H7t h7t = (C32159H7t) obj;
                C04220Ms.A0B(h7t, 0);
                C30839GYn.A00(h7t, (I0W) this.A02, (UserSession) this.A00, (List) this.A01);
                return;
            default:
                super.A03(obj);
                return;
        }
    }

    public final void onFinish() {
        if (this.A03 != 0) {
            super.onFinish();
        } else {
            ((AnonymousClass3HF) this.A02).A00();
        }
    }

    public final void onStart() {
        if (this.A03 != 0) {
            super.onStart();
        } else {
            ((AnonymousClass3HF) this.A02).A01();
        }
    }
}
