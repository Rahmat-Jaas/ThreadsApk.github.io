package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

/* renamed from: X.2GQ  reason: invalid class name */
public final class AnonymousClass2GQ {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        FragmentActivity A05 = C63913ic.A05(r6);
        Object A0B = C63893iY.A0B(r7, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r7, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        C04220Ms.A0B(A05, 0);
        AnonymousClass0wJ.A1M(str, A1Z, str2);
        Intent A0B2 = C18230wP.A0B();
        Bundle bundle = ActivityOptions.makeCustomAnimation(A05, R.anim.cds_fade_in, R.anim.cds_slide_out_bottom).toBundle();
        A0B2.setClassName(A05, "com.instagram.caa.registration.transition.CaaRegTransitionScreenActivity");
        A0B2.setFlags(67108864);
        A0B2.putExtra("flow_type", str);
        A0B2.putExtra("flow_name", str2);
        if (bundle == null) {
            C10650ih.A02(A05, A0B2);
        } else {
            C10650ih.A00.A07().A07(A05, A0B2, bundle);
        }
        A05.finish();
        return null;
    }
}
