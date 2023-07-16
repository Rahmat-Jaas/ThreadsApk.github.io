package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4T6  reason: invalid class name */
public final class AnonymousClass4T6 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C303820v A01;
    public final /* synthetic */ C58703Gu A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;

    public AnonymousClass4T6(Activity activity, C303820v r2, C58703Gu r3, Integer num, Integer num2) {
        this.A03 = num;
        this.A01 = r2;
        this.A04 = num2;
        this.A02 = r3;
        this.A00 = activity;
    }

    public final void run() {
        String str;
        AnonymousClass17a r5;
        Bundle A06 = C18180wK.A06();
        switch (this.A03.intValue()) {
            case 0:
                str = "DIRECT_INBOX_NUX";
                break;
            case 1:
                str = "THREAD_BANNER";
                break;
            case 2:
                str = "SETTINGS";
                break;
            case 3:
                str = "FISHFOODING";
                break;
            case 4:
                str = "OTC_NOTIFICATION";
                break;
            default:
                str = "SETTINGS_RESET_PIN";
                break;
        }
        A06.putString("BUNDLE_ENTRY_POINT", str);
        C303820v r3 = this.A01;
        A06.putString("BUNDLE_SURFACE", r3.toString());
        Integer num = this.A04;
        A06.putString("BUNDLE_SCREEN", AnonymousClass2MU.A00(num));
        if (r3 == C303820v.BOTTOM_SHEET) {
            UserSession userSession = this.A02.A00;
            Fragment A002 = AnonymousClass3MA.A00(A06, userSession, num);
            if (A002 != null) {
                Activity activity = this.A00;
                C37032Jj9 A0L = C18210wN.A0L(userSession);
                A0L.A0j = true;
                A0L.A0c = true;
                if (!(A002 instanceof AnonymousClass1Xi)) {
                    r5.A02 = R.drawable.instagram_x_pano_outline_24;
                    r5.A04 = C18190wL.A0H(activity, 338);
                    r5.A07 = C18190wL.A0g(activity.getResources(), 2131823054);
                } else {
                    r5 = new AnonymousClass17a((View.OnClickListener) null, (CharSequence) null, 0, 0, 4095, false);
                }
                A0L.A0F = r5.A01();
                Resources resources = activity.getResources();
                C04220Ms.A06(resources);
                A0L.A0O = AnonymousClass3MA.A01(resources, A002);
                C18200wM.A16(activity, A002, A0L);
            }
        } else if (r3 == C303820v.FULLSCREEN_MODAL) {
            C58703Gu r0 = this.A02;
            Activity activity2 = this.A00;
            C63863iT A022 = C63863iT.A02(activity2, A06, r0.A00, ModalActivity.class, "encrypted_backups_screen");
            A022.A0F();
            A022.A07 = true;
            A022.A0I(activity2);
        }
    }
}
