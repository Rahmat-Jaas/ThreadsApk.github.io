package X;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.3WD  reason: invalid class name */
public final class AnonymousClass3WD {
    public static final void A00(Activity activity, EffectAttribution effectAttribution, UserSession userSession) {
        AnonymousClass0wJ.A1M(userSession, 0, activity);
        Bundle A06 = C18180wK.A06();
        A06.putParcelable("ar_effect_licensing", effectAttribution);
        C18190wL.A13(A06, userSession.token);
        C63863iT.A08(activity, A06, userSession, TransparentModalActivity.class, "effect_licensing");
    }

    public static final void A01(Activity activity, String str) {
        String A00 = C28174Ezk.A00(427);
        boolean A1Y = AnonymousClass0wJ.A1Y(activity, str);
        Object systemService = activity.getApplicationContext().getSystemService("clipboard");
        C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        C18250wR.A0n((ClipboardManager) systemService, A00, str);
        if (C63813iO.A03(activity, (String) null, 2131821474, A1Y ? 1 : 0) == null) {
            C63813iO.A03(activity, (String) null, 2131821475, A1Y);
        }
    }

    public static final void A02(Context context, Integer num, String str) {
        StringBuilder A0r;
        int intValue;
        AnonymousClass0wJ.A1N(context, str);
        Intent A0B = C18230wP.A0B();
        A0B.setAction("android.intent.action.SEND");
        if (num == null || !((intValue = num.intValue()) == 10 || intValue == 9)) {
            A0r = C18200wM.A0r();
            A0r.append("https://www.instagram.com/ar/");
        } else {
            A0r = C18200wM.A0r();
            A0r.append("https://www.instagram.com/ar/");
            A0r.append(str);
            str = "/?src=vc";
        }
        A0B.putExtra("android.intent.extra.TEXT", C18180wK.A0i(str, A0r));
        A0B.setType(HTTP.PLAIN_TEXT_TYPE);
        C10650ih.A0B(context, Intent.createChooser(A0B, (CharSequence) null));
    }
}
