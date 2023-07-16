package com.instagram.urlhandlers.clipsapp;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.AnonymousClass5KX;
import X.BKN;
import X.BKU;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18200wM;
import X.C19480Ax3;
import X.C19482Ax5;
import X.C32165H8c;
import X.C62373Zc;
import X.C86114wI;
import X.C90485Me;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.KtLambdaShape133S0100000_I2_113;

public final class ClipsAppUrlHandlerActivity extends BaseFragmentActivity {
    public final C04530Oa A00 = C62373Zc.A03(new KtLambdaShape133S0100000_I2_113(this, 30));

    public static final void A00(BKU bku, ClipsAppUrlHandlerActivity clipsAppUrlHandlerActivity) {
        ImageUrl imageUrl;
        String str;
        boolean z;
        String str2 = null;
        BKN bkn = bku.A0f;
        C90485Me r1 = bkn.A0r;
        ClipsAppUrlHandlerActivity clipsAppUrlHandlerActivity2 = clipsAppUrlHandlerActivity;
        if (r1 != null) {
            AnonymousClass5KX r0 = r1.A00;
            String str3 = r0.A02;
            ImageUrl imageUrl2 = r0.A00;
            String str4 = r0.A03;
            User user = r0.A01;
            if (user != null) {
                str2 = user.BK7();
                imageUrl = user.B4M();
                z = user.BZi();
                str = user.getId();
            } else {
                imageUrl = null;
                str = null;
                z = false;
            }
            UserSession A0X = AnonymousClass0wJ.A0X(clipsAppUrlHandlerActivity2.A00);
            String str5 = r1.A01;
            String str6 = r1.A02;
            String str7 = bkn.A4Y;
            C04220Ms.A06(str7);
            C19480Ax3.A02(clipsAppUrlHandlerActivity2, imageUrl2, imageUrl, A0X, str5, str6, str3, str2, str, str4, str7, z);
        }
        clipsAppUrlHandlerActivity2.finish();
    }

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(-886573191);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1932925142;
        } else {
            String string = A0C.getString("original_url");
            if (string == null || string.length() == 0) {
                finish();
                i = 2078582138;
            } else {
                C10300i6 A0W = C18200wM.A0W(this);
                if (!(A0W instanceof UserSession)) {
                    AnonymousClass3YR.A00.A02(this, A0C, A0W);
                } else {
                    Uri A01 = C15430rJ.A01(string);
                    C04220Ms.A06(A01);
                    UserSession userSession = (UserSession) A0W;
                    String queryParameter = A01.getQueryParameter("media_id");
                    if (queryParameter != null) {
                        BKU A0W2 = C86114wI.A0W(userSession, queryParameter);
                        if (A0W2 == null) {
                            C32165H8c A03 = C19482Ax5.A03(userSession, queryParameter);
                            A03.A00 = new IDxACallbackShape112S0100000_2_I2(this, 24);
                            schedule(A03);
                        } else {
                            A00(A0W2, this);
                        }
                    }
                }
                i = 1102213538;
            }
        }
        C14030oh.A07(i, A002);
    }
}
