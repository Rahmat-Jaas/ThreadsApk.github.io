package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.fleetbeacon.FleetBeaconTestTrigger;

/* renamed from: X.3OU  reason: invalid class name */
public final class AnonymousClass3OU {
    public static Integer A00(String str) {
        if (str.equals("PUSH")) {
            return AnonymousClass006.A00;
        }
        if (str.equals(FleetBeaconTestTrigger.TRANSPORT)) {
            return AnonymousClass006.A01;
        }
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass006.A0C;
        }
        throw C18190wL.A0a(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return FleetBeaconTestTrigger.TRANSPORT;
            case 2:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            default:
                return "PUSH";
        }
    }
}
