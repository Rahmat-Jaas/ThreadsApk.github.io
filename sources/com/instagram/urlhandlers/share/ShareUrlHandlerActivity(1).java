package com.instagram.urlhandlers.share;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C10300i6;
import X.C10650ih;
import X.C14030oh;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C62333Yi;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ShareUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        Bundle A0B;
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        if (intent != null && (A0B = C18210wN.A0B(intent)) != null) {
            return r1.A02(A0B);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A00 = C14030oh.A00(-596839372);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C != null) {
            str = C18190wL.A0i(A0C);
        } else {
            str = null;
        }
        Intent A002 = C62333Yi.A00(this);
        if (str == null) {
            str = "instagram://share";
        }
        Intent data = A002.setData(C18220wO.A0E(str).build());
        C04220Ms.A06(data);
        data.putExtra("com.instagram.url.extra.IS_ALREADY_HANDLED", true);
        C10650ih.A02(this, data);
        finish();
        C14030oh.A07(-253081467, A00);
    }
}
