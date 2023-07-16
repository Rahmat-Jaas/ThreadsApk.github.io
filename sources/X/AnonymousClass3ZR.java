package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.3ZR  reason: invalid class name */
public final class AnonymousClass3ZR {
    public static Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static Object A02(List list) {
        Object A02;
        Class<AnonymousClass1Xb> cls = AnonymousClass1Xb.class;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            Fragment fragment = (Fragment) list.get(size);
            if (cls.isInstance(fragment)) {
                return cls.cast(fragment);
            }
            A02 = A02(fragment.getChildFragmentManager().A0T.A04());
        } while (A02 == null);
        return A02;
    }

    public static List A03(Activity activity) {
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager().A0T.A04();
        }
        return null;
    }

    public static Object A01(Context context) {
        List A03 = A03(A00(context));
        if (A03 == null || A03.isEmpty()) {
            return null;
        }
        return A02(A03);
    }
}
