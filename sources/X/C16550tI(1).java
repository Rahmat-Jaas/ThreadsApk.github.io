package X;

import android.content.SharedPreferences;
import com.instagram.realtimeclient.fleetbeacon.FleetBeaconTestTrigger;
import java.net.Socket;

/* renamed from: X.0tI  reason: invalid class name and case insensitive filesystem */
public final class C16550tI implements C17910vk {
    public C18110wB A00;
    public C12800mV A01;
    public final boolean A02;

    public final String AQz() {
        return "567310203415052";
    }

    public final synchronized String Ad5() {
        return (String) ((C13030mt) this.A00).first;
    }

    public final synchronized String Ad8() {
        return (String) ((C13030mt) this.A00).second;
    }

    public final String getAppName() {
        return FleetBeaconTestTrigger.TRANSPORT;
    }

    public final String BHG() {
        throw new RuntimeException("Tokenbinding not implemented for legacy auth");
    }

    public final boolean CWb() {
        throw new RuntimeException("Tokenbinding not implemented for legacy auth");
    }

    public final byte[] CWe(Socket socket) {
        throw new RuntimeException("Tokenbinding not implemented for legacy auth");
    }

    public final boolean CmI(boolean z) {
        SharedPreferences sharedPreferences = this.A01.A00(AnonymousClass006.A0j).A00;
        if (sharedPreferences.contains("/settings/mqtt/id/is_using_secure_auth") && z == sharedPreferences.getBoolean("/settings/mqtt/id/is_using_secure_auth", false)) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("/settings/mqtt/id/is_using_secure_auth", z);
        edit.apply();
        return true;
    }

    public final boolean D8d(C18110wB r5) {
        if (this.A00.equals(r5)) {
            return false;
        }
        SharedPreferences.Editor edit = this.A01.A00(AnonymousClass006.A0j).A00.edit();
        C13030mt r2 = (C13030mt) r5;
        edit.putString("/settings/mqtt/id/mqtt_device_id", (String) r2.first);
        edit.putString("/settings/mqtt/id/mqtt_device_secret", (String) r2.second);
        edit.putLong("/settings/mqtt/id/timestamp", r2.A00);
        edit.apply();
        this.A00 = r5;
        return true;
    }

    public C16550tI(C12800mV r8, boolean z) {
        this.A02 = z;
        this.A01 = r8;
        SharedPreferences sharedPreferences = r8.A00(AnonymousClass006.A0j).A00;
        C13030mt r0 = new C13030mt(sharedPreferences.getString("/settings/mqtt/id/mqtt_device_id", ""), sharedPreferences.getString("/settings/mqtt/id/mqtt_device_secret", ""), sharedPreferences.getLong("/settings/mqtt/id/timestamp", Long.MAX_VALUE));
        this.A00 = r0;
        String str = (String) r0.first;
        if ((str == null || str.equals("")) && this.A02) {
            D8d(new C13030mt(C03480Iw.A00().toString(), "", System.currentTimeMillis()));
        }
    }
}
