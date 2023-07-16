package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4Im  reason: invalid class name and case insensitive filesystem */
public final class C71354Im implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        UserSession userSession = this.A01;
        C49182qy.A00(userSession).A00("start_funnel");
        if (C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36328220664015172L)) {
            C34572Kb.A00(C304921n.IG_WHATSAPP_LINK, userSession).CXf(this.A00, new KtCSuperShape0S3100000_I2((Object) null, (String) null, (String) null, "ContactOptionsEntryPoint", 7), "whatsapp_linking_in_quick_promotion");
            return;
        }
        if (!AnonymousClass0wJ.A0Y(userSession).A2y()) {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_upsell.UpsellScreen";
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("back_stack_tag", "ContactOptionsEntryPoint");
        A0y.put("entrypoint", "whatsapp_linking_in_quick_promotion");
        C63863iT.A0C(C62853b1.A00(C18190wL.A0N(userSession), C63743iE.A02(str, A0y)), this.A00, userSession);
    }

    public C71354Im(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
