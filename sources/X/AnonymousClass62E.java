package X;

import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.62E  reason: invalid class name */
public final class AnonymousClass62E extends C131057rL {
    public final RtcStartCoWatchPlaybackArguments A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass62E) {
                AnonymousClass62E r5 = (AnonymousClass62E) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A00) + AnonymousClass0wJ.A06(this.A01);
    }

    public AnonymousClass62E(RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, String str) {
        this.A00 = rtcStartCoWatchPlaybackArguments;
        this.A01 = str;
    }
}
