package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6G3  reason: invalid class name */
public final class AnonymousClass6G3 {
    public static float A00(AnonymousClass3HX r5, String str, String str2) {
        if (str == null) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        try {
            return AnonymousClass7Kk.A01(str);
        } catch (C29721zB e) {
            C30967GcS.A01(r5, "RichTextBinderUtils", String.format("Error parsing %s: %s", new Object[]{str2, str}), e, 0);
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
    }
}
