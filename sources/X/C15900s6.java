package X;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: X.0s6  reason: invalid class name and case insensitive filesystem */
public final class C15900s6 extends AnonymousClass0L5 {
    public final Context A00;
    public volatile AnonymousClass0K0 A01 = new AnonymousClass0K0(new JSONObject());

    public final void A01() {
        JSONObject jSONObject = new JSONObject();
        A03(jSONObject);
        this.A01 = new AnonymousClass0K0(jSONObject);
    }

    public C15900s6(Context context) {
        this.A00 = context;
    }

    public final AnonymousClass0K0 A00() {
        return this.A01;
    }

    public final void A02() {
        AnonymousClass05L A07 = C16420t2.A00().A07();
        Intent intent = new Intent("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED");
        Context context = this.A00;
        A07.A05(context, intent.setPackage(context.getPackageName()));
    }
}
