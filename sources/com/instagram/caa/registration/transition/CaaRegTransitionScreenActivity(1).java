package com.instagram.caa.registration.transition;

import X.AnonymousClass006;
import X.AnonymousClass3HX;
import X.AnonymousClass4WJ;
import X.AnonymousClass4WK;
import X.AnonymousClass601;
import X.C04220Ms;
import X.C10300i6;
import X.C109326jp;
import X.C127397h3;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C37067Jjv;
import X.C63743iE;
import X.C66883yU;
import X.C81804oQ;
import X.C95245zh;
import android.content.Intent;
import android.os.Bundle;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenCallerDismissCallback;
import com.facebook.redex.IDxCRunnableShape615S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

public final class CaaRegTransitionScreenActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void A0D(Bundle bundle) {
        try {
            UserSession A0Z = C18230wP.A0Z();
            this.A00 = A0Z;
            Intent intent = getIntent();
            C04220Ms.A06(intent);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = C18180wK.A06();
            }
            Pair A0p = C18180wK.A0p("flow_name", extras.getString("flow_name"));
            Intent intent2 = getIntent();
            C04220Ms.A06(intent2);
            Bundle extras2 = intent2.getExtras();
            if (extras2 == null) {
                extras2 = C18180wK.A06();
            }
            Map A0O = AnonymousClass4WK.A0O(C18180wK.A0p("flow_info", C18190wL.A0n(new JSONObject(AnonymousClass4WJ.A0G(A0p, C18180wK.A0p("flow_type", extras2.getString("flow_type")))))));
            Integer num = C66883yU.A0F;
            Integer num2 = AnonymousClass006.A00;
            Integer num3 = AnonymousClass006.A0N;
            C66883yU r8 = new C66883yU((C81804oQ) null, new CdsOpenScreenCallerDismissCallback(new IDxCRunnableShape615S0100000_1_I2((Object) this, 2)), (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num3, num, num2, (Integer) null, (Integer) null, false, false, false);
            IgBloksScreenConfig A0N = C18190wL.A0N(A0Z);
            A0N.A0P = "com.bloks.www.bloks.caa.reg.transition";
            A0N.A01 = r8;
            C95245zh r3 = new C95245zh(13784);
            r3.A04.put(45, "bloks.caa.reg.transition");
            C63743iE A02 = C63743iE.A02("com.bloks.www.bloks.caa.reg.transition", C37067Jjv.A02(A0O));
            A02.A00 = 719983200;
            r3.A0V();
            A02.A03 = r3;
            A02.A0E(this, A0N);
        } catch (IllegalStateException unused) {
        }
    }
}
