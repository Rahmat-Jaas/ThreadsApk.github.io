package com.instagram.debug.devoptions;

import X.C04220Ms;
import X.C105006cj;
import X.C10650ih;
import X.C14030oh;
import X.C18180wK;
import X.FLT;
import android.content.Context;
import android.util.Base64;
import android.view.View;
import com.instagram.service.session.UserSession;
import java.security.cert.Certificate;

public final class PublicDeveloperOptions$addMainOptions$139 implements View.OnClickListener {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    public PublicDeveloperOptions$addMainOptions$139(UserSession userSession, Context context) {
        this.$userSession = userSession;
        this.$context = context;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1888694681);
        C105006cj r2 = new C105006cj();
        FLT flt = new FLT(this.$userSession);
        Context context = this.$context;
        C04220Ms.A0B(context, 0);
        flt.A02 = context;
        flt.A0D = "IG Internal Settings";
        Certificate certificate = r2.A00.getCertificate("alias");
        if (certificate != null) {
            String encodeToString = Base64.encodeToString(certificate.getPublicKey().getEncoded(), 2);
            C04220Ms.A06(encodeToString);
            flt.A0E = encodeToString;
            C10650ih.A02(this.$context, flt.A00());
            C14030oh.A0C(-215681244, A05);
            return;
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
