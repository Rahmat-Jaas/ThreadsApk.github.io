package com.instagram.payout.activity;

import X.AnonymousClass01J;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0hH;
import X.AnonymousClass1c8;
import X.AnonymousClass2FJ;
import X.AnonymousClass4WJ;
import X.C04220Ms;
import X.C04620Ok;
import X.C10300i6;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C37416Jrb;
import X.C62853b1;
import X.C63743iE;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.Pair;

public final class PayoutOnboardingFlowActivity extends BaseFragmentActivity {
    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Intent intent = getIntent();
        C04220Ms.A06(intent);
        return r1.A06(AnonymousClass0hH.A00(intent));
    }

    public final void A0D(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Fragment A0L = getSupportFragmentManager().A0L(R.id.layout_container_main);
        Bundle A0C = C18190wL.A0C(this);
        String str5 = null;
        if (A0C != null) {
            str = A0C.getString(C18170wI.A00(250));
        } else {
            str = null;
        }
        Bundle A0C2 = C18190wL.A0C(this);
        if (A0C2 != null) {
            str2 = A0C2.getString("ARGUMENT_ORIGIN");
        } else {
            str2 = null;
        }
        Bundle A0C3 = C18190wL.A0C(this);
        if (A0C3 != null) {
            str3 = A0C3.getString("ARGUMENT_DEAL_ID");
        } else {
            str3 = null;
        }
        Bundle A0C4 = C18190wL.A0C(this);
        if (A0C4 != null) {
            str5 = A0C4.getString("ARGUMENT_FE_ID");
        }
        if (A0L == null) {
            AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
            Intent intent = getIntent();
            C04220Ms.A06(intent);
            UserSession A06 = r1.A06(AnonymousClass0hH.A00(intent));
            UserMonetizationProductType A00 = AnonymousClass2FJ.A00(str);
            String valueOf = String.valueOf(C04620Ok.A00(A06).A00.A14());
            if (A00 != UserMonetizationProductType.INCENTIVE_PLATFORM) {
                str3 = valueOf;
            }
            Pair A0p = C18180wK.A0p("subtype", C37416Jrb.A03(A00).A00);
            if (str2 == null) {
                str2 = "";
            }
            Pair A0p2 = C18180wK.A0p("entrypoint", str2);
            int ordinal = A00.ordinal();
            if (ordinal == 10) {
                str4 = "ig_incentives_platform_onboarding";
            } else if (ordinal != 2) {
                str4 = "native";
            } else {
                str4 = "ig_branded_content_final_screen";
            }
            AnonymousClass1c8 A02 = C62853b1.A02(C18190wL.A0N(A06), C63743iE.A02("com.bloks.www.payout_onboarding", AnonymousClass4WJ.A0H(A0p, A0p2, C18180wK.A0p("exit_destination", str4), C18180wK.A0p("payee_id", str3), C18180wK.A0p("fe_id", str5))));
            AnonymousClass01J A0L2 = C18220wO.A0L(this);
            A0L2.A0D(A02, R.id.layout_container_main);
            A0L2.A00();
        }
    }
}
