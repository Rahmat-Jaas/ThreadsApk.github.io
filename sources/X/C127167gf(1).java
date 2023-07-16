package X;

import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.7gf  reason: invalid class name and case insensitive filesystem */
public final class C127167gf implements C146158lk {
    public static final C127167gf A00 = new C127167gf();

    public final boolean isEnabled() {
        return false;
    }

    public final ZonedValue CfS(C143448gk r3, ZonePolicy zonePolicy) {
        return new ZonedValue(zonePolicy, r3.get());
    }

    public final Object CfT(C143448gk r2, ZonePolicy zonePolicy, Integer num) {
        return r2.get();
    }

    public final Object D8X(ZonedValue zonedValue) {
        return zonedValue.A01;
    }
}
