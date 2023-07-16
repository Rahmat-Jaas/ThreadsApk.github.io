package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.4Cw  reason: invalid class name */
public final class AnonymousClass4Cw implements C27686Erc {
    public static final Pattern A02 = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    public boolean A00 = false;
    public final Context A01;

    public static boolean A00(String str) {
        if (str == null || !C18240wQ.A1V(str, A02)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4Cw(Context context) {
        this.A01 = context;
    }

    public final AnonymousClass38C getState(AnonymousClass38C r3, CharSequence charSequence, boolean z) {
        Resources resources;
        int i;
        if (TextUtils.isEmpty(charSequence) || A00(charSequence.toString())) {
            if (this.A00 && TextUtils.isEmpty(charSequence)) {
                r3.A01 = "error";
                resources = this.A01.getResources();
                i = 2131834847;
            }
            return r3;
        }
        r3.A01 = "error";
        resources = this.A01.getResources();
        i = 2131829202;
        r3.A00 = resources.getString(i);
        return r3;
    }

    public AnonymousClass4Cw(Context context, boolean z) {
        this.A01 = context;
        this.A00 = true;
    }
}
