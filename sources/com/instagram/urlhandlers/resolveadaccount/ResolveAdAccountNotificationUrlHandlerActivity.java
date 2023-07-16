package com.instagram.urlhandlers.resolveadaccount;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.AnonymousClass2KP;
import X.AnonymousClass2RT;
import X.AnonymousClass3XV;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C16240si;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C62883b4;
import X.JY1;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class ResolveAdAccountNotificationUrlHandlerActivity extends BaseFragmentActivity {
    public final C16240si A00 = C18190wL.A0I();

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return C18200wM.A0W(this);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = C14030oh.A00(786940199);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = -1801966060;
        } else {
            String A0i = C18190wL.A0i(A0C);
            if (A0i == null) {
                finish();
                i = -1150885713;
            } else {
                Uri A003 = C15430rJ.A00(this.A00, A0i, true);
                if (A003 == null) {
                    finish();
                    i = -1672312694;
                } else {
                    Bundle A06 = C18180wK.A06();
                    C18190wL.A12(A003, A06, "type");
                    A0C.putAll(A06);
                    AnonymousClass0RG r5 = AnonymousClass0RA.A0C;
                    if (r5.A03(this) instanceof UserSession) {
                        UserSession A062 = r5.A06(A0C);
                        String string = A0C.getString("type");
                        Integer num = AnonymousClass006.A15;
                        if (string != null) {
                            num = AnonymousClass3XV.A00(string);
                            C04220Ms.A06(num);
                        }
                        if (num == AnonymousClass006.A01) {
                            str = "instagram_push_notification_for_business";
                        } else if (num == AnonymousClass006.A0u) {
                            str = "instagram_push_notification_for_ad_account";
                        } else {
                            JY1 A02 = C62883b4.A02();
                            ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(AnonymousClass2RT.A00(num));
                            if (errorIdentifier == null) {
                                errorIdentifier = ErrorIdentifier.UNRECOGNIZED;
                            }
                            C18180wK.A17(A02.A01(errorIdentifier, A062), C18180wK.A0Q(this, r5.A03(this)));
                            i = -1097208829;
                        }
                        AnonymousClass2KP.A00(this, A062, str);
                    }
                    finish();
                    i = -1097208829;
                }
            }
        }
        C14030oh.A07(i, A002);
    }
}
