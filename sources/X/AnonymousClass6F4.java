package X;

import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* renamed from: X.6F4  reason: invalid class name */
public final class AnonymousClass6F4 {
    public static final boolean A00() {
        Boolean bool;
        Method method;
        try {
            Object obj = null;
            if (AndroidComposeView.A16 == null) {
                Class<?> cls = Class.forName(AnonymousClass000.A00(47));
                AndroidComposeView.A16 = cls;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                } else {
                    method = null;
                }
                AndroidComposeView.A17 = method;
            }
            Method method2 = AndroidComposeView.A17;
            if (method2 != null) {
                obj = method2.invoke((Object) null, new Object[]{"debug.layout", false});
            }
            if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
