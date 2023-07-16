package com.instagram.realtimeclient.fleetbeacon;

import X.C10300i6;
import com.instagram.realtimeclient.fleetbeacon.L;
import com.instagram.service.session.UserSession;

public class FleetBeaconConfig {
    public final C10300i6 mUserSession;

    public synchronized Long getPublishTimeoutInMs() {
        return L.ig_android_fleetbeacon_config.publish_timeout_ms.getAndExpose(this.mUserSession);
    }

    public synchronized long getSubscribeTimeoutInMs() {
        return L.ig_android_fleetbeacon_config.subscribe_timeout_ms.getAndExpose(this.mUserSession).longValue();
    }

    public double getDistilleryTestSampleRate() {
        return L.ig_android_fleetbeacon_config.distillery_test_sample_rate.getAndExpose(this.mUserSession).doubleValue();
    }

    public boolean getEnableDistilleryFleetbeacon() {
        return L.ig_android_fleetbeacon_config.enable_distillery_fleet_beacon.getAndExpose(this.mUserSession).booleanValue();
    }

    public long getPublishDelayInMs() {
        return L.ig_android_fleetbeacon_config.publish_delay_ms.getAndExpose(this.mUserSession).longValue();
    }

    public long getStartTestDelayMs() {
        return L.ig_android_fleetbeacon_config.test_start_delay_ms.getAndExpose(this.mUserSession).longValue();
    }

    public FleetBeaconConfig(UserSession userSession) {
        this.mUserSession = userSession;
    }
}
