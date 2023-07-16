package X;

import android.content.Intent;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.2Rz  reason: invalid class name and case insensitive filesystem */
public final class C36612Rz {
    public static final void A00(Fragment fragment, String str, boolean z) {
        C04220Ms.A0B(str, 0);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s", (Object) str);
        Resources A0B = AnonymousClass0wJ.A0B(fragment);
        int i = 2131835656;
        if (z) {
            i = 2131835651;
        }
        String string = A0B.getString(i, new Object[]{str, formatStrLocaleSafe});
        C04220Ms.A09(string);
        Intent A0B2 = C18230wP.A0B();
        A0B2.setAction("android.intent.action.SEND");
        A0B2.putExtra("android.intent.extra.TEXT", string);
        A0B2.setType(HTTP.PLAIN_TEXT_TYPE);
        C10650ih.A07(fragment, Intent.createChooser(A0B2, (CharSequence) null), 7384567);
    }
}
