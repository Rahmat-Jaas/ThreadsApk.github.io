package X;

import com.instagram.api.schemas.GrowthFrictionInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.62w  reason: invalid class name */
public final class AnonymousClass62w extends AnonymousClass5NL implements C21672ByJ {
    public final Map Apd() {
        return null;
    }

    public final boolean AlQ() {
        Boolean optionalBooleanValue = getOptionalBooleanValue("has_active_interventions");
        if (optionalBooleanValue != null) {
            return optionalBooleanValue.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final GrowthFrictionInfo Cyq() {
        return new GrowthFrictionInfo((HashMap) null, AlQ());
    }
}
