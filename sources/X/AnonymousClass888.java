package X;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.facebook.redex.IDxCallableShape272S0100000_2_I2;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.IsomorphicObjectBoundaryInterface;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* renamed from: X.888  reason: invalid class name */
public final class AnonymousClass888 implements WebMessageListenerBoundaryInterface {
    public C141968da A00;

    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        String str;
        C1195575w r4;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) AnonymousClass72D.A00(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        int length = ports.length;
        C1192674h[] r3 = new C1192674h[length];
        for (int i = 0; i < length; i++) {
            r3[i] = new C1192674h(ports[i]);
        }
        if (WebViewFeatureInternal.WEB_MESSAGE_GET_MESSAGE_PAYLOAD.A01()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) AnonymousClass72D.A00(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                str = webMessagePayloadBoundaryInterface.getAsString();
                r4 = new C1195575w(str, r3);
            } else if (type == 1) {
                r4 = new C1195575w(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), r3);
            } else {
                return;
            }
        } else {
            str = webMessageBoundaryInterface.getData();
            r4 = new C1195575w(str, r3);
        }
        IsomorphicObjectBoundaryInterface isomorphicObjectBoundaryInterface = (IsomorphicObjectBoundaryInterface) AnonymousClass72D.A00(JsReplyProxyBoundaryInterface.class, invocationHandler2);
        Object orCreatePeer = isomorphicObjectBoundaryInterface.getOrCreatePeer(new IDxCallableShape272S0100000_2_I2(isomorphicObjectBoundaryInterface, 0));
        C125137cW r2 = (C125137cW) this.A00;
        C04220Ms.A0B(orCreatePeer, 4);
        if (!z) {
            AnonymousClass5EZ r22 = r2.A00;
            WeakReference weakReference = r22.A00;
            if (weakReference != null) {
                weakReference.clear();
            }
            r22.A00 = C86144wL.A0w(orCreatePeer);
            String str2 = r4.A00;
            if (str2 != null) {
                r22.A01.A00(str2);
                return;
            }
            return;
        }
        AnonymousClass0LU.A0B("FbPaySDKIFrameInjector", "Web message listener is called on the main frame");
    }

    public AnonymousClass888(C141968da r1) {
        this.A00 = r1;
    }
}
