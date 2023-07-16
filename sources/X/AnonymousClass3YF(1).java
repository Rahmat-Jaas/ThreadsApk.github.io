package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.3YF  reason: invalid class name */
public final class AnonymousClass3YF {
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);
    public AnonymousClass7lN A00;
    public C84484tD A01;
    public final AnonymousClass3LL A02 = new AnonymousClass3LL();
    public final C10300i6 A03;
    public final List A04 = AnonymousClass0wJ.A0v();

    public static void A00(C10300i6 r2, AnonymousClass265 r3, String str, int i) {
        String str2 = null;
        if (str != null) {
            if (r3 != null) {
                str2 = r3.A01;
            }
            C04220Ms.A0B(r2, 0);
            C63523hf.A02(r2, str2);
        } else if (i == 0) {
            if (r3 != null) {
                str2 = r3.A01;
            }
            C04220Ms.A0B(r2, 0);
            C63523hf.A01(r2, str2);
        } else {
            if (r3 != null) {
                str2 = r3.A01;
            }
            C04220Ms.A0B(r2, 0);
            C63523hf.A03(r2, str2);
        }
    }

    public final /* synthetic */ void A01(Activity activity, HintRequest hintRequest, AnonymousClass7AL r16, AnonymousClass7lN r17, C82664q4 r18, AnonymousClass265 r19) {
        if (Build.VERSION.SDK_INT < 31) {
            AnonymousClass7AL r2 = r16;
            C13320nQ.A02(r2, "client must not be null");
            C13320nQ.A02(hintRequest, "request must not be null");
            C129107lI r0 = ((C93555ln) r2.A03(C103876as.A02)).A00;
            Context A022 = r2.A02();
            String str = r0.A00;
            C13320nQ.A02(A022, "context must not be null");
            C13320nQ.A02(hintRequest, "request must not be null");
            if (TextUtils.isEmpty(str)) {
                byte[] bArr = new byte[16];
                AnonymousClass30G.A00.nextBytes(bArr);
                str = Base64.encodeToString(bArr, 11);
            } else {
                C13320nQ.A01(str);
            }
            Intent putExtra = C18250wR.A05("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (String) null);
            putExtra.putExtra("logSessionId", str);
            Parcel obtain = Parcel.obtain();
            hintRequest.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
            PendingIntent activity2 = PendingIntent.getActivity(A022, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, putExtra, AnonymousClass30H.A00 | 134217728);
            Activity activity3 = activity;
            C82664q4 r4 = r18;
            try {
                C10300i6 r5 = this.A03;
                C26961rY r02 = new C26961rY(r5, r4, r19);
                List list = this.A04;
                synchronized (list) {
                    list.add(r02);
                }
                activity3.startIntentSenderForResult(activity2.getIntentSender(), r02.A00, (Intent) null, 0, 0, 0);
                int A002 = C63533hk.A00(r5);
                boolean A1T = AnonymousClass0wJ.A1T(r17.A01, 10);
                C04220Ms.A0B(r5, 0);
                C63523hf.A00((Status) null, r5, "bloks_reg", A002, A1T);
            } catch (IntentSender.SendIntentException unused) {
                activity.runOnUiThread(new AnonymousClass4SO(activity, r4, (Object) null));
                C10300i6 r3 = this.A03;
                C04220Ms.A0B(r3, 0);
                C63523hf.A05(r3, "bloks_reg", "get_signup_hint", "cannot_show_dialog");
            }
        }
    }

    public AnonymousClass3YF(C10300i6 r2) {
        this.A03 = r2;
    }
}
