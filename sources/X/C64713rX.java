package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.service.session.UserSession;

/* renamed from: X.3rX  reason: invalid class name and case insensitive filesystem */
public final class C64713rX implements View.OnClickListener {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ C63873iU A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C64713rX(Dialog dialog, Context context, Fragment fragment, C63873iU r4, UserSession userSession, String str, boolean z) {
        this.A04 = userSession;
        this.A01 = context;
        this.A02 = fragment;
        this.A06 = z;
        this.A05 = str;
        this.A00 = dialog;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(-156604468);
        UserSession userSession = this.A04;
        Context context = this.A01;
        Fragment fragment = this.A02;
        boolean z = this.A06;
        String str = this.A05;
        Dialog dialog = this.A00;
        C63873iU r11 = this.A03;
        if (C34562Ka.A00(userSession)) {
            dialog.dismiss();
            C34572Kb.A00(C304921n.IG_PAGE_LINK, userSession).CXf(fragment, new KtCSuperShape0S3100000_I2((Object) AnonymousClass22J.PAGE_CREATION, (String) null, (String) null, (String) null, 7), str);
        } else if (C61853Wb.A01(C67243zD.A00, userSession, "ig_professional_fb_page_linking")) {
            C67243zD.A01(context, fragment, r11, userSession, z);
        } else {
            C67243zD.A02(fragment, new C681642o(context, fragment, r11, userSession, z), userSession);
        }
        C67243zD.A03(userSession, str, "claim_page", "claim_button");
        C14030oh.A0C(-16302746, A052);
    }
}
