package com.instagram.urlhandlers.bloksleavereview;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C25786Drz;
import X.C62853b1;
import X.C63743iE;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public class BloksLeaveReviewUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(83990019);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0B = C18210wN.A0B(intent);
        A0B.getClass();
        C10300i6 A0S = C18190wL.A0S(A0B);
        this.A00 = A0S;
        UserSession A02 = C05030Qo.A02(A0S);
        String stringExtra = intent.getStringExtra("product_id");
        String stringExtra2 = intent.getStringExtra("merchant_id");
        String stringExtra3 = intent.getStringExtra("prefilled_rating");
        String stringExtra4 = intent.getStringExtra("survey_entry_point");
        String stringExtra5 = intent.getStringExtra("referral_surface");
        C04220Ms.A0B(A02, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("product_id", stringExtra);
        A0y.put("merchant_id", stringExtra2);
        A0y.put("seeded_star_index", stringExtra3);
        A0y.put("survey_entry_point", stringExtra4);
        A0y.put("referral_surface", stringExtra5);
        C25786Drz A0Q = C18180wK.A0Q(this, A02);
        C63743iE A022 = C63743iE.A02("com.bloks.www.bk.commerce.ratings_and_reviews.product.composer", A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(A02);
        C18210wN.A0s(this, A0N, 2131822380);
        A0N.A0h = false;
        A0N.A0Q = "shops_rr_product_composer";
        C18220wO.A1B(C62853b1.A02(A0N, A022), A0Q, false);
        C14030oh.A07(-431780139, A002);
    }
}
