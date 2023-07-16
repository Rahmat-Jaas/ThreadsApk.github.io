package com.instagram.urlhandlers.stories;

import X.AnonymousClass000;
import X.AnonymousClass00U;
import X.AnonymousClass054;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass4WM;
import X.AnonymousClass7ZZ;
import X.C04220Ms;
import X.C06750aI;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C15430rJ;
import X.C171229wH;
import X.C18170wI;
import X.C18180wK;
import X.C18200wM;
import X.C19554AyF;
import X.C25335Djv;
import X.C25539DnV;
import X.C25786Drz;
import X.C62333Yi;
import X.C86124wJ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.reels.fragment.ReelViewerFragment;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class StoriesUrlHandlerActivity extends BaseFragmentActivity {
    public final AnonymousClass054 A00 = new AnonymousClass7ZZ(this);

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        String queryParameter;
        int i;
        int A002 = C14030oh.A00(891215013);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1480418433;
        } else {
            String string = A0C.getString("original_url");
            if (string == null) {
                finish();
                i = -7360680;
            } else {
                C10300i6 A0W = C18200wM.A0W(this);
                if (!(A0W instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0C, A0W);
                } else {
                    getSupportFragmentManager().A0v(this.A00);
                    Uri A01 = C15430rJ.A01(string);
                    String host = A01.getHost();
                    String A003 = AnonymousClass000.A00(1133);
                    if (host == null || !host.equalsIgnoreCase(A003)) {
                        String queryParameter2 = A01.getQueryParameter("user_id");
                        if (!(queryParameter2 == null || (queryParameter = A01.getQueryParameter("media_id")) == null)) {
                            ArrayList A14 = C06750aI.A14(queryParameter2);
                            C25786Drz A0Q = C18180wK.A0Q(this, A0W);
                            C19554AyF.A02();
                            C19554AyF.A02();
                            C25539DnV dnV = new C25539DnV();
                            dnV.A0N = A14;
                            dnV.A0O = A14;
                            dnV.A0M = C18180wK.A0e();
                            dnV.A05 = C171229wH.A0X;
                            dnV.A0R = true;
                            dnV.A03 = new C25335Djv();
                            dnV.A0Q = C86124wJ.A0z(C18180wK.A0p(queryParameter2, AnonymousClass4WM.A04(AnonymousClass00U.A0N(queryParameter, queryParameter2, '_'))));
                            C18180wK.A0x(dnV.A01(), new ReelViewerFragment(), A0Q);
                        }
                    } else {
                        Intent data = C62333Yi.A00(this).setData(A01);
                        C04220Ms.A06(data);
                        data.putExtra(C18170wI.A00(341), true);
                        C10650ih.A02(this, data);
                        finish();
                        i = 1574368753;
                    }
                }
                i = -176221107;
            }
        }
        C14030oh.A07(i, A002);
    }
}
