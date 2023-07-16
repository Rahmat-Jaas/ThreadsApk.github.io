package com.instagram.business.instantexperiences;

import X.AnonymousClass69T;
import X.AnonymousClass7Dz;
import X.C171209wF;
import X.C18180wK;
import X.C86134wK;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserActivity;
import com.instagram.service.session.UserSession;

public class InstantExperiencesLibImpl extends AnonymousClass7Dz {
    public Intent getInstantExperiencesIntent(Context context, String str, UserSession userSession, String str2, String str3, C171209wF r10, String str4) {
        Intent intent = new Intent(context, InstantExperiencesBrowserActivity.class);
        Bundle A06 = C18180wK.A06();
        C86134wK.A15(A06, userSession);
        A06.putString(AnonymousClass69T.A05.toString(), str);
        A06.putString(AnonymousClass69T.A0C.toString(), str2);
        A06.putString(AnonymousClass69T.A0A.toString(), str3);
        A06.putString(AnonymousClass69T.A02.toString(), str4);
        A06.putString(AnonymousClass69T.A0B.toString(), r10.toString());
        intent.putExtras(A06);
        return intent;
    }
}
