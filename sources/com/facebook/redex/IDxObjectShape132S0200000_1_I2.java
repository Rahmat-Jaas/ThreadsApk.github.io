package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0LU;
import X.AnonymousClass0YY;
import X.AnonymousClass3HX;
import X.AnonymousClass4Vo;
import X.AnonymousClass601;
import X.C10300i6;
import X.C109326jp;
import X.C127397h3;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C63743iE;
import X.C63893iY;
import X.C66883yU;
import X.C67313zL;
import X.C81804oQ;
import X.IVw;
import X.K9R;
import android.content.Context;
import android.text.TextUtils;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Function;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

public class IDxObjectShape132S0200000_1_I2 implements Function, AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObjectShape132S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (2 - this.A02 != 0) {
            ((AnonymousClass0YY) this.A01).invoke(C63893iY.A0B((C63893iY) obj2, 0));
            return null;
        }
        Context context = (Context) this.A00;
        C10300i6 r3 = (C10300i6) this.A01;
        String str = (String) obj2;
        Integer num = C66883yU.A0F;
        Integer num2 = AnonymousClass006.A00;
        C66883yU r10 = new C66883yU((C81804oQ) null, (CdsOpenScreenDismissCallback) null, (AnonymousClass3HX) null, (AnonymousClass601) null, (C127397h3) null, (C109326jp) null, AnonymousClass006.A0C, num2, num, num2, (Integer) null, (Integer) null, false, false, false);
        K9R k9r = K9R.A00;
        IVw iVw = new IVw(k9r);
        iVw.A04("deeplink_destination", (String) null);
        Locale locale = Locale.US;
        iVw.A04("entrypoint", str.toLowerCase(locale));
        iVw.A03("requested_screen_component_type", 2);
        IVw iVw2 = new IVw(k9r);
        iVw2.A04("entrypoint", str.toLowerCase(locale));
        iVw2.A04("newly_linked", "");
        if (!TextUtils.isEmpty((CharSequence) null)) {
            try {
                JSONObject A0j = C18250wR.A0j((String) null);
                Iterator<String> keys = A0j.keys();
                while (keys.hasNext()) {
                    String A0k = C18180wK.A0k(keys);
                    iVw2.A04(A0k, A0j.getString(A0k));
                }
            } catch (JSONException e) {
                AnonymousClass0LU.A0G(C67313zL.__redex_internal_original_name, "Exception on resolve deeplink params", e);
            }
        }
        iVw.A00.put("deeplink_params", iVw2);
        AnonymousClass4Vo r4 = new AnonymousClass4Vo(C18180wK.A0M(k9r, iVw));
        IgBloksScreenConfig A0N = C18190wL.A0N(r3);
        A0N.A0P = "com.bloks.www.fxcal.settings";
        A0N.A01 = r10;
        C63743iE r1 = new C63743iE(r4, Collections.EMPTY_MAP, "com.bloks.www.fxcal.settings");
        r1.A00 = 857806880;
        r1.A0E(context, A0N);
        return Unit.A00;
    }
}
