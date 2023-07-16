package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxNActionShape117S0300000_1_I2;
import com.facebook.redex.IDxNActionShape212S0200000_1_I2;
import com.facebook.redex.IDxNActionShape38S0400000_1_I2;
import com.facebook.redex.IDxRStepShape232S0200000_1_I2;
import com.facebook.redex.IDxTransformationShape288S0200000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;

/* renamed from: X.1yr  reason: invalid class name and case insensitive filesystem */
public final class C29571yr extends C29591yt {
    public static C29571yr A00;

    public final void A0A(FragmentActivity fragmentActivity, UserSession userSession) {
        Integer num = AnonymousClass006.A00;
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession2, 0);
        C60093Nq.A01(userSession2, num, (String) null);
        AnonymousClass3D9 r1 = new AnonymousClass3D9(AnonymousClass0wJ.A0Y(userSession2));
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass36Y A002 = C50612tH.A00(C50612tH.A00(new AnonymousClass36Y(), (C84774tq) null, (C84784tr) null, new IDxNActionShape38S0400000_1_I2(2, fragmentActivity2, r1, this, userSession2), (C84794ts) null, AnonymousClass2AS.ENTRY_POINT, (C84804tt) null, true), (C84774tq) null, (C84784tr) null, new IDxNActionShape38S0400000_1_I2(3, fragmentActivity2, r1, this, userSession2), new IDxNActionShape212S0200000_1_I2(r1, this, 8), AnonymousClass2AS.LOAD_USER, (C84804tt) null, true);
        AnonymousClass2AS r19 = AnonymousClass2AS.ADD_PROFILE_PICTURE;
        IDxRStepShape232S0200000_1_I2 iDxRStepShape232S0200000_1_I2 = new IDxRStepShape232S0200000_1_I2(5, userSession2, this);
        AnonymousClass4Ms r11 = new AnonymousClass4Ms(fragmentActivity2, userSession2);
        IDxNActionShape117S0300000_1_I2 iDxNActionShape117S0300000_1_I2 = new IDxNActionShape117S0300000_1_I2(r1, this, userSession2, 2);
        IDxTransformationShape288S0200000_1_I2 iDxTransformationShape288S0200000_1_I2 = new IDxTransformationShape288S0200000_1_I2(r1, this, 1);
        AnonymousClass36Y A003 = C50612tH.A00(A002, r11, iDxRStepShape232S0200000_1_I2, iDxNActionShape117S0300000_1_I2, new C72194Mz(userSession2), r19, iDxTransformationShape288S0200000_1_I2, false);
        AnonymousClass2AS r192 = AnonymousClass2AS.ADD_NAME;
        IDxRStepShape232S0200000_1_I2 iDxRStepShape232S0200000_1_I22 = new IDxRStepShape232S0200000_1_I2(0, userSession2, this);
        AnonymousClass4Ms r112 = new AnonymousClass4Ms(fragmentActivity2, userSession2);
        IDxNActionShape117S0300000_1_I2 iDxNActionShape117S0300000_1_I22 = new IDxNActionShape117S0300000_1_I2(r1, this, userSession2, 3);
        IDxTransformationShape288S0200000_1_I2 iDxTransformationShape288S0200000_1_I22 = new IDxTransformationShape288S0200000_1_I2(r1, this, 2);
        AnonymousClass36Y A004 = C50612tH.A00(A003, r112, iDxRStepShape232S0200000_1_I22, iDxNActionShape117S0300000_1_I22, new C72194Mz(userSession2), r192, iDxTransformationShape288S0200000_1_I22, false);
        AnonymousClass2AS r193 = AnonymousClass2AS.ADD_BIO;
        IDxRStepShape232S0200000_1_I2 iDxRStepShape232S0200000_1_I23 = new IDxRStepShape232S0200000_1_I2(1, userSession2, this);
        AnonymousClass4Ms r113 = new AnonymousClass4Ms(fragmentActivity2, userSession2);
        IDxNActionShape117S0300000_1_I2 iDxNActionShape117S0300000_1_I23 = new IDxNActionShape117S0300000_1_I2(r1, this, userSession2, 0);
        IDxTransformationShape288S0200000_1_I2 iDxTransformationShape288S0200000_1_I23 = new IDxTransformationShape288S0200000_1_I2(r1, this, 0);
        AnonymousClass36Y A005 = C50612tH.A00(A004, r113, iDxRStepShape232S0200000_1_I23, iDxNActionShape117S0300000_1_I23, new C72194Mz(userSession2), r193, iDxTransformationShape288S0200000_1_I23, false);
        AnonymousClass2AS r17 = AnonymousClass2AS.SHOW_LOADER;
        AnonymousClass36Y A006 = C50612tH.A00(A005, (C84774tq) null, new IDxRStepShape232S0200000_1_I2(2, r1, this), new IDxNActionShape212S0200000_1_I2(r1, this, 7), (C84794ts) null, r17, (C84804tt) null, true);
        AnonymousClass2AS r14 = AnonymousClass2AS.SAVE_NAME_AND_BIO;
        AnonymousClass3D9 r18 = r1;
        UserSession userSession3 = userSession2;
        AnonymousClass36Y A007 = C50612tH.A00(A006, (C84774tq) null, new IDxRStepShape232S0200000_1_I2(3, r1, this), new IDxNActionShape38S0400000_1_I2(0, fragmentActivity2, r18, this, userSession3), (C84794ts) null, r14, (C84804tt) null, true);
        Context applicationContext = fragmentActivity2.getApplicationContext();
        AnonymousClass2AS r142 = AnonymousClass2AS.SAVE_PROFILE_PICTURE;
        AnonymousClass36Y A008 = C50612tH.A00(C50612tH.A00(A007, (C84774tq) null, new IDxRStepShape232S0200000_1_I2(4, r1, this), new IDxNActionShape38S0400000_1_I2(1, applicationContext, r18, this, userSession3), (C84794ts) null, r142, (C84804tt) null, true), (C84774tq) null, (C84784tr) null, new IDxNActionShape117S0300000_1_I2(r1, this, userSession2, 1), (C84794ts) null, AnonymousClass2AS.BROADCAST_USER_UPDATES, (C84804tt) null, true);
        AnonymousClass3HU r3 = new AnonymousClass3HU();
        r3.A03 = Collections.unmodifiableList(A008.A00);
        r1.A05 = r3;
        A07(r3, new AnonymousClass4Mw(r1, this), (Object) null, "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
    }

    public static int A00(User user) {
        int A34 = user.A34();
        if (TextUtils.isEmpty(user.Ak1())) {
            A34++;
        }
        if (TextUtils.isEmpty(user.A0v())) {
            return A34 + 1;
        }
        return A34;
    }
}
