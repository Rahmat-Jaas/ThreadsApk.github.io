package X;

import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;

/* renamed from: X.3Oc  reason: invalid class name and case insensitive filesystem */
public final class C60203Oc {
    public static DirectMessageInteropReachabilityOptions A00(MMo mMo) {
        return A01(mMo.A0p());
    }

    public static final DirectMessageInteropReachabilityOptions A01(String str) {
        for (DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions : DirectMessageInteropReachabilityOptions.values()) {
            if (C04220Ms.A0I(directMessageInteropReachabilityOptions.A03, str)) {
                return directMessageInteropReachabilityOptions;
            }
        }
        return null;
    }
}
