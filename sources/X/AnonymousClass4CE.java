package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxHDelegateShape496S0100000_1_I2;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.model.upcomingevents.UpcomingEvent;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.4CE  reason: invalid class name */
public final class AnonymousClass4CE implements C21571Bwa {
    public final Fragment A00;
    public final C21839C2o A01;
    public final UserSession A02;

    public final void Bk0(AnonymousClass18U r12, String str) {
        try {
            StringWriter A0d = C18230wP.A0d();
            MMp A04 = C18987Aon.A00.A04(A0d);
            AnonymousClass3KJ.A00(A04, r12);
            A04.close();
            String obj = A0d.toString();
            FragmentActivity requireActivity = this.A00.requireActivity();
            C84584tU A022 = C25529DnJ.A02.A02(requireActivity, new IDxHDelegateShape496S0100000_1_I2(requireActivity, 4), this.A02);
            C28923FeI feI = C28923FeI.FOLLOWERS_SHARE;
            C25818DsX dsX = new C25818DsX(feI);
            dsX.A05 = false;
            dsX.A0A = true;
            C32264HDa.A02((Bundle) null, C170769vX.FEED_ADD_YOURS_PROMPT_CTA, (C32264HDa) A022, new MediaCaptureConfig(dsX), feI, (UpcomingEvent) null, obj, str, -1, true);
        } catch (IOException unused) {
            C10450iM.A00().CuW("FeedAddYoursMediaCTABarDelegateImpl", "Failed to deserialize MediaPromptData from onAddYoursCreationLabelClicked");
        }
    }

    public final void Bk1(AnonymousClass18U r5) {
        AnonymousClass4A9 A002 = C63263h8.A00(this.A02, "com.instagram.feed.prompt.open_participation_screen", C63203gz.A03("prompt_id", r5.A01));
        AnonymousClass4A9.A00(A002, this, 5);
        ((C145538kf) this.A00).schedule(A002);
    }

    public AnonymousClass4CE(Fragment fragment, C21839C2o c2o, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = c2o;
    }
}
