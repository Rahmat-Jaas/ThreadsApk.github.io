package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;

/* renamed from: X.3yv  reason: invalid class name and case insensitive filesystem */
public final class C67133yv implements CallerContextable {
    public static final CallerContext A0K = CallerContext.A00(C67133yv.class);
    public static final String __redex_internal_original_name = "BusinessConversionDataContext";
    public int A00;
    public ConversionStep A01;
    public C22121Tl A02;
    public AnonymousClass1S0 A03;
    public C10300i6 A04;
    public C24481is A05;
    public BusinessInfo A06;
    public BusinessInfo A07;
    public RegFlowExtras A08;
    public Integer A09 = AnonymousClass006.A0C;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public final int A00() {
        String str = this.A06.A0J;
        if (TextUtils.isEmpty(str) || !A01()) {
            return 0;
        }
        for (AnonymousClass3DO r2 : this.A05.A00.A00.A00) {
            if (str.equals(r2.A09)) {
                AnonymousClass384 r1 = r2.A06;
                if (r1 != null) {
                    return r1.A00;
                }
                return 0;
            }
        }
        return 0;
    }

    public final boolean A01() {
        C556934f r0;
        C556834e r02;
        List list;
        C24481is r03 = this.A05;
        if (r03 == null || (r0 = r03.A00) == null || (r02 = r0.A00) == null || (list = r02.A00) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public C67133yv(Bundle bundle, C10300i6 r5) {
        this.A04 = r5;
        this.A0B = C18190wL.A0j(bundle, "entry_point");
        this.A00 = bundle.getInt("intro_entry_position");
        bundle.getString("suma_sign_up_page_name");
        this.A0G = bundle.getString("target_page_id");
        this.A0C = bundle.getString("fb_access_token");
        this.A0D = bundle.getString("fb_user_id");
        bundle.getBoolean("sign_up_megaphone_entry", false);
        this.A0H = C61853Wb.A01(A0K, this.A04, "ig_professional_conversion_flow");
        bundle.getString("upsell_fb_user_id");
        bundle.getString("upsell_page_id");
    }
}
