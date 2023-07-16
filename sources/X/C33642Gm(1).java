package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxHDelegateShape496S0100000_1_I2;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.upcomingevents.UpcomingEvent;

/* renamed from: X.2Gm  reason: invalid class name and case insensitive filesystem */
public final class C33642Gm {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        String A0E = C63893iY.A0E(r12, 2);
        C10300i6 A0F = C63913ic.A0F(r11);
        FragmentActivity A05 = C63913ic.A05(r11);
        C84584tU A02 = C25529DnJ.A02.A02(A05, new IDxHDelegateShape496S0100000_1_I2(A05, A1Z ? 1 : 0), C05030Qo.A02(A0F));
        C28923FeI feI = C28923FeI.FOLLOWERS_SHARE;
        C25818DsX dsX = new C25818DsX(feI);
        dsX.A05 = false;
        dsX.A0A = A1Z;
        C32264HDa.A02((Bundle) null, C170769vX.FEED_ADD_YOURS_PROMPT_PARTICIPATION_SCREEN, (C32264HDa) A02, new MediaCaptureConfig(dsX), feI, (UpcomingEvent) null, A0E, (String) null, -1, A1Z);
        return null;
    }
}
