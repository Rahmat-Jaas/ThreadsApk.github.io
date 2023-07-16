package X;

import android.net.Uri;

/* renamed from: X.1zO  reason: invalid class name and case insensitive filesystem */
public enum C29841zO {
    A05("ig_reminders", 0, 3, false),
    A06("ig_heads_up_reminders", 1, 4, false),
    A0A("ig_reminders_with_vibrations", 2, 3, true),
    A07("ig_heads_up_reminders_with_vibrations", 3, 4, true),
    A09("ig_reminders_with_sounds_and_vibrations", 4, 3, true),
    A08("ig_heads_up_reminders_with_sounds_and_vibrations", 5, 4, true);
    
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final boolean A03;

    /* access modifiers changed from: public */
    C29841zO(String str, int i, int i2, boolean z) {
        this.A02 = str;
        this.A00 = i2;
        this.A03 = z;
        this.A01 = r1;
    }
}
