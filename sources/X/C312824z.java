package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.24z  reason: invalid class name and case insensitive filesystem */
public enum C312824z {
    IMAGE(0.25f),
    VIDEO(0.25f),
    SUBTITLES(0.1f),
    REMOTE_ASSETS(0.1f),
    GIFS(0.05f);
    
    public final C556033w A00;
    public final float A01;

    /* access modifiers changed from: public */
    static {
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        for (C312824z r0 : values()) {
            f += r0.A01;
        }
        if (f > 1.0f) {
            throw C18190wL.A0a("Cache fractions sum up to more than 100%!");
        }
    }

    /* access modifiers changed from: public */
    C312824z(float f) {
        this.A01 = f;
        this.A00 = new C556033w(f);
    }
}
