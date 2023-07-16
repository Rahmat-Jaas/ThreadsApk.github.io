package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.3HD  reason: invalid class name */
public final class AnonymousClass3HD {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C23411dm A02;

    public final void A01(C85604vT r7, String str, List list, boolean z, boolean z2) {
        int i;
        int i2;
        UserSession userSession = this.A01;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36316409504336996L) && r7 != null) {
            String BH2 = r7.BH2();
            String B3D = r7.B3D();
            r7.B3E();
            list.add(0, new C61233Sk(C18200wM.A0R(r7, this, HttpStatus.SC_CREATED), BH2, B3D));
        }
        if (z) {
            C63613hu.A04(list, 2131835555);
        }
        if (C63803iN.A0E(r2, userSession, 36317298562174505L)) {
            i = 2131827938;
            i2 = 241;
        } else {
            AccountFamily A022 = C62813an.A02(C62813an.A01(userSession), userSession);
            if (!(A022 == null || A022.A00() == null)) {
                HasPasswordState hasPasswordState = A022.A00().A00.A01;
                if (hasPasswordState == null) {
                    hasPasswordState = HasPasswordState.UNKNOWN;
                }
                if (hasPasswordState == HasPasswordState.FALSE && C63173fJ.A05(r2, 18297101846839913L)) {
                    i = 2131824557;
                    i2 = 242;
                }
            }
            i = 2131827938;
            i2 = 244;
            if (C18190wL.A1X(C18200wM.A0C(), "has_one_clicked_logged_in")) {
                i2 = 243;
            }
        }
        AnonymousClass4MA A002 = AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, i2), i);
        if (z2) {
            A002.A01 = R.drawable.instagram_key_pano_outline_24;
        }
        list.add(A002);
        AnonymousClass4MA A003 = AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, 247), 2131830129);
        if (z2) {
            A003.A01 = R.drawable.instagram_location_pano_outline_24;
        }
        list.add(A003);
        AnonymousClass4MA A004 = AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, 245), 2131830269);
        if (z2) {
            A004.A01 = R.drawable.instagram_keyhole_pano_outline_24;
        }
        list.add(A004);
        AnonymousClass4MA A005 = AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, 246), 2131830176);
        if (z2) {
            A005.A01 = R.drawable.instagram_authentication_pano_outline_24;
        }
        list.add(A005);
        AnonymousClass4MA A006 = AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, 248), 2131826739);
        if (z2) {
            A006.A01 = R.drawable.instagram_mail_pano_outline_24;
        }
        list.add(A006);
        AnonymousClass4MA A007 = AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, 239), 2131835353);
        if (z2) {
            A007.A01 = R.drawable.instagram_shield_pano_outline_24;
        }
        list.add(A007);
        if (C63803iN.A0E(r2, userSession, 36316409504336996L) && str != null) {
            list.add(new C63293hC((CharSequence) str));
        }
        if (z) {
            C63273h9.A03(list);
            C63613hu.A04(list, 2131835537);
        }
        AnonymousClass4MA A008 = AnonymousClass4MA.A00(new IDxCListenerShape202S0100000_1_I2_1(this, 240), 2131821453);
        if (z2) {
            A008.A01 = R.drawable.instagram_device_mixed_pano_outline_24;
        }
        list.add(A008);
    }

    public AnonymousClass3HD(UserSession userSession, C23411dm r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = r3.getActivity();
    }

    public final /* synthetic */ void A00(View view, C85604vT r7) {
        String B3E = r7.B3E();
        if (B3E != null) {
            C37350Jpy jpy = new C37350Jpy(view.getContext(), this.A01, C171209wF.A04, B3E);
            jpy.A07(this.A02.getModuleName());
            jpy.A04();
        }
    }
}
