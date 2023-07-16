package X;

import android.content.SharedPreferences;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.43u  reason: invalid class name and case insensitive filesystem */
public final class C684443u implements C11630kW {
    public static final String __redex_internal_original_name = "BrandedContentCampaignRepository";
    public final SharedPreferences A00;
    public final C31580Grx A01;
    public final UserSession A02;
    public final C86074wE A03;
    public final C86074wE A04;
    public final C86094wG A05;
    public final C86094wG A06;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public C684443u(SharedPreferences sharedPreferences, C31580Grx grx, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = grx;
        this.A00 = sharedPreferences;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0110000_I2((List) null, 3, 10, false));
        this.A04 = A0z;
        this.A06 = C18230wP.A0x((C148838sG) null, A0z);
        C27457Enn A0z2 = C18190wL.A0z(false);
        this.A03 = A0z2;
        this.A05 = C18230wP.A0x((C148838sG) null, A0z2);
    }
}
