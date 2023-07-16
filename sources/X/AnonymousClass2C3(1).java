package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.2C3  reason: invalid class name */
public final class AnonymousClass2C3 {
    public static Fragment A00(Context context) {
        Context context2;
        List A04;
        Class<FragmentActivity> cls = FragmentActivity.class;
        while (true) {
            Context context3 = context;
            if (cls.isInstance(context)) {
                context2 = context;
                break;
            }
            context2 = null;
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                if (context3 == context) {
                    break;
                }
            } else {
                break;
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context2;
        if (fragmentActivity == null || (A04 = fragmentActivity.getSupportFragmentManager().A0T.A04()) == null || A04.isEmpty()) {
            return null;
        }
        return (Fragment) A04.get(A04.size() - 1);
    }
}
