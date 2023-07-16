package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape219S0200000_1_I2;
import com.facebook.redex.IDxCListenerShape267S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4AW  reason: invalid class name */
public final class AnonymousClass4AW implements C84534tJ {
    public static final C63273h9 A06 = new C63273h9();
    public C82434pc A00;
    public final Activity A01;
    public final Context A02;
    public final C28161tl A03;
    public final UserSession A04;
    public final List A05 = AnonymousClass0wJ.A0v();

    public AnonymousClass4AW(Activity activity, Context context, UserSession userSession) {
        C04220Ms.A0B(userSession, 3);
        this.A01 = activity;
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = AnonymousClass3WS.A01(userSession);
        A00(this);
    }

    public final void Cp1(C82434pc r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
    }

    public final boolean Csv() {
        return false;
    }

    public final void onDestroy() {
        this.A00 = null;
    }

    public static final void A00(AnonymousClass4AW r11) {
        List list = r11.A05;
        list.clear();
        C63273h9 r5 = A06;
        list.add(r5);
        AnonymousClass4MA A002 = AnonymousClass4MA.A00(C18190wL.A0H(r11, 272), 2131836287);
        A002.A01 = R.drawable.instagram_new_story_pano_outline_24;
        list.add(A002);
        AnonymousClass4MA A003 = AnonymousClass4MA.A00(C18190wL.A0H(r11, 271), 2131834454);
        A003.A01 = R.drawable.instagram_reels_pano_outline_24;
        list.add(A003);
        AnonymousClass4MA A004 = AnonymousClass4MA.A00(C18190wL.A0H(r11, 270), 2131829932);
        A004.A01 = R.drawable.instagram_live_pano_outline_24;
        list.add(A004);
        list.add(r5);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Context context = r11.A02;
        C63613hu.A01(context.getString(2131822924), A0v);
        C28161tl r7 = r11.A03;
        A0v.add(AnonymousClass4MC.A05(r11, 6, 2131827948, r7.A0Q()));
        list.addAll(A0v);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v2, 2131827944);
        C63293hC.A02(context.getString(2131827943), A0v2);
        ArrayList A0v3 = AnonymousClass0wJ.A0v();
        String str = "left_side";
        C62563aI.A01(str, context.getString(2131827945), A0v3);
        C62563aI.A01("right_side", context.getString(2131827946), A0v3);
        SharedPreferences sharedPreferences = r7.A00;
        if (sharedPreferences.getBoolean(C28174Ezk.A00(89), false)) {
            str = "right_side";
        }
        C61353Sw.A00(new IDxCListenerShape219S0200000_1_I2(0, r11, A0v3), str, A0v2, A0v3);
        list.addAll(A0v2);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, r11.A04, 36326575691540122L)) {
            list.add(r5);
            ArrayList A0v4 = AnonymousClass0wJ.A0v();
            IDxCSpanShape187S0100000_1_I2 A005 = C18730xl.A00(r11, C18210wN.A01(context), 12);
            String A0k = AnonymousClass0wJ.A0k(context, 2131822938);
            String string = context.getString(2131822939);
            SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(context, A0k, 2131822937));
            AnonymousClass3Zw.A01(A0E, A005, A0k);
            AnonymousClass4MC r0 = new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new IDxCListenerShape267S0100000_1_I2((Object) r11, 5), (CharSequence) string, (CharSequence) A0E, sharedPreferences.getBoolean("has_allowed_acr_camera_roll_access", false));
            r0.A0D = true;
            C63613hu.A03(A0v4, 2131822939);
            A0v4.add(r0);
            list.addAll(A0v4);
        }
    }

    public final List AvI() {
        return this.A05;
    }

    public final String getModuleName() {
        return "camera_settings";
    }

    public final int BH6() {
        return 2131822940;
    }
}
