package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape169S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape1S2100000_I2;
import kotlin.jvm.internal.KtLambdaShape27S0200000_I2_11;
import kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50;

/* renamed from: X.1YB  reason: invalid class name */
public final class AnonymousClass1YB extends C34640IcN {
    public static final String __redex_internal_original_name = "FanClubShoutoutsFragment";
    public final C04530Oa A00;
    public final C04530Oa A01;
    public final C04530Oa A02 = C80644m9.A00(this);
    public final C04530Oa A03;

    public final String getModuleName() {
        return "fan_club_shoutouts";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public AnonymousClass1YB() {
        Integer num = AnonymousClass006.A0C;
        this.A00 = AnonymousClass0OY.A01(num, new KtLambdaShape1S2100000_I2(this, "creator_user_id", "creator_user_id", 6));
        this.A01 = AnonymousClass0OY.A01(num, new KtLambdaShape1S2100000_I2(this, "ARG_SHOUTOUT_MENTIONED_IDS", "ARG_SHOUTOUT_MENTIONED_IDS", 7));
        KtLambdaShape70S0100000_I2_50 A0g = C18250wR.A0g(this, 36);
        C04530Oa A012 = AnonymousClass0OY.A01(num, C18250wR.A0g(C18250wR.A0g(this, 33), 34));
        this.A03 = C18220wO.A0M(C18250wR.A0g(A012, 35), A0g, new KtLambdaShape27S0200000_I2_11(4, (Object) null, A012), C18210wN.A0l(AnonymousClass105.class));
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass1kC r4;
        int A022 = C14030oh.A02(-1842511244);
        super.onCreate(bundle);
        AnonymousClass105 r8 = (AnonymousClass105) this.A03.getValue();
        List list = r8.A03;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A032 = r8.A01.A03(C18180wK.A0k(it));
            if (A032 != null) {
                String A11 = A032.A11();
                if (A11 == null && (A11 = A032.Ak1()) == null) {
                    A11 = "";
                }
                A0w.add(new KtCSuperShape0S3100000_I2(A032.B4M(), A032.BK7(), A11, A032.getId()));
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        }
        User A033 = r8.A01.A03(r8.A02);
        if (A033 != null) {
            boolean z = true;
            if (A033.A02 == C307022o.ELIGIBLE_TO_SUBSCRIBE) {
                r4 = AnonymousClass1kC.A00(new Object[]{A033.BK7()}, 2131836341);
            } else {
                r4 = null;
            }
            r8.A04.CrC(new KtCSuperShape1S0200000_I2_1((List) A0w, (C57943Dd) r4, 4));
            AnonymousClass495 A002 = AnonymousClass2O7.A00(r8.A00);
            int size = A0w.size();
            if (A033.A02 != C307022o.SUBSCRIBED) {
                z = false;
            }
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A002.A00, "ig_fan_club_story_shoutouts_consumption_bottomsheet_impression"), 1208);
            C18230wP.A1H(A0I, "story_viewer");
            A0I.A0S("mentioned_user_count", C18230wP.A0f(size));
            A0I.A0Q("subscribed", Boolean.valueOf(z));
            A0I.Bb4();
            C14030oh.A09(240512646, A022);
            return;
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-235370874);
        ComposeView A002 = AnonymousClass6QR.A00(this, AnonymousClass7JR.A03(new KtLambdaShape169S0100000_I2_2(this, 1), 1162909659, true));
        C14030oh.A09(-1406688527, A022);
        return A002;
    }
}
