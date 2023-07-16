package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.430  reason: invalid class name */
public final class AnonymousClass430 implements C83424rM, CallerContextable {
    public static final String __redex_internal_original_name = "IGUXFlowLifecycleIGWALinkingProcessor";
    public final Fragment A00;
    public final KtCSuperShape0S3100000_I2 A01;
    public final UserSession A02;
    public final String A03;

    public AnonymousClass430(Fragment fragment, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = str;
        this.A01 = ktCSuperShape0S3100000_I2;
    }

    public final void CH8(int i, int i2, Intent intent) {
    }

    public final void Bht() {
        String str;
        Fragment fragment = this.A00;
        C18190wL.A19(fragment);
        C04620Ok r0 = C06810aP.A01;
        UserSession userSession = this.A02;
        if (r0.A01(userSession).A2y()) {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_upsell.UpsellScreen";
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("entrypoint", this.A03);
        KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2 = this.A01;
        String str2 = ktCSuperShape0S3100000_I2.A01;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        A0y.put("back_stack_tag", str2);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18230wP.A1A(fragment, A0N, 2131838087);
        Bundle A002 = C62853b1.A00(A0N, C63743iE.A02(str, A0y));
        C63863iT A05 = C63863iT.A05(fragment.requireActivity(), A002, userSession, ModalActivity.class, "bloks");
        A05.A07 = true;
        String str4 = ktCSuperShape0S3100000_I2.A01;
        if (str4 != null) {
            str3 = str4;
        }
        A05.A06 = str3;
        A05.A0I(fragment.requireActivity());
    }
}
