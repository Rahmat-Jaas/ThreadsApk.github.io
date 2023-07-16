package androidx.webkit.internal;

import X.AnonymousClass00U;
import X.AnonymousClass5CA;
import X.AnonymousClass5CB;
import X.AnonymousClass5CC;
import X.AnonymousClass5CD;
import X.AnonymousClass5CE;
import X.AnonymousClass5CF;
import X.AnonymousClass5CG;
import X.AnonymousClass5CH;
import X.AnonymousClass5CI;
import X.C1188772q;
import X.C125147cX;
import X.C18200wM;
import X.C18250wR;
import X.C86134wK;
import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class WebViewFeatureInternal {
    public static final AnonymousClass5CI ALGORITHMIC_DARKENING = new AnonymousClass5CA();
    public static final AnonymousClass5CB CREATE_WEB_MESSAGE_CHANNEL = new AnonymousClass5CB("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final AnonymousClass5CC DISABLED_ACTION_MODE_MENU_ITEMS = new AnonymousClass5CC("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final AnonymousClass5CD DOCUMENT_START_SCRIPT = new AnonymousClass5CD("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final AnonymousClass5CD ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY = new AnonymousClass5CD("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final AnonymousClass5CH FORCE_DARK = new AnonymousClass5CH("FORCE_DARK", "FORCE_DARK");
    public static final AnonymousClass5CD FORCE_DARK_STRATEGY = new AnonymousClass5CD("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final AnonymousClass5CD GET_COOKIE_INFO = new AnonymousClass5CD("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    public static final AnonymousClass5CD GET_VARIATIONS_HEADER = new AnonymousClass5CD("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final AnonymousClass5CE GET_WEB_CHROME_CLIENT = new AnonymousClass5CE("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final AnonymousClass5CE GET_WEB_VIEW_CLIENT = new AnonymousClass5CE("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final AnonymousClass5CH GET_WEB_VIEW_RENDERER = new AnonymousClass5CH("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final AnonymousClass5CD MULTI_PROCESS = new AnonymousClass5CD("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final AnonymousClass5CB OFF_SCREEN_PRERASTER = new AnonymousClass5CB("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final AnonymousClass5CB POST_WEB_MESSAGE = new AnonymousClass5CB("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final AnonymousClass5CD PROXY_OVERRIDE = new AnonymousClass5CD("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final AnonymousClass5CD PROXY_OVERRIDE_REVERSE_BYPASS = new AnonymousClass5CD("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final AnonymousClass5CB RECEIVE_HTTP_ERROR = new AnonymousClass5CB("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    public static final AnonymousClass5CB RECEIVE_WEB_RESOURCE_ERROR = new AnonymousClass5CB("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    public static final AnonymousClass5CD REQUESTED_WITH_HEADER_ALLOW_LIST = new AnonymousClass5CD("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    public static final AnonymousClass5CF SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED = new AnonymousClass5CF("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    public static final AnonymousClass5CF SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED = new AnonymousClass5CF("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final AnonymousClass5CF SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED = new AnonymousClass5CF("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final AnonymousClass5CF SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED = new AnonymousClass5CF("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final AnonymousClass5CE SAFE_BROWSING_ENABLE = new AnonymousClass5CE("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final AnonymousClass5CF SAFE_BROWSING_HIT = new AnonymousClass5CF("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final AnonymousClass5CF SAFE_BROWSING_PRIVACY_POLICY_URL = new AnonymousClass5CF("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final AnonymousClass5CF SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY = new AnonymousClass5CF("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final AnonymousClass5CF SAFE_BROWSING_RESPONSE_PROCEED = new AnonymousClass5CF("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final AnonymousClass5CF SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL = new AnonymousClass5CF("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final AnonymousClass5CC SERVICE_WORKER_BASIC_USAGE = new AnonymousClass5CC("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final AnonymousClass5CC SERVICE_WORKER_BLOCK_NETWORK_LOADS = new AnonymousClass5CC("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final AnonymousClass5CC SERVICE_WORKER_CACHE_MODE = new AnonymousClass5CC("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final AnonymousClass5CC SERVICE_WORKER_CONTENT_ACCESS = new AnonymousClass5CC("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final AnonymousClass5CC SERVICE_WORKER_FILE_ACCESS = new AnonymousClass5CC("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    public static final AnonymousClass5CC SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST = new AnonymousClass5CC("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final AnonymousClass5CC SHOULD_OVERRIDE_WITH_REDIRECTS = new AnonymousClass5CC("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final C1188772q STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX = new C1188772q();
    public static final AnonymousClass5CF START_SAFE_BROWSING = new AnonymousClass5CF("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    public static final AnonymousClass5CD SUPPRESS_ERROR_PAGE = new AnonymousClass5CD("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");
    public static final AnonymousClass5CG TRACING_CONTROLLER_BASIC_USAGE = new AnonymousClass5CG();
    public static final AnonymousClass5CB VISUAL_STATE_CALLBACK = new AnonymousClass5CB("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final AnonymousClass5CB WEB_MESSAGE_CALLBACK_ON_MESSAGE = new AnonymousClass5CB("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final AnonymousClass5CD WEB_MESSAGE_GET_MESSAGE_PAYLOAD = new AnonymousClass5CD("WEB_MESSAGE_GET_MESSAGE_PAYLOAD", "WEB_MESSAGE_GET_MESSAGE_PAYLOAD");
    public static final AnonymousClass5CD WEB_MESSAGE_LISTENER = new AnonymousClass5CD("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final AnonymousClass5CB WEB_MESSAGE_PORT_CLOSE = new AnonymousClass5CB("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final AnonymousClass5CB WEB_MESSAGE_PORT_POST_MESSAGE = new AnonymousClass5CB("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final AnonymousClass5CB WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK = new AnonymousClass5CB("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final AnonymousClass5CB WEB_RESOURCE_ERROR_GET_CODE = new AnonymousClass5CB("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final AnonymousClass5CB WEB_RESOURCE_ERROR_GET_DESCRIPTION = new AnonymousClass5CB("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final AnonymousClass5CC WEB_RESOURCE_REQUEST_IS_REDIRECT = new AnonymousClass5CC("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    public static final AnonymousClass5CH WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE = new AnonymousClass5CH("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final AnonymousClass5CH WEB_VIEW_RENDERER_TERMINATE = new AnonymousClass5CH("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    public static UnsupportedOperationException getUnsupportedOperationException() {
        return C86134wK.A0s("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean isStartupFeatureSupported(String str, Collection collection, Context context) {
        HashSet A0u = C18200wM.A0u();
        for (Object next : collection) {
            if ("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX".equals(str)) {
                A0u.add(next);
            }
        }
        if (!A0u.isEmpty()) {
            Iterator it = A0u.iterator();
            if (!it.hasNext()) {
                return false;
            }
            it.next();
            return true;
        }
        throw C18250wR.A0V(AnonymousClass00U.A0L("Unknown feature ", str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isSupported(java.lang.String r4, java.util.Collection r5) {
        /*
            java.util.HashSet r3 = X.C18200wM.A0u()
            java.util.Iterator r2 = r5.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r1 = r2.next()
            X.8db r1 = (X.C141978db) r1
            r0 = r1
            X.7cX r0 = (X.C125147cX) r0
            java.lang.String r0 = r0.A00
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0008
            r3.add(r1)
            goto L_0x0008
        L_0x0023:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x004b
            java.util.Iterator r2 = r3.iterator()
        L_0x002d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            X.8db r1 = (X.C141978db) r1
            X.7cX r1 = (X.C125147cX) r1
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0047
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x002d
        L_0x0047:
            r0 = 1
            return r0
        L_0x0049:
            r0 = 0
            return r0
        L_0x004b:
            java.lang.String r0 = "Unknown feature "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.internal.WebViewFeatureInternal.isSupported(java.lang.String, java.util.Collection):boolean");
    }

    public static boolean isStartupFeatureSupported(String str, Context context) {
        return isStartupFeatureSupported(str, Collections.unmodifiableSet(C1188772q.A00), context);
    }

    public static boolean isSupported(String str) {
        return isSupported(str, Collections.unmodifiableSet(C125147cX.A02));
    }
}
