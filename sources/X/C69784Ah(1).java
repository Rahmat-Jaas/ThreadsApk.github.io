package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.4Ah  reason: invalid class name and case insensitive filesystem */
public final class C69784Ah implements C33745Htj {
    public final Activity A00;
    public final Fragment A01;
    public final UserSession A02;
    public final boolean A03;

    public final void BNY(Intent intent) {
        C15730rn A002 = C60493Pi.A00(AnonymousClass006.A0u);
        if (intent.getStringExtra("CaptureFlowHelper.RESULT_KEY_POST_TYPE").equals("CaptureFlowHelper.RESULT_VALUE_MEDIA_POSTED")) {
            if (!this.A03) {
                A002.A0D("return_to", "feed");
                C18180wK.A1K(A002, this.A02);
            }
            Activity activity = this.A00;
            if (activity instanceof ModalActivity) {
                activity.onBackPressed();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Camera activity action not handled");
    }

    public final void Cv8(File file, int i) {
        AnonymousClass3Zy.A02(this.A00, file, i);
    }

    public final void CvN(Intent intent, int i) {
        C10650ih.A0E(intent, this.A01, i);
    }

    public C69784Ah(UserSession userSession, Activity activity, Fragment fragment, boolean z) {
        this.A01 = fragment;
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = z;
    }
}
