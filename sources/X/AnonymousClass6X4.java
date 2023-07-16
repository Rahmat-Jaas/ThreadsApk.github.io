package X;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: X.6X4  reason: invalid class name */
public final class AnonymousClass6X4 {
    public static final C145158jw A00;

    static {
        C145158jw r0;
        try {
            r0 = new C125157cY((WebViewProviderFactoryBoundaryInterface) AnonymousClass72D.A00(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0])));
        } catch (IllegalAccessException e) {
            throw C86114wI.A0k(e);
        } catch (InvocationTargetException e2) {
            throw C86114wI.A0k(e2);
        } catch (ClassNotFoundException unused) {
            r0 = new C125167cZ();
        } catch (NoSuchMethodException e3) {
            throw C86114wI.A0k(e3);
        }
        A00 = r0;
    }
}
