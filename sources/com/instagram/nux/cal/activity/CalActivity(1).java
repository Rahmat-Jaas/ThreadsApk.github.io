package com.instagram.nux.cal.activity;

import X.AnonymousClass006;
import X.AnonymousClass1bH;
import X.AnonymousClass2A8;
import X.C04220Ms;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C25786Drz;
import X.C306222g;
import X.C36522Rq;
import X.C58013Dl;
import X.C62383Zj;
import X.C82784qG;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;

public class CalActivity extends BaseFragmentActivity implements C11630kW, C82784qG {
    public int A00;
    public Bundle A01;
    public C10300i6 A02;
    public String A03;
    public String A04;
    public String A05;
    public Parcelable A06;
    public C58013Dl A07;

    public final String getModuleName() {
        return "cal_tos";
    }

    public final void A0D(Bundle bundle) {
        Fragment r0;
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("argument_flow");
            stringExtra.getClass();
            Integer A002 = C36522Rq.A00(stringExtra);
            C306222g r8 = (C306222g) getIntent().getSerializableExtra("argument_entry_point");
            if (r8 != null) {
                C25786Drz A0Q = C18180wK.A0Q(this, getSession());
                A0Q.A0C = false;
                C58013Dl r5 = this.A07;
                Parcelable parcelable = this.A06;
                C10300i6 r7 = this.A02;
                if (A002 == AnonymousClass006.A00) {
                    r0 = r5.A00(parcelable, r7, r8, A002, (String) null, (String) null);
                } else if (A002 == AnonymousClass006.A01) {
                    Bundle A062 = C18180wK.A06();
                    C18180wK.A0w(A062, r7);
                    A062.putParcelable("argument_content", parcelable);
                    A062.putString("argument_flow", "NUX_FLOW".toLowerCase());
                    A062.putSerializable("argument_entry_point", r8);
                    r0 = new AnonymousClass1bH();
                    r0.setArguments(A062);
                } else {
                    throw C18180wK.A0a("Flow not supported!");
                }
                A0Q.A03 = r0;
                A0Q.A05();
            }
        }
    }

    public final void C8k() {
        C10300i6 r4 = this.A02;
        String string = this.A01.getString("extra_cal_registration_source");
        Boolean A0Q = C18210wN.A0Q(this.A01, "extra_cal_force_signup_with_fb_after_cp_claiming");
        C04220Ms.A0B(r4, 0);
        C62383Zj.A03(AnonymousClass2A8.A0H, r4, A0Q, string);
        Intent A0B = C18230wP.A0B();
        A0B.putExtra("result_action_positive", false);
        A0B.putExtra("argument_requested_code", this.A00);
        A0B.putExtra("argument_access_token", this.A03);
        A0B.putExtra("argument_client_extras_bundle", this.A01);
        C18200wM.A10(this, A0B);
        overridePendingTransition(R.anim.signup_content_fade_in, R.anim.signup_content_slide_out);
    }

    public final C10300i6 getSession() {
        Bundle A0C = C18190wL.A0C(this);
        A0C.getClass();
        return C18190wL.A0S(A0C);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.signup_content_fade_in, R.anim.signup_content_slide_out);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1272781869);
        this.A07 = new C58013Dl();
        Bundle A0C = C18190wL.A0C(this);
        A0C.getClass();
        this.A02 = C18190wL.A0S(A0C);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("argument_content");
        parcelableExtra.getClass();
        this.A06 = parcelableExtra;
        this.A00 = getIntent().getIntExtra("argument_requested_code", -1);
        String stringExtra = getIntent().getStringExtra("argument_access_token");
        stringExtra.getClass();
        this.A03 = stringExtra;
        Bundle bundleExtra = getIntent().getBundleExtra("argument_client_extras_bundle");
        bundleExtra.getClass();
        this.A01 = bundleExtra;
        super.onCreate(bundle);
        C10300i6 r3 = this.A02;
        String string = this.A01.getString("extra_cal_registration_source");
        Boolean A0Q = C18210wN.A0Q(this.A01, "extra_cal_force_signup_with_fb_after_cp_claiming");
        C04220Ms.A0B(r3, 0);
        C62383Zj.A03(AnonymousClass2A8.A04, r3, A0Q, string);
        C14030oh.A07(459384137, A002);
    }

    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
