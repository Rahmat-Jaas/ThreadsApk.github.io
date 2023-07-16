package X;

import com.instagram.api.schemas.TrackData;

/* renamed from: X.5Kv  reason: invalid class name and case insensitive filesystem */
public final class C90185Kv extends AnonymousClass0Sf implements C145898lI {
    public final C1535598i A00;
    public final TrackData A01;
    public final AnonymousClass9A0 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90185Kv) {
                C90185Kv r5 = (C90185Kv) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C27986Ewa AvV() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C23 Az7() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C28019Ex9 BHm() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A02) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A01);
    }

    public C90185Kv(C1535598i r1, TrackData trackData, AnonymousClass9A0 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = trackData;
    }
}
